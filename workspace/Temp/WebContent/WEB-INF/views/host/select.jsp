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
<title>공지사항 내용</title>
<style type="text/css">
	td:nth-child(1) {
		width: 70%;	
	}
	td:nth-child(2) {
		width: 30%;	
	}
	a{
		text-decoration: none;
		border-radius : 5px;
		border: 1px solid black;
		padding: 3px 10px 3px 10px;
		color: black;
	}
</style>
</head>
<%String date = notVo.getNtcDate();
date = date.substring(0,10);
%>
<body>
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