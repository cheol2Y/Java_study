<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>�̰��� ex03�Դϴ�.</title>
</head>
<body>
	<%!		// �޼��� ����
			public int sumAll(int num){
				int total = 0 ;
				for (int i=1 ; i <=num; i++){
					total += i;
				}
				return total;
	}
	
	%>
	<%
			// ��ũ��Ʋ��
			int num = 10;
			num = sumAll(num);
			System.out.println("num: "+ num);
	%>
</body>	<%= num %>
</html>