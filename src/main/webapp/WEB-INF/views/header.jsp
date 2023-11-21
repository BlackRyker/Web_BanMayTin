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
			<header class=" p-3 bg-dark text-white">
				<div class="container">
					<div class="d-flex flex-wrap align-items-center justify-content-center justify-content-lg-start">
						<a href="/" class="d-flex align-items-center mb-2 mb-lg-0 text-white text-decoration-none">

						</a>

						<ul class="nav col-12 col-lg-auto me-lg-auto mb-2 justify-content-center mb-md-0">
							<c:url var="home" value="/"></c:url>
							<li><a href="${home}" class="nav-link px-2 text-white">Home</a></li>
							<li><a href="#" class="nav-link px-2 text-secondary">Features</a></li>
							<li><a href="#" class="nav-link px-2 text-secondary">Pricing</a></li>
							<li><a href="#" class="nav-link px-2 text-secondary">FAQs</a></li>
							<li><a href="#" class="nav-link px-2 text-secondary">About</a></li>
						</ul>

						<form class="col-12 col-lg-auto mb-3 mb-lg-0 me-lg-3">
							<input type="search" class="form-control form-control-dark" placeholder="Search..."
								aria-label="Search">
						</form>

						<div class="text-end d-flex g-2">
							<button type="button" class="btn btn-outline-light me-2">Login</button>
							<button type="button" class="btn btn-warning">Sign-up</button>

							<c:url var="cartLink" value="/cart"></c:url>
							<a href="${cartLink}" class="btn-cart"> <span class="material-symbols-outlined">
									shopping_cart </span>
							</a>
						</div>
					</div>
				</div>
			</header>
		</body>
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
			integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
			crossorigin="anonymous"></script>

		</html>