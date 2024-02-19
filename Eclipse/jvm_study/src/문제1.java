import java.sql.*;

public class 문제1 {
	
	public static void main(String[] args) {
        String sql = "SHOW TABLES;";
        try (Connection conn = JdbcUtil.getInstance().getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {

            while (rs.next()) {
                String tableName = rs.getString("Tables_in_classicmodels");
                System.out.println(tableName);
            }
        } catch (SQLException e) {
            System.out.println("데이터베이스 오류 발생");
            e.printStackTrace();
        }
    }
}
