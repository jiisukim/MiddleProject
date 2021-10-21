<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<title>Insert title here</title>
<style type="text/css">
	img{
		border-radius: 15px;
		width: 250px;
	}
	img:hover{
		border: 2px solid lightgray;
	}
	h2{
		text-align: center;
	}
	@import url(//fonts.googleapis.com/earlyaccess/nanummyeongjo.css);
	
	body{
		font-family: 'Nanum Myeongjo', serif;
	}
	#logo{
		text-align: center;
	}
</style>
</head>
<%
String gen = request.getParameter("gen");
%>
<body>
	<div id="logo">
		<img src="../images/crew.png" alt="..?">
	</div>
	
	<h2>캠핑여행의 활동 유형 선택해주세요.</h2>
		<br><br><br>
	<div class="container" style="width: 70%">
	<br><br><br>
		<div style="text-align: center; width: calc(20%); float: left; overflow: hidden;">
			<h2>등산</h2>
			<a href="crewJoin.do?key=act&act=등산&gen=<%=gen %>"><img alt="등산" src="/images/moun.jpg" height="300px"></a>
		</div>
		<div style="text-align: center; width: calc(20%); float: left; overflow: hidden;">
			<h2>낚시</h2>
			<a href="crewJoin.do?key=act&act=낚시&gen=<%=gen %>"><img alt="낚시" src="/images/fishing33.jpg" height="300px"></a>
		</div>
		<div style="text-align: center; width: calc(20%); float: left; overflow: hidden;">
			<h2>오락</h2>
			<a href="crewJoin.do?key=act&act=오락&gen=<%=gen %>"><img alt="오락" src="https://i.ytimg.com/vi/FHnalNvdUP0/maxresdefault.jpg" height="300px"></a>
		</div>
		<div style="text-align: center; width: calc(20%); float: left; overflow: hidden;">
			<h2>힐링</h2>
			<a href="crewJoin.do?key=act&act=힐링&gen=<%=gen %>"><img alt="힐링" src="/images/healing2.jpg" height="300px"></a>
		</div>
		<div style="text-align: center; width: calc(20%); float: left; overflow: hidden;">
			<h2>무관</h2>
			<a href="crewJoin.do?key=act&act=무관&gen=<%=gen %>"><img alt="무관" src="http://m.gagsital.com/web/product/medium/201707/2707_shop1_658932.jpg" height="300px"></a>
		</div>
	</div>
</body>
</html>