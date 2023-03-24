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
<h2>Store Product</h2>
<form action="storeProduct" method="post">
<label>PId</label>
<input type="number" name="pid" required="required"><br/>
<label>PName</label>
<input type="text" name="pname" required="required"><br/>
<label>Price</label>
<input type="number" name="price" required="required"><br/>
<input type="submit" value="store product"/>
<input type="reset" value="reset"/>
</form>
</body>
</html>