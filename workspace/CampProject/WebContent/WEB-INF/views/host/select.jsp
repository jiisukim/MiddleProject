<%@page import="vo.NoticeVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	NoticeVO notVo = (NoticeVO)request.getAttribute("notVo");
%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<title>공지사항 내용</title>
<style type="text/css">
	table {
    	width: 100%;
    	border-top: 1px solid #444444;
    	border-collapse: collapse;
	  }
	td {
    	border-bottom: 1px solid #444444;
    	padding: 10px;
  	  }
  	  
  	  td{
  	  
  	  }
  	  a{
  	  	text-decoration: none;
  	  	border: navy solid 2px;
  	  	border-radius: 5px;
  	  	background-color: black;
  	  	color: white; 
  	  }
</style>
</head>
<%String date = notVo.getNtcDate();
date = date.substring(0,10);
%>
<body>

	<div class="w3-content w3-container w3-margin-top">
		<div class="w3-container w3-card-4">
			<form action="search/findId.do" method="post">
				<div class="w3-center w3-large w3-margin-top">

	<table border="1">
		<tr>
			<td><%=notVo.getNtcTitle() %></td>
			<td><%=date %></td>
		</tr>
		<tr>
			<td colspan="2"><%=notVo.getNtcCon() %></td>
		</tr>
	</table>
	<br>
	<a href="hostNotice.do" >목록</a>
	<a href="noticeUpdate.do?ntcCode=<%=notVo.getNtcCode() %>">수정</a>
	<a href="noticeDelete.do?ntcCode=<%=notVo.getNtcCode() %>">삭제</a>
	
</body>
</html>