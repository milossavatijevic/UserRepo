<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All users</title>
</head>
<body>
	<jsp:include page="../pages/template/userLogout.jsp" flush="true"/>
	<jsp:include page="../pages/template/menu.jsp" flush="true"/>
	
	<c:set value="${pageContext.request.contextPath}" var="contextPath"></c:set>

		<table>
			<thead>
				<tr>
					<th>Name</th>
					<th>Lastname</th>
					<th>Username</th>
				</tr>
			</thead>
			<c:forEach items="${applicationScope.users}" var="user">
			<tbody>
				<tr>
					<td>${user.name}</td>
					<td>${user.lastname}</td>
					<td>${user.username}</td>
				</tr>
				</tbody>
			</c:forEach>
		</table>
</body>
</html>