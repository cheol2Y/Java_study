<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<a href="./ex01.jsp">ex01</a>
	<form action = "./ex02_result.jsp" method = "get">
		<input type="text" name= "addr" placeholder="주소를입력하시게">
		<input type= "submit" value = "전송">
	</form>
</body>
</html>