package ch20.oracle.sec08;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BoardDeleteExample {

	public static void main(String[] args) {
		
		Connection conn = null;
		
		try {
			//JDBC Driver 등록
			Class.forName("oracle.jdbc.OracleDriver");
			
			//연결하기
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orcl","java","oracle");
			
			//매개변수화된 SQL 문 작성
			String sql = "DELETE FROM boards WHERE bwriter = ?";
			
			//PreparedStatement 얻기 및 값 지정
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "winter");
			
			int rows =pstmt.executeUpdate();
			System.out.println("삭제된 행의 수 : "+rows);
			
			pstmt.close();
			
		}catch(Exception e) {
			
		}finally {
			if(conn != null) {
				try {					
					conn.close();
				}catch(SQLException e) {}
			}
		}
		
		
	}

}
