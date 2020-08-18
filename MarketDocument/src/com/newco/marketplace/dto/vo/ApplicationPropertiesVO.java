package com.newco.marketplace.dto.vo;

import com.sears.os.vo.SerializableBaseVO;

public class ApplicationPropertiesVO extends SerializableBaseVO
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 7989673075757516457L;
	private String appKey;
	private String appValue;
	private byte[] appFile;
	
	public String getAppKey() {
		return appKey;
	}
	public void setAppKey(String appKey) {
		this.appKey = appKey;
	}
	public String getAppValue() {
		return appValue;
	}
	public void setAppValue(String appValue) {
		this.appValue = appValue;
	}
	public byte[] getAppFile() {
		return appFile;
	}
	public void setAppFile(byte[] appFile) {
		this.appFile = appFile;
	}
	
	

}
