<%@page import="vo.ConstVO"%>
<%@page import="vo.AdminVO"%>
<%@page import="vo.CampHostVO"%>
<%@page import="vo.MemVO"%>
<%@page import="vo.CrewThmVO"%>
<%@page import="vo.CrewActVO"%>
<%@page import="vo.RecCrewVO2"%>
<%@page import="vo.RecCrewVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%

List<RecCrewVO2> rv = (List<RecCrewVO2>)request.getAttribute("rv"); 

%>

<%
	CrewActVO cav = (CrewActVO)request.getAttribute("cav");
	CrewThmVO ctv= (CrewThmVO)request.getAttribute("ctv");
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<%
HttpSession loginSession = request.getSession();
String loginType = (String) loginSession.getAttribute(ConstVO.LOGIN_TYPE);
MemVO memVO = (MemVO) loginSession.getAttribute("memVO");
CampHostVO hostVO = (CampHostVO) loginSession.getAttribute("hostVO");
AdminVO adminVO = (AdminVO) loginSession.getAttribute("adminVO");
%>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no" />
<meta name="description" content="" />
<meta name="author" content="" />

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css"
	rel="stylesheet" />
<link href="../../../vendor/fontawesome-free/css/all.min.css"
	rel="stylesheet" type="text/css">
<link href="../../../css/styles.css" rel="stylesheet" />
<link href="../../../css/sb-admin-2.min.css" rel="stylesheet">
<link
	href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
	rel="stylesheet">

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.15.3/css/all.css"
	integrity="sha384-SZXxX4whJ79/gErwcOYf+zWLeJdY/qpuqC4cAa9rOGUstPomtqpuNWT9wdPEn2fk"
	crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.6.0.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<script src="https://cdn.iamport.kr/js/iamport.payment-1.1.5.js"
	type="text/javascript"></script>

<link href="http://fonts.googleapis.com/earlyaccess/nanumpenscript.css"
	rel="stylesheet">

<title>???????????? ??????</title>

<style type="text/css">
table {
	text-align: left;
	border-collapse: collapse;
	line-height: 1.5;
	margin: auto;
}

table thead th {
	padding: 10px;
	font-weight: bold;
	vertical-align: top;
	border-bottom: 3px solid #036;
}

table tbody th {
	width: 100px;
	padding: 10px;
	font-weight: bold;
	vertical-align: top;
	border-bottom: 1px solid #ccc;
	background-color: navy;
	color: white;
}

table td {
	width: 400px;
	padding: 10px;
	vertical-align: top;
	border-bottom: 1px solid #ccc;
}

tr:first-child>td {
	background-color: silver;
	color: white;
}

