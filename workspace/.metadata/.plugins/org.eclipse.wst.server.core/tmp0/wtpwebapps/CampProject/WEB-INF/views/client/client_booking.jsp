<%@page import="vo.MemVO"%>
<%@page import="vo.CampHostVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//파라미터로 받을것들 
	//해당 캠핑장정보(수용인원, 가격 ) 		
	MemVO memVO = (MemVO)session.getAttribute("memVO")==null?null:(MemVO)session.getAttribute("memVO");
	String memNick = "";
	String memName = "";
	if(memVO!=null) {
		memNick = memVO.getMemNick();
		memName = memVO.getMemName();
	}

%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">  	
	<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.15.3/css/all.css" integrity="sha384-SZXxX4whJ79/gErwcOYf+zWLeJdY/qpuqC4cAa9rOGUstPomtqpuNWT9wdPEn2fk" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.6.0.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>  
	<script src="https://cdn.iamport.kr/js/iamport.payment-1.1.5.js" type="text/javascript"></script>  
	
	<script>
				
		// 이전화면으로 돌아가기
		function cancelForm(){
			if(confirm("이전화면으로 돌아가시겠습니까?")){
				location.href = "<%=request.getContextPath()%>/campingDetail.jsp";
			}			
		}		
		
		var cmpFee = 25000;//1박 가격
		var bkDayin = 0;
		var bkDayout = 0;
		var bak = 0;
		var bkPrice = 0;

		$(document).ready(function(){	
			
			$("#bkDayin").change(function () {   // 시작날짜가 오늘보다 전 날짜인 경우
				var date = new Date();
				var year = date.getFullYear(); 
				var month = (1 + date.getMonth());          
					month = month >= 10 ? month : '0' + month; 
				var day = date.getDate();                 
					day = day >= 10 ? day : '0' + day;
				date = year + month +day;
				
				
				var startDate = $("#bkDayin").val();
				startDate = startDate.replace(/-/gi, "");
				console.log(startDate);
				
				
				console.log(date);
				if(parseInt(date) > parseInt(startDate)){
					alert("입소일이 과거입니다. 올바르게 입력해주십시오");
					$("#bkDayin").val('startDate');     // 야매식 날짜 선택 풀리게 하기
				}else{
					bkDayin = startDate;
				}
				
			});	
			$("#bkDayout").change(function () {      // 끝 날짜가 시작날짜보다 빠를 시 오류창 출력
				var startDate = $("#bkDayin").val();
				var startDate2 = startDate.replace(/-/gi, "");
				console.log(startDate);
				
				var lastDate = $("#bkDayout").val();
				lastDate = lastDate.replace(/-/gi, "");
				console.log(lastDate);				

				
				if(parseInt(startDate2) > parseInt(lastDate)){
					alert("마지막 날이 시작 날보다 빠릅니다.");
					$("#bkDayout").val('startDate');      // 야매식 날짜 선택 풀리게 하기
				}else if(parseInt(startDate2) == parseInt(lastDate)){
					bak = 1;
					console.log(bak);
					bkPrice = bak * cmpFee;
					var result = bkPrice + "원";
					$("#showprice").html(result);
					$("#bkPrice").val(bkPrice);
				}
				else{
					bkDayout = lastDate;
					bak = bkDayout - bkDayin;
					console.log(bak);
					bkPrice = bak * cmpFee
					var result = bkPrice + "원";
					$("#showprice").html(result);
					$("#bkPrice").val(bkPrice);
				}


			});
			$("#paying").click(function () {
				var IMP = window.IMP; // 생략가능
				IMP.init('imp19732306');
				// 'iamport' 대신 부여받은 "가맹점 식별코드"를 사용
				// i'mport 관리자 페이지 -> 내정보 -> 가맹점식별코드
				IMP.request_pay({
					pg: 'inisis', // version 1.1.0부터 지원.
					/*
					'kakao':카카오페이,
					html5_inicis':이니시스(웹표준결제)
					'nice':나이스페이
					'jtnet':제이티넷
					'uplus':LG유플러스
					'danal':다날
					'payco':페이코
					'syrup':시럽페이
					'paypal':페이팔
					*/
					pay_method: 'card',
					/*
					'samsung':삼성페이,
					'card':신용카드,
					'trans':실시간계좌이체,
					'vbank':가상계좌,
					'phone':휴대폰소액결제
					*/
					merchant_uid: 'merchant_' + new Date().getTime(),
					/*
					merchant_uid에 경우
					https://docs.iamport.kr/implementation/payment
					위에 url에 따라가시면 넣을 수 있는 방법이 있습니다.
					참고하세요.
					나중에 포스팅 해볼게요.
					*/
					name: '백일야영장',
					//결제창에서 보여질 이름
					amount: bkPrice,
					//가격
					buyer_email: 'iamport@siot.do',
					buyer_name: '구매자이름',
					buyer_tel: '010-1234-5678',
					buyer_addr: '서울특별시 강남구 삼성동',
					buyer_postcode: '123-456',
					m_redirect_url: '<%=request.getContextPath()%>/'
					/*
					모바일 결제시,
					결제가 끝나고 랜딩되는 URL을 지정
					(카카오페이, 페이코, 다날의 경우는 필요없음. PC와 마찬가지로 callback함수로 결과가 떨어짐)
					*/
					}, function (rsp) {
						console.log(rsp);
						if (rsp.success) {
							var msg = '결제가 완료되었습니다.';
							msg += '고유ID : ' + rsp.imp_uid;
							msg += '상점 거래ID : ' + rsp.merchant_uid;
							msg += '결제 금액 : ' + rsp.paid_amount;
							msg += '카드 승인번호 : ' + rsp.apply_num;
					
							var fm = $("#fm");				
							fm.attr("method", "post");
							fm.attr("action", "<%=request.getContextPath()%>/pay/chspay.do");
							fm.submit();								
							
						} else {
							var msg = '결제에 실패하였습니다.';
							msg += '에러내용 : ' + rsp.error_msg;
						}
						alert(msg);
						});
			});
		});

		
		


	</script>
	<style>
		#box{
			border: 5px solid gray;
			padding :20px 0px;
			margin : 0px 30px;
		}	
		#flow{
			margin : 0px 10px;
		}
	</style>
