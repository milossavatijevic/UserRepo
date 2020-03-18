<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Users on system</title>
</head>
<body>
	<jsp:include page="../pages/template/userLogout.jsp" flush="true"/>
	<jsp:include page="../pages/template/menu.jsp" flush="true"/>
	

		<table>
			<thead>
				<tr>
					<th>Username</th>
				</tr>
			</thead>
			<c:forEach items="${applicationScope.loggedUsers}" var="user">
			<tbody>
				<tr>
					<td>${user.username}</td>
				</tr>
				</tbody>
			</c:forEach>
		</table>
</body>
</html>