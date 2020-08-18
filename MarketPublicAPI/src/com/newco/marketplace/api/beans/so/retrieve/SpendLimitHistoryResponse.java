package com.newco.marketplace.api.beans.so.retrieve;

import java.util.List;

import com.newco.marketplace.api.beans.Results;
import com.newco.marketplace.api.common.IAPIResponse;
import com.newco.marketplace.api.utils.constants.PublicAPIConstant;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

/**
 * This is a bean class for storing response information for 
 * the SORetrieveSpendLimitService
 * @author Infosys
 *
 */
@XStreamAlias("spendLimitHistoryResponse")
public class SpendLimitHistoryResponse implements IAPIResponse {
	
	@XStreamAlias("version")   
	@XStreamAsAttribute()   
	private String version;
	 
	@XStreamAlias("xsi:schemaLocation")   
	@XStreamAsAttribute()   
	private String schemaLocation;
	 
	@XStreamAlias("xmlns")   
	@XStreamAsAttribute()   
	private String namespace;
	 
	@XStreamAlias("xmlns:xsi")   
	@XStreamAsAttribute()   
	private String schemaInstance;
		
	@XStreamAlias("results")
	private Results results;
	
	@XStreamImplicit(itemFieldName="soSpendLimitHistory")
	private List<SOSpendLimitHistory> soSpendLimitHistoryList;
	
	public SpendLimitHistoryResponse(){
		this.schemaInstance = PublicAPIConstant.SCHEMA_INSTANCE;
		this.namespace = PublicAPIConstant.SORESPONSE_SPENDLIMIT_NAMESPACE;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getSchemaLocation() {
		return schemaLocation;
	}

	public void setSchemaLocation(String schemaLocation) {
		this.schemaLocation = schemaLocation;
	}

	public String getNamespace() {
		return namespace;
	}

	public void setNamespace(String namespace) {
		this.namespace = namespace;
	}

	public String getSchemaInstance() {
		return schemaInstance;
	}

	public void setSchemaInstance(String schemaInstance) {
		this.schemaInstance = schemaInstance;
	}

	public Results getResults() {
		return results;
	}

	public void setResults(Results results) {
		this.results = results;
	}

	
	public List<SOSpendLimitHistory> getSoSpendLimitHistoryList() {
		return soSpendLimitHistoryList;
	}

	public void setSoSpendLimitHistoryList(
			List<SOSpendLimitHistory> soSpendLimitHistoryList) {
		this.soSpendLimitHistoryList = soSpendLimitHistoryList;
	}

	
  }
