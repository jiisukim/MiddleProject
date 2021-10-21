<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	 int isVerify= (Integer)request.getAttribute("isSuccess");
%>

<%
	if(isVerify == 1){%>
		
	{ "isSuccess" : 1}
		
		
<%
	}else if(isVerify == 0){%>
		
	{ "isSuccess" : 0}
<%		
	}%>
