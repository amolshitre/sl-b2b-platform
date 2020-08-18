////////////////////////////////////////////////////////////////////////
//
// DataTypeValidator.java
//
// This file was generated by MapForce 2011sp1.
//
// YOU SHOULD NOT MODIFY THIS FILE, BECAUSE IT WILL BE
// OVERWRITTEN WHEN YOU RE-RUN CODE GENERATION.
//
// Refer to the MapForce Documentation for further details.
// http://www.altova.com/mapforce
//
////////////////////////////////////////////////////////////////////////

package com.altova.text.edi;

import com.altova.text.ITextNode;

public abstract class  DataTypeValidator {

	int mMinLength;
	int mMaxLength;
	String[] mCodeList;

	public int getMinLength() {
		return mMinLength;
	}
	
	public int getMaxLength() {
		return mMaxLength;
	}
	
	public String[] getCodeList() {
		return mCodeList;
	}

	public boolean hasValue(String value) {
		if( mCodeList != null)
		{
			for( int i = 0; i < mCodeList.length; i++) {
				if( value.equals( mCodeList[i]))
					return true;
			}
		}
		else
			return true;
		
		return false;
	}
	
	public String getCodeListValues() {
		StringBuffer sb = new StringBuffer();
		if( mCodeList != null)
		{
			for( int i = 0; i < mCodeList.length - 1; i++) {
				sb.append( mCodeList[i] + ", ");
			}
			sb.append( mCodeList[mCodeList.length - 1]);
		}
		return sb.toString();
	}
	
	protected DataTypeValidator(int minLength, int maxLength, String[] codeList) {
		mMinLength = minLength;
		mMaxLength = maxLength;
		mCodeList = codeList;
	}
	
	protected void validateLength( int effLen, String s, Parser.Context context, Scanner.State beforeRead)
	{
		//report error/warning
		if (effLen > getMaxLength())
		{
			context.handleError(
				Parser.ErrorType.DataElementTooLong,
				ErrorMessages.GetDataElementTooLongMessage(
					context.getParticle().getNode().getName(),
					getMaxLength(),
					s
				),
				new ErrorPosition( beforeRead ),
				s
			);
		}
		else if( effLen < getMinLength())
		{
			context.handleError(
				Parser.ErrorType.DataElementTooShort,
				ErrorMessages.GetDataElementTooShortMessage(
					context.getParticle().getNode().getName(),
					getMaxLength(),
					s
				),
				new ErrorPosition( beforeRead ),
				s
			);
		}
	}
	
	protected void validateLength( int effLen, String s, ITextNode node, Writer writer)
	{
		//report error/warning
		if (effLen > getMaxLength())
		{
			writer.handleError(
				node,
				Parser.ErrorType.DataElementTooLong,
				ErrorMessages.GetDataElementTooLongMessage(
					node.getName(),
					getMaxLength(),
					s
				)
			);
		}
		else if( effLen < getMinLength())
		{
			writer.handleError(
				node,
				Parser.ErrorType.DataElementTooShort,
				ErrorMessages.GetDataElementTooShortMessage(
					node.getName(),
					getMaxLength(),
					s
				)
			);
		}
	}
	
	// 2 Trim functions which are written for StringBuffer
	static public void trimRight( StringBuffer sBuffer, char cTrim)
	{
		int i;
		for( i = sBuffer.length() - 1; i >= 0 && sBuffer.charAt(i) == cTrim; --i);
		
		sBuffer.delete( i + 1, sBuffer.length());
	}
	
	static public void trimLeft( StringBuffer sBuffer, char cTrim)
	{
		int i;
		for( i = 0; i < sBuffer.length() && sBuffer.charAt(i) == cTrim ; ++i);
		
		sBuffer.delete( 0, i);
	}

	public abstract boolean makeValidOnRead (StringBuffer s, Parser.Context context, Scanner.State beforeRead);
    public abstract  boolean makeValidOnWrite (StringBuffer s, ITextNode node, Writer writer, boolean esc);
	public abstract  boolean makeValidOnWrite (StringBuffer s, ITextNode node, Writer writer);
}	
