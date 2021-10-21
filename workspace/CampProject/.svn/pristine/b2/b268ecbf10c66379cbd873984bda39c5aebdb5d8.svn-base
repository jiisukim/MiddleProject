<%@page import="vo.ViewRevVo"%>
<%@page import="vo.AdminVO"%>
<%@page import="vo.CampHostVO"%>
<%@page import="vo.MemVO"%>
<%@page import="vo.ConstVO"%>
<%@page import="vo.PagingVO"%>
<%@page import="java.util.List"%>
<%@page import="vo.EventVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
List<ViewRevVo> revList = (List<ViewRevVo>)request.getAttribute("revList");
PagingVO pagingVO = (PagingVO)request.getAttribute("pagingVO");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>캠핑장리뷰~</title>


<style type="text/css">
	table.type09 {
		text-align: left;
		border-collapse: collapse;
		line-height: 1.5;
		margin: auto;
	}
	
	table.type09 thead th {
		padding: 10px;
		font-weight: bold;
		vertical-align: top;
		color: #369;
		border-bottom: 3px solid #036;
	}
	
	table.type09 tbody th {
		width: 100px;
		padding: 10px;
		font-weight: bold;
		vertical-align: top;
		border-bottom: 1px solid #ccc;
		background-color: navy;
		color: white;
		
	}
	
	table.type09 td {
		width: 400px;
		padding: 10px;
		vertical-align: top;
		border-bottom: 1px solid #ccc;
	}
	
	h1 {
		text-align: center;
	}
</style>
<%
HttpSession loginSession = request.getSession();
String loginType = (String) loginSession.getAttribute(ConstVO.LOGIN_TYPE);
MemVO memVO = (MemVO) loginSession.getAttribute("memVO");
CampHostVO hostVO = (CampHostVO) loginSession.getAttribute("hostVO");
AdminVO adminVO = (AdminVO) loginSession.getAttribute("adminVO");
%>
</head>
<body>

	<h1>리뷰 목록 보기</h1>
	<br>
	<br>
	<table class="type09" border="1">
		<thead>
			<tr>
				<th style="width: 200px;">번호</th>
				<th>제목</th>
				<th style="width: 200px;">작성자</th>
				<th style="width: 200px;">날짜</th>
			</tr>
		</thead>
		<%
				int revSize = revList.size();
				if (revSize > 0) { // 사이즈가 0보다 클때 : 공지사항 게시물이 있을 때
					for (int i = 0; i < revSize; i++) {
						String revTitle = revList.get(i).getvTitle();
			%>
		<tbody>
			<tr>
				<td style="width: 200px;"><%= revTitle %></td>
				<td><a
					href="view.do?qnaCode=<%= revTitle %>"><%= revList.get(i).getvTitle() %></a></td>
<!-- 					a태그 라서 반드시 태그 사이에 내용. href는 코드번호-->
				<td style="width: 200px;"><%= revList.get(i).getvNick() %></td> 
				<td style="width: 200px;"><%= revList.get(i).getvDate() %></td>
			</tr>
		</tbody>
		<%		
			 } // for문
		%>

		<!-- 페이징 처리 시작 -->
		<tr>
			<td colspan="4" align="center">
				<%if(pagingVO.getFirstPageNo() > pagingVO.getPageSize()) { %> <a
				href="list.do?pageNo=<%=pagingVO.getFirstPageNo() - pagingVO.getPageSize() %>">[이전]</a>
				<%} %> <%for(int pNo = pagingVO.getFirstPageNo(); pNo <= pagingVO.getLastPageNo(); pNo++){ %>
				<a <%if(pNo == pagingVO.getCurrentPageNo()){ %>
				style="color: green;" <%} %> href="list.do?pageNo=<%=pNo %>">[<%=pNo %>]
			</a> <%} %> <%if(pagingVO.getLastPageNo() < pagingVO.getTotalPageCount()) { %>
				<a
				href="list.do?pageNo=<%=pagingVO.getFirstPageNo() + pagingVO.getPageSize() %>">[다음]</a>
				<%} %>
			</td>
		</tr>
		<!-- 페이징 처리 끝 -->
		<% 		
			}else{ // 회원정보가 존재하지 않으면...
			%>
		<tr align="center">
			<td colspan="4">리뷰가 올라오지 않았습니다.</td>
		</tr>
		<%
			}
		%>
		<tr align="center">
			<td colspan="4"><a href="insert.do">[리뷰 쓰러가기]</a></td>
		</tr>

	</table>


</body>
</html>
