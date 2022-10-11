package ch20.oracle.sec06;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserInsertExample {

	public static void main(String[] args) {

		Connection conn = null;

		try {
			// JDBC Driver 등록
			Class.forName("oracle.jdbc.OracleDriver");

			// 연결하기
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orcl", "java", "oracle");

			// 매개변수화된 SQL 문 작성
			String sql = "INSERT INTO users(userid, username,userpassword,userage,useremail)"+ "VALUES(?,?,?,?,?)";

			// PreparedStatement 얻기 밑 값 지정
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "Spring1");
			pstmt.setString(2, "봄1");
			pstmt.setString(3, "123451");
			pstmt.setInt(4, 29);
			pstmt.setString(5,"spring1@mycompany.com");

			// SQL 문 실행
			int rows = pstmt.executeUpdate();
			System.out.println("저장된 행 수 : " + rows);

			// PreparedStatement 닫기
			pstmt.close();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (conn != null) {
				// 연결 끊기
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

	}

}