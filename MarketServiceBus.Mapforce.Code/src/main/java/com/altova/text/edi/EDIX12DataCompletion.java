////////////////////////////////////////////////////////////////////////
//
// EDIX12DataCompletion.java
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

import com.altova.text.*;

public class EDIX12DataCompletion extends DataCompletion {
	private EDIX12Settings m_Settings = null;

	private ITextNode m_GroupRoot = NullTextNode.getInstance();

	private ITextNode m_MessageRoot = NullTextNode.getInstance();

    public void completeData(ITextNode dataRoot, Particle rootParticle) {
		completeMandatory(dataRoot, rootParticle);
        completeEnvelope(dataRoot);
	}

    private void completeEnvelope(ITextNode envelope)
    {
        if (envelope.getName() != "Envelope")
			throw new com.altova.AltovaException("completeEnvelope: root node is not an envelope");

        makeSureExists(envelope, "Interchange");

        TextNodeList interchanges = envelope.getChildren().filterByName("Interchange");
        for (int i=0; i< interchanges.size(); ++i)
            completeInterchange(interchanges.getAt(i));
    }

	private void completeInterchange(ITextNode interchange) {
		makeSureExists(interchange, "ISA");
		m_GroupRoot = makeSureExists(interchange, "Group");
		makeSureExists(interchange, "IEA");

		ITextNode isa = getKid(interchange, "ISA");
		ITextNode iea = getKid(interchange, "IEA");

		ITextNode FI01 = makeSureExists(isa, "FI01");
		conservativeSetValue(FI01, "00");
		ITextNode FI02 = makeSureExists(isa, "FI02");
		conservativeSetValue(FI02, "          ");
		ITextNode FI03 = makeSureExists(isa, "FI03");
		conservativeSetValue(FI03, "00");
		ITextNode FI04 = makeSureExists(isa, "FI04");
		conservativeSetValue(FI04, "          ");
		ITextNode FI05_1 = makeSureExists(isa, "FI05_1");
		conservativeSetValue(FI05_1, "ZZ");
		ITextNode FI05_2 = makeSureExists(isa, "FI05_2");
		conservativeSetValue(FI05_2, "ZZ");
		ITextNode FI08 = makeSureExists(isa, "FI08");
		conservativeSetValue(FI08, getCurrentDateAsEDIString(2));
		ITextNode FI09 = makeSureExists(isa, "FI09");
		conservativeSetValue(FI09, getCurrentTimeAsEDIString());
		
		if( isOldISAVersion() ) {
			ITextNode FI10 = makeSureExists(isa, "FI10");
		}
		else {
			ITextNode FI65 = makeSureExists(isa, "FI65");
			conservativeSetValue(FI65, m_Settings.getServiceChars().getRepetitionSeparator());
		}

		ITextNode FI11 = makeSureExists(isa, "FI11");
		conservativeSetValue(FI11, m_Settings
				.getInterchangeControlVersionNumber());
		ITextNode FI12 = makeSureExists(isa, "FI12");
		conservativeSetValue(FI12, "000000000");
		ITextNode FI13 = makeSureExists(isa, "FI13");
		conservativeSetValue(FI13, m_Settings.getRequestAcknowledgement() ? "1"
				: "0");
		ITextNode FI14 = makeSureExists(isa, "FI14");
		conservativeSetValue(FI14, "P");
		ITextNode FI15 = makeSureExists(isa, "FI15");
		conservativeSetValue(FI15, m_Settings.getServiceChars()
				.getComponentSeparator());

		ITextNodeList groups = interchange.getChildren().filterByName("Group");
		for (int j = 0; j < groups.size(); ++j) {
			m_GroupRoot = groups.getAt(j);
			makeSureExists(m_GroupRoot, "GS");
			makeSureExists(m_GroupRoot, "GE");
			completeGroup();
		}

		ITextNode IEAFI16 = makeSureExists(iea, "FI16");
		conservativeSetValue(IEAFI16, interchange.getChildren()
				.filterByName("Group").size());
		ITextNode IEAFI12 = makeSureExists(iea, "FI12");
		conservativeSetValue(IEAFI12, FI12.getValue().trim());

	}

	private void completeGroup() {
		ITextNode GS = m_GroupRoot.getChildren().filterByName("GS").getAt(0);
		if (!GS.isNull()) {
			ITextNode GE = m_GroupRoot.getChildren().filterByName("GE")
					.getAt(0);
			ITextNode GSF373 = makeSureExists(GS, "F373");
			conservativeSetValue(GSF373, getCurrentDateAsEDIString(4));
			ITextNode GSF337 = makeSureExists(GS, "F337");
			conservativeSetValue(GSF337, getCurrentTimeAsEDIString());
			ITextNode GSF28 = GS.getChildren().filterByName("F28").getAt(0);
			ITextNode GEF97 = makeSureExists(GE, "F97");
			conservativeSetValue(GEF97, GS.getParent().getChildren()
					.filterByName("Message").size());
					
			if (!GSF28.isNull())
			{
				ITextNode GEF28 = makeSureExists(GE, "F28");
				conservativeSetValue(GEF28, GSF28.getValue());
			}
		}
		m_MessageRoot = makeSureExists(m_GroupRoot, "Message");
		ITextNodeList messages = m_GroupRoot.getChildren().filterByName(
				"Message");
		for (int i = 0; i < messages.size(); ++i) {
			m_MessageRoot = messages.getAt(i);
			makeSureExists(m_MessageRoot, "ST");
			makeSureExists(m_MessageRoot, "SE");
			completeMessage();
		}

	}

	private void completeMessage() {
		ITextNode ST = m_MessageRoot.getChildren().filterByName("ST").getAt(0);
		ITextNode SE = m_MessageRoot.getChildren().filterByName("SE").getAt(0);
		ITextNode STF143 = makeSureExists(ST, "F143");
		conservativeSetValue(STF143, getStructureName());
		ITextNode SEF96 = makeSureExists(SE, "F96");
		long segmentcount = getSegmentChildrenCount(ST.getParent());
		conservativeSetValue(SEF96, segmentcount);
		ITextNode STF329 = makeSureExists(ST, "F329");
		ITextNode SEF329 = makeSureExists(SE, "F329");
		conservativeSetValue(SEF329, STF329.getValue());
	}

	public EDIX12DataCompletion(EDIX12Settings settings, String structurename) {
		super(structurename);
		m_Settings = settings;
	}

	boolean isOldISAVersion()
	{
		return m_Settings.getRelease().equals("3040") ||
			m_Settings.getRelease().equals("3050") ||
			m_Settings.getRelease().equals("3060") ||
			m_Settings.getRelease().equals("3070") ||
			m_Settings.getRelease().equals("4010");
	}
}
