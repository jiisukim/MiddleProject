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
<link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
<link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">

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
				<li class="nav-item"><a class="nav-link" href="/event/list.do">이벤트</a></li>
				<li class="nav-item"><a class="nav-link" href="/host/hostNotice.do">공지사항</a></li>
				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" id="navbarDropdownBlog" href="#"
					role="button" data-bs-toggle="dropdown" aria-expanded="false">문의사항</a>
					<ul class="dropdown-menu dropdown-menu-end"
						aria-labelledby="navbarDropdownBlog">
						<li><a class="dropdown-item" href="/qna/list.do">Q&A</a></li>
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
						<li><a class="dropdown-item" href="memMyPage.jsp">마이페이지</a></li>
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
				<li class="nav-item"><a class="nav-link" href="/event/list.do">이벤트</a></li>
				<li class="nav-item"><a class="nav-link" href="/host/hostNotice.do">공지사항</a></li>
				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" id="navbarDropdownBlog" href="#"
					role="button" data-bs-toggle="dropdown" aria-expanded="false">문의사항</a>
					<ul class="dropdown-menu dropdown-menu-end"
						aria-labelledby="navbarDropdownBlog">
						<li><a class="dropdown-item" href="/qna/list.do">Q&A</a></li>
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
						<li><a class="dropdown-item" href="hostMyPage.jsp">마이페이지</a></li>
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
				<li class="nav-item"><a class="nav-link" href="/event/list.do">이벤트</a></li>
				<li class="nav-item"><a class="nav-link" href="/host/hostNotice.do">공지사항</a></li>
				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" id="navbarDropdownBlog" href="#"
					role="button" data-bs-toggle="dropdown" aria-expanded="false">문의사항</a>
					<ul class="dropdown-menu dropdown-menu-end"
						aria-labelledby="navbarDropdownBlog">
						<li><a class="dropdown-item" href="/qna/list.do">Q&A</a></li>
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
						<li><a class="dropdown-item" href="/qna/list.do">Q&A</a></li>
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
						if(memVO == null || hostVO == null) {
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
	<header id="headerImg" class="bg-dark py-5"
		style="width:100%; background-image: url('images/tree.jpg');">
	<div class="container px-5">
		<div class="row gx-5 align-items-center justify-content-center">
			<div class="col-lg-8 col-xl-7 col-xxl-6">
				<div class="my-5 text-center text-xl-start">
					<h1 class="display-5 fw-bolder text-white mb-2">같이 캠핑 가볼텨?</h1>
					<p class="lead fw-bold text-white mb-4" style="color: red;">캠핑족들
						모여라! 같이 캠핑가자</p>
					<div class="d-grid gap-3 d-sm-flex justify-content-sm-center justify-content-xl-start">
						<a class="btn btn-primary btn-lg px-4 me-sm-3" href="/crew/crewMake.do">크루
							모집하기</a> 
						<a class="btn  btn-primary1 btn-lg px-4" href="/crew/crewJoin.do"
							">크루 신청하기</a>
					</div>
				</div>
			</div>
			<div class="col-xl-5 col-xxl-6 d-none d-xl-block text-center">
				<a href="http://localhost/event/view.do?evnCode=12"><img class="img-fluid rounded-3 my-5"
					src="images/market.jpg" alt="..." / width="600px" height="400px"></a>
			</div>
		</div>
	</div>
	</header> 
	
	<!-- Features section--> 
	<section class="py-5" id="tema1">
	<div class="container px-5 my-5">
		<div class="row gx-5 justify-content-center">
			<div class="col-lg-8 col-xl-6">
				<div class="text-center">
					<h2 class="fw-bolder">어떤 곳을 갈까?</h2>
					<p class="lead fw-normal text-muted mb-5">다양한 캠핑장 카테고리를 통해<br>자신의 취향에 맞는 캠핑장을 선택해보자!</p>
				</div>
			</div>
		</div>
		<div class="row gx-5">
			<div class="col-lg-3 mb-5">
				<div class="card h-100 shadow border-0">
				
				<a class="text-decoration-none" href="IcampNature.jsp">
					<img class="card-img-top" src="images/camping2.jpg" alt="..." />
				</a>
			
 				<a class="text-decoration-none  link-dark " href="lcampNature.jsp"> 
					<div class="card-body p-4">
						<div class="badge bg-primary bg-gradient rounded-pill mb-2">Nature</div> 
						<h5 class="card-title mb-3">맑은 공기를 가진 자연</h5>
						<p class="card-text mb-0">A place where you can heal with friends and family in a nature full of fresh air.</p>
					</div>
				</a>
				</div>
			</div>
			<div class="col-lg-3 mb-5">
			<a class="text-decoration-none link-dark stretched-link" href="campSea.jsp">
				<div class="card h-100 shadow border-0">
					<img class="card-img-top"
						src="images/camping1.jpg"  alt="...." />
					<div class="card-body p-4">
						<div class="badge bg-primary bg-gradient rounded-pill mb-2">Sea</div>
						<h5 class="card-title mb-3">뷰가 멋진 해안가</h5>
						<p class="card-text mb-0">A place where you can spend quality time with your lovers and family on the beach with stunning views.</p>
					</div>
					</a>
				</div>
			</div>
			<div class="col-lg-3 mb-5">
			<a class="text-decoration-none link-dark stretched-link" href="campCity.jsp">
				<div class="card h-100 shadow border-0">
					<img class="card-img-top"
						src="images/camping3.jpg"  alt="....." />
					<div class="card-body p-4">
						<div class="badge bg-primary bg-gradient rounded-pill mb-2">City</div>
						<h5 class="card-title mb-3">야경이 빛나는 도시</h5>
						<p class="card-text mb-0">A place where you can heal with the beautiful night view shining even in the dark.</p>
					</div>
				</a>
				</div>
			</div>
			<div class="col-lg-3 mb-5">
			<a class="text-decoration-none link-dark stretched-link" href="campPartner.jsp">
				<div class="card h-100 shadow border-0">
					<img class="card-img-top"
						src="images/camping4.jpg"  alt="......." />
					<div class="card-body p-4">
						<div class="badge bg-primary bg-gradient rounded-pill mb-2">Partner</div>
						<h5 class="card-title mb-3">반려동물 동반</h5>
						<p class="card-text mb-0">A place where you can enjoy camping with your beloved pet.</p>
					</div>
					</a>
				</div>
			</div>
		</div>
	</div>
	</section> <!-- Blog preview section--> <section class="py-5" id="tema2">
	<div class="container px-5 my-5">
		<div class="row gx-5 justify-content-center">
			<div class="col-lg-8 col-xl-6">
				<div class="text-center">
					<h2 class="fw-bolder">스트레스 뿌시러 가자!</h2>
					<p class="lead fw-normal text-muted mb-5">스트레스 푸는 방법도 다양하게!<br>스트레스 풀 수 있는 캠핑장을 선택해보자!</p>
				</div>
			</div>
		</div>
		<div class="row gx-5">
			<div class="col-lg-3 mb-5">
				<div class="card h-100 shadow border-0">
					<img class="card-img-top"
						src="images/climbing.jpg" alt="..." />
					<div class="card-body p-4">
						<div class="badge bg-primary bg-gradient rounded-pill mb-2">Climbing</div>
						<a class="text-decoration-none link-dark stretched-link" href="campClimb.jsp">
						<h5 class="card-title mb-3">산책, 등산</h5>
						<p class="card-text mb-0">There's a trail to take a walk, a mountain to climb.</p>
					</div>
					</a>
				</div>
			</div>
			<div class="col-lg-3 mb-5">
			<a class="text-decoration-none link-dark stretched-link" href="campFish.jsp">
				<div class="card h-100 shadow border-0">
					<img class="card-img-top"
						src="images/water.jpg" alt="..." />
					<div class="card-body p-4">
						<div class="badge bg-primary bg-gradient rounded-pill mb-2">Fishing</div>
						<h5 class="card-title mb-3">낚시, 수상레저</h5>
						<p class="card-text mb-0">You can fish, water leisure, water play.</p>
					</div>
					</a>
				</div>
			</div>
			<div class="col-lg-3 mb-5">
			<a class="text-decoration-none link-dark stretched-link" href="campEnter.jsp">
				<div class="card h-100 shadow border-0">
					<img class="card-img-top"
						src="images/jumping.jpg" alt="..." />
					<div class="card-body p-4">
						<div class="badge bg-primary bg-gradient rounded-pill mb-2">Entertainment</div>
						<h5 class="card-title mb-3">놀이, 오락</h5>
						<p class="card-text mb-0">It's full of fun and active activities.</p>
					</div>
					</a>
				</div>
			</div>
			<div class="col-lg-3 mb-5">
			<a class="text-decoration-none link-dark stretched-link" href="campHeal.jsp">
				<div class="card h-100 shadow border-0">
					<img class="card-img-top"
						src="images/healing.jpg" alt="..." />
					<div class="card-body p-4">
						<div class="badge bg-primary bg-gradient rounded-pill mb-2">Healing</div>
							<h5 class="card-title mb-3">힐링 그 자체</h5>
						<p class="card-text mb-0">Quiet, relaxed, healing with a cup of coffee.</p>
					</div>
					</a>
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