<%@page import="vo.AtFileVO"%>
<%@page import="vo.EventVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	EventVO eventVO = (EventVO)request.getAttribute("eventVO");

	 List<AtFileVO> fileList = (List<AtFileVO>)request.getAttribute("fileList");
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
<title>게시글 정보</title>
<style type="text/css">
	table {
		text-align: left;
		border-collapse: collapse;
		line-height: 1.5;
		margin: auto;
		
	}
	table th,td{
		padding: 10px;
		font-weight: bold;
		color: #369;
		border-bottom: 3px solid #036;
		text-align: center;
	}
	
	table td {
		width: 100px;
		font-weight: bold;
		vertical-align: top;
		border-bottom: 1px solid #ccc;
		color: black;	
	}
	
	table td {
		width: 400px;
		padding: 10px;
		border-bottom: 1px solid #ccc;
	}
	
	h1 {
		text-align: center;
	}
	.atag{
		text-align: center;	
	}
	.bg-dark {
    background-color: #5a5c69 !important;
	}

</style>
</head>
<body>

<%@include file="/WEB-INF/views/include/header.jsp" %>
	<h2 align="center"><i class="fas fa-book-open">&nbsp;&nbsp;&nbsp;</i>이벤트</h2>
	<br><br><br>
	<table style="border: 1px solid white;">
	
		<tr>
			<th style="background-color: #669999; color: white;">제&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 목</th>
			<th><%=eventVO.getEvnTitle() %></th>
		</tr>
			<%
							
						String date = eventVO.getEvnDate();
						date = date.substring(0, 10);
			%>
		<tr>
			<td style="margin: auto;" width="60%"  height="100px; background-color: navy; color: white;"><center>내&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 용</center></td>
			<td><%=eventVO.getEvnCon() %></td>
		</tr>
		<tr>
			<td style="background-color: #669999; color: white;">등록일</td>
				<td><%=date %></td>
		</tr>
		
		<tr>
			<td colspan="3" height="300px;"> 
				<%if(fileList != null){ %> 
				
					<%for(AtFileVO fileVO : fileList){ %>

				<div>
					<img id="aaa" src="<%=request.getContextPath() %>/filedownload.do?fileId=<%=fileVO.getFileId()%>&fileNo=<%=fileVO.getFileNo()%>" />
					<br><br><br>
				<div style="float: left;">
					<p style="display: inline;">첨부파일: </p>
					<a
						href="<%=request.getContextPath() %>/filedownload.do?fileId=<%=fileVO.getFileId()%>&fileNo=<%=fileVO.getFileNo()%>">
						<%=fileVO.getFileOrigin() %>
					</a>
				</div>	
				</div> 
					<%} %>
				
				 <%} %>

			</td>
		</tr>
		
	</table>
	<br>
	<br>
	<%
		// 관리자 이면
		if(ConstVO.LOGIN_TYPE_ADMIN.equals(loginType)){
		
	%>
	<div class="atag">
		<a href="list.do"><button class="btn btn-success"><i class="far fa-edit"></i>게시글 등록</button></a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<a href="update.do?evnCode=<%=eventVO.getEvnCode() %>"><button class="btn btn-warning"><i class="far fa-edit"></i>게시글 수정</button></a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<a href="delete.do?evnCode=<%=eventVO.getEvnCode() %>"><button class="btn btn-danger"><i class="far fa-edit"></i>게시글 삭제</button></a>
	</div>
	<%} %>
</body>
</html>