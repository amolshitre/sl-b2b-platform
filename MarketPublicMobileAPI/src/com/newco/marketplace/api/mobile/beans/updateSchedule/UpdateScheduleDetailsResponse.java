package com.newco.marketplace.api.mobile.beans.updateSchedule;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import com.newco.marketplace.api.annotation.XSD;
import com.newco.marketplace.api.beans.Results;
import com.newco.marketplace.api.common.IAPIResponse;
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XSD(name="updateScheduleDetailsResponse.xsd", path="/resources/schemas/mobile/v3_1/")
@XmlRootElement(name = "updateScheduleDetailsResponse")
@XStreamAlias("updateScheduleDetailsResponse")
@XmlAccessorType(XmlAccessType.FIELD)
public class UpdateScheduleDetailsResponse implements IAPIResponse {

	@XStreamAlias("results")
	private Results results;


	public Results getResults() {
		return results;
	}

	public void setResults(Results results) {
		this.results = results;
	}

	public void setVersion(String version) {}
	public void setSchemaLocation(String schemaLocation) {}
	public void setNamespace(String namespace) {}
	public void setSchemaInstance(String schemaInstance) {}
}
