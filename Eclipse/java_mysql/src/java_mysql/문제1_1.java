package java_mysql;

import java.sql.*;
public class 문제1_1 {
	public static void main(String[] args) {
		// DBSM -> jdbc:mysql:
		// localhost는 mysql 설치위치
		// 어떤 Database 사용하는 건지 -> /examplesdb
		String url = "jdbc:mysql://localhost:3306/classicmodels";
		String id = "test";
		String pw = "test1234";
		
		// 커넥션 객체 만들자
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager
					.getConnection(url,id,pw);
			
			String sql = "select \r\n"
					+ "	count(*) as cnt \r\n"
					+ "from orders\r\n"
					+ "where 1=1\r\n"
					+ "  and status = 'Shipped'\r\n"
					+ ";";
//			conn.prepareStatement(sql);
			PreparedStatement pstmt = conn
					.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				String cnt = rs.
						getString("cnt");
				System.out.println("갯수는 "+cnt);
			}
			
}
		catch (ClassNotFoundException | SQLException e) {
		      
		    } finally {
		    	
		      
	}

		
	}}


