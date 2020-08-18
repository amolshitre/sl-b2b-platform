package com.newco.marketplace.api.mobile.beans.soDetails.v3_0;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

/**
 * This is a generic bean class for storing documents information.
 * @author Infosys
 *
 */

@XStreamAlias("invoiceDocuments")
@XmlAccessorType(XmlAccessType.FIELD)
public class InvoiceDocuments {
	
	@XStreamImplicit(itemFieldName="document")
	private List<Document> document;
	
	public List<Document> getDocument() {
		return document;
	}

	public void setDocument(List<Document> document) {
		this.document = document;
	}
	

	
}