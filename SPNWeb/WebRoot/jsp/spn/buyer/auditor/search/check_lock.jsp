<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%><%@ taglib prefix="s" uri="/struts-tags"%><%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %><%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>{"isLocked": "${expandCriteriaVO.lockedRecord}", "modifiedDate": "<fmt:formatDate pattern='yyyy-MM-dd HH:mm:ss' value='${expandCriteriaVO.orginalModifiedDate_Date}' />"}