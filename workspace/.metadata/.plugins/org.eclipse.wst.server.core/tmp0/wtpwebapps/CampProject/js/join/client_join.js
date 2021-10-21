$(document).ready(function(){
			

    $("#memId").keyup(function(){	    
        var regExp = /[a-z]+[a-z0-9]{3,11}/;
        var String = "영문 소문자와 숫자의 조합으로 4~12 글자";			
        validate($("#memId"), $("#isIdOk") , regExp, String);	
    });

    $("#memPw").keyup(function(){
        var regExp = /^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[$@$!%*?&])[A-Za-z\d$@$!%*?&]{8,12}/;
        var String = "영문 소문자, 영문 대문자, 숫자, 특수문자가 각각 1개 이상씩 포함된 8~12 글자";
        validate($("#memPw"), $("#isPwOk") , regExp, String);
    });

    $("#memPwChk").keyup(function(){
        if($("#memPw").val() != $("#memPwChk").val()){
            $("#isPwChkOk").html("비밀번호가 일치하지 않습니다.");
            $("#isPwChkOk").addClass("text-warning");
        }else{
            $("#isPwChkOk").html("");
        }    
    });

    $("#memName").keyup(function(){	    
        var regExp =  /^[가-힣]{2,5}$/;
        var String = "한글 2~5글자";			
        validate($("#memName"), $("#isNameOk") , regExp, String);	
    });

    $("#memNick").keyup(function(){	    
        var regExp =  /^[가-힣a-zA-Z0-9]{1,10}$/;
        var String = "한글, 영문, 숫자 1~10글자";			
        validate($("#memNick"), $("#isNickOk") , regExp, String);	
    });

    var today = new Date();
    var yyyy = today.getFullYear(); 
    var mm = today.getMonth() < 9 ? "0" + (today.getMonth() + 1) : (today.getMonth() + 1); 
    var dd  = today.getDate() < 10 ? "0" + today.getDate() : today.getDate();
    $("#memBir").change(function(){
        var memyyyy = $("#memBir").val().substr(0,4);
        var memmm = $("#memBir").val().substr(5,2);
        var memdd = $("#memBir").val().substr(8,2);
        var currAge =  parseInt(yyyy + mm + dd) - parseInt(memyyyy + memmm + memdd);
        if(currAge < 190000){
            alert("만19세 미만은 이용하실 수 없습니다.");
            $("#isBirOk").html("만19세 미만은 이용하실 수 없습니다.");
            $("#isBirOk").addClass("text-warning");
        }else{
            $("#isBirOk").html("해당 사이트를 이용하실 수 있는 나이입니다.");
        }
    });

    $("#memEmail").keyup(function(){
        var regExp =/^[a-zA-Z0-9.!#$%&’*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\.[a-zA-Z0-9-]+)*$/; 
        var String = "올바른 이메일 형식이 아닙니다 ex)carcar@hanmail.net";
        validate($("#memEmail"), $("#isEmailOk") , regExp, String);
    });

    $("#memTel").keyup(function(){
        var regExp = /^\d{3}-?\d{4}-?\d{4}$/; 
        var String = "숫자로 구성된 올바른 휴대폰 번호가 아닙니다";
        validate($("#memTel"), $("#isTelOk") , regExp, String);
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
        var checkELe = $("#memId");
        var isok = $("#isIdOk");
        var alertStr = "아이디를 입력해 주세요";
        var success = "사용가능한 아이디입니다.";	
        var fail = "중복된 아이디입니다.";	
        var param = {memId : checkELe.val(), flag : "checkId" };

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
        var checkELe = $("#memNick");
        var isok = $("#isNickOk");
        var alertStr = "닉네임을 입력해 주세요";
        var success = "사용가능한 닉네임입니다."
        var fail = "중복된 닉네임입니다.";	
        var param = {memNick : checkELe.val(), flag : "checkId" };

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
        url: "/clientjoin.do"
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
                isok.removeClass("text-warning");
                isok.addClass("text-success");
            }else{
                alert(fail);
                isok.html(fail);
                isok.removeClass("text-success");
                isok.addClass("text-warning");
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
        var inputArr = $("input");
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
        var inputArr = $("input");
        for(var i=0; i < inputArr.length;i++){           
            $(inputArr[i]).val("");
        }
    }
}



function save(){
    //아이디체크
    var memId = $("#memId").val();
    if(memId.length == 0 || memId == null){ //빈칸체크
        alert("영문 소문자와 숫자의 조합으로 4~12 글자가 포함된 아이디를 입력해주시기 바랍니다");
        $("#memId").focus();
        return;
    }else{  // 정규식 체크
        var regExp = /[a-z]+[a-z0-9]{3,11}/;              
        if(!memId.match(regExp)){				
            alert("영문 소문자와 숫자의 조합으로 4~12 글자 아이디를 입력해주시기 바랍니다.");
            $("#memId").focus();
            return;
        }
    }
    
    
    //비밀번호
    var memPw = $("#memPw").val();
    if(memPw.length == 0 || memPw == null){ //빈칸체크
        alert("영문 소문자, 영문 대문자, 숫자, 특수문자가 각각 1개 이상씩 포함된 비밀번호를 입력해주시기 바랍니다");
        $("#memPw").focus();
        return;
    }else{  // 정규식 체크
        var regExp = /^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[$@$!%*?&])[A-Za-z\d$@$!%*?&]{8,12}/;           
        if(!memPw.match(regExp)){				
            alert("영문 소문자, 영문 대문자, 숫자, 특수문자가 각각 1개 이상씩 포함된 8~12 글자의 비밀번호를 입력해주시기 바랍니다.");
            $("#memPw").focus();
            return;
        }
    }

    
    //이름
    var memName = $("#memName").val();
    if(memName.length == 0 || memName == null){ //빈칸체크
        alert("한글로 이루어진 이름을 입력해주시기 바랍니다");
        $("#memName").focus();
        return;
    }else{  // 정규식 체크
        var regExp = /^[가-힣]{2,5}$/;          
        if(!memName.match(regExp)){				
            alert("한글 2~5글자로 이름을 입력해주시기 바랍니다.");
            $("#memName").focus();
            return;
        }
    }			
    
    
    //닉네임
    var memNick = $("#memNick").val();
    if(memNick.length == 0 || memNick == null){ //빈칸체크
        alert("한글, 영문, 숫자 1~10글자가 포함된 아이디를 입력해주시기 바랍니다");
        $("#memNick").focus();
        return;
    }else{  // 정규식 체크
        var regExp =  /^[가-힣a-zA-Z0-9]{1,10}$/;           
        if(!memNick.match(regExp)){				
            alert("한글, 영문, 숫자 1~10글자로 이름을 입력해주시기 바랍니다.");
            $("#memNick").focus();
            return;
        }
    }

    //성별 
    var cnt = 0;
    $(":radio","#box").each(function(index,item){
        if($(item).prop("checked")== true){
            cnt++;
        }		
    });
    if(cnt == 0){
        alert("성별을 선택해 주시기 바랍니다.");
        return;
    }
    
    
    //생년월일
    var today = new Date();
    var yyyy = today.getFullYear();
    var mm = today.getMonth() < 9 ? "0" + (today.getMonth() + 1) : (today.getMonth() + 1); 
    var dd  = today.getDate() < 10 ? "0" + today.getDate() : today.getDate();
    if( $("#memBir").val().length == 0 ||  $("#memBir").val() == null){ //빈칸체크
        alert("생년월일을 입력해주시기 바랍니다");
        $("#memBir").focus();
        return;
    }else{ // 나이체크     
        var memyyyy = $("#memBir").val().substr(0,4);
        var memmm = $("#memBir").val().substr(5,2);
        var memdd = $("#memBir").val().substr(8,2);
        var currAge =  parseInt(yyyy + mm + dd) - parseInt(memyyyy + memmm + memdd);
        if(currAge < 190000){
            alert("만19세 미만은 이용하실 수 없습니다.");
            $("#memBir").focus();
            return;
        }				
    }
    
    
    //메일체크
    var memEmail = $("#memEmail").val();
    if(memEmail.length == 0 || memEmail == null){ //빈칸체크
        alert("이메일주소를 입력해주시기 바랍니다. ex)carcar@hanmail.net");
        $("#memEmail").focus();
        return;
    }else{  // 정규식 체크
        var regExp =/^[a-zA-Z0-9.!#$%&’*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\.[a-zA-Z0-9-]+)*$/;           
        if(!memEmail.match(regExp)){				
            alert("올바른 이메일 형식을 입력해주시기 바랍니다. ex)carcar@hanmail.net");
            $("#memEmail").focus();
            return;
        }
    }
    
    //휴대폰번호
    var memTel = $("#memTel").val();
    if(memTel.length == 0 || memTel == null){ //빈칸체크
        alert("숫자로 구성된 올바른 휴대폰 번호를 입력해주시기 바랍니다");
        $("#memTel").focus();
        return;
    }else{  // 정규식 체크       
        var regExp = /^\d{3}-?\d{4}-?\d{4}$/;           
        if(!memTel.match(regExp)){				
            alert("000-0000-000 형식으로 휴대폰 번호를 입력해주시기 바랍니다.");
            $("#memTel").focus();
            return;
        }
    }
    // <!-- 아이디, 비밀번호 , 비밀번호 재확인, 이름 , 닉네임, 성별, 생년월일, 이메일 , 핸드폰번호, 리캡챠-->
        // <!-- memId memPw memNick  memName	memBir memGen memEmail memTel -->
    
    //중복체크 여부
    if($("#isIdOk").html().indexOf("사용가능") == -1){
        alert("아이디 중복체크를 해주시기 바랍니다.");
        $("#memId").focus();
        return;
    }
    if($("#isNickOk").html().indexOf("사용가능") == -1){
        alert("닉네임 중복체크를 해주시기 바랍니다.");	
        $("#memNick").focus();			
        return;
    }

    //recaptcha 체크여부
    if($("#g-recaptcha-response").val() == null || $("#g-recaptcha-response").val().length == 0){
        alert("보안체크란에 체크박스를 체크해주시기 바랍니다.");
        return;
    }

    if(confirm("회원가입 하시겠습니까?")){	
        $("#flag").val("joinclient");

        $.ajax({
            url : "/clientjoin.do"
            ,type : "post"
            ,data : $("#fm").serialize()
            ,dataType : "json"
            ,success : function(data){
                console.log(data);
                if(data.isInsert){
                    alert("회원가입이 완료되었습니다.")
                    //방법1
                    // location.href="/MemberPj/list"; //성공시 이동될 사이트
                    //방법2
                    var fm = $("#fm");							
                    fm.prop("method","get");
                    fm.prop("action", "/");							
                    fm.submit();
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


