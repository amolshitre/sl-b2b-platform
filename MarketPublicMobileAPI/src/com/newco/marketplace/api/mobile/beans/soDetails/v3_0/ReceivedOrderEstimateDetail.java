package com.newco.marketplace.api.mobile.beans.soDetails.v3_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * This is a generic bean class for storing Estimate information.
 * @author Infosys
 *
 */

@XStreamAlias("estimate")
@XmlAccessorType(XmlAccessType.FIELD)
public class ReceivedOrderEstimateDetail {

	@XStreamAlias("estimationId")
	private Integer estimationId;
	
	@XStreamAlias("estimationNo")
	private String estimationNo;
	
	@XStreamAlias("estimationStatus")
	private String estimationStatus;
    
	@XStreamAlias("resourceId")
	private Integer resourceId;
		
	public Integer getEstimationId() {
		return estimationId;
	}

	public void setEstimationId(Integer estimationId) {
		this.estimationId = estimationId;
	}

	public String getEstimationNo() {
		return estimationNo;
	}

	public void setEstimationNo(String estimationNo) {
		this.estimationNo = estimationNo;
	}

	public String getEstimationStatus() {
		return estimationStatus;
	}

	public void setEstimationStatus(String estimationStatus) {
		this.estimationStatus = estimationStatus;
	}

	public Integer getResourceId() {
		return resourceId;
	}

	public void setResourceId(Integer resourceId) {
		this.resourceId = resourceId;
	}
   
	


}
