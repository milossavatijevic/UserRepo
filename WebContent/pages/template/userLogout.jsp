<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var = "user" scope = "session" value = "${loginUser}"/>
<c:if test = "${loginUser != null}">
<div>
	<div>
	Login user:${loginUser.username}&nbsp;
		<c:url value="/application/logout" var="logout"></c:url>
		<a href="<c:out value="${logout}"/>">Logout</a>
	</div>
</div>
</c:if>