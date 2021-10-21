<%@page import="vo.MemVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	MemVO memVO = (MemVO)request.getAttribute("memVO");
%>

<!DOCTYPE html PUBLIC "-//W3C//Dth HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dth">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>회원 정보</h1>
	<br><br><br>
	<table border="1">
		<tr>
			<th>회원 코드</th>
			<th>회원 ID</th>
			<th>회원 닉네임</th>
			<th>회원 이름</th>			
			<th>회원 생년월일</th>		
			<th>회원 이메일</th>		
			<th>회원 전화번호</th>		
		</tr>
		<tr>
			<td><%=memVO.getMemCode() %></td>
			<td><%=memVO.getMemId() %></td>
			<td><%=memVO.getMemNick() %></td>
			<td><%=memVO.getMemName() %></td>
			<td><%=memVO.getMemBir() %></td>
			<td><%=memVO.getMemEmail() %></td>
			<td><%=memVO.getMemTel() %></td>
		</tr>
	</table>
	<br><br>
	<a href="adminList.do">목록</a>
	<a href="adminUpdate.do?memCode=<%=memVO.getMemCode() %>">회원정보 수정</a>
	<a href="adminDelete.do?memCode=<%=memVO.getMemCode() %>">회원정보 삭제</a>

</body>
</html>