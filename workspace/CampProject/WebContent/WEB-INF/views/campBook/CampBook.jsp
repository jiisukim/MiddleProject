<%@page import="vo.PagingVO"%>
<%@page import="vo.CampBookVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
List<CampBookVO> campBookList = (List<CampBookVO>)request.getAttribute("campBookList");
	
	
	PagingVO pagingVO = (PagingVO)request.getAttribute("pagingVO");

%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>예약내역 조회</title>
<style type="text/css">
	td, th{
		width: 500px;
		height: 40px;
	}
	th{
		background-color: navy;
		color: white;
	}
	table {
		border: 2px black solid;
		text-align: center;
		border-collapse: collapse;
	}
	h1{
		text-align: center;
	}
</style>
</head>
<body>
<h1>예약내역</h1>
<table border="1">
		<tr>
			<th>결제일</th>
			<th>입실 날짜</th>
			<th>퇴실 날짜</th>
			<th>입실 인원</th>
			<th>가 격</th>			
		</tr>

		<%
			int campBookSize = campBookList.size();
			if (campBookSize > 0) { // 사이즈가 0보다 클때 : 공지사항 게시물이 있을 때
				for (int i = 0; i < campBookSize; i++) {
					String date = campBookList.get(i).getBkPayday();
					date = date.substring(0, 10);
		%>
	

		<tr>
			<td><%= date %></td>
			<td><%= campBookList.get(i).getBkDayin() %></td>
			<td><%= campBookList.get(i).getBkDayout() %></td>
			<td><%= campBookList.get(i).getBkMemnum() %><p style="display: inline;">명</p></td>
			<td><%= campBookList.get(i).getBkPrice() %><p style="display: inline;">원</p></td> 
		</tr>
		<%		
		 } // for문
	%>

		<!-- 페이징 처리 시작 -->
		<tr>
			<td colspan="5" align="center">
				<%if(pagingVO.getFirstPageNo() > pagingVO.getPageSize()) { %> <a
				href="CampBook.do?pageNo=<%=pagingVO.getFirstPageNo() - pagingVO.getPageSize() %>">[이전]</a>
				<%} %> <%for(int pNo = pagingVO.getFirstPageNo(); pNo <= pagingVO.getLastPageNo(); pNo++){ %>
				<a <%if(pNo == pagingVO.getCurrentPageNo()){ %>
				style="color: green;" <%} %> href="CampBook.do?pageNo=<%=pNo %>">[<%=pNo %>]
			</a> <%} %> <%if(pagingVO.getLastPageNo() < pagingVO.getTotalPageCount()) { %>
				<a
				href="CampBook.do?pageNo=<%=pagingVO.getFirstPageNo() + pagingVO.getPageSize() %>">[다음]</a>
				<%} %>
			</td>
		</tr>
		<!-- 페이징 처리 끝 -->
		<% 		
		}else{ // 회원정보가 존재하지 않으면...
	%>
		<tr>
			<td colspan="5">예약 정보가 없습니다.</td>
		</tr>
		<%
		}
	%>
	</table>


</body>
</html>
