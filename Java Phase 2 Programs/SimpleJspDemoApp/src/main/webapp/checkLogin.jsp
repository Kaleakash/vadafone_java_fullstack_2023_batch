<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%! String emailid,password; %>
<%
emailid = request.getParameter("emailid");
password = request.getParameter("pass");
if(emailid.equals("akash@gmail.com") && password.equals("123")){
	out.println("successfully login");
}else {
	out.println("failure try once again");
}
%>
</body>
</html>