/**
 * AssurantDocument.java
 *
 * This file was generated by MapForce 2011sp1.
 *
 * YOU SHOULD NOT MODIFY THIS FILE, BECAUSE IT WILL BE
 * OVERWRITTEN WHEN YOU RE-RUN CODE GENERATION.
 *
 * Refer to the MapForce Documentation for further details.
 * http://www.altova.com/mapforce
 */

package com.servicelive.esb.mapforce.Assurant;

import java.io.IOException;

import com.altova.AltovaException;
import com.altova.text.TextNode;
import com.altova.text.flex.*;
import com.altova.text.TextNodeXMLSerializer;


public class AssurantDocument extends TextDocument {

	// Project Root2
	static private CommandProject command_Root2 = new CommandProject("Root", 0);

	// CSV CSV2
	static private CommandStore store_CSV2_Status2 = new CommandStore("Status", 0, "");
	static private CommandStore store_CSV2_Incident_ID2 = new CommandStore("Incident ID", 0, "");
	static private CommandStore store_CSV2_Incident_Comments2 = new CommandStore("Incident Comments", 0, "");
	static private CommandStore store_CSV2_Part_LaborFlag2 = new CommandStore("Part/LaborFlag", 0, "");
	static private CommandStore store_CSV2_First_Name2 = new CommandStore("First Name", 0, "");
	static private CommandStore store_CSV2_Last_Name2 = new CommandStore("Last Name", 0, "");
	static private CommandStore store_CSV2_Address_12 = new CommandStore("Address 1", 0, "");
	static private CommandStore store_CSV2_Address_22 = new CommandStore("Address 2", 0, "");
	static private CommandStore store_CSV2_City2 = new CommandStore("City", 0, "");
	static private CommandStore store_CSV2_State2 = new CommandStore("State", 0, "");
	static private CommandStore store_CSV2_Zip_Code2 = new CommandStore("Zip Code", 0, "");
	static private CommandStore store_CSV2_Zip_Code_Ext2 = new CommandStore("Zip Code Ext", 0, "");
	static private CommandStore store_CSV2_Phone2 = new CommandStore("Phone", 0, "");
	static private CommandStore store_CSV2_Phone_Ext2 = new CommandStore("Phone Ext", 0, "");
	static private CommandStore store_CSV2_Alt_Phone2 = new CommandStore("Alt Phone", 0, "");
	static private CommandStore store_CSV2_Alt_Phone_Ext2 = new CommandStore("Alt Phone Ext", 0, "");
	static private CommandStore store_CSV2_Product_Line2 = new CommandStore("Product Line", 0, "");
	static private CommandStore store_CSV2_NumOfParts_Quantity2 = new CommandStore("NumOfParts/Quantity", 0, "");
	static private CommandStore store_CSV2_Class_Code2 = new CommandStore("Class Code", 0, "");
	static private CommandStore store_CSV2_Class_Comments2 = new CommandStore("Class Comments", 0, "");
	static private CommandStore store_CSV2_Part_Number2 = new CommandStore("Part Number", 0, "");
	static private CommandStore store_CSV2_OEM_Number2 = new CommandStore("OEM Number", 0, "");
	static private CommandStore store_CSV2_Part_Comments_Description2 = new CommandStore("Part Comments/Description", 0, "");
	static private CommandStore store_CSV2_Manufacturer2 = new CommandStore("Manufacturer", 0, "");
	static private CommandStore store_CSV2_Model_Number2 = new CommandStore("Model Number", 0, "");
	static private CommandStore store_CSV2_Serial_Number2 = new CommandStore("Serial Number", 0, "");
	static private CommandStore store_CSV2_Contract_Date2 = new CommandStore("Contract Date", 0, "");
	static private CommandStore store_CSV2_Associated_Incident2 = new CommandStore("Associated Incident", 0, "");
	static private CommandStore store_CSV2_Part_WarrantySKU2 = new CommandStore("Part/WarrantySKU", 0, "");
	static private CommandStore store_CSV2_SpecialCoverageFlag2 = new CommandStore("SpecialCoverageFlag", 0, "");
	static private CommandStore store_CSV2_WarrantyStatus2 = new CommandStore("WarrantyStatus", 0, "");
	static private CommandStore store_CSV2_ContractNum2 = new CommandStore("ContractNum", 0, "");
	static private CommandStore store_CSV2_ExpDate2 = new CommandStore("ExpDate", 0, "");
	static private CommandStore store_CSV2_ShipMethod2 = new CommandStore("ShipMethod", 0, "");
	static private CommandStore store_CSV2_ProviderLocation2 = new CommandStore("ProviderLocation", 0, "");
	static private CommandStore store_CSV2_VendorClaimNum2 = new CommandStore("VendorClaimNum", 0, "");
	static private CommandStore store_CSV2_FutureUse12 = new CommandStore("FutureUse1", 0, "");
	static private CommandStore store_CSV2_AuthorizedAmount2 = new CommandStore("AuthorizedAmount", 0, "");
	static private CommandStore store_CSV2_SupportGroup2 = new CommandStore("SupportGroup", 0, "");
	static private CommandStore store_CSV2_ServicerID2 = new CommandStore("ServicerID", 0, "");
	static private CommandStore store_CSV2_AuthCode2 = new CommandStore("AuthCode", 0, "");
	static private CommandStore store_CSV2_ContractTypeCode2 = new CommandStore("ContractTypeCode", 0, "");
	static private CommandStore store_CSV2_Retailer2 = new CommandStore("Retailer", 0, "");
	static private CommandStore store_CSV2_FutureUse22 = new CommandStore("FutureUse2", 0, "");
	static private CommandStore store_CSV2_FutureUse32 = new CommandStore("FutureUse3", 0, "");
	static private CommandStore store_CSV2_FutureUse42 = new CommandStore("FutureUse4", 0, "");
	static private CommandStore store_CSV2_FutureUse52 = new CommandStore("FutureUse5", 0, "");
	static private ColumnDelimited[] columns_CSV2 = {
		new ColumnDelimited(store_CSV2_Status2, "Status"),
		new ColumnDelimited(store_CSV2_Incident_ID2, "Incident ID"),
		new ColumnDelimited(store_CSV2_Incident_Comments2, "Incident Comments"),
		new ColumnDelimited(store_CSV2_Part_LaborFlag2, "Part/LaborFlag"),
		new ColumnDelimited(store_CSV2_First_Name2, "First Name"),
		new ColumnDelimited(store_CSV2_Last_Name2, "Last Name"),
		new ColumnDelimited(store_CSV2_Address_12, "Address 1"),
		new ColumnDelimited(store_CSV2_Address_22, "Address 2"),
		new ColumnDelimited(store_CSV2_City2, "City"),
		new ColumnDelimited(store_CSV2_State2, "State"),
		new ColumnDelimited(store_CSV2_Zip_Code2, "Zip Code"),
		new ColumnDelimited(store_CSV2_Zip_Code_Ext2, "Zip Code Ext"),
		new ColumnDelimited(store_CSV2_Phone2, "Phone"),
		new ColumnDelimited(store_CSV2_Phone_Ext2, "Phone Ext"),
		new ColumnDelimited(store_CSV2_Alt_Phone2, "Alt Phone"),
		new ColumnDelimited(store_CSV2_Alt_Phone_Ext2, "Alt Phone Ext"),
		new ColumnDelimited(store_CSV2_Product_Line2, "Product Line"),
		new ColumnDelimited(store_CSV2_NumOfParts_Quantity2, "NumOfParts/Quantity"),
		new ColumnDelimited(store_CSV2_Class_Code2, "Class Code"),
		new ColumnDelimited(store_CSV2_Class_Comments2, "Class Comments"),
		new ColumnDelimited(store_CSV2_Part_Number2, "Part Number"),
		new ColumnDelimited(store_CSV2_OEM_Number2, "OEM Number"),
		new ColumnDelimited(store_CSV2_Part_Comments_Description2, "Part Comments/Description"),
		new ColumnDelimited(store_CSV2_Manufacturer2, "Manufacturer"),
		new ColumnDelimited(store_CSV2_Model_Number2, "Model Number"),
		new ColumnDelimited(store_CSV2_Serial_Number2, "Serial Number"),
		new ColumnDelimited(store_CSV2_Contract_Date2, "Contract Date"),
		new ColumnDelimited(store_CSV2_Associated_Incident2, "Associated Incident"),
		new ColumnDelimited(store_CSV2_Part_WarrantySKU2, "Part/WarrantySKU"),
		new ColumnDelimited(store_CSV2_SpecialCoverageFlag2, "SpecialCoverageFlag"),
		new ColumnDelimited(store_CSV2_WarrantyStatus2, "WarrantyStatus"),
		new ColumnDelimited(store_CSV2_ContractNum2, "ContractNum"),
		new ColumnDelimited(store_CSV2_ExpDate2, "ExpDate"),
		new ColumnDelimited(store_CSV2_ShipMethod2, "ShipMethod"),
		new ColumnDelimited(store_CSV2_ProviderLocation2, "ProviderLocation"),
		new ColumnDelimited(store_CSV2_VendorClaimNum2, "VendorClaimNum"),
		new ColumnDelimited(store_CSV2_FutureUse12, "FutureUse1"),
		new ColumnDelimited(store_CSV2_AuthorizedAmount2, "AuthorizedAmount"),
		new ColumnDelimited(store_CSV2_SupportGroup2, "SupportGroup"),
		new ColumnDelimited(store_CSV2_ServicerID2, "ServicerID"),
		new ColumnDelimited(store_CSV2_AuthCode2, "AuthCode"),
		new ColumnDelimited(store_CSV2_ContractTypeCode2, "ContractTypeCode"),
		new ColumnDelimited(store_CSV2_Retailer2, "Retailer"),
		new ColumnDelimited(store_CSV2_FutureUse22, "FutureUse2"),
		new ColumnDelimited(store_CSV2_FutureUse32, "FutureUse3"),
		new ColumnDelimited(store_CSV2_FutureUse42, "FutureUse4"),
		new ColumnDelimited(store_CSV2_FutureUse52, "FutureUse5"),
};
	static private CommandCSV command_CSV2 = new CommandCSV("CSV", columns_CSV2, false, "\r\n", "~", '\"', '\0', true);

	public AssurantDocument()	{
		command_Root2.setNext(command_CSV2);

		rootCommand = command_Root2;
	}
}


