<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Q&A 등록h</title>
</head>
<body>
	
	<form method="post"  action="<%=request.getContextPath() %>/qna/insert.do">
	
		<table border="1">
			<tr>
				<td>제목</td>
				<td><input type="text" name="qnaTitle"></td>
			</tr>		
			<tr>
				<td>내용</td>
				<td><textarea rows="10" cols="30" name="qnaCon"></textarea></td>
			</tr>
		</table>
		<input type="submit" value="Q&A 등록">
	</form>
</body>
</html>