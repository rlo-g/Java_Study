package 도서관리프로그램;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BookDAO {

	// [1] 데이터베이스에 접근해서 도서등록에 필요한 데이터들을 저장
	public int insert(BookVO vo) {
		// 매개변수로 BookVo 자료형의 vo를 받아준다
		// row가 int이기 때문에 int insert()
		// controller를 통해 받아온 main의 vo를 sql문에 실행해준다
		
		
		int row = 0;  // row를 전역변수로 빼줘야 try문 밖에서 return이 가능
		Connection conn = null;
		PreparedStatement psmt = null;
		
		
		// 1. 드라이버 동적로딩
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 통로로 진입할 수 있는지 권한을 받기 위한 준비물 : DB 주소, 아이디, 비밀번호
			String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "shopping";
			String db_pw = "12345";
			
			
			// 권한이 있는지 알기 위해 준비물들을 보내주는 역할
			// 권한이 있으면 접근에 대한 기능을 허용하고 계속 사용하게 해주는 객체
			
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
			
			
			// 2. SQL문 준비
			// 사용자로부터 받아온 vo를 저장해줌
			String sql = "INSERT INTO BOOK VALUES(?, ?, ?, ?)";
			//PSMT에 SQL문을 담아줌
			psmt = conn.prepareStatement(sql);
			
			// ? 인자 채워주기
			// main에서 입력하여 vo에 저장한 값을 불러와서 넣어준다 
			psmt.setString(1, vo.getTitle());
			psmt.setString(2, vo.getName());
			psmt.setInt(3, vo.getPrice());
			psmt.setString(4, vo.getNum());
			
			row = psmt.executeUpdate(); // 영향을 받은 행이 있는지에 대한 결과값을 받아옴
			// 컨트롤러를 통해 메인에 결과값을 보내주기 위해 row에 담는다
			// row를 main에 바로 보내는 것이 아니라 controller에 보내서 controller를 통해서 main에 보냄
			
			
			
			// 3. 결과값 처리
			// 4. 자원 반납
	
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("데이터베이스 연결 실패");
			e.printStackTrace();
		}finally {
			try {
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
		
		
		// 결과값을 리턴(DAO의 insert()를 호출하는 곣으로 보내줌)
		// 데이터베이스 저장 성공 여부 결과값 처리는 Controller에서 하도록 보내줌
		return row;
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	// [2] 도서 조회
	public ArrayList<BookVO> select() {
		// 리턴 타입 : ArrayList<BookVO>
		
		// 테이블에 있는 책 정보들을 저장하는 가변 배열
		ArrayList<BookVO> bookList = new ArrayList<>();
		
		
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		
		
		// 동적 연결
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// DB가 존재하는 url, 아이디, 비밀번호
			String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "shopping";
			String db_pw = "12345";
			
			// drivermanager에게 연결권한이 있으면 connection에 대한 기능을 주라고 요청
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
			
			
			// SQL문
			String sql = "SELECT * FROM BOOK";
			
			// 연결권한을 사용해서 SQL문을 담아줌
			psmt = conn.prepareStatement(sql);
			
			
			// executeQuery() 사용  ---> ResultSet
			// ResultSet : SQL문의 select 실행 시 가져오는 테이블 형태의 데이터를 그대로 담을 수 있는 객체
			// 결과값을 rs 형태로 받아옴 
			// >> 테이블 형태의 데이터를 받아주는 데이터베이스 객체
			rs = psmt.executeQuery();
			
			
			while(rs.next()) {
				// rs.next()를 통해서 커서를 아래로 움직이며 데이터 유무를 확인하고 존재(true)하면 데이터 가져오기
				// SQL문에서 받아온 결과값에서 데이터를 꺼내줌
				
				
				String title = rs.getString(1);  // 1번 컬럼을 가지고 온다
				String name = rs.getString(2);
				int price = rs.getInt(3);
				String num = rs.getString(4);
				
				// BookVo를 통해 하나의 정보로 묶어줌
				// BookVo 자료를 관리하기 위해 ArrayList 만듦 (사용자가 입력 시 계속 추가되기 때문에)
				BookVO vo = new BookVO(title, name, price, num);
				
				// 반복할 때 마다 가지고 온 네 개의 정보를 vo로 묶어서 bookList에 저장해줌
				bookList.add(vo);
				
				
			}

			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
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
		return bookList;  // ArrayList<BookVO> bookList를 리턴해줌 > 호출해주는 곳으로 결과값이 보내짐
	}
	
	
	
	
	// [3] 도서 검색
	public BookVO selectOne(BookVO vo) {
		// main에서 받은 vo를 매개변수로
		
		
		Connection conn = null;
		PreparedStatement psmt = null; 
		ResultSet rs = null;
		
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			
			// DB가 존재하는 url, 아이디, 비밀번호
			String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "shopping";
			String db_pw = "12345";
			
			// drivermanager에게 연결권한이 있으면 connection에 대한 기능을 주라고 요청
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
			
			
			// SQL문
			String sql = "SELECT * FROM book WHERE title = ?";
			
			psmt = conn.prepareStatement(sql);
			
			// 받아온 vo에서 title을 꺼내 ? 인자에 넣어준다
			psmt.setString(1, vo.getTitle());
			
			rs = psmt.executeQuery();
			
			while(rs.next()) {
				
				String title = rs.getString(1);  // 1번 컬럼을 가지고 온다
				String name = rs.getString(2);
				int price = rs.getInt(3);
				String num = rs.getString(4);
				
				// 가져온 데이터들을 BookVo를 통해 하나의 정보로 묶어줌 (각기 다른 자료형이 모여 한 책에 대한 정보를 이루므로)
				// vo에 담긴 내용을 controller로 보내줄 것임
				vo = new BookVO(title, name, price, num);
	
			}
					
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
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
		
		return vo;  // 하나의 정보로 묶어준 데이터들을 리턴
	}

}

   



