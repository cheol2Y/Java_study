<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="common.*" %>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		BoardList board = new BoardList();
		List<Map> lst = board.selectBoard();
	
		System.out.println("lst size: "+lst.size());

	%>
	<h3>board에 등록된 글의 수: <%=lst.size() %></h3>
</body>
</html>