<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>이짝워뗘 | 캠핑장 호스트 등록</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">  	
	<script src="https://code.jquery.com/jquery-3.6.0.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
	<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>	
    <script src="/js/join/host_join.js"></script>	
    <style>
        #box{
			border: 5px solid gray;
			padding :20px 0px;
			margin : 0px 30px;
		}
		#checkbox label{
			margin-right: 5px;
		}
		#cmpFee + span{
			margin-left: 5px;
		}
		#cmpLati{
			margin-right: 5px;
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
	

    <form class="form-horizontal container" id="fm" enctype="multipart/form-data" method="POST">
        <h2 class="col-sm-offset-2">캠핑장호스트 회원가입</h2>
        <div id="box">
            <div class="form-group">
				<label for="cmpId" class="control-label col-sm-2">아이디<sup class="text-danger">*</sup> : </label>
				<div class="col-sm-10 form-inline">
					<input type="text" class="form-control width" id="cmpId" name="cmpId">
					<button class="btn btn-default" type="button" onclick="duplicate('id')" id="btnUserid">중복검사</button>
					<span id="isIdOk"></span>
				</div>
			</div>	
			<hr>
			<div class="form-group">
				<label for="cmpPw" class="control-label col-sm-2">비밀번호<sup class="text-danger">*</sup> : </label>
				<div class="col-sm-10 form-inline">
					<input type="password" id="cmpPw" class="form-control" name="cmpPw">	
					<span id="isPwOk"></span>			
				</div>
			</div>	
			<div class="form-group">
				<label for="cmpPwChk" class="control-label col-sm-2">비밀번호 재입력<sup class="text-danger">*</sup> : </label>
				<div class="col-sm-10 form-inline">
					<input type="password" id="cmpPwChk" class="form-control">	
					<span id="isPwChkOk"></span>			
				</div>
			</div>
			<hr>	
			<div class="form-group">
				<label for="cmpNick" class="control-label col-sm-2">닉네임<sup class="text-danger">*</sup> : </label>
				<div class="col-sm-10 form-inline">
					<input type="text" id="cmpNick" class="form-control"  name="cmpNick">	
					<button class="btn btn-default" type="button" onclick="duplicate('nick')" id="btnUserNick">중복검사</button>
					<span id="isNickOk"></span>
				</div>
			</div>	
			<hr>	
			<div class="form-group">
				<label for="cmpHostname" class="control-label col-sm-2">캠핑장이름<sup class="text-danger">*</sup> : </label>
				<div class="col-sm-10 form-inline">
					<input type="text" id="cmpHostname" class="form-control"  name="cmpHostname">						
					<span id="isNameOk"></span>		
				</div>
			</div>	
			<hr>
			<div class="form-group">
				<label for="cmpTel" class="control-label col-sm-2">캠핑장 전화번호<sup class="text-danger">*</sup> : </label>
				<div class="col-sm-10 form-inline">
					<input type="text" id="cmpTel" class="form-control"  name="cmpTel">						
					<span id="isTelOk"></span>		
				</div>
			</div>	
			<hr>
			<div class="form-group">
				<label for="cmpDesc" class="control-label col-sm-2">캠핑장설명: </label>
				<div class="col-sm-10 form-inline">							
					<textarea class="form-control" cols="60" rows="6" id="cmpDesc" placeholder="150자 내외로 써주세요."></textarea>		
					<input type="hidden" name="cmpDesc" id="textarea">
					<span id="isDescOk"></span>
					<!-- 150자내외	 -->
				</div>
			</div>	
			<hr>
			<div class="form-group">
				<label for="memHp" class="control-label col-sm-2">편의시설<sup class="text-danger">*</sup> : </label>
				<div class="col-sm-10 form-inline" id="checkbox">
					<input type="checkbox" id="electrical" name="cmpConv" value="전기시설">
					<label for="electrical">전기시설</label>
					<input type="checkbox" id="sewage" name="cmpConv" value="상하수도시설">
					<label for="sewage">상하수도시설</label>
					<input type="checkbox" id="toilet" name="cmpConv" value="화장실">
					<label for="toilet">화장실</label>
					<input type="checkbox" id="shower" name="cmpConv" value="샤워장">
					<label for="shower">샤워장</label>
					<input type="checkbox" id="store" name="cmpConv" value="편의점">
					<label for="store"> 편의점  </label>
					<br>
					<input type="checkbox" id="cooking" name="cmpConv" value="취사시설">
					<label for="cooking"> 취사시설  </label>
					<input type="checkbox" id="parking" name="cmpConv" value="주차장">
					<label for="parking"> 주차장  </label>
					<input type="checkbox" id="waterplay" name="cmpConv" value="물놀이장">
					<label for="waterplay"> 물놀이장  </label>
					<input type="checkbox" id="none" name="cmpConv" value="none">
					<label for="none"> 해당사항없음 </label>									
				</div>
			</div>	
			<hr>
			<div class="form-group">
				<label for="cmpFee" class="control-label col-sm-2">요금(1박2일 기준)<sup class="text-danger">*</sup> : </label>
				<div class="col-sm-10 form-inline">
					<input type="text" id="cmpFee" class="form-control"  name="cmpFee"><span class="text-info font-weight-bold">원</span>
					<span id="isFeeOk"></span>		
				</div>
			</div>	
			<hr>
			<div class="form-group">
				<label for="cmpSitenum" class="control-label col-sm-2">수용인원<sup class="text-danger">*</sup> : </label>
				<div class="col-sm-10 form-inline">
					<input type="text" id="cmpSitenum" class="form-control"  name="cmpSitenum">
					<span id="isSiteOk"></span>		
				</div>
			</div>	
			<hr>
			<div class="form-group">
				<label for="roadAddress" class="control-label col-sm-2">캠핑장 주소<sup class="text-danger">*</sup> : </label>
				<div class="col-sm-5">					
					<input type="text" id="roadAddress"  name="cmpLoadaddr" class="form-control" placeholder="도로명주소" readonly>										
				</div>
			</div>	
			<div class="form-group">
				<label class="control-label col-sm-2"></label>
				<div class="col-sm-5">				
					<input type="text" id="jibunAddress" name="cmpAddr" class="form-control" placeholder="지번주소" readonly>
					<input type="button" class="btn btn-primary" onclick="findAddr()" value="주소 찾기" id="addrBtn">														
					<span id="isTelOk"></span>		
				</div>
			</div>	
			<hr>
			<div class="form-group">
				<label class="control-label col-sm-2">캠핑장 위치좌표: </label>
				<div class="col-sm-10 form-inline">
					<label for="cmpLati">위도<span class="text-info">(latitude)</span></label>
					<input type="text" id="cmpLati" class="form-control"  name="cmpLati">
					<label for="cmpLong">경도<span class="text-info">(longitude)</span></label>
					<input type="text" id="cmpLong" class="form-control"  name="cmpLong">		
					<a href="https://www.google.com/maps/" target="_blank">좌표구하기</a>					
				</div>
			</div>	
			<hr>	
			<!-- t001	해안
			t002	자연
			t003	도시
			t004	반려동물
			t005	무관 -->
			<div class="form-group">
				<label for="memName" class="control-label col-sm-2">캠핑장 테마<sup class="text-danger">*</sup> : </label>
				<div class="col-sm-10 form-inline">
					<input type="radio" id="beach" name="tmCode" value="t001">
                    <label for="beach">해안</label>
					<input type="radio" id="nature" name="tmCode" value="t002">
                    <label for="nature">자연</label>
					<input type="radio" id="city" name="tmCode" value="t003">
                    <label for="city">도시</label>
                    <input type="radio" id="pet" name="tmCode" value="t004">
                    <label for="pet">반려동물</label>                  
				</div>
			</div>	
			<hr>
			<!-- a001	등산
			a002	낚시
			a003	오락
			a004	힐링
			a005	무관 -->
			<div class="form-group">
				<label for="memName" class="control-label col-sm-2">캠핑장 활동<sup class="text-danger">*</sup> : </label>
				<div class="col-sm-10 form-inline">
					<input type="radio" id="hiking" name="actCode" value="a001">
                    <label for="hiking">등산</label>
					<input type="radio" id="fishing" name="actCode" value="a002">
                    <label for="fishing">낚시</label>
					<input type="radio" id="game" name="actCode" value="a003">
                    <label for="game">오락</label>
                    <input type="radio" id="healing" name="actCode" value="a004">
                    <label for="healing">힐링</label>
                </div>
			</div>	
			<hr>
			<div class="form-group">
				<label class="control-label col-sm-2">캠핑장 소개사진: </label>
				<div class="col-sm-10 form-inline">
					<input type="file" accept="image/*" id="cmpImg"   name="cmpImg">						
					<!-- <span id="isFileOk"></span> -->
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