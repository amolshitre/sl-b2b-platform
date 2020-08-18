package com.newco.marketplace.vo.apiUserProfile;

import java.sql.Timestamp;


public class LocationResponseDate {
    /**
	 * 
	 */
	
	private static final long serialVersionUID = -4580151067751250598L;
	
	private String locType = "";
	private String street1 = "";
	private String street2 = "";
	private String aptNo   = "";
	private String city    = "";
	private String state   = "";
	private String zip     = "";
	private String country = "";
	public String getLocType() {
		return locType;
	}
	public void setLocType(String locType) {
		this.locType = locType;
	}
	public String getStreet1() {
		return street1;
	}
	public void setStreet1(String street1) {
		this.street1 = street1;
	}
	public String getStreet2() {
		return street2;
	}
	public void setStreet2(String street2) {
		this.street2 = street2;
	}
	public String getAptNo() {
		return aptNo;
	}
	public void setAptNo(String aptNo) {
		this.aptNo = aptNo;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
}
