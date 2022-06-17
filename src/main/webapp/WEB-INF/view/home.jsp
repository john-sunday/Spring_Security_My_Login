<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>Welcome</h1>
	<hr>
	<h3>We have come !!!</h3>
	
	<p>
	User: <security:authentication property="principal.username"/>
	<br>
	<br>
	Rol: <security:authentication property="principal.authorities"/>
	</p>
	<br>
	<!-- Administrators link -->
	<p>
	<a href="${pageContext.request.contextPath }/administrators">Go to administrators zone</a>
	</p>
	
	<form:form action="${pageContext.request.contextPath}/logout" method="POST">
		<input type="submit" value="Log Out">
	</form:form>
</body>
</html>