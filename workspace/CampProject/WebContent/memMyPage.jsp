<%@page import="vo.AdminVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
a{
	color:black;
}

.btn1:hover {
	 color: #fff;
  background-color: #686868;
  border-color: #686868;
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
						<li><a class="dropdown-item" href="/clientjoin.do">일반회원 회원가입</a></li>
						<li><a class="dropdown-item" href="/hostjoin.do">호스트 회원가입</a></li>
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
						<li><a class="dropdown-item" href="/clientjoin.do">일반회원 회원가입</a></li>
						<li><a class="dropdown-item" href="/hostjoin.do">호스트 회원가입</a></li>
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
						<li><a class="dropdown-item" href="/clientjoin.do">일반회원 회원가입</a></li>
						<li><a class="dropdown-item" href="/hostjoin.do">호스트 회원가입</a></li>
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
						<li><a class="dropdown-item" href="/clientjoin.do">일반회원 회원가입</a></li>
						<li><a class="dropdown-item" href="/hostjoin.do">호스트 회원가입</a></li>
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
	<!-- Header--> 
	<header id="headerImg" class="bg-dark py-5" style="width:100%; background-image: url('images/tree.jpg');">
		<div class="container px-5">
			<div class="row gx-5 align-items-center justify-content-center">
				<div class="text-center my-5">
                <img class="img-fluid rounded-circle mb-4" src="images/user.png" alt="..." />
                <h1 class="text-white fs-3 fw-bolder"><%=memVO.getMemNick()%> 님</h1>
                
            	</div>
				<div class="text-center my-5">
								<form method="post" action="<%=request.getContextPath() %>/myPageUser/myInfo.do"  class="btn btn-primary2 btn-lg px-4 me-sm-3">
									 <input type="hidden" name="memCode" value="<%=memVO.getMemCode() %>">
									 <button type="submit" style="background: none; border:none;" class="btn1">내 정보</button>
								</form>
<!-- 								<a class="btn btn-primary2 btn-lg px-4 me-sm-3" href="#features">내 정보</a>  -->
								<a class="btn btn-primary2 btn-lg px-4 me-sm-3" href="reserve.jsp">예약 현황</a>
								<a class="btn btn-primary2 btn-lg px-4 me-sm-3" href="#features">리뷰 쓰기</a>
								<form method="post" action="<%=request.getContextPath() %>/crew/myPageCrew.do"  class="btn btn-primary2 btn-lg px-4 me-sm-3">
									 <input type="hidden" name="memCode" value="<%=memVO.getMemCode() %>">
									 <button type="submit" style="background: none; border:none;" class="btn1">크루신청내역</button>
								</form>
								 
				</div>
			</div>
		</div>
	</header> 
	<!-- Features section--> 
	
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