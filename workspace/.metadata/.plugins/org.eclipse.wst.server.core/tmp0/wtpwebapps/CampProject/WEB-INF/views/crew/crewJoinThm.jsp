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
String act = request.getParameter("act");
%>
<body>
	<div id="logo">
		<img src="../images/crew.png" alt="..?">
	</div>
	
	<h2>캠핑여행의 테마를 선택해주세요.</h2>
		<br><br><br>
	<div class="container" style="width: 70%">
	<br><br><br>
		<div style="text-align: center; width: calc(20%); float: left; overflow: hidden;">
			<h2>해안</h2>
			<a href="crewJoin.do?key=thm&thm=해안&gen=<%=gen %>&act=<%=act %>"><img alt="해안" src="http://nstayidb.cafe24.com/arribada/tour/101.jpg" height="300px"></a>
		</div>
		<div style="text-align: center; width: calc(20%); float: left; overflow: hidden;">
			<h2>자연</h2>
			<a href="crewJoin.do?key=thm&thm=자연&gen=<%=gen %>&act=<%=act %>"><img alt="자연" src="https://papers.co/android/wp-content/uploads/papers.co-mi76-mountain-spring-view-sunrise-david-marcu-nature-6-wallpaper-1-250x400.jpg" height="300px"></a>
		</div>
		<div style="text-align: center; width: calc(20%); float: left; overflow: hidden;">
			<h2>도시</h2>
			<a href="crewJoin.do?key=thm&thm=도시&gen=<%=gen %>&act=<%=act %>"><img alt="도시" src="https://pds.joins.com/news/component/htmlphoto_mmdata/201505/07/htm_2015050723223750105011.jpg" height="300px"></a>
		</div>
		<div style="text-align: center; width: calc(20%); float: left; overflow: hidden;">
			<h2>반려동물</h2>
			<a href="crewJoin.do?key=thm&thm=반려동물&gen=<%=gen %>&act=<%=act %>"><img alt="반려동물" src="https://c.wallhere.com/photos/15/46/dog_bubbles_look-608053.jpg!d" height="300px"></a>
		</div>
		<div style="text-align: center; width: calc(20%); float: left; overflow: hidden;">
			<h2>무관</h2>
			<a href="crewJoin.do?key=thm&thm=무관&gen=<%=gen %>&act=<%=act %>"><img alt="무관" src="http://m.gagsital.com/web/product/medium/201707/2707_shop1_658932.jpg" height="300px"></a>
		</div>
	</div>
</body>
</html>