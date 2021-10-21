<%@page import="vo.PagingVO"%>
<%@page import="vo.NoticeVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	List<NoticeVO> noticeList = (List<NoticeVO>)request.getAttribute("noticeList");
// 	String msg = request.getParameter("msg") == "" ? "실패" : "성공";
// 	System.out.println(msg);
	PagingVO pagingVO = (PagingVO)request.getAttribute("pagingVO");
	NoticeVO notVo = (NoticeVO)request.getAttribute("notVo");
%>



<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<style type="text/css">
	table{
		width: 100%;
	}
	tr:nth-child(1){
		text-align: center;
	}
	td:nth-child(1) {
		width: 70%;	
	}
	td:nth-child(2) {
		text-align: center;
		width: 30%;	
	}
</style>
<title>이짝워뗘 공지사항</title>
</head>

<body>
	<div class="container">
	  <h2>공지사항</h2>
	  <br><br>
	  <div>
	  	<form style="float: right;" method="post" enctype="multipart/form-data" action="<%=request.getContextPath() %>/host/noticeSearch.do">
		  <button disabled="disabled">제목</button>
		  <input type="text" name="ntcTitle">
		  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<button type="submit" value="제목검색">검색</button>
		</form>
	  <br>
	  <br>
	  <table border="1">
	 	 	<tr>
		      <td>제목</td>
		      <td>날짜</td>
		    </tr>
	  <%
	  int notSize = noticeList.size();
	  	if(notSize > 0){		// 사이즈가 0보다 클때 : 공지사항 게시물이 있을 때
	  		for(int i =0; i<notSize; i++){
	  			String date = noticeList.get(i).getNtcDate();
	  			date = date.substring(0,10);
	  %>
		  <tr>
		      <td><a href="select.do?ntcCode=<%=noticeList.get(i).getNtcCode() %>"><%= noticeList.get(i).getNtcTitle() %></a></td>
		      <td><%= date %></td>
		  </tr>  
	  <%	
	  		} //fo문
	  %>
	  <!--  페이징 처리 시작  -->
	  <tr>
	  	<td colspan="4" align="center">
	  		<%if(pagingVO.getFirstPageNo() > pagingVO.getPageSize()) {%>
	  		<a href="hostNotice.do?pageNo=<%=pagingVO.getFirstPageNo() - pagingVO.getPageSize() %>">[이전]</a>
	  		<%} %>
	  		<%for(int pNo = pagingVO.getFirstPageNo(); pNo <= pagingVO.getLastPageNo(); pNo++){%>
	  		<a <%if(pNo == pagingVO.getCurrentPageNo()){ %> <%} %> href="hostNotice.do?pageNo=<%=pNo %>">[<%=pNo %>]</a>
	  		<%} %>
	  		<%if(pagingVO.getLastPageNo() < pagingVO.getTotalPageCount()) { %>
			<a  href="hostNotice.do?pageNo=<%=pagingVO.getFirstPageNo() + pagingVO.getPageSize() %>">[다음]</a>
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
	<a href="noticeInsert.do" style="float: right;"><button>공지등록</button></a>
	</div>
	  
<script type="text/javascript">

<%-- <% --%>
// if(msg.equals("성공")){
<%-- %>	   --%>
// 	alert('정상적으로 처리되었습니다.')
<%--  <% --%>
//  }
<%--  %>  --%>


</script>

	</div>
</body>
</html>