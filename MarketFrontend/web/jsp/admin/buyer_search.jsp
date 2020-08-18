<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<c:set var="contextPath" scope="request"
	value="<%=request.getContextPath()%>" />

<c:set var="staticContextPath" scope="request" value="<%=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+"/ServiceLiveWebUtil"%>" />
<div id="search_by_buyer" style="display: block">
	<div class="darkGrayModuleHdr">
		Find by Buyer
	</div>
	<div class="grayModuleContent mainWellContent clearfix">
		<table cellspacing="5" cellpadding="0" border=0>
			<tbody>
				<tr>
					
					<td width="350">
						
						
						<p>
							<label>
								Company ID Number
							</label>
							<br>
							<s:textfield theme="simple" name="buyerId" id="buyerId"
								cssClass="shadowBox grayText" cssStyle="width: 250px;"
								value="%{buyerId}" maxlength="25" />
						</p>
					</td>
					
					<td colspan="2">
						<p>
							<label>
								Service Order Number
							</label>
							<br />
							<s:textfield theme="simple" name="buyer_orderNumber" id="buyer_orderNumber"
								cssClass="shadowBox grayText" cssStyle="width: 250px;"
								value="%{buyer_orderNumber}" maxlength="25" />

						</p>
					</td>
				</tr>
				
				<tr>
					<td>
						<p>
							<label>
								User Name
							</label>
							<br>
							<s:textfield theme="simple" name="buyer_username" id="buyer_username"
								cssClass="shadowBox grayText" cssStyle="width: 250px;"
								value="%{buyer_username}" maxlength="25" />
						</p>
					</td>
					<td colspan="2">
						<p>
							<label>
								Business Name
							</label>
							<br />
							<s:textfield theme="simple" name="buyer_businessName" id="buyer_businessName"
								cssClass="shadowBox grayText" cssStyle="width: 250px;"
								value="%{buyer_businessName}" maxlength="25" />

						</p>
					</td>
				</tr>
				<tr>
					<td>
						<p>
							<label>
								City
							</label>
							<br>
							<s:textfield theme="simple" name="buyer_city" id="buyer_city"
								cssClass="shadowBox grayText" cssStyle="width: 250px;"
								value="%{buyer_city}" maxlength="25" />
						</p>
					</td>
					<td width="55">
						<p>
							<label>
								State
							</label>
							<br />



							<s:select id="buyer_state" name="buyer_state" headerKey="-1"
								headerValue="Select One" cssStyle="width: 110px;" size="1"
								theme="simple" list="#application['stateCodes']" listKey="type"
								listValue="descr" />

						</p>
					</td>
					<td>
						<p>
							<label>
								ZIP
							</label>
							<br />
							<s:textfield theme="simple" name="buyer_zip" id="buyer_zip"
								cssClass="shadowBox grayText" cssStyle="width: 60px;"
								value="%{buyer_zip}" maxlength="5" />
						</p>
					</td>
				</tr>
				<tr>
					<td>
						<p>
							<label>
								Phone Number
							</label>
							<br>
							<s:textfield theme="simple" name="buyer_phone" id="buyer_phone"
								cssClass="shadowBox grayText" cssStyle="width: 250px;"
								value="%{buyer_phone}" maxlength="25" />
						</p>
					</td>
					<td colspan="2">
						<p>
							<label>
								Email
							</label>
							<br>
							<s:textfield theme="simple" name="buyer_email" id="buyer_email"
								cssClass="shadowBox grayText" cssStyle="width: 250px;"
								value="%{buyer_email}" maxlength="40" />
						</p>
					</td>
				</tr>

			</tbody>
		</table>
	</div>
</div>

