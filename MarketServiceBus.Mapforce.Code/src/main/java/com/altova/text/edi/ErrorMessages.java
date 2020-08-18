////////////////////////////////////////////////////////////////////////
//
// ErrorMessages.java
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

public class ErrorMessages {
	static String GetMissingSegmentMessage(final String sSegment)
	{
		return "Missing Segment " + sSegment + ".";
	}

	static String GetMissingGroupMessage(final String sGroup)
	{
		return "Missing Group " + sGroup + ".";
	}

	static String GetMissingFieldOrCompositeMessage(final String sField)
	{
		return "Missing field or composite " + sField + ".";
	}

	static String GetExtraDataMessage(final String sNodeName, final String sExtra)
	{
		return "Extra content detected in '" + sNodeName + "': '" + sExtra + "'";
	}

	static String GetInvalidFieldValueMessage(final String sNodeName, final String sValue, final String sType)
	{
		return "Type mismatch in field '" + sNodeName + "'. The value '" + sValue + "' is not of type '" + sType + "'";
	}

	static String GetInvalidDateMessage( final String sNodeName, final String sValue, final String sType)
	{
		return GetInvalidFieldValueMessage( sNodeName, sValue, sType);
	}

	static String GetInvalidTimeMessage( final String sNodeName, final String sValue, final String sType)
	{
		return GetInvalidFieldValueMessage( sNodeName, sValue, sType);
	}

	static String GetExtraRepeatMessage( final String sNodeName)
	{
		return "Extra repetition of '" + sNodeName + "'";
	}

	static String GetNumericOverflowMessage( final String sNodeName, final String sValue)
	{
		return "Numeric overflow in field '" + sNodeName + "' with value: '" + sValue + "'";
	}

	static String GetDataElementTooShortMessage( final String sNodeName, final long nMinLength, final String sValue)
	{
		return "The content of '" + sNodeName 
			+ "' is shorter than the minimum length of " 
			+ nMinLength + " characters: '" + sValue + "'";
	}

	static String GetDataElementTooLongMessage( final String sNodeName, final long nMaxLength, final String sValue)
	{
		return "The content of '" + sNodeName 
			+ "' is longer than the maximum length of " 
			+ nMaxLength + " characters: '" + sValue + "'";
	}

	static String GetUnexpectedEndOfFileMessage( )
	{
		return "Unexpected end of file";
	}

	static String GetInvalidCodeListValueMessage( final String sValue, final String sItemList)
	{
		return  "'" + sValue + "' is not a legal value. Legal values are: " + sItemList + ".";
	}
	
	static String GetUnexpectedSegmentIDMessage( final String sSegment)
	{
		return "Segment '" + sSegment + "' is unexpected.";
	}
	
	static String GetUnrecognizedSegmentMessage( final String sSegment)
	{
		return "Segment '" + sSegment + "' is unrecognized.";
	}
	
	static String GetTextNotParsedMessage( final String sText)
	{
		return "The following text was not parsed: '" + sText + "'";
	}
}
