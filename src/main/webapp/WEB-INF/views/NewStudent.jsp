<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="s" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<style type="text/css">
.error {
	color: red;
}
</style>
</head>
<body>
	<h3>Signup</h3>



	<s:form action="savestudent" method="post" modelAttribute="student">
		FirstName : <s:input path="firstName" />
		<s:errors cssClass="error" path="firstName"></s:errors>
		<br>

		<br>
		Email : <s:input path="email" />
		<s:errors path="email" cssClass="error"></s:errors>

		<br>
		Password: <s:password path="password" />
		<s:errors cssClass="error" path="password"></s:errors>

		<br>

		<input type="submit" value="Save" />
	</s:form>

</body>
</html>









