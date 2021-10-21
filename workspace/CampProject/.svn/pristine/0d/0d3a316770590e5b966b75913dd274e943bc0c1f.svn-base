<%@page import="vo.AdminVO"%>
<%@page import="vo.CampHostVO"%>
<%@page import="vo.MemVO"%>
<%@page import="vo.ConstVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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

<!-- Favicon-->
<link rel="icon" type="image/x-icon" href="assets/favicon.ico" />

<!-- Bootstrap icons-->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css"
	rel="stylesheet" />

<!-- Custom styles for this template-->
<link href="../../../css/sb-admin-2.min.css" rel="stylesheet">
<!-- Core theme CSS (includes Bootstrap)-->
<link href="../../../css/styles.css" rel="stylesheet" />

<!-- Custom fonts for this template-->
<link href="../../../vendor/fontawesome-free/css/all.min.css"
	rel="stylesheet" type="text/css">
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

a {
	color: black;
}
</style>

<link href="http://fonts.googleapis.com/earlyaccess/nanumpenscript.css"
	rel="stylesheet">

<title>크루 모집</title>
<style type="text/css">
h3 {
	margin: 10px;
}

#logo {
	text-align: center;
}

@import url(//fonts.googleapis.com/earlyaccess/jejumyeongjo.css);

#crew {
	font-family: 'Nanum Pen Script', cursive;
	font-size: x-large;
}
</style>

<%
HttpSession loginSession = request.getSession();
String loginType = (String) loginSession.getAttribute(ConstVO.LOGIN_TYPE);
MemVO memVO = (MemVO) loginSession.getAttribute("memVO");
CampHostVO hostVO = (CampHostVO) loginSession.getAttribute("hostVO");
AdminVO adminVO = (AdminVO) loginSession.getAttribute("adminVO");
%>

