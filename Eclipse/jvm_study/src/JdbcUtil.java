import java.sql.*;

public class JdbcUtil {
	private static String url = "jdbc:mysql://localhost:3306/examplesdb";
	private static String id = "urstory";
	private static String pw = "u1234"; 
	
	
	private static Connection conn;
	private static JdbcUtil instance = new JdbcUtil();
	
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			// connection 생성 
			conn = DriverManager
					.getConnection(url, id, pw);
			System.out.println("MySQL에 접속 성공!!");
			
		} catch(Exception e) {
			System.out.println("MySQL 접속 오류");
			System.out.println();
		}
	}
	
	public static JdbcUtil getInstance() {
		return instance;
	}
	
	public Connection getConnection() {
		return conn;
	}
	

}
