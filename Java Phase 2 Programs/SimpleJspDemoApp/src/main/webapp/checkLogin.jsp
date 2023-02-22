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
//RequestDispatcher rd1 = request.getRequestDispatcher("Home.jsp");
//RequestDispatcher rd2 = request.getRequestDispatcher("login.jsp");
if(emailid.equals("akash@gmail.com") && password.equals("123")){
	out.println("successfully login");
	//rd1.forward(request, response);
	%>
		<jsp:forward page="Home.jsp"></jsp:forward>
	<%
}else {
	out.println("failure try once again");
	//rd2.include(request, response);
			%>
	<jsp:include page="login.jsp"></jsp:include>		
			<%
}
%>
</body>
</html>