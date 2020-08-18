

package com.newco.marketplace.api.beans.hi.account.firm.v1_0;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XStreamAlias("credentials")
@XmlAccessorType(XmlAccessType.FIELD)
public class Credentials {

	@XStreamImplicit(itemFieldName="credential")
    private List<Credential> credential;

	public List<Credential> getCredential() {
		return credential;
	}

	public void setCredential(List<Credential> credential) {
		this.credential = credential;
	}


}