package java_mysql;

import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class 문제2 {
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
					+ "	t2.orderNumber as order_number, max(t2.orderLineNumber) as order_max\r\n"
					+ "from orders t1, orderdetails t2\r\n"
					+ "where 1=1\r\n"
					+ "  and t1.status = 'Shipped'\r\n"
					+ "  and t1.orderNumber = t2.orderNumber\r\n"
					+ "group by t1.orderNumber # orderNumber를 기준으로 통계값을 뽑자!!\r\n"
					+ "limit 5\r\n"
					+ ";";
//			conn.prepareStatement(sql);
			PreparedStatement pstmt = conn
					.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			
			List<Integer> orderNumberList = new ArrayList<>();
			List<Integer> orderMaxList = new ArrayList<>();
			
            while (rs.next()) {
                int orderNumber = rs.getInt("order_number");
                int orderMax = rs.getInt("order_max");
                
                orderNumberList.add(orderNumber);
                orderMaxList.add(orderMax);
            }
            List<Integer> combinedList = Stream.concat(orderNumberList.stream(), orderMaxList.stream())
                    .collect(Collectors.toList());
            Integer[] combinedArray = combinedList.toArray(new Integer[0]);
            System.out.println(Arrays.toString(combinedArray));
			
}
		catch (ClassNotFoundException | SQLException e) {
		      
		    } finally {
		    	
		      
	}

		
	}}


