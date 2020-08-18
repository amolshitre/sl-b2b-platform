package com.newco.marketplace.web.dto.buyerFileUpload;

import java.util.Date;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.File;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.newco.marketplace.web.dto.SerializedBaseDTO;

public class UploadAuditDTO extends SerializedBaseDTO{
	protected final Log logger = LogFactory.getLog(getClass());
	private int buyerId;
	private String firstName;
	private String lastName;
	private String uploadFileFileName;
	private String uploadFileName;
	private int soId;
	private Date createdDate;
	private byte[] fileContent;
	private int buyerResContactId;
	private int buyerResourceId;
	private File uploadFile;
	private String uploadFileContentType;
	private int rowCount;
	private String urlFilePath;

	public File getUploadFile() {
		return uploadFile;
	}
	

	public String getUploadFileContentType() {
		return uploadFileContentType;
	}



	public void setUploadFileContentType(String uploadFileContentType) {
		
		this.uploadFileContentType = uploadFileContentType;
	}



	public void setUploadFile(File uploadFile) {
		this.uploadFile = uploadFile;
	}
	public byte[] getFileContent() {
		try {
			return this.fileContent;
		} catch (Exception e) {
			logger.info("exception in getfileContent ");
			e.printStackTrace();
			return null;
		}

	}

	public void setfileContent(byte[] uploadedfilename) {
		try {
			String str = "";
			// byte[] bytes = new byte[];

			// InputStream fin = new java.io.FileInputStream(uploadedfilename);
			this.fileContent = uploadedfilename;
		} catch (Exception e) {
			logger.info("exception in setfileContent ");
			e.printStackTrace();
		}
		// uploadedfile.
	}

	public void setBlobFromFile(File uploadedfile) {
		try {
			InputStream is = new FileInputStream(uploadedfile);
			long length = uploadedfile.length();
			if (length > Integer.MAX_VALUE) {
				// File is too large
			}

			// int tscfdsx=is.read(this.fileContent);
			// Create the byte array to hold the data
			byte[] bytes = new byte[(int) length];

			// Read in the bytes
			int offset = 0;
			int numRead = 0;
			while (offset < bytes.length
					&& (numRead = is.read(bytes, offset, bytes.length - offset)) >= 0) {
				offset += numRead;
			}
			if (offset < bytes.length) {
				throw new IOException("Could not completely read file "
						+ uploadedfile.getName());
			}

			// Close the input stream and return bytes
			is.close();

			this.fileContent = bytes;
		} catch (Exception e) {

		}
	}

	public int getRowCount() {
		return rowCount;
	}
	/**
	 * @param rowCount the rowCount to set
	 */
	public void setRowCount(int rowCount) {
		this.rowCount = rowCount;
	}

	public void setcreatedDate(Date curdate) {
		this.createdDate = curdate;

	}

	public Date getcreatedDate() {
		return this.createdDate;
	}

	public int getBuyerResContactId() {
		return buyerResContactId;
	}

	public void setBuyerResContactId(int buyerResContactId) {
		this.buyerResContactId = buyerResContactId;
	}

	public int getBuyerResourceId() {
		return buyerResourceId;
	}

	public void setBuyerResourceId(int buyerResourceId) {
		this.buyerResourceId = buyerResourceId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getSoId() {
		return soId;
	}

	public void setSoId(int soId) {
		this.soId = soId;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public void setFileContent(byte[] fileContent) {
		this.fileContent = fileContent;
	}

	public int getBuyerId() {
		return buyerId;
	}

	public void setBuyerId(int buyerId) {
		this.buyerId = buyerId;
	}


	public String getUploadFileFileName() {
		return uploadFileFileName;
	}


	public void setUploadFileFileName(String uploadFileFileName) {
		this.uploadFileFileName = uploadFileFileName;
	}


	public String getUploadFileName() {
		return uploadFileName;
	}


	public void setUploadFileName(String uploadFileName) {
		this.uploadFileName = uploadFileName;
	}


	public String getUrlFilePath() {
		return urlFilePath;
	}


	public void setUrlFilePath(String urlFilePath) {
		this.urlFilePath = urlFilePath;
	}
	
	
}