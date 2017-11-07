<%--
  Created by IntelliJ IDEA.
  User: weitongyan
  Date: 06/11/2017
  Time: 15:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<c:set var="contextPath" value="${pageContext.request.contextPath}" scope="request"/>
<style type="text/css">
    h2{color: darkgoldenrod}
    h3{color: coral;display: inline}
    h4{color: darksalmon}
</style>
<html>
<HEAD>
    <link rel="stylesheet" href="${contextPath}/static_resource/css/common.css" type="text/css"/>
</HEAD>
<body>
<div>
    <hr color="white">
</div>

<div>
    <div style="text-align: center">
        <h2>Hello Traveller</h2>
    </div>
</div>
<div style="text-align: center;margin-left: 30%;margin-right: 30%">
    <hr color="white">
</div>
<div>
    <div style="text-align: center">
        <div>
            <h3 onmouseover="this.style.color='green'" onmouseleave="this.style.color='coral'" onclick="window.location.href='/home'" style="margin-right: 7%">Home</h3>
            <h3 onmouseover="this.style.color='green'" onmouseleave="this.style.color='coral'" onclick="window.location.href='/you'" >You</h3>
            <h3 onmouseover="this.style.color='green'" onmouseleave="this.style.color='coral'" onclick="window.location.href='/me'" style="margin-left: 7%">Me</h3>
        </div>
    </div>
</div>

<%--<div class="footer" style="text-align: right">--%>
    <%--<hr color="white">--%>
    <%--<h4>java_js_tomcat_centos_jenkins_mysql,all by tim.</h4>--%>
<%--</div>--%>
</body>
</html>

