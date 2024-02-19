<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%@
		page import= "java.sql.*"	
	%>
	<a href="/jspmysql/ex02.jsp"> ex02.jsp</a> <br>
	<%
		String url = "jdbc:mysql://localhost:3306/classicmodels";
		String id = "test";
		String pw = "test1234";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager
					.getConnection(url,id,pw);
			
			String sql = "show tables;";
//			conn.prepareStatement(sql);
			PreparedStatement pstmt = conn
					.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				String table_name = rs.
						getString("Tables_in_classicmodels");
				System.out.println("테이블 이름은 "+table_name);
				%>
				<%=table_name %> <br>
				<%
			}
			
}
		catch (ClassNotFoundException | SQLException e) {
		      
		    } finally {
		    	
		      
	}
		
		
	%>
<%= url %>
</body> 
</html>