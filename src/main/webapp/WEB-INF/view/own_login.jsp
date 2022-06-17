<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Own Form Login</title>
<style>
.errorFormat{
color:red;	
}
</style>

</head>
<body>
	<h3 style="text-align:center">Login Page</h3>
	
	<form:form action="${pageContext.request.contextPath}/userAuthentication" method="POST">

		<p>User: <input type="text" name="username"/><p>
		<p>Password: <input type="text" name="password"/><p>
		<input type="submit" value="LOGIN">
		<c:if test="${param.error!=null}">
			<strong class="errorFormat">Username and/or password INCORRECT !!!</strong>
		</c:if>
	</form:form>
</body>
</html>