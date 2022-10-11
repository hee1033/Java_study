package ch20.oracle.sec07;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BoardUpdateExample {

	public static void main(String[] args) {
		Connection conn = null;

		try {
			// JDBC Driver 등록
			Class.forName("oracle.jdbc.OracleDriver");

			// 연결하기
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orcl", "java", "oracle");

			// 매개변수화된 SQL 문 작성
			String sql = new StringBuilder()
					.append("UPDATE boards SET ")
					.append("btitle=?, ")
					.append("bcontent=?, ")
					.append("bfilename=?, ")
					.append("bfiledata=? ")
					.append("WHERE bno=?")
					.toString();

			// PreparedStatement 얻기 밑 값 지정
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "자이언트");
			pstmt.setString(2, "펭수");
			pstmt.setString(3, "image.jpg");
			pstmt.setBlob(4, new FileInputStream("src\\ch20\\oracle\\sec07\\image.jpg"));
			pstmt.setInt(5, 4);

			// SQL 문 실행
			int rows = pstmt.executeUpdate();
			System.out.println("수정된 행 수 : " + rows);
		
			// PreparedStatement 닫기
			pstmt.close();

		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(conn != null) {
				try {
					conn.close();
				}catch(SQLException e) {
					
				}
			}
		}

	}

}
