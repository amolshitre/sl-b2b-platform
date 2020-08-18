////////////////////////////////////////////////////////////////////////
//
// DataTypeValidatorString.java
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

public class  DataTypeValidatorString extends DataTypeValidator {

	public DataTypeValidatorString (int minLength, int maxLength, String[] codeList) {
		super (minLength, maxLength, codeList);
	}

	public boolean makeValidOnRead (StringBuffer s, Parser.Context context, Scanner.State beforeRead) {
		if( context.getParser().getEDIKind() == EDISettings.EDIFixed )
			trimRight(s, ' ');
		
		int effLen = effectiveLength(s, context.getScanner().getServiceChars().getReleaseCharacter());
		validateLength(effLen, s.toString(), context, beforeRead);

		return true;
	}

	public boolean makeValidOnWrite (StringBuffer s, ITextNode node, Writer writer) {
        return makeValidOnWrite(s, node, writer, true);
    }

    public boolean makeValidOnWrite (StringBuffer s, ITextNode node, Writer writer, boolean esc) {
        if( esc)
            escape(s, writer.getServiceChars());

		int effLen = effectiveLength(s, writer.getServiceChars().getReleaseCharacter());
		int toPad = getMinLength() - effLen;

		//use correct padding for fixed configs
		if( writer.getEDIKind() == EDISettings.EDIFixed )
		{
			toPad = mMaxLength - s.length();
			if( s.length() > getMaxLength())
				s.delete( getMaxLength(), s.length() );	
		}

		if (toPad >0)
		{
			StringBuffer spad = new StringBuffer();
			for (int i=0; i< toPad; ++i)
				spad.append( ' ');
			s.append(spad);
		}

		validateLength(s.length(), s.toString(), node, writer);
		return true;
	}

	int effectiveLength(StringBuffer s, char escape)
	{
		int len = s.length();
		if (escape == '\0')
			return len;

		for (int i=0; i< s.length(); ++i)
			if (s.charAt(i) == escape)
				len--;
		return len;
	}

	void escape(StringBuffer s, ServiceChars sc)
	{

		char escapeChar = sc.getReleaseCharacter();

		 char toBeEscaped[] = {
				 sc.getComponentSeparator(),
				 sc.getDataElementSeparator(),
				 sc.getRepetitionSeparator(),
				 sc.getSegmentTerminator(),
                 sc.getSubComponentSeparator(),
				 escapeChar
		};

		for (int i=0; i< s.length(); ++i)
			for (int j=0; j<toBeEscaped.length; ++j)
				if (toBeEscaped[j] != '\0' && toBeEscaped[j] != ' ' && s.charAt(i) == toBeEscaped[j])
					if (escapeChar != '\0')
						s.insert(i++, escapeChar);
					else
						s.setCharAt(i, ' ');
	}
}
