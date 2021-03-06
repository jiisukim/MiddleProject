
function findAddr() {
    new daum.Postcode({
        oncomplete: function(data) {
            // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.

            // 도로명 주소의 노출 규칙에 따라 주소를 표시한다.
            // 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.
            var roadAddr = data.roadAddress; // 도로명 주소 변수
            var jibunAddr = data.jibunAddress; // 소재지번 주소
                        
            // 참고항목 문자열이 있을 경우 해당 필드에 넣는다.
            if(roadAddr !== ''){								
                $("#roadAddress").val(roadAddr);
            } else {								
                $("#roadAddress").val("-");
            }
            if(jibunAddr !== ''){								
                $("#jibunAddress").val(jibunAddr);
            } else {								
                $("#jibunAddress").val("-");
            }

            $("#jibunAddress").focus();

        }
    }).open();
}		


$(document).ready(function(){
    $("#cmpId").keyup(function(){	    
        var regExp = /[a-z]+[a-z0-9]{3,11}/;
        var String = "영문 소문자와 숫자의 조합으로 4~12 글자";			
        validate($("#cmpId"), $("#isIdOk") , regExp, String);	
    });
    
    $("#cmpPw").keyup(function(){
        var regExp = /^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[$@$!%*?&])[A-Za-z\d$@$!%*?&]{8,12}/;
        var String = "영문 소문자, 영문 대문자, 숫자, 특수문자가 각각 1개 이상씩 포함된 8~12 글자";
        validate($("#cmpPw"), $("#isPwOk") , regExp, String);
    });

    $("#cmpPwChk").keyup(function(){
        if($("#cmpPw").val() != $("#cmpPwChk").val()){
            $("#isPwChkOk").html("비밀번호가 일치하지 않습니다.");
            $("#isPwChkOk").addClass("text-warning");
        }else{
            $("#isPwChkOk").html("");
        }    
    });

    $("#cmpNick").keyup(function(){	    
        var regExp =  /^[가-힣a-zA-Z0-9]{1,10}$/;
        var String = "한글, 영문, 숫자 1~10글자";			
        validate($("#cmpNick"), $("#isNickOk") , regExp, String);	
    });

    $("#cmpHostname").keyup(function(){	    
        var regExp =  /^[가-힣a-zA-Z0-9]{1,10}$/;
        var String = "한글, 영문, 숫자 1~10글자";			
        validate($("#cmpHostname"), $("#isNameOk") , regExp, String);	
    });

    $("#cmpTel").keyup(function(){
        var regExp = /^[0-9]{2,3}-?[0-9]{3,4}-?[0-9]{4}$/; 
        var String = "올바른 전화번호가 아닙니다";
        validate($("#cmpTel"), $("#isTelOk") , regExp, String);
    });

    $("#cmpDesc").keyup(function(){	   
        $("#textarea").val($("#cmpDesc").val());
        
        if($("#cmpDesc").val().length > 150){
            $("#isDescOk").html("150자를 넘으셨습니다.");
            $("#isDescOk").addClass("text-warning");
        }else{
            $("#isDescOk").html("");
        }

    });

    $("#none").click(function(){
        if($(this).prop("checked")){
            $(":checkbox", "#checkbox").not("#none").prop("checked", false);				
        }
    });
    $(":checkbox", "#checkbox").not("#none").click(function(){
        if($("#none").prop("checked")){
            $("#none").prop("checked",false);
        }
    });

    $("#cmpFee").keyup(function(){
        var regExp = /^[0-9]+$/; 
        var String = "숫자로 구성된 올바른 요금이 아닙니다";
        validate($("#cmpFee"), $("#isFeeOk") , regExp, String);
    });

    $("#cmpSitenum").keyup(function(){
        var regExp = /^[0-9]+$/; 
        var String = "숫자로 구성된 올바른 사이트수가 아닙니다";
        validate($("#cmpSitenum"), $("#isSiteOk") , regExp, String);
    });



    function validate(element, isok , regExp, String ){
        var input = element.val();
        if(!input.match(regExp)){				
            isok.html(String);
            isok.addClass("text-warning");
        }else{
            isok.html("");
        }	
    
    }
});

