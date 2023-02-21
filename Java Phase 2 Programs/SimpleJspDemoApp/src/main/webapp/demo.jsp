<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome to Simple HTML Page</h1>
	<%-- JSP Comments --%>
	<%!int a,b,sum; %>
	<%
		a=100;
		b=200;
		sum = a+b;
		out.println("Welcome to JSP Page");
		out.println("Sum of two number is "+sum);
		out.println("<font color=red>sum of two number is "+sum+"</font>");
	%>
	<p>Sum of two number is <%=100+200 %> </p>
	<font color="blue" size=4>Sum of <%=a %> and <%=b %> is <%=sum %></font>
</body>
</html>