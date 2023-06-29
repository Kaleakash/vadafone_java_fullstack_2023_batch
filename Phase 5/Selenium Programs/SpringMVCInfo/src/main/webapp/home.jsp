<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
${requestScope.msg}	
<a href="#">First Link</a> |
<a href="#">Second Link</a> |
<a href="#">Third Link</a> |
<a href="#">Fourth Link</a> |
<br/>
<form action="logout">
<input type="submit" value="Logout">
</form>
</body>
</html>