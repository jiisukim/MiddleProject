<%@page import="vo.PagingVO"%>
<%@page import="java.util.List"%>
<%@page import="vo.MemVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<%
List<MemVO> memList = (List<MemVO>)request.getAttribute("memList");
PagingVO pagingVO = (PagingVO)request.getAttribute("pagingVO");
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.15.3/css/all.css" integrity="sha384-SZXxX4whJ79/gErwcOYf+zWLeJdY/qpuqC4cAa9rOGUstPomtqpuNWT9wdPEn2fk" crossorigin="anonymous">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<script>
</script>
<title>회원관리</title>
</head>
<body>

<%@include file="/WEB-INF/views/include/header.jsp" %>

	<div class="container">
		  <h2><i class="fas fa-exclamation-circle"></i>회원 관리</h2>
		  <br><br><br>
		  <br><br><br>
		  
		  <table border="1">
		      <thead>
			      <tr>
			          <th>회원 아이디</th>
			          <th>회원 이름</th>
					  <th>전화번호</th>		          
			      </tr>
		      </thead>
		      
		     <% 
				int memSize = memList.size();
				
				if(memSize > 0) {
					for(int i=0; i<memSize; i++){
			%>	

		      <tbody>
		          <tr>
		              <td><a href="view.do?memId=><%=memList.get(i).getMemCode() %>"><%= memList.get(i).getMemId() %></a></td>
		              <td><%= memList.get(i).getMemName() %></td>
		              <td><%= memList.get(i).getMemTel() %></td>
		          </tr>
		      </tbody>
		    <%		
				 }
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
				<td colspan="3">회원 정보가 없습니다.</td>
			</tr>
			<%
				}
			%>
	
			<tr align="center">
				<div class=btnCampHost" style="float:right;">
				    <td colspan="3"><a href="adminInsert.do"><button class="btn btn-default"><i class="far fa-edit"></i>업체 등록</button></a>
				</div>
			</tr>
			
		  </table>
	</div>
</body>
</html>