<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="EUC-KR">
		<title>Hello World!</title>
	</head>
	<body>
	<%
			// 자바코드 작성쓰
		String str= "스크립틀릿 입니다?";
		int num = 13;
		num *= 5;
		System.out.println("num: "+num);
	%>
		<h1>
			안녕하세요 첫 번째 예제입니다. 띄어쓰기는 잘하시네용
		</h1>
		<p>
			현재 시간은 <%= new java.util.Date() %>입니다.
		</p>
	</body>
</html>