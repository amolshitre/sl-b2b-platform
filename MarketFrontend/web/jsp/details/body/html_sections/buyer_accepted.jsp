<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath" scope="request" value="<%=request.getContextPath()%>" />
<c:set var="staticContextPath" scope="request" value="<%=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+"/ServiceLiveWebUtil"%>" />

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html>
	<head>
	
		<title>[Buyer Accepted]</title><link rel="shortcut icon" href="${staticContextPath}/images/favicon.ico" />
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="this is my page">
		<meta http-equiv="content-type" content="text/html; charset=ISO-8859-1">
		<script type="text/javascript" src="../../js/prototype.js"></script>
		<script type="text/javascript" src="../../js/tooltip.js"></script>
        <script type="text/javascript" src="../../js/formfields.js"></script>
		<style type="text/css">
			@import "${staticContextPath}/javascript/dojo/dijit/themes/tundra/tundra.css";
			@import "${staticContextPath}/javascript/dojo/dijit/themes/tundra/tundra_rtl.css";
		</style>
		<link rel="stylesheet" type="text/css" href="../../css/main.css" />
		<link rel="stylesheet" type="text/css" href="../../css/iehacks.css" />
		<link rel="stylesheet" type="text/css" href="../../css/top-section.css" />
		<link rel="stylesheet" type="text/css" href="../../css/buttons.css" />
		<link rel="stylesheet" type="text/css" href="../../css/tooltips.css" />
        <link rel="stylesheet" type="text/css" href="../../css/so_details.css">
		<script type="text/javascript" src="${staticContextPath}/javascript/dojo/dojo/dojo.js" djConfig="isDebug: false, parseOnLoad: true"></script>
		<script type="text/javascript">
			dojo.require("dijit.layout.ContentPane");
			dojo.require("dijit.layout.TabContainer");
			dojo.require("dijit.TitlePane");
			dojo.require("dojo.parser");
			//dojo.require("newco.servicelive.SOMRealTimeManager");
		</script>
		<script language="JavaScript" type="text/javascript">
			//_commonSOMgr = new SOMRealTimeManager('../../ajax/AjaxJSonManager.action',10000);
		</script>
		<link rel="stylesheet" type="text/css" href="${staticContextPath}/css/dijitTabPane-serviceLive.css">
		<link rel="stylesheet" type="text/css" href="../../css/dijitTitlePane-serviceLive.css">
		<link rel="stylesheet" type="text/css" href="../../css/service_order_wizard.css" />
	</head>
	<body class="tundra">
	
		<jsp:include page="/jsp/public/common/omitInclude.jsp" flush="true">
			 <jsp:param name="PageName" value="SOD - Buyer Accepted"/>
		</jsp:include>	
	
		<div id="page_margins">
			<div id="page">
				<div dojoType="dijit.layout.ContentPane" href="html_sections/header/hdr_buyer.html">
				</div>
				<div id="mainTabContainer" dojoType="dijit.layout.TabContainer"
					style="height: 4500px; width: 975px; margin: 0;" class="detailsTabs">
					<div id="Summary" dojoType="dijit.layout.ContentPane"
						title="Summary" selected="true" href="html_sections/modules/tab_summary_accepted.html">
					</div>
					
					
                    <div dojoType="dijit.layout.ContentPane"
						title="Notes" selected="false"
						href="html_sections/modules/tab_so_notes.html">
					</div>
					
					<div dojoType="dijit.layout.ContentPane"
						title="Order History" selected="false"
						href="html_sections/modules/tab_so_history.html">
					</div>
					<div dojoType="dijit.layout.ContentPane"
						title="ServiceLive Support" selected="false"
						href="html_sections/modules/tab_support.html">
					</div>
				</div>
				<!-- END TAB PANE -->
				<div class="clear"></div>
				
				<jsp:include page="/jsp/public/common/defaultFooter.jsp" />
			</div>
		</div>
	</body>
</html>