function duplicate(flag){		
    // 입력된 값이 있는지 확인, 입력된 값이 유효한지, 형식이 맞는지, db에서 중복된것이 있는지

    // 영소문자 반드시 포함, 영소문자와 숫자조합으로 4 ~ 12글자
    
    if(flag == "id"){
        var checkELe = $("#cmpId");
        var isok = $("#isIdOk");
        var alertStr = "아이디를 입력해 주세요";
        var success = "사용가능한 아이디입니다.";	
        var fail = "중복된 아이디입니다.";	
        var param = {cmpId : checkELe.val(), flag : "checkId" };

        if(checkELe.val() == null || checkELe.val().length == 0){  //빈칸일시 경고
            alert(alertStr);
            return;
        }

        var regExp = /[a-z]+[a-z0-9]{3,11}/;       
        var input = checkELe.val();
        if(!input.match(regExp)){				
            alert("영문 소문자와 숫자의 조합으로 4~12글자의 아이디를 입력해주십시오.");
            return;
        }	

    }else{
        var checkELe = $("#cmpNick");
        var isok = $("#isNickOk");
        var alertStr = "닉네임을 입력해 주세요";
        var success = "사용가능한 닉네임입니다."
        var fail = "중복된 닉네임입니다.";	
        var param = {cmpNick : checkELe.val(), flag : "checkNick" };

        if(checkELe.val() == null || checkELe.val().length == 0){  //빈칸일시 경고
            alert(alertStr);
            return;
        }

        var regExp =  /^[가-힣a-zA-Z0-9]{1,10}$/;       
        var input = checkELe.val();
        if(!input.match(regExp)){				
            alert("한글, 영문, 숫자 1~10글자의 닉네임을 입력해주십시오.");
            return;
        }						
    }				
    
    console.log(param);

    $.ajax({
        url: "/hostjoin.do"
        ,type : "post"
        ,data : param
        ,dataType : "json"
        ,success : function(data){
            console.log(data);
            if(data.isDuplicate == null){
                alert("처리중에 오류발생");
            }
            if(!data.isDuplicate){  //존재시 true가 날라옴
                alert(success);
                isok.html( "\'"+ checkELe.val() +"\'"  +" 사용가능");
                isok.addClass("text-success")
            }else{
                alert(fail);
                isok.html(fail);
                isok.addClass("text-warning")
                checkELe.focus();
            }
        }
        ,error : function(xhr){
            console.log(xhr);
            alert("오류입니다. 관리자에게 문의하세요");
        }				
    });

}

// 이전화면으로 돌아가기
function cancelForm(){
    if(confirm("입력을 취소하시겠습니까? 취소하시면 홈페이지로 돌아갑니다.")){
        var inputArr = $("input").not("#addrBtn");
        for(var i=0; i < inputArr.length;i++){
            inputArr[i].value = "";
        }				
        //방법2가 작동안되서 location 넣음
        // var fm = $("#fm");
        // fm.attr("method", "get");
        // fm.attr("action", "http://localhost/camp/");				
        // fm.submit();
        location.href = "http://localhost/";
    }
}

// 리셋버튼 
function resetForm(){
    if(confirm("초기화 하시겠습니까?")){
        var inputArr = $("input").not("#addrBtn");
        for(var i=0; i < inputArr.length;i++){           
            $(inputArr[i]).val("");
        }
    }
}

