package java_mysql;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class 문제1 {

    public static void main(String[] args) {
        // JDBC 연결 정보
        String url = "jdbc:mysql://localhost:3306/classicmodels";
        String username = "test";
        String password = "test1234";

        // JDBC 객체
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            // JDBC 드라이버 로드
            Class.forName("com.mysql.jdbc.Driver");

            // 데이터베이스 연결
            connection = DriverManager.getConnection(url, username, password);

            // SQL 쿼리 작성
            String sql = "SELECT COUNT(*) AS cnt FROM orders WHERE status = 'Shipped'";

            // PreparedStatement 객체 생성
            preparedStatement = connection.prepareStatement(sql);

            // 쿼리 실행 및 결과 가져오기
            resultSet = preparedStatement.executeQuery();

            // 결과 처리
            if (resultSet.next()) {
                int count = resultSet.getInt("cnt");
                System.out.println("Count: " + count);
            }

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            // 자원 해제
            try {
                if (resultSet != null) resultSet.close();
                if (preparedStatement != null) preparedStatement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
