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
<h2>SignUp</h2>
<form action="signUpIntoDb" method="post">
<label>EmailId</label>
<input type="email" name="emailid" required><br/>
<label>Password</label>
<input type="password" name="password" required><br/>
<input type="submit" value="submit"/>
<input type="reset" value="reset"/>
</form>
<br/>
<a href="login.jsp">SignUp</a>
</body>
</html>