////////////////////////////////////////////////////////////////////////
//
// EDISettings.java
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

public class EDISettings {
	final public static short EDIUnknown = 0;
	final public static short EDIFact = 1;
	final public static short EDIX12 = 2;
    final public static short EDIHL7 = 3;
	final public static short EDIFixed = 4;

	private ServiceChars m_ServiceChars = new ServiceChars();

	private boolean m_TerminateSegmentsWithLinefeed = false;
	private boolean m_AutoCompleteData = true;

	protected String mVersion = "";
	protected String mRelease = "";
	protected String mControllingAgency = "UNO";
	private String mMessageType = "";
	protected short mEDIStandard = EDIUnknown;

	public ServiceChars getServiceChars() {
		return m_ServiceChars;
	}

	public boolean getTerminateSegmentsWithLinefeed() {
		return m_TerminateSegmentsWithLinefeed;
	}

	public boolean getAutoCompleteData() {
		return m_AutoCompleteData;
	}

	public void setTerminateSegmentsWithLinefeed(boolean rhs) {
		m_TerminateSegmentsWithLinefeed = rhs;
	}

	public void setAutoCompleteData(boolean rhs) {
		m_AutoCompleteData = rhs;
	}

	public void setVersion(String ver) {
		mVersion=ver;
	}

	public String getVersion() {
		return mVersion;
	}

	public void setRelease(String rel) {
		mRelease = rel;
	}

	public String getRelease() {
		return mRelease;
	}
	
	public short getStandard() {
		return mEDIStandard;
	}
	
	public String getControllingAgency() {
		return mControllingAgency;
	}

	public void setControllingAgency(String rhs) {
		mControllingAgency = rhs;
	}
	
	public String getMessageType() {
		return mMessageType;
	}

	public void setMessageType(String rhs) {
		mMessageType = rhs;
	}
}
