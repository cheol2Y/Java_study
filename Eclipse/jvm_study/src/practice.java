import java.sql.*;

public class practice {
	private static String url = "jdbc:mysql://localhost:3306/examplesdb";
	private static String id = "urstory";
	private static String pw = "u1234";
	
	private static Connection conn;
	private static practice instance = new practice();
	
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager
					.getConnection(url,id,pw);
			System.out.println("MySQL에 접속 성공!!");
		}
		catch (Exception e) {
			System.out.println("MySQL 오류");
			
			
		}
	}
		public static practice getInstance() {
			return instance;
		}
		public Connection getConnection() {
			return conn;
		}
		
		}


