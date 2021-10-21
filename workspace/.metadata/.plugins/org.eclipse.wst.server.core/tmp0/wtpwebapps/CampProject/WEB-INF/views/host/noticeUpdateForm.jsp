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
<title>공지사항 수정</title>
</head>
<body>
	<form method="post" enctype="multipart/form-data" action="<%=request.getContextPath() %>/host/noticeUpdate.do">
	    <input type="hidden" name="ntcCode" value="<%=notVo.getNtcCode() %>">
		<table>	
			<tr>
				<td>제목:</td>
				<td><input type="text" name="ntcTitle" value="<%=notVo.getNtcTitle()%>"></td>
			</tr>
			<tr>
				<td>내용:</td>
				<td><textarea rows="10" cols="30" name="ntcCon"><%=notVo.getNtcCon()%></textarea></td>
			</tr>
		</table>
		<button type="submit">회원정보 수정</button>
<!-- 		<input type="submit" value="회원정보 수정"> -->
	</form>
</body>
</html>