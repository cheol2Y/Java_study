<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>이것은 ex03입니다.</title>
</head>
<body>
	<%!		// 메서드 정의
			public int sumAll(int num){
				int total = 0 ;
				for (int i=1 ; i <=num; i++){
					total += i;
				}
				return total;
	}
	
	%>
	<%
			// 스크립틀릿
			int num = 10;
			num = sumAll(num);
			System.out.println("num: "+ num);
	%>
</body>	<%= num %>
</html>