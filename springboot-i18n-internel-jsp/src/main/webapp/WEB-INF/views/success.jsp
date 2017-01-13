<%@ page contentType="text/html;charset=UTF-8" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<html>
<head><title><spring:message code="user.title"/></title></head>
<body>
<a href="updateLanguage?locale=en">English </a> | <a href="updateLanguage?locale=zh_CN">中文 </a>

<h3><spring:message code="user.success"/></h3>
</body>
</html>
