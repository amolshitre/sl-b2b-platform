/**
 * Statement.java
 *
 * This file was generated by MapForce 2010r3.
 *
 * YOU SHOULD NOT MODIFY THIS FILE, BECAUSE IT WILL BE
 * OVERWRITTEN WHEN YOU RE-RUN CODE GENERATION.
 *
 * Refer to the MapForce Documentation for further details.
 * http://www.altova.com/mapforce
 */


package com.altova.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class Statement 
{
	static public class Parameter
	{
		public Parameter(int type) {this.type=type;}
		public Parameter(int type, int scaleOrLength) {this.type=type; this.scaleOrLength=scaleOrLength;}
		public int type;
		public int scaleOrLength = -1;
	}
	
	private PreparedStatement statement=null;
	private Catalog catalog = null;
	private String	statement_string;
	private ArrayList<Parameter> parameters;
	private ArrayList<Object> values;

	public Statement(Catalog catalog, String newStatement) 
	{
		this.catalog = catalog;
		statement_string = newStatement;
		parameters = new ArrayList<Parameter>();
		values = new ArrayList<Object>();
	}

	public String getStatement() 
	{
		return statement_string;
	}
			
	public void setStatement(String newValue) 
	{
		statement_string = newValue;
	}

	public void addParameter(int type)	
	{
		parameters.add(new Parameter(type));
	}
	
	public void addParameter(int type, int scaleOrLength)	
	{
		parameters.add(new Parameter(type, scaleOrLength));
	}
	
	public void bindParameter(Object value, int scale)
	{
		values.add(value);
		int i = values.size()-1;
		Parameter p = parameters.get(i);
		p.scaleOrLength = scale;
		parameters.set(i, p);
	}
	
	public void bindParameter(Object value)
	{
		values.add(value);
	}
	
	public void clear()
	{
		values.clear();
	}
	
	public ResultSetWrapper execute() throws Exception
	{
		statement = catalog.getConnection().prepareStatement(statement_string);
		for (int i = 0; i < parameters.size(); i++)
		{
			try 
			{
				if (parameters.get(i).scaleOrLength < 0)
					statement.setObject(i+1, values.get(i), parameters.get(i).type);
				else
					statement.setObject(i+1, values.get(i), parameters.get(i).type, parameters.get(i).scaleOrLength);
			}
			catch (java.sql.SQLException e)
			{
				if (values.get(i) instanceof java.math.BigInteger)
				{
					java.math.BigInteger v = (java.math.BigInteger)values.get(i);
					
					if (parameters.get(i).type == java.sql.Types.TINYINT && statement.getMetaData().isSigned(i+1))
						statement.setObject(i+1, new Long(v.longValue()), java.sql.Types.SMALLINT);
					else
					{
						if (parameters.get(i).scaleOrLength < 0)
							statement.setObject(i+1, new Long(v.longValue()), parameters.get(i).type);
						else
							statement.setObject(i+1, new Long(v.longValue()), parameters.get(i).type, parameters.get(i).scaleOrLength);					
					}
				}
				else
					throw e;
			}
		}
		
		return new ResultSetWrapper(catalog, statement.executeQuery(), this);
	}
	
	public void close() throws Exception 
	{
		clear();
	}
	
	public void destroy() throws Exception 
	{
		clear();
		if (statement != null)
			statement.close();
	}
}