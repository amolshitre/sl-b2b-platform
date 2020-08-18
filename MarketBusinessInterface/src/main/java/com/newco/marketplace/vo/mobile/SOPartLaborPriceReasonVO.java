package com.newco.marketplace.vo.mobile;

import java.util.Date;

import com.newco.marketplace.webservices.base.CommonVO;

public class SOPartLaborPriceReasonVO extends CommonVO {
	
	private static final long serialVersionUID = 20090428L;

	private int reasonId;
	private String soId;
	private String priceType;
	private String reasonCodeId;
	private String reasonComments;
	private Date createdDate;
	private Date modifiedDate;
	private String modifiedBy;
	
	public int getReasonId() {
		return reasonId;
	}
	public void setReasonId(int reasonId) {
		this.reasonId = reasonId;
	}
	public String getSoId() {
		return soId;
	}
	public void setSoId(String soId) {
		this.soId = soId;
	}
	public String getPriceType() {
		return priceType;
	}
	public void setPriceType(String priceType) {
		this.priceType = priceType;
	}
	public String getReasonCodeId() {
		return reasonCodeId;
	}
	public void setReasonCodeId(String reasonCodeId) {
		this.reasonCodeId = reasonCodeId;
	}
	public String getReasonComments() {
		return reasonComments;
	}
	public void setReasonComments(String reasonComments) {
		this.reasonComments = reasonComments;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Date getModifiedDate() {
		return modifiedDate;
	}
	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	public String getModifiedBy() {
		return modifiedBy;
	}
	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	
	

}
