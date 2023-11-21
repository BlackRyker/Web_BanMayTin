<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
		<!DOCTYPE html>
		<html>

		<head>
			<meta charset="UTF-8">
			<title>Admin</title>
			<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
				integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
				crossorigin="anonymous">
			<link rel="stylesheet"
				href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@24,400,0,0" />
			<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/main.css" />
			<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/user.css" />
		</head>

		<body>
			<div class="row row-cols-1 row-cols-md-3 row-cols-lg-5 g-4">
				<c:forEach var="temp" items="${sanPhams}">
					<c:url var="productLink" value="/product">
						<c:param name="productId" value="${temp.maSp}"></c:param>
					</c:url>

					<div class="col">
						<a href="${productLink}">
							<div class="card">
								<img src="${temp.anhSp}" class="card-img-top" alt="image">
								<div class="card-body">
									<h5 class="card-title">${temp.tenSp}</h5>
									<p class="card-text">${temp.giaSp}</p>
								</div>
							</div>
						</a>
					</div>
				</c:forEach>

			</div>
		</body>
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
			integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
			crossorigin="anonymous"></script>

		</html>