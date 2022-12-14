package ch20.oracle.sec06;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BoardWithFIleInsertExample {

	public static void main(String[] args) {
		
		Connection conn = null;
		
		try {
			// JDBC Driver 등록
			Class.forName("oracle.jdbc.OracleDriver");

			// 연결하기
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orcl", "java", "oracle");

			// 매개변수화된 SQL 문 작성
			String sql = "INSERT INTO boards(bno,btitle,bcontent,bwriter,bdate,bfilename,bfiledata)"+ "VALUES(SEQ_BNO.NEXTVAL,?,?,?,SYSDATE,?,?)";

			// PreparedStatement 얻기 밑 값 지정
			PreparedStatement pstmt = conn.prepareStatement(sql,new String[] {"bno","btitle"});
			pstmt.setString(1, "winter");
			pstmt.setString(2, "눈");
			pstmt.setString(3, "함박눈이 내려요");
			pstmt.setString(4,"image.jpg");
			pstmt.setBlob(5,new FileInputStream("src\\ch20\\oracle\\sec06\\image.jpg"));
			
			// SQL 문 실행
			int rows = pstmt.executeUpdate();
			System.out.println("저장된 행 수 : " + rows);
			
			//bno,btitle 값 얻기
			if(rows == 1) {
				ResultSet rs = pstmt.getGeneratedKeys();
				if(rs.next()) {
					int bno = rs.getInt(1);
					String btitle = rs.getString(2);
					System.out.println("저장된 bno : "+bno);
					System.out.println("저장된 btitle : "+btitle);
				}
				rs.close();
			}

			// PreparedStatement 닫기
			pstmt.close();

		} catch (Exception e) {
			e.printStackTrace();
		} 

	}

}
