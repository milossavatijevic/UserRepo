<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set value="${pageContext.request.contextPath}" var="contextPath"></c:set>
<div>
	<c:url value="${contextPath}/application/users/all" var="allUserURL"></c:url>
	<a href="<c:out value="${allUserURL}"/>">All users</a>
	<!-- <a href="/pages/all.jsp">All users</a> -->
</div>
<c:set var = "user" scope = "session" value = "${loginUser}"/>
<c:if test = "${loginUser != null}">
<div>
	<c:url value="${contextPath}/application/users/add" var="addUserURL"></c:url>
	<a href="<c:out value="${addUserURL}"/>">Add new user</a>
	<!-- <a href="/pages/add.jsp">Add new user</a> -->
</div>

<div>
	<c:url value="${contextPath}/application/users/login" var="sysUserURL"></c:url>
	<a href="<c:out value="${sysUserURL}"/>">User on system</a>
</div>
</c:if>