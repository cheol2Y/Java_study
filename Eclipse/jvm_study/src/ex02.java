import java.sql.*;

public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			
			JdbcUtil ju = JdbcUtil.getInstance();
			conn = ju.getConnection();
			
			String sql = "show tables;";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				String table_nm = rs
						.getString("Tables_in_classicmodels");
				System.out.println(table_nm);
			}
			
		} catch(Exception e) {
			System.out.println(e);
		} finally {
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
