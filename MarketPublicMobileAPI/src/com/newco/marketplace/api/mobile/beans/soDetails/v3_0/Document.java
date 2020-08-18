package com.newco.marketplace.api.mobile.beans.soDetails.v3_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * This is a generic bean class for storing Document information.
 * @author Infosys
 *
 */

@XStreamAlias("document")
@XmlAccessorType(XmlAccessType.FIELD)
public class Document {
	
	@XStreamAlias("documentId")
	private Integer documentId;
	
	@XStreamAlias("documentType")
	private String documentType;
	
	@XStreamAlias("documentDescription")
	private String documentDescription;
	
	@XStreamAlias("fileType")
	private String fileType;
	
	@XStreamAlias("fileName")
	private String fileName;
	
	@XStreamAlias("uploadedBy")
	private String uploadedBy;
	
	@XStreamAlias("uploadedbyName")
	private String uploadedbyName;
	
	@XStreamAlias("uploadDateTime")
	private String uploadDateTime;
	
	@XStreamAlias("docSize")
	private Integer docSize;

	public String getDocumentDescription() {
		return documentDescription;
	}

	public void setDocumentDescription(String documentDescription) {
		this.documentDescription = documentDescription;
	}

	public String getFileType() {
		return fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getUploadedBy() {
		return uploadedBy;
	}

	public void setUploadedBy(String uploadedBy) {
		this.uploadedBy = uploadedBy;
	}

	public String getUploadedbyName() {
		return uploadedbyName;
	}

	public void setUploadedbyName(String uploadedbyName) {
		this.uploadedbyName = uploadedbyName;
	}

	public String getUploadDateTime() {
		return uploadDateTime;
	}

	public void setUploadDateTime(String uploadDateTime) {
		this.uploadDateTime = uploadDateTime;
	}

	/**
	 * @return the documentId
	 */
	public Integer getDocumentId() {
		return documentId;
	}

	/**
	 * @param documentId the documentId to set
	 */
	public void setDocumentId(Integer documentId) {
		this.documentId = documentId;
	}
	
	/**
	 * @return the documentType
	 */
	public String getDocumentType() {
		return documentType;
	}

	/**
	 * @param documentType the documentType to set
	 */
	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}

	public Integer getDocSize() {
		return docSize;
	}

	public void setDocSize(Integer docSize) {
		this.docSize = docSize;
	}
	

}
