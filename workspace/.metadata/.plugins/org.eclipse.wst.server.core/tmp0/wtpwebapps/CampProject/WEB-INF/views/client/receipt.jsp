<%@page import="vo.CampBookVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	CampBookVO campbook = (CampBookVO)request.getAttribute("campbook");


%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">  	
	<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.15.3/css/all.css" integrity="sha384-SZXxX4whJ79/gErwcOYf+zWLeJdY/qpuqC4cAa9rOGUstPomtqpuNWT9wdPEn2fk" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.6.0.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script> 
    <script>
        // 이전화면으로 돌아가기
		function cancelForm(){
			if(confirm("이전화면으로 돌아가시겠습니까?")){
				location.href = "<%=request.getContextPath()%>/campingDetail.jsp";
			}			
		}	
      

    </script>
    <style>
        #box{
			border: 5px solid gray;
			padding :20px 0px;
			margin : 0px 30px;
		}	
        span{
            font-size: 1.4em;
        }
    </style>
    
<title>이짝워뗘 | 예약내역</title>
</head>
<body>
    
    <form class="form-horizontal container" id="fm">
        <h2 class="col-sm-offset-2">예약내역</h2>
        <div id="box">
            <div class="form-group">
				<label for="memId" class="control-label col-sm-2">예약장소: </label>
				<div class="col-sm-10 form-inline">
					<span class="text-info" id="showCampNick">백일야영장</span>
				</div>
			</div>	
            <hr>
            <div class="form-group">
				<label for="memPw" class="control-label col-sm-2">예약번호 :</label>
				<div class="col-sm-10 form-inline">
                    <span class="text-info" id="bkCode"><%=campbook.getBkCode() %></span>
				</div>
			</div>
			<hr>
            <div class="form-group">
				<label for="memPw" class="control-label col-sm-2">예약인원 :</label>
				<div class="col-sm-10 form-inline">
                    <span class="text-info" id="showMemnum"><%=campbook.getBkMemnum() %></span><span class="text-info">명</span>
				</div>
			</div>	
			<div class="form-group">
				<label for="memPwChk" class="control-label col-sm-2">입소일 :</label>
				<div class="col-sm-10 form-inline">
					<span class="text-info" id="bkDayin"><%=campbook.getBkDayin() %></span>
				</div>
			</div>
			<hr>
            <div class="form-group">
				<label for="memName" class="control-label col-sm-2">퇴소일 :</label>
				<div class="col-sm-10 form-inline">
					<span class="text-info" id="bkDayout"><%=campbook.getBkDayout() %></span>
				</div>
			</div>	
			<hr>
			<div class="form-group">
				<label for="memNick" class="control-label col-sm-2">결제일 :</label>
				<div class="col-sm-10 form-inline">
					<span class="text-info" id="bkPayday">2021-06-25</span>	
				</div>
			</div>				
            <div class="form-group">
				<label for="bkPrice" class="control-label col-sm-2">총 결제액 :</label>
				<div class="col-sm-10 form-inline">
					<span class="text-info" id="showprice"><%=campbook.getBkPrice() %></span><span class="text-info">원</span>														
				</div>
			</div>	
        </div>
		<div class="form-group btns">
			<div class="col-sm-offset-2 col-sm-10">
				<button type="button" class="btn btn-primary btn-lg" id="submit" onclick="cancelForm()">목록으로</button>			
			</div>
		</div>
    </form>
</body>
</html>