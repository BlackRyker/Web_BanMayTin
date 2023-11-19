<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Save Customer</title>
</head>
<body>
	<h3>Save Customer</h3>
	<form:form action="saveCustomer" modelAttribute="customer"
		method="POST">
		<form:hidden path="id" />
		
		<label>First Name</label>
		<form:input path="firstName"/>
		<br>
		<label>last Name</label>
		<form:input path="lastName"/>
		<br>
		
		<input type="submit" value="Save">
	</form:form>
	
	
	<a href="${pageContext.request.contextPath}/customer/list">Back to List</a>
</body>
</html>