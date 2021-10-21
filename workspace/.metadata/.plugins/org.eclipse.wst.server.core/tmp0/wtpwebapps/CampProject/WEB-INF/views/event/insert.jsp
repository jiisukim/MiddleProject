<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>게시글 등록</title>
</head>
<body>
	<form method="post" enctype="multipart/form-data" action="<%=request.getContextPath() %>/event/insert.do">
		<table border="1">
			<tr>
				<td>관리자 코드</td>
				<td><input type="text" name="admCode"></td>
			</tr>		
			<tr>
				<td>이벤트 제목</td>
				<td><input type="text" name="evnTitle"></td>
			</tr>		
			<tr>
				<td>이벤트 내용</td>
				<td><textarea rows="10" cols="30" name="evnCon"></textarea></td>
			</tr>
			<tr>
				<td>이벤트 시작일</td>
				<td><input type="date" name="evnStart"></td>
			</tr>
			<tr>
				<td>이벤트 종료일</td>
				<td><input type="date" name="evnEnd"></td>
			</tr>
 			<tr>
				<td>첨부파일</td>
				<td><input type="file" name="atFile"></td>
			</tr> 
		</table>
		<input type="submit" value="게시글 등록">
	</form>
</body>
</html>