<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>

	<s:form action="saveproduct" method="post" modelAttribute="product">
	
	ProductName : <s:input path="productName" />
		<s:errors path="productName"></s:errors>
		<br>
	Price : <s:input path="price" />
		<s:errors path="price"></s:errors>
		<br>
	Qty : <s:input path="qty" />
		<s:errors path="qty"></s:errors>
		<br>

		<input type="submit" value="Save Product" />
	</s:form>

</body>
</html>