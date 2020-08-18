<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<s:if test="%{errors.size > 0}">
<div class="errorBox clearfix" width="100%">
<%--	<label class="error"><strong>ERRORS EXIST</strong></label>--%>

			<s:iterator  value="errors" status="error">
			<p class="errorMsg">
				${errors[error.index].fieldId} -  ${errors[error.index].msg}
			</p>
			</s:iterator>

</div>
<br>
</s:if>
<s:if test="%{warnings.size > 0}">
<div class="warningBox clearfix" width="100%">

		<s:iterator  value="warnings" status="warning"  >
			<p class="warningMsg contentWellPane">
				<span>${warnings[warning.index].fieldId} -  ${warnings[warning.index].msg}</span>
			</p>
		</s:iterator>
</div>
<br>
</s:if>