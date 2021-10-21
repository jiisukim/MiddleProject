<%@page import="vo.QnaVO"%>
<%@page import="vo.EventVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	QnaVO qnaVO = (QnaVO)request.getAttribute("qnaVO");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Q&A 정보</title>
<style type="text/css">
	th {
		width: 200px;
	}
	td{
		width: 400px;
	}
	table {
		border: 1px black solid;
		text-align: center;
		font-size: x-large;
		border-collapse: collapse;
		line-height: 1.5;
		margin: auto;
	}
	a{
		line-height: 1.5;
		margin: auto;
	}
	th{
		font-size: large;
	}
	
	a {
		text-decoration: none;
		border: 2px solid gray;
		color: black;
		border-radius: 5px;
		background-color: black;
		color: white;
</style>
</head>
<body>
	<table border="1">
		<tr style="height: 70px;">
			<th style="background-color: navy; color: white;">제목</th>
			<th><%=qnaVO.getQnaTitle() %></th>
			<th style="background-color: navy; color: white;">내용</th>
			<th><%=qnaVO.getQnaCon() %></th>
		</tr>
	</table>
	<br>
	<br>
	<a href="list.do">목록</a>
	<a href="update.do?qnaCode=<%=qnaVO.getQnaCode() %>">게시글 수정</a>
	<a href="delete.do?qnaCode=<%=qnaVO.getQnaCode() %>">게시글 삭제</a>
</body>
</html>