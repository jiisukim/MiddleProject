<%@page import="vo.AtFileVO"%>
<%@page import="vo.EventVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
	EventVO eventVO = (EventVO) request.getAttribute("eventVO");
List<AtFileVO> fileList = (List<AtFileVO>)request.getAttribute("fileList");
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>게시글 수정</title>
</head>
<body>
	<form method="post" enctype="multipart/form-data"
		action="<%=request.getContextPath()%>/event/update.do">

		<%-- 		<input type="hidden" name="atchFileId" value="<%=eventVO.getAtchFileId()%>"> --%>
		<table>
			<tr>
				<td>이벤트 코드번호</td>
				<td><%=eventVO.getEvnCode()%> <input type="hidden"
					name="evnCode" value="<%=eventVO.getEvnCode()%>"></td>
			</tr>
			<tr>
				<td>게시글 제목:</td>
				<td><input type="text" name="evnTitle"
					value="<%=eventVO.getEvnTitle()%>"></td>
			</tr>
			<tr>
				<td>게시글 내용:</td>
				<td><input type="text" name="evnCon"
					value="<%=eventVO.getEvnCon()%>"></td>
			</tr>
			<tr>
				<td>이벤트 시작일:</td>
				<td><input type="date" name="evnStart"
					value="<%=eventVO.getEvnStart()%>"></td>
			</tr>
			<tr>
				<td>이벤트 종료일:</td>
				<td><input type="date" name="evnEnd"
					value="<%=eventVO.getEvnEnd()%>"></td>
			</tr>
			 
			<tr>
				<td>기존첨부파일:</td>
				<td>
					<%if(fileList != null){ %>
					
						<%for(AtFileVO fileVO : fileList){ %>
						
						<div>
						<a href="<%=request.getContextPath() %>/filedownload.do?fileId=<%=fileVO.getFileId()%>&fileNo=<%=fileVO.getFileNo()%>">
							<%=fileVO.getFileOrigin() %>
						</a>
						</div>
						
						<%} %>
					
					<%} %>
				</td>
		</tr>		 
		<tr>
			<td>새로운 첨부파일</td>
			<td><input type="file" name="atFile"></td>
		</tr>
		</table>
		<input type="submit" value="게시글 수정">
	</form>
</body>
</html>