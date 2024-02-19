<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>HTTP 요청 정보</title>
</head>
<body>
	<a href="/jspmysql/ex01.jsp"> ex01.jsp</a> <br>
	요청정보 인코딩 방식: <%=request.getCharacterEncoding() %> <br>
	요청정보 전송 방식: <%=request.getMethod() %> <br>
	요청 URL: <%=request.getRequestURL() %> <br>
	컨텍스트 경로: <%=request.getContextPath() %> <br>
	서버 이름: <%=request.getServerName() %> <br>
	서버 포트: <%=request.getServerPort() %> <br>
</body>
</html>