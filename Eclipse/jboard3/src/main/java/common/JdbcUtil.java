package common;

import java.sql.*;
import java.util.*;

public class JdbcUtil {
    private static String url = "jdbc:mysql://localhost:3306/examplesdb"; 
    private static String id = "urstory"; 
    private static String pw = "u1234"; 
    private static JdbcUtil instance = new JdbcUtil();
    
    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(url, id, pw);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public static JdbcUtil getInstance() {
		return instance;
	}
    
    public List<Map> selectBySql(String sql) {
    	List<Map> lst = new ArrayList<>();

        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) { 
        	         	
             ResultSetMetaData rsmd = rs.getMetaData();
             int columnCount = rsmd.getColumnCount();
             
             while (rs.next()) {
            	 Map<String, Object> map = new HashMap<>();
 				
 				for(int i=1;i<=columnCount;i++) {
 					String colNm = rsmd.getColumnName(i);
 					map.put(colNm
 							, rs.getObject(colNm));
 				}
 				lst.add(map);
             }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return lst;
    }
	
	public int insertOrUpdate(String sql) {
	    int result = -1;

	    try (Connection conn = getConnection();
	         PreparedStatement pstmt = conn.prepareStatement(sql)) { 
	        result = pstmt.executeUpdate();
	        
	    } catch (Exception e) {
	        e.printStackTrace();
	    }

	    return result;
	}
}