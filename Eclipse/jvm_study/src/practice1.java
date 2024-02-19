import java.sql.*;

public class practice1 {
	public static void main(String[] args) {
		String sql = "show tables;";
		try(Connection conn = practice.getInstance().getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery()){}
			
			
		catch(SQLException e) {
	}

}
