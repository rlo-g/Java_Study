package JDBC기초;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ex01_select {

	public static void main(String[] args) {
		
		
		Connection conn = null;  // finally에서 사용하기 위해 전역변수로 선언
		PreparedStatement psmt = null;
		ResultSet rs = null;
		
		// 1. 데이터베이스 동적로딩
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// DB가 존재하는 url, 아이디, 비밀번호
			String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "shopping";
			String db_pw = "12345";
			
			// 연결 권한 가져오기
			conn = DriverManager.getConnection(db_url,db_id,db_pw);
			
			
			// SELECT
			String sql = "SELECT * FROM MEMBER";
			psmt = conn.prepareStatement(sql);
			
			
			// ResultSet : sql문의 select문 실행 시 가져오는 테이블 데이터를 테이블 형태로 담을 수 있는 객체
			rs = psmt.executeQuery();
			
			// rs.next() : 커서를 한칸식 이동시키면서 데이터가 있는지 없는지에 대한 결과값을 t/f로 받아오는 메서드
			while(rs.next()) {
				// 반복횟수 알 수 없으므로 while
				// re.next() ture : 데이터 존재일 때까지 반복
				
				String id = rs.getString(1); // String 자료형인 1번 컬럼을 가져온다
				String pw = rs.getString(2);
				String nick = rs.getString(3);
				System.out.println(id + "\t" + pw + "\t" + nick);
				
			}
				
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}finally {
			// 역순으로 자원 반납
			// ResultSet > preparedStatement > connection
			try {
				if(rs != null) {
					rs.close();	
				}
				if(psmt != null) {
					psmt.close();
				}
				if(conn != null) {
					conn.close();
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
