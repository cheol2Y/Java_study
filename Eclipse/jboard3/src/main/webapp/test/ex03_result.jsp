<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <%@ page import="common.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>ex03_result</title>
</head>
<body>
	<%
		String num1 = request.getParameter("num1");
	 	String num2 = request.getParameter("num2");
	 	int num11 = Integer.parseInt(num1);
	 	int num22 = Integer.parseInt(num2);
	 	
	 	
	 	test test = new test();
	 	int numSum = test.sumAll(num11,num22);
	 %>
	 <h3>더한값은 <%=numSum %></h3>
	 	
	
	<a href = "./ex03.jsp" >ex02</a>
</body>
</html>