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
<title>성별 고르기</title>
<style type="text/css">
	img{
		border-radius: 15px;
		width: 400px;
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
<body>
	<div id="logo">
		<img src="../images/crew.png" alt="..?">
	</div>
	
	<h2>캠핑크루원의 성별을 선택해 주세요.</h2>
	<div class="container" style="width: 70%">
		<br><br><br>
		
		<div style="text-align: center; width: calc(33%); float: left; overflow: hidden;">
			<h2>Man</h2>
			<a href="crewJoin.do?key=gender&gen=남자" name="남자"><img name="남자" alt="남자" src="/images/man.png" height="400px"></a>
		</div>
		<div style="text-align: center; width: calc(33%); float: left; overflow: hidden;">
			<h2>Woman</h2>
			<a href="crewJoin.do?key=gender&gen=여자" name="여자"><img name="여자" alt="여자" src="/images/women.png" height="400px"></a>
		</div>
		<div style="text-align: center; width: calc(33%); float: right; overflow: hidden;">
			<h2>무관</h2>
			<a href="crewJoin.do?key=gender&gen=무관" name="무관"><img name="무관" alt="무관" src="http://m.gagsital.com/web/product/medium/201707/2707_shop1_658932.jpg" height="400px"></a>
		</div>
	</div>
</body>
</html>