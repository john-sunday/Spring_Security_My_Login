<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3 style="text-align:center">Login Page</h3>
	
	<form:form action="${pageContext.request.contextPath }/userAuthentication" method="POST">
		<p>
		User: <input type="text" name="username"/>
		<p>
		<p>
		Password: <input type="text" name="password"/>
		<p>
		<input type="submit" value="LOGIN">
	</form:form>
</body>
</html>