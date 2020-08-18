package com.servicelive.orderfulfillment.serviceinterface.vo;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class LeadResponse{
	
	@XmlElementWrapper(name = "errors")
	@XmlElement(name = "error")
	private List<String> errors = new ArrayList<String>();
	
	private String leadId;
	private boolean signalAvailable = true;   

	public void setErrors(List<String> errors) {
		this.errors = errors;
	}
	
	public List<String> getErrors() {
		return errors;
	}
	
	public LeadResponse addError(String error) {
		errors.add(error);
		return this;
	}
	
	public LeadResponse addErrors( List<String> newerrors) {
		errors.addAll(newerrors);
		return this;
	}
	
	public boolean isError() {
		return !errors.isEmpty();
	}

	public void setLeadId(String leadId) {
		this.leadId = leadId;
	}
	
	public String getLeadId() {
		return leadId;
	}
	
	public String getErrorMessage() {
		StringBuffer sb = new StringBuffer();
		for(String s : errors){
			sb.append(s).append("\t");
		}
		return sb.toString();
	}

	public void setSignalAvailable(boolean signalAvailable) {
		this.signalAvailable = signalAvailable;
	}
	
	public boolean isSignalAvailable() {
		return signalAvailable;
	}
}
