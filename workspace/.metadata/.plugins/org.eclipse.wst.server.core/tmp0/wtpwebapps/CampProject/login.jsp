<%@page import="vo.ConstVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport"
		content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<meta name="description" content="">
	<meta name="author" content="">
	
	<title>로그인</title>
	
	<!-- Custom fonts for this template-->
	<link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
	<link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">
	
	<!-- Custom styles for this template-->
	<link href="css/sb-admin-2.min.css" rel="stylesheet">
	<style type="text/css">
		main {
			height: 897px;
		}
	</style>
</head>
<body>
	<main>
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
						<li><a class="dropdown-item" href="blog-post.html">FAQ</a></li>
					</ul>
				</li>
				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" id="navbarDropdownPortfolio"
					href="#" role="button" data-bs-toggle="dropdown"
					aria-expanded="false"><i class="fas fa-user-circle"></i></a>
					<ul class="dropdown-menu dropdown-menu-end"
						aria-labelledby="navbarDropdownPortfolio">
						<li><a class="dropdown-item" href="login.jsp">로그인</a></li>
						<li><a class="dropdown-item" href="/clientjoin.do">일반회원 회원가입</a></li>
						<li><a class="dropdown-item" href="/hostjoin.do">호스트 회원가입</a></li>
					</ul>
				</li>
				
			</ul>
		</div>
	</div>
	</nav>
	<div class="container">

		<!-- Outer Row -->
		<div class="row justify-content-center">

			<div class="col-xl-10 col-lg-12 col-md-9">

				<div class="card o-hidden border-0 shadow-lg my-5">
					<div class="card-body p-0">
						<!-- Nested Row within Card Body -->
						<div class="row">
							<div class="col-lg-6 d-none d-lg-block bg-login-image"></div>
							<div class="col-lg-6">
								<div class="p-5">
									<div class="text-center">
										<h1 class="h4 text-gray-900 mb-4">Welcome Back!</h1>
									</div>
									<form class="user">
										<div class="form-group">
											<input type="text" class="form-control form-control-user"
												id="exampleInputEmail" aria-describedby="emailHelp"
												placeholder="Enter Id">
										</div>
										<div class="form-group">
											<input type="password" class="form-control form-control-user"
												id="exampleInputPassword" placeholder="Password">
										</div>
										<div class="form-group">
											<div class="custom-control custom-checkbox small">
												<input type="checkbox" class="custom-control-input"
													id="customCheck"> <label
													class="custom-control-label" for="customCheck">Remember
													Me</label>
											</div>
										</div>
<!-- 										<a href="#" onclick="login()" -->
<!-- 											class="btn btn-primary btn-user btn-block"> Login </a> -->
										<a href="javascript:login(1)"
											class="btn btn-primary btn-user btn-block"> User Login </a>
										<a href="javascript:login(2)"
											class="btn btn-primary btn-user btn-block"> Host Login </a>
										<a href="javascript:login(3)"
											class="btn btn-primary btn-user btn-block"> Admin Login </a>
									</form>
									<br>
									<br>
									<div class="text-center">
										<a class="small" href="forgot-password.html">Forgot
											Password?</a>
									</div>
									<div class="text-center">
										<a class="small" href="register.html">Create an Account!</a>
									</div>
									<br>
									<br>
								</div>
							</div>
						</div>
					</div>
				</div>

			</div>

		</div>

	</div>
	</main>
	<!-- Footer-->
	<footer class="py-5 bg-dark">
	<div class="container">
		<p class="m-0 text-center text-white">Copyright &copy; Your
			Website 2021</p>
	</div>
	</footer>
	<!-- Bootstrap core JS-->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js"></script>
	<!-- Core theme JS-->
	<script src="js/scripts.js"></script>

	<!-- Bootstrap core JavaScript-->
	<script src="vendor/jquery/jquery.min.js"></script>
	<script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

	<!-- Core plugin JavaScript-->
	<script src="vendor/jquery-easing/jquery.easing.min.js"></script>

	<!-- Custom scripts for all pages-->
	<script src="js/sb-admin-2.min.js"></script>
	
	<script type="text/javascript">
	
	
	function login(flag){
		
		
		if($("#exampleInputEmail").val().trim() == "") {
			alert("ID를 입력하세요.");
			$("#exampleInputEmail").focus();
			cnt++;
			return;
		}
		
		if($("#exampleInputPassword").val().trim() == "") {
			alert("비밀번호를 입력하세요.");
			$("#exampleInputPassword").focus();
			cnt++;
			return;
		}
		
// 		사용자 로그인
		if(flag == 1) {
			var param = {
					userID : $("#exampleInputEmail").val().trim()
					, userPW : $("#exampleInputPassword").val().trim()
			}
			$.ajax({
				url: "/login.do"
				,type: "post"
				,data: param
				,dataType: "json"
				,success: function(data){
					if(data.isSuccess == 1) { //로그인 성공+
						alert("로그인되셨습니다.");
						
						window.location.href = "http://localhost" + "<%=ConstVO.VIEW_MAIN_PAGE%>";
					
					}else{ //로그인 실패-비밀번호오류 등..
	// 					alert(data.msg);
						alert("존재하지 않는 아이디 이거나 비밀번호가 틀렸습니다.");
					}
					
				}
				,error: function(xhr){
					console.log(xhr);
					alert("오류발생. 관리자 문의 바랍니다.");
				}
			});
			
// 		업체로그인	
		}else if (flag == 2) {
			
			var param = {
					hostID : $("#exampleInputEmail").val().trim()
					, hostPW : $("#exampleInputPassword").val().trim()
			}
				
			$.ajax({
				url: "/hostlogin.do"
				,type: "post"
				,data: param
				,dataType: "json"
				,success: function(data){
					if(data.isSuccess == 1) { //로그인 성공+
						alert("로그인되셨습니다.");
						window.location.href = "http://localhost" + "<%=ConstVO.VIEW_MAIN_PAGE%>";
					
					}else{ //로그인 실패-비밀번호오류 등..
	// 					alert(data.msg);
						alert("존재하지 않는 아이디 이거나 비밀번호가 틀렸습니다.");
					}
					
				}
				,error: function(xhr){
					console.log(xhr);
					alert("오류발생. 관리자 문의 바랍니다.");
				}
			});
			
// 		관리자로그인	
		}else if (flag == 3) {
			var param = {
					adminID : $("#exampleInputEmail").val().trim()
					, adminPW : $("#exampleInputPassword").val().trim()
			}
				
			$.ajax({
				url: "/adminlogin.do"
				,type: "post"
				,data: param
				,dataType: "json"
				,success: function(data){
					if(data.isSuccess == 1) { //로그인 성공+
						alert("로그인되셨습니다.");
						window.location.href = "http://localhost" + "<%=ConstVO.VIEW_MAIN_PAGE%>";
					
					}else{ //로그인 실패-비밀번호오류 등..
	// 					alert(data.msg);
						alert("존재하지 않는 아이디 이거나 비밀번호가 틀렸습니다.");
					}
					
				}
				,error: function(xhr){
					console.log(xhr);
					alert("오류발생. 관리자 문의 바랍니다.");
				}
			});
		}
		
	}
	
	
	
	</script>

</body>
</html>