<title>이짝워뗘 | 예약 페이지</title>
</head>
<body>
    <form class="form-horizontal container" id="fm">
        <h2 class="col-sm-offset-2">예약하기</h2>
        <div id="box">
			<input type="hidden" name="cmpCode" id="cmpCode" value="999">
            <div class="form-group">
				<label for="bkMemnum" class="control-label col-sm-2">예약 인원<sup class="text-danger">*</sup> : </label>
				<div class="col-sm-10 form-inline">
					<input type="text" class="form-control width" id="bkMemnum" name="bkMemnum"><span class="text-info" style="font-size: 1.3em; margin-left: 10px;">명</span>				
				</div>
			</div>	
			<hr>            
			<div class="form-group">
				<label for="bkDayin" class="control-label col-sm-2">입소일 ~ 퇴소일 : </label>
				<div class="col-sm-10 form-inline">
					<input type="date" id="bkDayin" class="form-control" name="bkDayin"><span class="text-primary" id="flow">~</span>	
					<input type="date" id="bkDayout" class="form-control" name="bkDayout">					
				</div>
			</div>		
			<hr>			        
			<div class="form-group">
				<label for="bkPrice" class="control-label col-sm-2">총 결제액: </label>
				<div class="col-sm-10 form-inline">
					<h2 class="text-info" id="showprice"></h2>
					<input type="hidden" id="bkPrice" class="form-control" name="bkPrice" readonly>											
				</div>
			</div>		
        </div>
		<div class="form-group btns">
			<div class="col-sm-offset-2 col-sm-10">
				<button type="button" class="btn btn-primary btn-lg" id="paying">결제하기</button>			
				<button type="button" class="btn btn-secondary btn-lg" id="cancel" onclick="cancelForm()">돌아가기</button>
			</div>
		</div>		
		<input type="hidden" name="memNick" id="memNick" value="<%=memVO.getMemNick() %>">
		<input type="hidden" name="memName" id="memName" value="<%=memVO.getMemName() %>">	
		
		<input type="hidden" name="flag" id="flag" value="">
    </form>


</body>
</html>