<%@page import="vo.CampHostVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	CampHostVO campingVo = (CampHostVO)request.getAttribute("campingVo");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!-- 부트스트랩 -->
<meta charset="utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no" />
<meta name="description" content="" />
<meta name="author" content="" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>이짝워뗘</title>
<!-- Favicon-->
<link rel="icon" type="image/x-icon" href="assets/favicon.ico" />

<!-- Bootstrap icons-->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css"
	rel="stylesheet" />

<!-- Custom styles for this template-->
<link href="css/sb-admin-2.min.css" rel="stylesheet">
<!-- Core theme CSS (includes Bootstrap)-->
<link href="css/styles.css" rel="stylesheet" />

<!-- Custom fonts for this template-->
<link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet"
	type="text/css">
<link
	href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
	rel="stylesheet">

<style type="text/css">
#headerImg {
	background-size: 100% 100%;
}

#tem1, #tem2, #tem3, #tem4 {
	cursor: pointer;
	padding: 15px;
}

#tem1:hover, #tem2:hover, #tem3:hover, #tem4:hover {
	background-color: #EAEAEA;
}
</style>
<script type="text/javascript">
	function fnMove(seq) {
		var location = document.querySelector("#tema" + seq).offsetTop;
		window.scrollTo({
			top : location,
			behavior : 'smooth'
		});
	}
</script>
</head>
<body class="d-flex flex-column h-100">
	<main class="flex-shrink-0"> 
	<!-- Navigation--> 
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
	<div class="container px-1">
		<a class="navbar-brand" href="index.jsp">
		<img src="images/logo.png" alt="logo" width="100px"></a>
		<button class="navbar-toggler" type="button" data-bs-toggle="collapse"
			data-bs-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav ms-auto mb-2 mb-lg-0">

				

				<li class="nav-item"><a class="nav-link" href="pricing.html">이벤트</a></li>
				<li class="nav-item"><a class="nav-link" href="notice.jsp">공지사항</a></li>
				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" id="navbarDropdownBlog" href="#"
					role="button" data-bs-toggle="dropdown" aria-expanded="false">문의사항</a>
					<ul class="dropdown-menu dropdown-menu-end"
						aria-labelledby="navbarDropdownBlog">
						<li><a class="dropdown-item" href="blog-home.html">Q&A</a></li>
						<li><a class="dropdown-item" href="faq.jsp">FAQ</a></li>
					</ul>
				</li>
				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" id="navbarDropdownPortfolio"
					href="#" role="button" data-bs-toggle="dropdown"
					aria-expanded="false"><i class="fas fa-user-circle"></i></a>
					<ul class="dropdown-menu dropdown-menu-end"
						aria-labelledby="navbarDropdownPortfolio">
						<li><a class="dropdown-item" href="login.jsp">로그인</a></li>
						<li><a class="dropdown-item" href="client/join.do">일반회원 회원가입</a></li>
						<li><a class="dropdown-item" href="host/join.do">호스트 회원가입</a></li>
					</ul>
				</li>
				
			</ul>
		</div>
	</div>
	</nav> 
	
	<!-- Page Content--> 
	<section class="py-5">
	<div class="container px-5">
		<h1 class="fw-bolder fs-5 mb-4">Camping</h1>
		<div class="card border-0 shadow rounded-3 overflow-hidden">
			<div class="card-body p-0">
				<div class="row gx-0">
					<div class="col-lg-6 col-xl-7">
						<div class="bg-featured-blog"
							style="background-image: url('https://dummyimage.com/700x350/343a40/6c757d')"></div>
					</div>
					<div class="col-lg-6 col-xl-5 py-lg-5">
						<div class="p-4 p-md-5">
							<div class="badge bg-primary bg-gradient rounded-pill mb-2">테마</div>
							<div class="badge bg-primary bg-gradient rounded-pill mb-2">유형</div>
							<div class="h2 fw-bolder"><%=campingVo.getCmpNick() %></div>
							<br>
							<p><strong>Tel </strong> <%=campingVo.getCmpTel() %></p>
							<p><strong>Price </strong> <%=campingVo.getCmpFee() %></p>
							<p><strong>Address </strong> <%=campingVo.getCmpAddr() %></p>
							<br>
							<div class="d-grid gap-3 d-sm-flex justify-content-sm-center justify-content-xl-start">
								<a class="btn btn-primary2 btn-lg px-4 me-sm-3" href="#features">예약 하기</a> 
								<a class="btn btn-primary2 btn-lg px-4 me-sm-3" href="#features">리뷰 보기</a>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	</section> 
	<section class="py-5 bg-light">
	<div class="container px-5">
		<div class="row gx-5">
			<div class="col-xl-8">
				<h2 class="fw-bolder fs-5 mb-4">Introduction</h2>
				<!-- News item-->
				<div class="mb-4">
					<div class="small text-muted">June 25, 2021</div>
					<a class="link-dark" href="#!"><h3><%=campingVo.getCmpDesc() %></h3></a>
				</div>
			</div>
			
		</div>
	</div>
	</section> 
	<!-- Blog preview section--> 
	<section class="py-5">
	<div class="container px-5">
		<h2 class="fw-bolder fs-5 mb-4">Location Map</h2>
		<div class="row gx-5">
			<div class="col-lg-4 mb-5">
				<div class="card h-100 shadow border-0">
					
				</div>
			</div>
			
				
		</div>
	</div>
	</section>
	
	</main>
	<!-- Footer-->
	<footer class="bg-dark py-4 mt-auto">
	<div class="container px-5">
		<div
			class="row align-items-center justify-content-between flex-column flex-sm-row">
			<div class="col-auto">
				<div class="small m-0 text-white">Middle Project 2021.06.25</div>
			</div>
			<div class="col-auto">
				<a class="link-light small" href="#!">Privacy</a> <span
					class="text-white mx-1">&middot;</span> <a class="link-light small"
					href="#!">Terms</a> <span class="text-white mx-1">&middot;</span> <a
					class="link-light small" href="#!">Contact</a>
			</div>
		</div>
	</div>
	</footer>

	<!-- Bootstrap core JavaScript-->
	<script src="vendor/jquery/jquery.min.js"></script>
	<script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

	<!-- Core plugin JavaScript-->
	<script src="vendor/jquery-easing/jquery.easing.min.js"></script>

	<!-- Custom scripts for all pages-->
	<script src="js/sb-admin-2.min.js"></script>

	<!-- Bootstrap core JS-->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js"></script>
	<!-- Core theme JS-->
	<script src="js/scripts.js"></script>
</body>
</html>