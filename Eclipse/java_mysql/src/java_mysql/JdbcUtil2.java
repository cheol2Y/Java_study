//package java_mysql;
//
//import java.sql.*;
//
//public class JdbcUtil2 {
//    private static String url = "jdbc:mysql://localhost:3306/classicmodels";
//    private static String id = "test";
//    private static String pw = "test1234";
//    
//    private static Connection conn;
//    
//    static {
//    	try {
//    		Class.forName("com.mysql.jdbc.Driver");
//    		System.out.println("드라이버 로딩 성공 ");
//    		conn = DriverManager.getConnection(url, id, pw);
//    		System.out.println("Connection Pool 생성 ");
//    		
//    		
//		} catch(ClassNotFoundException e) {
//			e.printStackTrace();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//    }
//	private JdbcUtil2() {}
//	
//	public static JdbcUtil2 getInstance() {
//		JdbcUtil2 instance;
//		return instance;
//	}
//	
//	public Connection getConnection() throws SQLException {
//		return conn; //Pool에서 커넥션 반환 
//	}
//
//	
//}
//
