<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%
		String addr = request.getParameter("addr");
		addr = addr.strip();
		
		if (addr.equals("서울")){
	%>
		<h3>addr: 대한민국 수도임</h3>
	<%	}else {
	%>
		<h3> addr:<%=addr %></h3>
	<% } 
	%>
	
	<a href = "./ex02.jsp" >ex02</a>

</body>
</html>