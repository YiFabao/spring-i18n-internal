<%@ page contentType="text/html;charset=UTF-8" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head><title><spring:message code="user.title"/></title></head>
<body>
<a href="updateLanguage?locale=en">English </a> | <a href="updateLanguage?locale=zh_CN">中文</a>

<h3><spring:message code="user.title"/></h3>
<table>
    <form:form action="save" method="post" commandName="user">
        <tr>
            <td><spring:message code="user.name"/>:</td>
            <td><input type="text" name="name"/></td>
        </tr>
        <tr>
            <td><spring:message code="user.age"/> :</td>
            <td><input type="text" name="age"/></td>
        </tr>
        <tr>
            <td colspan=2>
                <spring:message code="user.submit" var="valSubmit"></spring:message>
                <input type="submit" value="${valSubmit}">
            </td>
        </tr>
    </form:form>
</table>
</body>
</html>
