<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="c"     uri="http://java.sun.com/jsp/jstl/core"%>

<jsp:include page="/jsp/public/common/commonIncludes.jsp" />

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html>
	<head>
		<title>ServiceLive [Terms of Use]</title><link rel="shortcut icon" href="${staticContextPath}/images/favicon.ico" />
		<script type="text/javascript" src="${staticContextPath}/javascript/dojo/dojo/dojo.js"
			djConfig="isDebug: false, parseOnLoad: true"></script>
		<script type="text/javascript">
			dojo.require("dijit.layout.ContentPane");
			dojo.require("dijit.TitlePane");
			dojo.require("dijit.Dialog");
			dojo.require("dijit._Calendar");
			dojo.require("dojo.date.locale");
			dojo.require("dojo.parser");
			dojo.require("dijit.layout.LinkPane");
			
</script>
		<style type="text/css">
@import "${staticContextPath}/javascript/dojo/dijit/themes/tundra/tundra.css";

@import "${staticContextPath}/javascript/dojo/dijit/themes/tundra/tundra_rtl.css";
</style>
		<link rel="stylesheet" type="text/css"
			href="${staticContextPath}/css/dijitTitlePane-serviceLive.css">
		<link rel="stylesheet" type="text/css"
			href="${staticContextPath}/css/dijitTabPane-serviceLive.css">
		<link rel="stylesheet" type="text/css" href="${staticContextPath}/css/main.css" />
		<link rel="stylesheet" type="text/css" href="${staticContextPath}/css/iehacks.css" />
		<link rel="stylesheet" type="text/css"
			href="${staticContextPath}/css/top-section.css" />
		<link rel="stylesheet" type="text/css" href="${staticContextPath}/css/tooltips.css" />
		<link rel="stylesheet" type="text/css" href="${staticContextPath}/css/buttons.css" />
		<script language="JavaScript" src="${staticContextPath}/javascript/tooltip.js"
			type="text/javascript"></script>
		<script language="JavaScript" type="text/javascript"
			src="${staticContextPath}/javascript/formfields.js"></script>
		<script type="text/javascript" src="${staticContextPath}/javascript/jquery/jquery.min.js"></script>
		<script language="JavaScript" type="text/javascript"
			src="${staticContextPath}/javascript/nav.js"></script>
		<script type="text/javascript" src="${staticContextPath}/javascript/banner.js"></script>
		<script type="text/javascript" src="${staticContextPath}/javascript/plugins/css_browser_selector.js"></script>
		<style type="text/css">
	.ff3 .bannerDiv{margin-left:-50px;}  
	.ff2 .bannerDiv{margin-left:-60px;}
	.ie9 .bannerDiv{margin-left:0px;}
	.ie8 .bannerDiv{margin-left:-50px;}
	@media screen and (-webkit-min-device-pixel-ratio:0) {
    #bannerDiv{margin-left:-50px;}
			</style>
        <link rel="stylesheet" type="text/css" href="${staticContextPath}/css/banner.css" />
		<script language="javascript">
		
	//selectedNav = function (){ $("profileAndPrefs").addClass("selected"); } 
	//window.addEvent('domready',selectedNav);
	
</script>
	<c:if test="${pageHeader == 'Provider Agreement'}">
			<jsp:include page="/jsp/public/common/omitInclude.jsp" flush="true">
			       <jsp:param name="PageName" value="TermsProviderAgreement"/>
			</jsp:include>
	</c:if>
	<c:if test="${pageHeader == 'Buyer Agreement'}">
			<jsp:include page="/jsp/public/common/omitInclude.jsp" flush="true">
			       <jsp:param name="PageName" value="TermsBuyerAgreement"/>
			</jsp:include>
	</c:if>
	</head>
	
    <!--<jsp:include page="/jsp/public/blueprint/browserCompatibilityBanner.jsp"></jsp:include>-->
    <body class="tundra">
	    <div id="page_margins">
			<div id="page">
				<!-- START HEADER -->
				<div id="header" style="height: 100px;">
					<div id="pageHeader" style="top: 30px;">
						<h2>${pageHeader} - <span style="color:#00A0D2">Key Items Highlighted Below</span></h2>
						
					</div>
				</div>
				<!-- END HEADER -->
				<div>
					<div class="content" style="color: #000; padding: 0 20px;">
						${text}
					</div>
				</div>
				<div class="colRight255">
				</div>
				<div class="clear"></div>
			</div>
		</div>
	</body>
</html>