@import url(//fonts.googleapis.com/earlyaccess/nanumgothiccoding.css);

h1 {
	text-align: center;
	font-family: 'Nanum Pen Script', cursive;
	font-size: 7em;
}

.bg-dark {
	background-color: #5a5c69 !important;
}

footer {
	position: absolute;
	left: 0;
	bottom: 0;
	width: 100%;
	padding: 15px 0;
	text-align: center;
	color: white;
	background: blue;
}
</style>
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
			// ????????? ???????????? ??????
			if(ConstVO.LOGIN_TYPE_USER.equals(loginType) ) {
			%>
			<ul class="navbar-nav ms-auto mb-2 mb-lg-0">
				<li class="nav-item"><a class="nav-link" href="/event/list.do">?????????</a></li>
				<li class="nav-item"><a class="nav-link" href="/event/list.do">?????????</a></li>
				<li class="nav-item"><a class="nav-link"
					href="/host/hostNotice.do">????????????</a></li>
				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" id="navbarDropdownBlog" href="#"
					role="button" data-bs-toggle="dropdown" aria-expanded="false">????????????</a>
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
						<li><a class="dropdown-item" href="login.do">?????????</a></li>
						<li><a class="dropdown-item" href="/clientjoin.do">????????????
								????????????</a></li>
						<li><a class="dropdown-item" href="/hostjoin.do">????????? ????????????</a></li>
						<%
						} else {
						%>
						<li><a class="dropdown-item" href="logout.do">????????????</a></li>
						<li><a class="dropdown-item" href="memMyPage.jsp">???????????????</a></li>
						<%
						}
						%>
					</ul></li>

			</ul>
			<%	
			// ?????? ???????????? ??????
			}else if(ConstVO.LOGIN_TYPE_HOST.equals(loginType)){
			%>
			<ul class="navbar-nav ms-auto mb-2 mb-lg-0">
				<li class="nav-item"><a class="nav-link" href="/event/list.do">?????????</a></li>
				<li class="nav-item"><a class="nav-link" href="/event/list.do">?????????</a></li>
				<li class="nav-item"><a class="nav-link"
					href="/host/hostNotice.do">????????????</a></li>
				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" id="navbarDropdownBlog" href="#"
					role="button" data-bs-toggle="dropdown" aria-expanded="false">????????????</a>
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
						<li><a class="dropdown-item" href="login.do">?????????</a></li>
						<li><a class="dropdown-item" href="/clientjoin.do">????????????
								????????????</a></li>
						<li><a class="dropdown-item" href="/hostjoin.do">????????? ????????????</a></li>
						<%
						} else {
						%>
						<li><a class="dropdown-item" href="logout.do">????????????</a></li>
						<li><a class="dropdown-item" href="hostMyPage.jsp">???????????????</a></li>
						<%
						}
						%>
					</ul></li>

			</ul>
			<%
			// ????????? ???????????? ??????	
			}else if(ConstVO.LOGIN_TYPE_ADMIN.equals(loginType)){
			%>
			<ul class="navbar-nav ms-auto mb-2 mb-lg-0">
				<li class="nav-item"><a class="nav-link" href="/event/list.do">?????????</a></li>
				<li class="nav-item"><a class="nav-link" href="/event/list.do">?????????</a></li>
				<li class="nav-item"><a class="nav-link"
					href="/host/hostNotice.do">????????????</a></li>
				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" id="navbarDropdownBlog" href="#"
					role="button" data-bs-toggle="dropdown" aria-expanded="false">????????????</a>
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
						<li><a class="dropdown-item" href="login.do">?????????</a></li>
						<li><a class="dropdown-item" href="/clientjoin.do">????????????
								????????????</a></li>
						<li><a class="dropdown-item" href="/hostjoin.do">????????? ????????????</a></li>
						<%
						} else {
						%>
						<li><a class="dropdown-item" href="logout.do">????????????</a></li>
						<li><a class="dropdown-item" href="portfolio-item.html">???????????????</a></li>
						<%
						}
						%>
					</ul></li>

			</ul>
			<%	
			// ????????? ????????? ?????? ??? ??????		
			}else {%>
			<ul class="navbar-nav ms-auto mb-2 mb-lg-0">
				<li class="nav-item"><a class="nav-link" href="/event/list.do">?????????</a></li>
				<li class="nav-item"><a class="nav-link"
					href="/host/hostNotice.do">????????????</a></li>
				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" id="navbarDropdownBlog" href="#"
					role="button" data-bs-toggle="dropdown" aria-expanded="false">????????????</a>
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
						<li><a class="dropdown-item" href="login.do">?????????</a></li>
						<li><a class="dropdown-item" href="/clientjoin.do">????????????
								????????????</a></li>
						<li><a class="dropdown-item" href="/hostjoin.do">????????? ????????????</a></li>
						<%
						} else {
						%>
						<li><a class="dropdown-item" href="logout.do">????????????</a></li>
						<li><a class="dropdown-item" href="portfolio-item.html">???????????????</a></li>
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
	<br>

	<h1>Crew List</h1>

	<div class="container">
		<br>
		<br>
		<br>
		<br>
		<br>
		<table border="1">
			<tr>
				<td>??????</td>
				<td>??????</td>
				<td>??????</td>
				<td>??????</td>
				<td>??????</td>
			</tr>
			<%
	int size = rv.size();
	if(size > 0){
		for(int i=0; i<size; i++){
			String startDate = rv.get(i).getRecrStart();
			startDate = startDate.substring(0,10);
  			String endDate = rv.get(i).getRecrEnd();
  			endDate = endDate.substring(0,10);
  			
			String act = rv.get(i).getActCode();
			if("a001".equals(act)) {
				act= "??????";
			}else if("a002".equals(act)){
				act = "??????";
			}else if("a003".equals(act)){
				act = "??????";
			}else if("a004".equals(act)){
				act = "??????";
			}else if("a005".equals(act)){
				act = "??????";
			}
			String thm = rv.get(i).getTmCode();
			if("t001".equals(thm)) {
				thm = "??????";
			}else if("t002".equals(thm)){
				thm = "??????";
			}else if("t003".equals(thm)){
				thm = "??????";
			}else if("t004".equals(thm)){
				thm = "????????????";
			}else if("t005".equals(thm)){
				thm = "??????";
			}
	%>
			<tr>
				<td><a
					href="crewViewSec.do?crewCode=<%=rv.get(i).getCrewCode() %>"><%=rv.get(i).getRecrTitle() %></a></td>
				<td><%=startDate %> - <%=endDate %></td>
				<td><%=thm %></td>
				<td><%=act %></td>
				<td><%=rv.get(i).getRecrNeednum() %></td>
			</tr>

			<%			
		} //for??????
	}else{				// ???????????? 0?????? : ???????????? ???????????? ?????? ???
	  %>
			<tr>
				<td colspan="5" style="text-align: center;">??????????????? ????????????.</td>
			</tr>
			<%
		}
	  %>
		</table>
	</div>

	</main>
	

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
</html>