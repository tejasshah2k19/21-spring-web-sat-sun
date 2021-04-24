<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="g" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="z" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
</head>
<body>

 




	<table border="1">            
		<tr>
			<th>ProductId</th>
			<th>ProductName</th>
			<th>Price</th>
			<th>Qty</th>
			<th>Action</th>
		</tr>

		<g:forEach items="${products}" var="p">
			<tr>
				<td>${p.productId}</td>
				<td>${p.productName}</td>
				<td>${p.price}</td>
				<td>${p.qty}</td>
				<td><a href="deleteproduct?productId=${p.productId}">Delete</a>
					|
					<a href="editproduct?productId=${p.productId}">Edit</a>	
				
				</td>
				
				
			</tr>
		</g:forEach>


	</table>



</body>
</html>