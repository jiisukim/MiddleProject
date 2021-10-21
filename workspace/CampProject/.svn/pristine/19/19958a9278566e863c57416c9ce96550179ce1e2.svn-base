<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>이짝워뗘 | 회원가입</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">  	
	<script src="https://code.jquery.com/jquery-3.6.0.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>	
    <script src="/js/join/client_join.js"></script>
    <style>
        #box{
			border: 5px solid gray;
			padding :20px 0px;
			margin : 0px 30px;
		}		
		#addrBtn{
			margin-top: 15px;
		}
		.btn-secondary{
			background-color: black;
			color: white;
		}		
		.btn-secondary:hover{
			background-color: rgb(73, 66, 66);
			color: white;
		}
		#submit{
			margin-right: 30px;
		}
		.btns{
			margin-top: 10px;
		}
    </style>
</head>
<body>
   

    <form class="form-horizontal container" id="fm">
        <h2 class="col-sm-offset-2">회원가입</h2>
        <div id="box">
            <div class="form-group">
				<label for="memId" class="control-label col-sm-2">아이디<sup class="text-danger">*</sup> : </label>
				<div class="col-sm-10 form-inline">
					<input type="text" class="form-control width" id="memId" name="memId">
					<button class="btn btn-default" type="button" onclick="duplicate('id')" id="btnUserid">중복검사</button>
					<span id="isIdOk"></span>
				</div>
			</div>	
			<hr>
            <div class="form-group">
				<label for="memPw" class="control-label col-sm-2">비밀번호<sup class="text-danger">*</sup> : </label>
				<div class="col-sm-10 form-inline">
					<input type="password" id="memPw" class="form-control" name="memPw">	
					<span id="isPwOk"></span>			
				</div>
			</div>	
			<div class="form-group">
				<label for="memPwChk" class="control-label col-sm-2">비밀번호 재입력<sup class="text-danger">*</sup> : </label>
				<div class="col-sm-10 form-inline">
					<input type="password" id="memPwChk" class="form-control">	
					<span id="isPwChkOk"></span>			
				</div>
			</div>
			<hr>
            <div class="form-group">
				<label for="memName" class="control-label col-sm-2">이름<sup class="text-danger">*</sup> : </label>
				<div class="col-sm-10 form-inline">
					<input type="text" id="memName" class="form-control"  name="memName">						
					<span id="isNameOk"></span>		
				</div>
			</div>	
			<hr>
			<div class="form-group">
				<label for="memNick" class="control-label col-sm-2">닉네임<sup class="text-danger">*</sup> : </label>
				<div class="col-sm-10 form-inline">
					<input type="text" id="memNick" class="form-control"  name="memNick">	
					<button class="btn btn-default" type="button" onclick="duplicate('nick')" id="btnUserNick">중복검사</button>
					<span id="isNickOk"></span>		
				</div>
			</div>	
			<hr>
            <div class="form-group">
				<label for="memName" class="control-label col-sm-2">성별<sup class="text-danger">*</sup> : </label>
				<div class="col-sm-10 form-inline">
					<input type="radio" id="male" name="memGen" value="남자">
                    <label for="male">남</label>
                    <input type="radio" id="female" name="memGen" value="여자">
                    <label for="female">녀</label><br>	
                    <input type="radio" id="other" name="memGen" value="기타">
                    <label for="other">기타</label>
				</div>
			</div>	
			<hr>
			<div class="form-group">
				<label for="memBir" class="control-label col-sm-2">생년월일 : </label>
				<div class="col-sm-10 form-inline">
					<input type="date" id="memBir" class="form-control" name="memBir">			
					<span id="isBirOk"></span>
				</div>
			</div>		
			<hr>
			<div class="form-group">
				<label for="memEmail" class="control-label col-sm-2">이메일 : </label>
				<div class="col-sm-10 form-inline">
					<input type="email" id="memEmail" class="form-control" name="memEmail">		
					<span id="isEmailOk"></span>			
				</div>
			</div>	
			<hr>
			<div class="form-group">
				<label for="memTel" class="control-label col-sm-2">휴대폰번호 : </label>
				<div class="col-sm-10 form-inline">
					<input type="text" id="memTel" class="form-control" placeholder="010-0000-0000" name="memTel">
					<span id="isTelOk"></span>					
				</div>
			</div>	
			<hr>
			<div class="form-group">
				<div id="google_recaptha">	
					<label class="control-label col-sm-2">보안체크<sup class="text-danger">*</sup> :</label>
					<div class="col-sm-10 form-inline">
						<script src='https://www.google.com/recaptcha/api.js'></script>					
						<div class="g-recaptcha" data-sitekey="6Lf6gTobAAAAAPZfjJN0AS_YlKoMuOtF0VHHDiaC"></div>
					</div>
				</div>
			</div>

        </div>
		<div class="form-group btns">
			<div class="col-sm-offset-2 col-sm-10">
				<button type="button" class="btn btn-primary btn-lg" id="submit" onclick="save()">저장</button>
				<button type="button" class="btn btn-lg" id="reset" onclick="resetForm()">초기화</button>
				<button type="button" class="btn btn-secondary btn-lg" id="cancel" onclick="cancelForm()">취소</button>
			</div>
		</div>	
		<input type="hidden" name="flag" id="flag" value="">

    </form>

</body>
</html>