<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<div style="margin-left: 10px;">
	<label>
		Name New Campaign <span class="req">*</span>
	</label>
	<s:textfield id="inviteCampaignName" name="inviteCampaignName"
		theme="simple" cssClass="text" value="%{inviteCampaignName}" maxlength="250" />
	<p>
		Naming your campaign will save these settings to use again with this
		SPN.
	</p>
</div>
