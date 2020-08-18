<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ taglib prefix="c"   uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s"   uri="/struts-tags" %>
<%@ taglib prefix="fn"  uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<c:set var="contextPath" scope="request" value="<%=request.getContextPath()%>" />
<c:set var="staticContextPath" scope="request" value="<%=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+"/ServiceLiveWebUtil"%>" />
<div dojoType="dijit.TitlePane" title="Auditor Actions" class="dijitTitlePaneSubTitle">
  <p>
    <label>Select Action</label>
    <select style="width: 200px;" onclick="changeDropdown(this)" class="grayText">
      <option>Select Action</option>
    </select>
  </p>
   <p><input width="59" type="image" height="20" src="${staticContextPath}/images/common/spacer.gif" style="background-image: url(${staticContextPath}/images/btn/select_gray_bg.gif);" class="btn20Bevel"/></p>
</div>
 <p><input width="131" type="image" height="27" src="${staticContextPath}/images/common/spacer.gif" style="background-image: url(${staticContextPath}/images/btn/returnToAuditItems.gif);" class="btn27"/></p>