</head>
<body>
	<main class="flex-shrink-0"> <!-- Navigation--> <nav
		class="navbar navbar-expand-lg navbar-dark bg-dark">
	<div class="container px-1">
		<a class="navbar-brand" href="../../../index.jsp"> <img
			src="../../../images/logo.png" alt="logo" width="100px"></a>
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
				<li class="nav-item"><a class="nav-link"
					href="/host/hostNotice.do">공지사항</a></li>
				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" id="navbarDropdownBlog" href="#"
					role="button" data-bs-toggle="dropdown" aria-expanded="false">문의사항</a>
					<ul class="dropdown-menu dropdown-menu-end"
						aria-labelledby="navbarDropdownBlog">
						<li><a class="dropdown-item" href="/qna/list.do">Q&A</a></li>
						<li><a class="dropdown-item" href="/faq.do">FAQ</a></li>
					</ul></li>
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
						<li><a class="dropdown-item" href="/clientjoin.do">일반회원
								회원가입</a></li>
						<li><a class="dropdown-item" href="/hostjoin.do">호스트 회원가입</a></li>
						<%
						} else {
						%>
						<li><a class="dropdown-item" href="logout.do">로그아웃</a></li>
						<li><a class="dropdown-item" href="memMyPage.jsp">마이페이지</a></li>
						<%
						}
						%>
					</ul></li>

			</ul>
			<%	
			// 업체 로그인시 항목
			}else if(ConstVO.LOGIN_TYPE_HOST.equals(loginType)){
			%>
			<ul class="navbar-nav ms-auto mb-2 mb-lg-0">
				<li class="nav-item"><a class="nav-link" href="/event/list.do">이벤트</a></li>
				<li class="nav-item"><a class="nav-link"
					href="/host/hostNotice.do">공지사항</a></li>
				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" id="navbarDropdownBlog" href="#"
					role="button" data-bs-toggle="dropdown" aria-expanded="false">문의사항</a>
					<ul class="dropdown-menu dropdown-menu-end"
						aria-labelledby="navbarDropdownBlog">
						<li><a class="dropdown-item" href="/qna/list.do">Q&A</a></li>
						<li><a class="dropdown-item" href="/faq.do">FAQ</a></li>
					</ul></li>
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
						<li><a class="dropdown-item" href="/clientjoin.do">일반회원
								회원가입</a></li>
						<li><a class="dropdown-item" href="/hostjoin.do">호스트 회원가입</a></li>
						<%
						} else {
						%>
						<li><a class="dropdown-item" href="logout.do">로그아웃</a></li>
						<li><a class="dropdown-item" href="hostMyPage.jsp">마이페이지</a></li>
						<%
						}
						%>
					</ul></li>

			</ul>
			<%
			// 관리자 로그인시 항목	
			}else if(ConstVO.LOGIN_TYPE_ADMIN.equals(loginType)){
			%>
			<ul class="navbar-nav ms-auto mb-2 mb-lg-0">
				<li class="nav-item"><a class="nav-link" href="/event/list.do">이벤트</a></li>
				<li class="nav-item"><a class="nav-link"
					href="/host/hostNotice.do">공지사항</a></li>
				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" id="navbarDropdownBlog" href="#"
					role="button" data-bs-toggle="dropdown" aria-expanded="false">문의사항</a>
					<ul class="dropdown-menu dropdown-menu-end"
						aria-labelledby="navbarDropdownBlog">
						<li><a class="dropdown-item" href="/qna/list.do">Q&A</a></li>
						<li><a class="dropdown-item" href="/faq.do">FAQ</a></li>
					</ul></li>
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
						<li><a class="dropdown-item" href="/clientjoin.do">일반회원
								회원가입</a></li>
						<li><a class="dropdown-item" href="/hostjoin.do">호스트 회원가입</a></li>
						<%
						} else {
						%>
						<li><a class="dropdown-item" href="logout.do">로그아웃</a></li>
						<li><a class="dropdown-item" href="portfolio-item.html">마이페이지</a></li>
						<%
						}
						%>
					</ul></li>

			</ul>
			<%	
			// 로그인 정보가 없을 때 항목		
			}else {%>
			<ul class="navbar-nav ms-auto mb-2 mb-lg-0">
				<li class="nav-item"><a class="nav-link" href="/event/list.do">이벤트</a></li>
				<li class="nav-item"><a class="nav-link"
					href="/host/hostNotice.do">공지사항</a></li>
				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" id="navbarDropdownBlog" href="#"
					role="button" data-bs-toggle="dropdown" aria-expanded="false">문의사항</a>
					<ul class="dropdown-menu dropdown-menu-end"
						aria-labelledby="navbarDropdownBlog">
						<li><a class="dropdown-item" href="/qna/list.do">Q&A</a></li>
						<li><a class="dropdown-item" href="/faq.do">FAQ</a></li>
					</ul></li>
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
						<li><a class="dropdown-item" href="/clientjoin.do">일반회원
								회원가입</a></li>
						<li><a class="dropdown-item" href="/hostjoin.do">호스트 회원가입</a></li>
						<%
						} else {
						%>
						<li><a class="dropdown-item" href="logout.do">로그아웃</a></li>
						<li><a class="dropdown-item" href="portfolio-item.html">마이페이지</a></li>
						<%
						}
						%>
					</ul></li>

			</ul>
			<%
			}
			%>
		</div>
	</div>
	</nav> <br>
	<br>
	<div id="logo">
		<img src="../images/crew.png" alt="..?">
	</div>

	<div align="center" id="crew">
		<form method="post"
			action="<%=request.getContextPath() %>/crew/crewMake.do">
			<input type="hidden" name="memCode" value="<%=memVO.getMemCode() %>">
			<!-- 회원코드에 현재 로그인한 회원 아이디 정보 들어가야함 -->
			<h3 style="display: inline;">제목</h3>
			<input type="text" name="recrTitle"> <br> <br>
			<h3 style="display: inline;">캠핑 날짜</h3>
			<input type="date" name="recrStart" id="recrStart"> - <input
				type="date" name="recrEnd" id="recrEnd">
			<h3 style="display: inline;">인원 수</h3>
			<input type="number" name="recrNeednum">
			<h3>성별</h3>
			<input type="radio" name="recrGender" id="genderMale" value="남자"><label
				for="genderMale">남자</label> <input type="radio" name="recrGender"
				id="genderFemale" value="여자"><label for="genderFemale">여자</label>
			<input type="radio" name="recrGender" id="genderMoo" value="무관"><label
				for="genderMoo">무관</label>

			<h3>장소</h3>
			<!-- 테마 >> 해안, 자연, 도시, 반려동물 -->
			<input type="radio" name="tmCode" id="sea" value="해안"><label
				for="sea">해안</label> <input type="radio" name="tmCode" id="forest"
				value="자연"><label for="forest">자연</label> <input
				type="radio" name="tmCode" id="city" value="도시"><label
				for="city">도시</label> <input type="radio" name="tmCode" id="pet"
				value="반려동물"><label for="pet">반려동물</label> <input
				type="radio" name="tmCode" id=thmMoo value="무관"><label
				for="thmMoo">무관</label>
			<h3>활동</h3>
			<!-- 활동 >> 등산, 낚시, 오락, 힐링 -->
			<input type="radio" name="actCode" id="hike" value="등산"><label
				for="hike">등산</label> <input type="radio" name="actCode"
				id="fishing" value="낚시"><label for="fishing">낚시</label> <input
				type="radio" name="actCode" id="enjoy" value="오락"><label
				for="enjoy">오락</label> <input type="radio" name="actCode"
				id="healing" value="힐링"><label for="healing">힐링</label> <input
				type="radio" name="actCode" id=actMoo value="무관"><label
				for="actMoo">무관</label><br>

			<h3>P.S</h3>
			<textarea rows="5" cols="60" name="recrContent"></textarea>
			<br>
			<br>
			<br>
			<button type="submit" class="btn btn-primary2 btn-lg">Go in!</button>
			<br> <br>
		</form>
	</div>
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
	<script src="../../../vendor/jquery/jquery.min.js"></script>
	<script src="../../../vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

	<!-- Core plugin JavaScript-->
	<script src="../../../vendor/jquery-easing/jquery.easing.min.js"></script>

	<!-- Custom scripts for all pages-->
	<script src="../../../js/sb-admin-2.min.js"></script>

	<!-- Bootstrap core JS-->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js"></script>
	<!-- Core theme JS-->
	<script src="../../../js/scripts.js"></script>

