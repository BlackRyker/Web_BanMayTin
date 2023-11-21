<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>Home</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@24,400,0,0" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/main.css" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/user.css" />
</head>

<body>
	<div class="container">
		<jsp:include page="header.jsp" />

		<div class="w-100 row row-cols-1 row-cols-md-2">
			<div class="col-1 col-md-5">
				<div class="card">
					<img src="${sanPham.anhSp}" class="card-img-top" alt="image">
				</div>
			</div>
			<div class="col-1 col-md-7">
				<div class="d-flex flex-column g-3">
					<p class="fs-2">${sanPham.tenSp}</p>
					<p class="fs-3 text-danger">${sanPham.giaSp}$</p>

				</div>
				<div class="mt-4">
					<c:url var="addLink" value="/product/add">
						<c:param name="maSp" value="${sanPham.maSp}"></c:param>
					</c:url>
					<a href="${addLink}" class="btn btn-danger btn-lg">Add to cart</a>
				</div>

				<div class="mt-4">
					<p class="fs-4 text-dark ">${sanPham.moTaSp}</p>
				</div>
			</div>
		</div>

		<div class="mt-4 mb-5">
			<p class="text-danger fs-3 font-monospace border-1 w-100 mb-1">Relative</p>
			<jsp:include page="list-card.jsp" />
		</div>

		<jsp:include page="list-card.jsp" />
		<jsp:include page="footer.jsp" />

	</div>
</body>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>

</html>