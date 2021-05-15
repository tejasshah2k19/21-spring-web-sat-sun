<%@ page language="java" isELIgnored="false"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>

	Welcome, ${student.firstName}
	
	<img src="${pageContext.request.contextPath}${student.profilePicPath}" height="200px" width="200px"></img>
	<br>
	<br>

	<a href="calc">Calc</a>
	<br>

	<a href="newproduct">Add New Product</a>
	<br>
	<a href="listproducts">List aLL Products</a>
	<br>
	<a href="uploadstudentprofile">Upload Profile Pic</a>
	<br>
	<a href="logout">Logout</a>
	<br>
	${msg}
	<Br>
	${pageContext.request.contextPath}${student.profilePicPath}
</body>
</html>