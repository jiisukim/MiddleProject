<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>공지사항 등록</title>
</head>
<body>
	<form method="post" enctype="multipart/form-data" action="<%=request.getContextPath() %>/host/noticeInsert.do">
		<table>
			<tr>
				<td>관리자 코드</td>
				<td><input type="text" name="admCode"></td>
			</tr>
			<tr>
				<td>제목: </td>
				<td><input type="text" name="ntcTitle"></td>
			</tr>
			<tr>
				<td>내용: </td>
				<td><textarea rows="10" cols="30" name="ntcCon"></textarea></td>
			</tr>
		</table>
		<button type="submit">공지등록</button>
	</form>
</body>
</html>


<!-- "ntcCode" 자동 -->
<!-- "admCode"  -->
<!-- "ntcTitle" -->
<!-- "ntcCon"  -->
<!-- "ntcDate"  -->