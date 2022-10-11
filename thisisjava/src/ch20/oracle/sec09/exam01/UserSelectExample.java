package ch20.oracle.sec09.exam01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserSelectExample {

	public static void main(String[] args) {

		Connection conn = null;

		try {
			// JDBC Driver 등록
			Class.forName("oracle.jdbc.OracleDriver");

			// 연결하기
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orcl", "java", "oracle");

			// 매개변수화된 SQL 문 작성
			String sql = "SELECT userid, username, userpassword, userage, useremail " + "FROM users " + "WHERE username = ?";

			// PreparedStatement 얻기 및 값 지정
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,"김단풍");
//			pstmt.setString(1,"fall");
//			pstmt.setString(1,"Spring");
//			pstmt.setString(1,"summer");
			
			//SQL 문 실행 후, ResultSet을 통해 데이터 읽기
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				User user = new User();
				user.setUserId(rs.getString(1));
				user.setUserName(rs.getString(2));
				user.setUserPassword(rs.getString(3));
				user.setUserAge(rs.getInt(4));
				user.setUserEmail(rs.getString(5));
				System.out.println(user);
			}
			rs.close();
			
			pstmt.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
				}
			}
		}

	}

}
