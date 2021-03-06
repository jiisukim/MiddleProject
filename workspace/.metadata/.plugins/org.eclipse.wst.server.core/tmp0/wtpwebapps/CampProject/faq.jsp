<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="vo.AdminVO"%>
<%@page import="vo.ConstVO"%>
<%@page import="vo.MemVO"%>
<%@page import="vo.CampHostVO"%>
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
<title>공지사항</title>
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

main {
	height: 897px;
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
<%
HttpSession loginSession = request.getSession();
String loginType = (String) loginSession.getAttribute(ConstVO.LOGIN_TYPE);
MemVO memVO = (MemVO) loginSession.getAttribute("memVO");
CampHostVO hostVO = (CampHostVO) loginSession.getAttribute("hostVO");
AdminVO adminVO = (AdminVO) loginSession.getAttribute("adminVO");
%>
</head>
<body>
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
			<%
			// 사용자 로그인시 항목
			if(ConstVO.LOGIN_TYPE_USER.equals(loginType) ) {
			%>
			<ul class="navbar-nav ms-auto mb-2 mb-lg-0">
				<li class="nav-item"><a class="nav-link" href="/event/list.do">캠핑장</a></li>
				<li class="nav-item"><a class="nav-link" href="/event/list.do">이벤트</a></li>
				<li class="nav-item"><a class="nav-link" href="/host/hostNotice.do">공지사항</a></li>
				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" id="navbarDropdownBlog" href="#"
					role="button" data-bs-toggle="dropdown" aria-expanded="false">문의사항</a>
					<ul class="dropdown-menu dropdown-menu-end"
						aria-labelledby="navbarDropdownBlog">
						<li><a class="dropdown-item" href="blog-home.html">Q&A</a></li>
						<li><a class="dropdown-item" href="/faq.do">FAQ</a></li>
					</ul>
				</li>
				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" id="navbarDropdownPortfolio"
					href="#" role="button" data-bs-toggle="dropdown"
					aria-expanded="false"><i class="fas fa-user-circle"></i></a>
					<ul class="dropdown-menu dropdown-menu-end"
						aria-labelledby="navbarDropdownPortfolio">
						
						<%
						if(memVO == null) {
						%>
						<li><a class="dropdown-item" href="login.do">로그인</a></li>
						<li><a class="dropdown-item" href="portfolio-item.html">회원가입</a></li>
						<%
						} else {
						%>
						<li><a class="dropdown-item" href="logout.do">로그아웃</a></li>
						<li><a class="dropdown-item" href="portfolio-item.html">마이페이지</a></li>
						<%
						}
						%>
					</ul>
				</li>
				
			</ul>
			<%	
			// 업체 로그인시 항목
			}else if(ConstVO.LOGIN_TYPE_HOST.equals(loginType)){
			%>
			<ul class="navbar-nav ms-auto mb-2 mb-lg-0">
				<li class="nav-item"><a class="nav-link" href="/event/list.do">캠핑장</a></li>
				<li class="nav-item"><a class="nav-link" href="/event/list.do">이벤트</a></li>
				<li class="nav-item"><a class="nav-link" href="/host/hostNotice.do">공지사항</a></li>
				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" id="navbarDropdownBlog" href="#"
					role="button" data-bs-toggle="dropdown" aria-expanded="false">문의사항</a>
					<ul class="dropdown-menu dropdown-menu-end"
						aria-labelledby="navbarDropdownBlog">
						<li><a class="dropdown-item" href="blog-home.html">Q&A</a></li>
						<li><a class="dropdown-item" href="/faq.do">FAQ</a></li>
					</ul>
				</li>
				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" id="navbarDropdownPortfolio"
					href="#" role="button" data-bs-toggle="dropdown"
					aria-expanded="false"><i class="fas fa-user-circle"></i></a>
					<ul class="dropdown-menu dropdown-menu-end"
						aria-labelledby="navbarDropdownPortfolio">
						
						<%
						if(hostVO == null) {
						%>
						<li><a class="dropdown-item" href="login.do">로그인</a></li>
						<li><a class="dropdown-item" href="portfolio-item.html">회원가입</a></li>
						<%
						} else {
						%>
						<li><a class="dropdown-item" href="logout.do">로그아웃</a></li>
						<li><a class="dropdown-item" href="portfolio-item.html">마이페이지</a></li>
						<%
						}
						%>
					</ul>
				</li>
				
			</ul>
			<%
			// 관리자 로그인시 항목	
			}else if(ConstVO.LOGIN_TYPE_ADMIN.equals(loginType)){
			%>
			<ul class="navbar-nav ms-auto mb-2 mb-lg-0">
				<li class="nav-item"><a class="nav-link" href="/event/list.do">캠핑장</a></li>
				<li class="nav-item"><a class="nav-link" href="/event/list.do">이벤트</a></li>
				<li class="nav-item"><a class="nav-link" href="/host/hostNotice.do">공지사항</a></li>
				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" id="navbarDropdownBlog" href="#"
					role="button" data-bs-toggle="dropdown" aria-expanded="false">문의사항</a>
					<ul class="dropdown-menu dropdown-menu-end"
						aria-labelledby="navbarDropdownBlog">
						<li><a class="dropdown-item" href="blog-home.html">Q&A</a></li>
						<li><a class="dropdown-item" href="/faq.do">FAQ</a></li>
					</ul>
				</li>
				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" id="navbarDropdownPortfolio"
					href="#" role="button" data-bs-toggle="dropdown"
					aria-expanded="false"><i class="fas fa-user-circle"></i></a>
					<ul class="dropdown-menu dropdown-menu-end"
						aria-labelledby="navbarDropdownPortfolio">
						
						<%
						if(adminVO == null) {
						%>
						<li><a class="dropdown-item" href="login.do">로그인</a></li>
						<li><a class="dropdown-item" href="portfolio-item.html">회원가입</a></li>
						<%
						} else {
						%>
						<li><a class="dropdown-item" href="logout.do">로그아웃</a></li>
						<li><a class="dropdown-item" href="portfolio-item.html">마이페이지</a></li>
						<%
						}
						%>
					</ul>
				</li>
				
			</ul>
			<%	
			// 로그인 정보가 없을 때 항목		
			}else {%>
				<ul class="navbar-nav ms-auto mb-2 mb-lg-0">
				<li class="nav-item"><a class="nav-link" href="/event/list.do">이벤트</a></li>
				<li class="nav-item"><a class="nav-link" href="/host/hostNotice.do">공지사항</a></li>
				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" id="navbarDropdownBlog" href="#"
					role="button" data-bs-toggle="dropdown" aria-expanded="false">문의사항</a>
					<ul class="dropdown-menu dropdown-menu-end"
						aria-labelledby="navbarDropdownBlog">
						<li><a class="dropdown-item" href="blog-home.html">Q&A</a></li>
						<li><a class="dropdown-item" href="/faq.do">FAQ</a></li>
					</ul>
				</li>
				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" id="navbarDropdownPortfolio"
					href="#" role="button" data-bs-toggle="dropdown"
					aria-expanded="false"><i class="fas fa-user-circle"></i></a>
					<ul class="dropdown-menu dropdown-menu-end"
						aria-labelledby="navbarDropdownPortfolio">
						
						<%
						if(memVO == null) {
						%>
						<li><a class="dropdown-item" href="login.do">로그인</a></li>
						<li><a class="dropdown-item" href="portfolio-item.html">회원가입</a></li>
						<%
						} else {
						%>
						<li><a class="dropdown-item" href="logout.do">로그아웃</a></li>
						<li><a class="dropdown-item" href="portfolio-item.html">마이페이지</a></li>
						<%
						}
						%>
					</ul>
				</li>
				
			</ul>	
			<%
			}
			%>
		</div>
	</div>
	</nav>
	<!-- Page Content--> 
	 
	<section class="py-5">
	<div class="container px-5 my-5">
		<div class="text-center mb-5">
			<h1 class="fw-bolder">FAQ</h1>
			<p class="lead fw-normal text-muted mb-0">How can we help you?</p>
		</div>
		<div class="row gx-5">
			<div class="col-xl-12">
				<!-- FAQ Accordion 1-->
				<h2 class="fw-bolder mb-3">자주 물어보는 질문들</h2> 
				<div class="accordion mb-5" id="accordionExample">
					<div class="accordion-item">
						<h3 class="accordion-header" id="headingOne">
							<button class="accordion-button" type="button"
								data-bs-toggle="collapse" data-bs-target="#collapseOne"
								aria-expanded="true" aria-controls="collapseOne">Accordion
								Item #1</button>
						</h3>
						<div class="accordion-collapse collapse show" id="collapseOne"
							aria-labelledby="headingOne" data-bs-parent="#accordionExample">
							<div class="accordion-body">
								<strong>This is the first item's accordion body.</strong> It is
								shown by default, until the collapse plugin adds the appropriate
								classes that we use to style each element. These classes control
								the overall appearance, as well as the showing and hiding via
								CSS transitions. You can modify any of this with custom CSS or
								overriding our default variables. It's also worth noting that
								just about any HTML can go within the
								<code>.accordion-body</code>
								, though the transition does limit overflow.
							</div>
						</div>
					</div>
					<div class="accordion-item">
						<h3 class="accordion-header" id="headingTwo">
							<button class="accordion-button collapsed" type="button"
								data-bs-toggle="collapse" data-bs-target="#collapseTwo"
								aria-expanded="false" aria-controls="collapseTwo">Accordion
								Item #2</button>
						</h3>
						<div class="accordion-collapse collapse" id="collapseTwo"
							aria-labelledby="headingTwo" data-bs-parent="#accordionExample">
							<div class="accordion-body">
								<strong>This is the second item's accordion body.</strong> It is
								hidden by default, until the collapse plugin adds the
								appropriate classes that we use to style each element. These
								classes control the overall appearance, as well as the showing
								and hiding via CSS transitions. You can modify any of this with
								custom CSS or overriding our default variables. It's also worth
								noting that just about any HTML can go within the
								<code>.accordion-body</code>
								, though the transition does limit overflow.
							</div>
						</div>
					</div>
					<div class="accordion-item">
						<h3 class="accordion-header" id="headingThree">
							<button class="accordion-button collapsed" type="button"
								data-bs-toggle="collapse" data-bs-target="#collapseThree"
								aria-expanded="false" aria-controls="collapseThree">Accordion
								Item #3</button>
						</h3>
						<div class="accordion-collapse collapse" id="collapseThree"
							aria-labelledby="headingThree" data-bs-parent="#accordionExample">
							<div class="accordion-body">
								<strong>This is the third item's accordion body.</strong> It is
								hidden by default, until the collapse plugin adds the
								appropriate classes that we use to style each element. These
								classes control the overall appearance, as well as the showing
								and hiding via CSS transitions. You can modify any of this with
								custom CSS or overriding our default variables. It's also worth
								noting that just about any HTML can go within the
								<code>.accordion-body</code>
								, though the transition does limit overflow.
							</div>
						</div>
					</div>
				</div>
				
			</div>
		
		</div>
	</div>
	</section> 
	
	</main>
	<!-- Footer-->
	<footer class="bg-dark py-4 mt-auto">
	<div class="container px-8">
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
	<!-- Bootstrap core JS-->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js"></script>
	<!-- Core theme JS-->
	<script src="js/scripts.js"></script>
</body>
</html>