/**
 * 
 */
package com.newco.marketplace.vo.provider;

import com.sears.os.vo.SerializableBaseVO;

/**
 * @author MTedder
 *
 */
public class LicensesVO extends SerializableBaseVO{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3966900824624116335L;
	private String vendorID = null;//vendor_id
	private int addCredentialToFile = 0;

	/**
	 * @return the addCredentialToFile
	 */
	public int getAddCredentialToFile() {

		return addCredentialToFile;
	}

	/**
	 * @param addCredentialToFile the addCredentialToFile to set
	 */
	public void setAddCredentialToFile(int addCredentialToFile) {
		this.addCredentialToFile = addCredentialToFile;
	}

	/**
	 * @return the vendorID
	 */
	public String getVendorID() {
		if(vendorID == null){
			vendorID="";
		}
		return vendorID;
	}

	/**
	 * @param vendorID the vendorID to set
	 */
	public void setVendorID(String vendorID) {
		this.vendorID = vendorID;
	}
	
}