function save(){

    //아이디체크
    var cmpId = $("#cmpId").val();
    if(cmpId.length == 0 || cmpId == null){ //빈칸체크
        alert("영문 소문자와 숫자의 조합으로 4~12 글자가 포함된 아이디를 입력해주시기 바랍니다");
        $("#cmpId").focus();
        return;
    }else{  // 정규식 체크
        var regExp = /[a-z]+[a-z0-9]{3,11}/;              
        if(!cmpId.match(regExp)){				
            alert("영문 소문자와 숫자의 조합으로 4~12 글자 아이디를 입력해주시기 바랍니다.");
            $("#cmpId").focus();
            return;
        }
    }

    //비밀번호
    var cmpPw = $("#cmpPw").val();
    if(cmpPw.length == 0 || cmpPw == null){ //빈칸체크
        alert("영문 소문자, 영문 대문자, 숫자, 특수문자가 각각 1개 이상씩 포함된 비밀번호를 입력해주시기 바랍니다");
        $("#cmpPw").focus();
        return;
    }else{  // 정규식 체크
        var regExp = /^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[$@$!%*?&])[A-Za-z\d$@$!%*?&]{8,12}/;           
        if(!cmpPw.match(regExp)){				
            alert("영문 소문자, 영문 대문자, 숫자, 특수문자가 각각 1개 이상씩 포함된 8~12 글자의 비밀번호를 입력해주시기 바랍니다.");
            $("#cmpPw").focus();
            return;
        }
    }

    //닉네임
    var cmpNick = $("#cmpNick").val();
    if(cmpNick.length == 0 || cmpNick == null){ //빈칸체크
        alert("한글, 영문, 숫자 1~10글자가 포함된 아이디를 입력해주시기 바랍니다");
        $("#cmpNick").focus();
        return;
    }else{  // 정규식 체크
        var regExp =  /^[가-힣a-zA-Z0-9]{1,10}$/;           
        if(!cmpNick.match(regExp)){				
            alert("한글, 영문, 숫자 1~10글자로 이름을 입력해주시기 바랍니다.");
            $("#cmpNick").focus();
            return;
        }
    }

    //캠핑장이름
    var cmpHostname = $("#cmpHostname").val();
    if(cmpHostname.length == 0 || cmpHostname == null){ //빈칸체크
        alert("한글, 영문, 숫자 1~10글자가 포함된 아이디를 입력해주시기 바랍니다");
        $("#cmpHostname").focus();
        return;
    }else{  // 정규식 체크
        var regExp =  /^[가-힣a-zA-Z0-9]{1,10}$/;           
        if(!cmpHostname.match(regExp)){				
            alert("한글, 영문, 숫자 1~10글자로 이름을 입력해주시기 바랍니다.");
            $("#cmpHostname").focus();
            return;
        }
    }

    //캠핑장 전화번호
    var cmpTel = $("#cmpTel").val();
    if(cmpTel.length == 0 || cmpTel == null){ //빈칸체크
        alert("숫자로 구성된 올바른 휴대폰 번호를 입력해주시기 바랍니다");
        $("#cmpTel").focus();
        return;
    }else{  // 정규식 체크       
        var regExp = /^[0-9]{2,3}-?[0-9]{3,4}-?[0-9]{4}$/; 
        if(!cmpTel.match(regExp)){				
            alert("올바른 전화번호를 입력해주시기 바랍니다.");
            $("#cmpTel").focus();
            return;
        }
    }

    //편의시설 체크박스
    var cnt = 0;
    $(":checkbox","#checkbox").each(function(index,item){
        if($(item).prop("checked")== true){
            cnt++;
        }		
    });
    if(cnt == 0){
        alert("편의시설에 해당사항을 체크해주시기 바랍니다.");
        return;
    }
    
    //요금
    var cmpFee = $("#cmpFee").val();
    if(cmpFee.length == 0 || cmpFee == null){ //빈칸체크
        alert("1박2일 기준 요금을 입력해 주시기 바랍니다.");
        $("#cmpFee").focus();
        return;
    }else{  // 정규식 체크
        var regExp = /^[0-9]+$/;            
        if(!cmpFee.match(regExp)){				
            alert("숫자로 구성된 올바른 요금이 아닙니다.");
            $("#cmpFee").focus();
            return;
        }
    }

    //야영사이트 수
    var cmpSitenum = $("#cmpSitenum").val();
    if(cmpSitenum.length == 0 || cmpSitenum == null){ //빈칸체크
        alert("운영중인 야영사이트 수를 입력해 주시기 바랍니다.");
        $("#cmpSitenum").focus();
        return;
    }else{  // 정규식 체크
        var regExp = /^[0-9]+$/;            
        if(!cmpSitenum.match(regExp)){				
            alert("숫자로 구성된 올바른 야영사이트 수가 아닙니다.");
            $("#cmpSitenum").focus();
            return;
        }
    }
    
    //주소입력
    var addr = $("#roadAddress").val();
    if(addr.length == 0 || addr== null){
        alert("주소를 입력해주시기 바랍니다.");
        $("#roadAddress").focus();
        return;
    }

    //중복체크 여부
    if($("#isIdOk").html().indexOf("사용가능") == -1){
        alert("아이디 중복체크를 해주시기 바랍니다.");
        $("#cmpId").focus();
        return;
    }
    if($("#isNickOk").html().indexOf("사용가능") == -1){
        alert("닉네임 중복체크를 해주시기 바랍니다.");	
        $("#cmpNick").focus();			
        return;
    }

    //recaptcha 체크여부
    if($("#g-recaptcha-response").val() == null || $("#g-recaptcha-response").val().length == 0){
        alert("보안체크란에 체크박스를 체크해주시기 바랍니다.");
        return;
    }

    if(confirm("회원가입 하시겠습니까?")){	
        $("#flag").val("joinhost");
               
        var fm = $("#fm")[0]; //form정보 가져오기
        var fmData = new FormData(fm) //form정보 FormData에다가 담기
        fmData.append("atFile", $("#cmpImg")[0].files[0]); // atfile에다가 파일담기
        

        $.ajax({
            url : "/hostjoin.do"
            ,type : "post"
            ,enctype : "multipart/form-data"
            ,data : fmData
            ,processData : false
            ,contentType : false
            ,dataType : "json"
            ,success : function(data){
                console.log(data);
                if(data.isInsert){
                    alert("회원가입이 완료되었습니다. 홈페이지로 가셔서 다시 로그인해주시기 바랍니다.")
                    //방법1
                    location.href = "http://localhost/"; //성공시 이동될 사이트
                    //방법2
                    // var fm = $("#fm");							
                    // fm.prop("method","get");
                    // fm.prop("action", "/");							
                    // fm.submit();
                }else{
                    alert("저장중에 오류가 발생했습니다. 관리자에게 문의하세요.");
                }
            }
            ,error : function(xhr){
                console.log(xhr);
                alert("오류가 발생했습니다. 관리자에게 문의하세요");
            }

        })			
        
    }else{
        return;
    }

}





