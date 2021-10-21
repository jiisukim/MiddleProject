<%@page import="vo.MemVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	MemVO memVO = (MemVO)request.getAttribute("memVO");

%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<tr>
			<td>I D:</td>
			<td><%=memVO.getMemId() %></td>
		</tr>
		<tr>
			<td>이름:</td>
			<td><%=memVO.getMemName() %></td>
		</tr>
		<tr>
			<td>생년월일:</td>
			<td><%=memVO.getMemBir() %></td>
		</tr>
		<tr>
			<td>성별:</td>
			<td><%=memVO.getMemGen() %></td>
		</tr>
		<tr>
			<td>전화번호:</td>
			<td><%=memVO.getMemTel() %></td>
		</tr>
		<tr>
			<td>이메일:</td>
			<td><%=memVO.getMemEmail() %></td>
		</tr>
		
		<tr>
			<td colspan="2"><a href="list">[목록]</a> <a
				href="update.do?memId=<%=memVO.getMemId() %>">[회원정보 수정]</a></td>
		</tr>
	</table>
</body>
</html>