</body>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script type="text/javascript">
$("#recrStart").change(function () {	// 시작날짜가 오늘보다 전 날짜인 경우
	var date = new Date();
	var year = date.getFullYear(); 
	var month = (1 + date.getMonth());          
		month = month >= 10 ? month : '0' + month; 
	var day = date.getDate();                 
		day = day >= 10 ? day : '0' + day;
	date = year + month +day;
	
	
	var startDate = $("#recrStart").val();
	startDate = startDate.replace(/-/gi, "");
	console.log(startDate);
	
	
	console.log(date);
	if(parseInt(date) > parseInt(startDate)){
		alert("시작날이 과거입니다.");
		$("#recrStart").val('startDate');  	// 야매식 날짜 선택 풀리게 하기
	}
	
})

$("#recrEnd").change(function () {		// 끝 날짜가 시작날짜보다 빠를 시 오류창 출력
	var startDate = $("#recrStart").val();
	var startDate2 = startDate.replace(/-/gi, "");
	console.log(startDate);
	
	var lastDate = $("#recrEnd").val();
	lastDate = lastDate.replace(/-/gi, "");
	console.log(lastDate);
	
	
	if(parseInt(startDate2) > parseInt(lastDate)){
		alert("마지막 날이 시작 날보다 빠릅니다.");
		$("#recrEnd").val('startDate');		// 야매식 날짜 선택 풀리게 하기
	}
	
})
</script>
</html>