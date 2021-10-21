<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

 
<%
	System.out.println("중복처리과정 시작");
	String overLap = (String)request.getAttribute("overLap");	
	
	if(overLap.equalsIgnoreCase("Y")){		
		%>
		
		{"isDuplicate" : true }		
		
		<%				
	}else if(overLap.equalsIgnoreCase("N")){		
		%>
		
		{"isDuplicate" : false }		
		
		<%				
	}else{
		%>
		{"isDuplicate" : "" }	
		<%
	}
%>
