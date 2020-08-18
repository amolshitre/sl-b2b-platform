package com.servicelive.wallet.batch.ach.vo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

// TODO: Auto-generated Javadoc
/**
 * NachaGenericRecordVO.java - This class abstracts functionalities required for the different NACHA record types
 * 
 * @author Siva
 * @version 1.0
 */
public class NachaGenericRecordVO implements Serializable, Comparator {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -5741310411579064388L;

	/** The field detail vo. */
	protected ArrayList<FieldDetailVO> fieldDetailVO;

	/** The record. */
	protected String record;

	/** The record identifier. */
	private String recordIdentifier;

	/* (non-Javadoc)
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	public int compare(Object o1, Object o2) {

		FieldDetailVO f1 = (FieldDetailVO) o1;
		FieldDetailVO f2 = (FieldDetailVO) o2;
		if (f1.getFieldOrder() > f2.getFieldOrder()) {
			return 1;
		} else {
			return -1;
		}

	}

	/**
	 * Format alpha numeric.
	 * 
	 * @param inputStr 
	 * @param toPadLength 
	 * 
	 * @return the string
	 */
	public String formatAlphaNumeric(String inputStr, int toPadLength) {

		String paddedString = "";
		// int remainingPadLength= toPadLength;
		for (int t = 0; t < toPadLength; t++) {
			paddedString = paddedString + " ";
		}
		return (inputStr + paddedString).toUpperCase();

	}

	/**
	 * Format numeric.
	 * 
	 * @param inputStr 
	 * @param toPadLength 
	 * 
	 * @return the string
	 */
	public String formatNumeric(String inputStr, int toPadLength) {

		String paddedString = "";
		for (int t = 0; t < toPadLength; t++) {
			paddedString = paddedString + "0";
		}
		return paddedString + inputStr;

	}

	/**
	 * Format string.
	 * 
	 * @return the string
	 */
	public String formatString() {

		Collections.sort(fieldDetailVO, this);
		java.util.Iterator<FieldDetailVO> itr = fieldDetailVO.iterator();
		String formatString = "";
		while (itr.hasNext()) {
			FieldDetailVO f = (FieldDetailVO) itr.next();
			String temp = formatValue(f);
			f.setFieldValue(temp);
			formatString = formatString + temp;

		}
		return formatString;
	}

	/**
	 * Format value.
	 * 
	 * @param fieldDetail 
	 * 
	 * @return the string
	 */
	public String formatValue(FieldDetailVO fieldDetail) {

		String str = fieldDetail.getFieldValue();
		int definedLength = fieldDetail.getEndPosition() - fieldDetail.getStartPosition() + 1;

		if (str == null) str = "";
		int stringLength = str.length();
		if ((fieldDetail.getFieldType()).equalsIgnoreCase("N")) {
			if ((stringLength < definedLength)) {
				// As it is numeric Left Pad with 0s ( Right justified)
				int toPadLength = definedLength - stringLength;
				str = formatNumeric(str, toPadLength);
			} else if ((stringLength > definedLength)) {
				// we need to truncate ??

			}
		} else {
			// Handle for Alphanumeric
			if ((stringLength < definedLength)) {
				// As it is numeric Left Pad with 0s ( Right justified)
				int toPadLength = definedLength - stringLength;
				str = formatAlphaNumeric(str, toPadLength);
			} else if ((stringLength > definedLength)) {
				// we need to truncate ??

			}
		}
		return str;

	}

	/**
	 * Gets the field detail vo.
	 * 
	 * @return the field detail vo
	 */
	public ArrayList<FieldDetailVO> getFieldDetailVO() {

		return fieldDetailVO;
	}

	/**
	 * Gets the hash.
	 * 
	 * @return the hash
	 */
	public HashMap<String, FieldDetailVO> getHash() {

		HashMap<String, FieldDetailVO> hashMap = new HashMap<String, FieldDetailVO>();
		for (int r = 0; r < fieldDetailVO.size(); r++) {
			FieldDetailVO fd = (FieldDetailVO) fieldDetailVO.get(r);
			hashMap.put(fd.getFieldName(), fd);
		}
		return hashMap;
	}

	/**
	 * Gets the hash.
	 * 
	 * @param fieldDetails 
	 * 
	 * @return the hash
	 */
	public HashMap<String, FieldDetailVO> getHash(ArrayList<FieldDetailVO> fieldDetails) {

		HashMap<String, FieldDetailVO> hashMap = new HashMap<String, FieldDetailVO>();
		for (int r = 0; r < fieldDetails.size(); r++) {
			FieldDetailVO fd = (FieldDetailVO) fieldDetails.get(r);
			hashMap.put(fd.getFieldName(), fd);
		}
		return hashMap;
	}

	/**
	 * Gets the record.
	 * 
	 * @return the record
	 */
	public String getRecord() {

		return record;
	}

	/**
	 * Gets the record identifier.
	 * 
	 * @return the record identifier
	 */
	public String getRecordIdentifier() {

		return recordIdentifier;
	}

	/**
	 * Sets the field detail vo.
	 * 
	 * @param fieldDetailVO the new field detail vo
	 */
	public void setFieldDetailVO(ArrayList<FieldDetailVO> fieldDetailVO) {

		this.fieldDetailVO = fieldDetailVO;
	}

	/**
	 * Sets the record.
	 * 
	 * @param record the new record
	 */
	public void setRecord(String record) {

		this.record = record;
	}

	/**
	 * Sets the record identifier.
	 * 
	 * @param recordIdentifier the new record identifier
	 */
	public void setRecordIdentifier(String recordIdentifier) {

		this.recordIdentifier = recordIdentifier;
	}

}