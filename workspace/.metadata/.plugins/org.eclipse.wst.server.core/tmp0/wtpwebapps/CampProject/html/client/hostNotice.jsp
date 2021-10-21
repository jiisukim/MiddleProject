<%@page import="vo.PagingVO"%>
<%@page import="vo.NoticeVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	List<NoticeVO> notList = (List<NoticeVO>)request.getAttribute("notList");
	String msg = request.getParameter("msg") == null ? "" : request.getParameter("msg");
	
	PagingVO pagingVO = (PagingVO)request.getAttribute("pagingVO");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script type="text/javascript" src="../../js/lib/jquery-3.6.0.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<style type="text/css">

</style>
<title>이짝워뗘 공지사항</title>
</head>
<body>
	<div class="container">
	  <h2>공지사항</h2>
	  <br><br>
	  <table border="1">
	 	 	<tr>
		      <td>제목</td>
		      <td>날짜</td>
		    </tr>
	  <%
	  	int notSize = notList.size();
	  
	  	if(notSize > 0){		// 사이즈가 0보다 클때 : 공지사항 게시물이 있을 때
	  		for(int i =0; i<notSize; i++){
	  %>
		  <tr>
		      <td><%= notList.get(i).getNtcTitle() %></td>
		      <td><%= notList.get(i).getNtcDate() %></td>
		  </tr>  
	  <%	
	  		} //fo문
	  %>
	  <!--  페이징 처리 시작  -->
	  <tr>
	  	<td colspan="4" align="center">
	  		<%if(pagingVO.getFirstPageNo() > pagingVO.getPageSize()) {%>
	  		<a href="??pageNo=<%=pagingVO.getFirstPageNo() - pagingVO.getPageSize() %>">[이전]</a>
	  		<%} %>
	  		<%for(int pNo = pagingVO.getFirstPageNo(); pNo <= pagingVO.getLastPageNo(); pNo++){%>
	  		<a <%if(pNo == pagingVO.getCurrentPageNo()){ %> style="color:orange;" <%} %> href="list.do?pageNo=<%=pNo %>">[<%=pNo %>]</a>
	  		<%} %>
	  		<%if(pagingVO.getLastPageNo() < pagingVO.getTotalPageCount()) { %>
			<a  href="list.do?pageNo=<%=pagingVO.getFirstPageNo() + pagingVO.getPageSize() %>">[다음]</a>
			<%} %>
	  	</td>
	  </tr>
	  <!--  페이징 처리 끝 -->
	  
	  
	  <%
	  	}else{				// 사이즈가 0일때 : 공지사항 게시물이 없을 때
	  %>
	  	<tr>
			<td colspan="2">공지사항이 없습니다.</td>
		</tr>
	  <%		
	  	}
	  %>
	  </table>
<%
if(msg.equals("성공")){
%>	  
<script type="text/javascript">
	alert('정상적으로 처리되었습니다.')
</script>
 <%
 }
 %>
	  
	</div>
</body>
</html>