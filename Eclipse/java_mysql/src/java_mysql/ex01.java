package java_mysql;

import java.sql.*;

public class ex01 {
	public static void main(String[] args) {
		// DBSM -> jdbc:mysql:
		// localhost는 mysql 설치위치
		// 어떤 Database 사용하는 건지 -> /examplesdb
		String url = "jdbc:mysql://localhost:3306/classicmodels";
		String id = "test";
		String pw = "test1234";
		
		// 커넥션 객체 만들자
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
			}
			
}
		catch (ClassNotFoundException | SQLException e) {
		      
		    } finally {
		    	
		      
	}

		
	}}


