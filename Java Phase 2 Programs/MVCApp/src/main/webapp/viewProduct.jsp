<%@page import="java.util.Iterator"%>
<%@page import="com.entity.Product"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
Object obj = request.getAttribute("listOfProduct");
List<Product> ll = (List)obj;
Iterator<Product> li = ll.iterator();
while(li.hasNext()){
	Product p = li.next();
	%>
	<div>
<img  src="<%=p.getImageUrl()%>"  width="200" height="200">
<span>Name : <%=p.getPname() %> Price :<%=p.getPrice() %></span>
</div>
	<% 
}
%>
</body>
</html>