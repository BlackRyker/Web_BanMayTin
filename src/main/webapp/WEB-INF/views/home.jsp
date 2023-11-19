<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<input type="button" value="Add customer"
		onclick="window.location.href='showFormAdd';return false;">

	<table>
		<tr>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Email</th>
			<th>Action</th>
		</tr>
		<c:forEach var="temp" items="${sanPhams}">
			<c:url var="updateLink" value="/customer/showFormUpdate">
				<c:param name="customerId" value="${temp.maSp}"></c:param>
			</c:url>
			<c:url var="deleteLink" value="/customer/delete">
				<c:param name="customerId" value="${temp.maSp}"></c:param>
			</c:url>
			<tr>
				<td>${temp.maSp}</td>
				<td>${temp.tenSp}</td>
				<td><a href="${updateLink}">Update</a> <a href="${deleteLink}">Delete</a>
				</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>