<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>HTTP ��û ����</title>
</head>
<body>
	<a href="/jspmysql/ex01.jsp"> ex01.jsp</a> <br>
	��û���� ���ڵ� ���: <%=request.getCharacterEncoding() %> <br>
	��û���� ���� ���: <%=request.getMethod() %> <br>
	��û URL: <%=request.getRequestURL() %> <br>
	���ؽ�Ʈ ���: <%=request.getContextPath() %> <br>
	���� �̸�: <%=request.getServerName() %> <br>
	���� ��Ʈ: <%=request.getServerPort() %> <br>
</body>
</html>