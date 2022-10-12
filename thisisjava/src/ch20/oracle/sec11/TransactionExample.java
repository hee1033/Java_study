package ch20.oracle.sec11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TransactionExample {

	public static void main(String[] args) {
		
		Connection conn = null;
		
		try {
			
			//JDBC Driver 등록
			Class.forName("oracle.jdbc.OracleDriver");
			
			//DB 연결
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orcl","java","oracle");
			
			//트랜잭션 시작
			conn.setAutoCommit(false);
			
			//출금 작업
			String sql1 = "UPDATE accounts SET balance = balance-? WHERE ano=?";
			PreparedStatement pstmt1 = conn.prepareStatement(sql1);
			pstmt1.setInt(1, 10000);
			pstmt1.setString(2, "111-111-1111");
			int rows1 = pstmt1.executeUpdate();
			if(rows1 == 0) throw new Exception("출금되지 않았습니다.");
			pstmt1.close();
			
			//입금 작업
			String sql2 = "UPDATE accounts SET balance = balance+? WHERE anp=?";
			PreparedStatement pstmt2 = conn.prepareStatement(sql2);
			pstmt2.setInt(1, 10000);
			pstmt2.setString(2, "222-222-2222");
			int rows2 = pstmt2.executeUpdate();
			if(rows2 == 0) throw new Exception("입금되지 않았습니다.");
			pstmt2.close();
			
			//수동 커밋 -> 모두 성공 처리
			conn.commit();
			System.out.println("계좌 이체 성공");
		}catch(Exception e) {
			try {
				conn.rollback();
			}catch(SQLException e1) {
				System.out.println("계좌 이체 실패");
				e.printStackTrace();
			}
		}finally {
			try {
				conn.setAutoCommit(true);
				conn.close();
			}catch(SQLException e) {
				
			}
		}
		
	}

}
