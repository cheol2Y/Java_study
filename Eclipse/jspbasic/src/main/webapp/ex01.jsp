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
			// �ڹ��ڵ� �ۼ���
		String str= "��ũ��Ʋ�� �Դϴ�?";
		int num = 13;
		num *= 5;
		System.out.println("num: "+num);
	%>
		<h1>
			�ȳ��ϼ��� ù ��° �����Դϴ�. ����� ���Ͻó׿�
		</h1>
		<p>
			���� �ð��� <%= new java.util.Date() %>�Դϴ�.
		</p>
	</body>
</html>