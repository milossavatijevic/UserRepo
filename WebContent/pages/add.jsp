<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add user</title>
</head>
<body>
	<jsp:include page="../pages/template/userLogout.jsp" flush="true"/>
	<jsp:include page="../pages/template/menu.jsp" flush="true"/>
	
	<c:set value="${pageContext.request.contextPath}" var="contextPath"></c:set>

	<form action="${contextPath}/application/add" method="post">
		<table>
			<tr>
				<td>Name:</td>
				<td><input type="text" id="name" name="name" /></td>
			</tr>
			<tr>
				<td>Lastname:</td>
				<td><input type="text" id="lastname" name="lastname" /></td>
			</tr>
			<tr>
				<td>Username:</td>
				<td><input type="text" id="username" name="username" /></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type="password" id="password" name="password" /></td>
			</tr>
			<tr>
				<td><input type="submit" id="save" name="action" value="Save" /></td>
			</tr>
			<tr>
				<td><c:out value="${requestScope.validationError}"></c:out></td>
			</tr>
		</table>
	</form>
</body>
</html>