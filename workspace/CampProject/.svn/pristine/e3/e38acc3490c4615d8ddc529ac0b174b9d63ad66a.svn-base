<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

 
<%
	System.out.println("db 입력처리과정 성공여부");
	String msg = (String)request.getAttribute("msg");	
	
	if("성공".equalsIgnoreCase(msg)){		
		%>
		
		{"isInsert" : true }		
		
		<%				
	}else if("실패".equalsIgnoreCase(msg)){		
		%>
		
		{"isInsert" : false }		
		
		<%				
	}else{
		%>
		{"isInsert" : "" }	
		<%
	}
%>
