<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
		<!DOCTYPE html>
		<html>

		<head>
			<meta charset="UTF-8">
			<title>Home</title>
			<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
				integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
				crossorigin="anonymous">
			<link rel="stylesheet"
				href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@24,400,0,0" />
			<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/main.css" />
			<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/user.css" />
		</head>

		<body>
			<div class="container">
				<jsp:include page="header.jsp" />

				<div class="cart-container mt-4 mb-5">
					<c:forEach var="temp" items="${carts}">
						<c:url var="updateLink" value="/product">
							<c:param name="maSp" value="${temp.sanPham.maSp}"></c:param>
						</c:url>
						<c:url var="deleteLink" value="/product/delete">
							<c:param name="maSp" value="${temp.sanPham.maSp}"></c:param>
						</c:url>

						<div class="card mb-3" style="max-width: 540px;">
							<div class="row g-0">
								<div class="col-md-4">
									<img src="${temp.sanPham.anhSp}" class="img-fluid rounded-start" alt="">
								</div>
								<div class="col-md-8">
									<div class="card-body">
										<h5 class="card-title">${temp.sanPham.tenSp}</h5>
										<p class="card-text">${temp.sanPham.giaSp}</p>
										<a href="${deleteLink}" class="mt-5 d-block">
											<span class="material-symbols-outlined">
												delete
											</span>
										</a>
									</div>
								</div>
							</div>
						</div>
					</c:forEach>


				</div>

				<jsp:include page="footer.jsp" />

			</div>
		</body>
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
			integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
			crossorigin="anonymous"></script>

		</html>