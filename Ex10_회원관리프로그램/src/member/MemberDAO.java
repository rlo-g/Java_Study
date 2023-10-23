package member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MemberDAO {
	// 데이터베이스에 연결하고 사용하는 것을 담당하는 클래스
	// DAO 클래스가 모든 JDBC 기능을 수행한다
	
	
	// [1]회원가입
	public int join(String id, String pw, String nick) {
		// main에서 int cnt로 받으므로 리턴타입은 int
		
		
		// try 밖에서 선언 ( finally에서 사용하기 위해)
		int cnt = 0;
		Connection conn = null;   
		PreparedStatement psmt = null;   // 이름 선언만 해주고 값은 갖지 않도록..
		
		
		
		// < 0. 드라이버 파일을 프로젝트 안에 넣어주기 ****** >
		//   - build path > comfigure build path > classpath > add external jars > oraclexe -product/jdbc..
		
		/* < 1. 드라이버 설치 (동적 로딩) >
		 *  - 예외상황 발생 : 오타가 있거나 파일이 존재하지 않을 때 클래스를 못찾는다
		 *  - 해결법 : try-catch
		 *           try에 예외사항이 발생할만한 코드 작성
		 *           catch는 해당 예외사항이 발생 시 오류 감지 및 포착
		 */  
		
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");  // 오라클 폴더 안에 jdbc 폴더 안에 ...~
			
			/* 왜 동적로딩인가?
			  - 컴파일러는 아래쪽의 코드를 만나기 전까지 어떠한 DBMS 드라이버를 사용하는지 모르고
			    아래쪽의 코드를 만나는 순간 해당 드라이버를 찾아서 설치한다
			*/
			

			// < 2. 커넥션 열기 >
			//  - DB가 존재하는 url, 아이디, 비밀번호 필요
			
			String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "shopping";
			String db_pw = "12345";
			
			
			// < 2-1. 커넥션 연결 >
			// 연결 권한 요청
			// conn이 db에 대한 거의 모든 권한을 갖게됨
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
			
			if(conn != null) {
				// conn이 커넥션 연결에 성공할 경우(null 값이 아닐 경우)
				System.out.println("DB 연결 성공!");
				System.out.println();
			}else {
				System.out.println("DB 연결 실패...");
			}
			
			

			// < 3. SQL문 실행 >
			//  - SQL문을 실행하기 위한 조건 : sql 문장에 이상이 없는지 검토를 받아야한다
			 
			String sql = "INSERT INTO MEMBER VALUES(?,?,?)";  // 값이 바뀌므로 ?
			
			// conn에게 sql문에 이상이 없는지 물어봄
			// psmt 객체가 sql문을 완성하고 실행할 수 있는 객체이다
			psmt = conn.prepareStatement(sql);
		
			psmt.setString(1, id);    // 첫번째 ?값에 입력받은 id 값을 넣는다 >> 세번째 ?까지 채우면 sql문 완성!
			psmt.setString(2, pw);
			psmt.setString(3, nick);
			
			// excuteUpdate(); : sql 문장을 실행하는 메서드 (테이블 안에 변화가 하나라도 일어날 시 사용)
			// 실행한 문장의 결과를 int 형태로 반환
			cnt = psmt.executeUpdate();
			
			
		} catch (ClassNotFoundException e) {
			// Class.forName이 문제가 생길 시 넘어오는 곳 (예외사항)
			e.printStackTrace();
			
		} catch (SQLException e) {
			// conn에서 문제가 생길 시 넘어오는 곳(예외사항)
			e.printStackTrace();
		}finally {
			
			
			// 3번에서 오류가 나도 커넥션은 살아 있으므로(2번이므로)
			// 연결 끊는 코드는 실행이 되지 않는다! 따라서 catch문 아래에 무조건 거치는 키워드 필요...
			
			// "finally"
			// try가 잘 실행되거나 
			// 또는 중간에 catch로 넘어간다고 하더라도
			// 마지막에는 finally로 반드시 넘어오게 되어있다!!
			// 예외사항이 발생하더라도 꼭 한 번은 실행되는 코드들이 들어오는 곳
			
			
			// < 4. 연결 끊기 >
			//  - 연결을 끊을 때는 역순으로 끊어준다
			
			try {
				
				// 사용한 적이 있으면 conn, psmt를 닫는다
				if(psmt != null) {
					// psmt가 null일 때 닫으면 오류뜸
					// 역순으로 반납해야하므로 psmt 먼저!
					psmt.close();
				}
				if(conn != null) {
					conn.close();
				}
				
			} catch (SQLException e) {
				// 닫을 때도 예외사항 처리가 필요하다
				e.printStackTrace();
			}
			// psmt는 try문에서 만들어졌으므로 바깥에서 사용할 수 없음 >> try 밖에 만들어준다!
			
		}
		return cnt;
	}
	
	
	
	
	
	// [2]로그인
	public MemberVO login(String id, String pw) {
		// 데이터 타입 : MemberVO
		
		MemberVO info = null;
		
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
			String sql = "SELECT nick FROM MEMBER WHERE id = ? AND pw = ?";
			psmt = conn.prepareStatement(sql);
			
			psmt.setString(1, id);    // 첫번째 ?값에 입력받은 id 값을 넣는다 >> 세번째 ?까지 채우면 sql문 완성!
			psmt.setString(2, pw);

			
			// ResultSet : sql문의 select문 실행 시 가져오는 테이블 데이터를 테이블 형태로 담을 수 있는 객체
			rs = psmt.executeQuery();
			
			// rs.next() : ResultSet에서 커서를 한칸식 이동시키면서 데이터가 있는지 없는지에 대한 결과값을 t/f로 받아오는 메서드
			if(rs.next()) {
				// re.next() true : 데이터 존재
				// 로그인 성공
				
				String nick = rs.getString(1);  // select문을 가져올 때 1개의 컬럼만 가져왔으므로 nick은 첫번째 컬럼
				                                // 괄호 안에 "컬럼명"을 써도 가능
				
				info = new MemberVO(id, pw, nick);
				// 로그인 성공 시 null이었던 info에 객체 생성
				// 로그인 성공 시 info 안에 데이터를 담아서 돌려줌
				
				
			}
				
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}finally {
			// 역순으로 자원 반납
			// ResultSet > preparedStatement > connection
			try {
				if(rs != null) {
					// psmt가 선언, setString 된 부분에서 오류가 나면 
					// 밑에 있는 코드들이 실행이 되지 않으므로 rs에는 null이 담기게 된다 : null point exception
					// != null >> 오류가 나지 않았다
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
		
		return info; 
	}
	
	
	
	
	// [3]회원목록
	public void select() {
		// 전체 회원의 정보가 보여지게 만들기
		
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
			
			System.out.println("============ 회원 목록 ============");
			System.out.println("아이디" + "\t" + "비밀번호" + "\t" + "닉네임");
			System.out.println("================================");
			// rs.next() : ResultSet에서 커서를 한칸식 아래로 이동시키면서 데이터가 있는지 없는지에 대한 결과값을 t/f로 받아오는 메서드
			//             커서는 제일 처음에 컬럼 위치에 있음
			while(rs.next()) {
				// 반복횟수 알 수 없으므로 while
				// re.next() ture : 데이터 존재할 때 반복
				
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
	
	
	// [4]회원정보수정
	public int update(String id, String pw) {
		
        int cnt = 0;
        Connection conn = null;
        PreparedStatement psmt = null;
        
        
        // 1. 데이터베이스 연결
        try {
           // 동적 로딩
           Class.forName("oracle.jdbc.driver.OracleDriver");
           // 준비물 3개
           String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
           String db_id = "shopping";
           String db_pw = "12345";
           
           // 연결권한 확인
           conn = DriverManager.getConnection(db_url,db_id,db_pw);
           
           // SQL문을 준비
           String sql = "update member set pw = ? where id = ?";
           psmt = conn.prepareStatement(sql);
           
           // ? 인자를 채워주자
           psmt.setString(1, pw);
           psmt.setString(2, id);
           
           cnt = psmt.executeUpdate();
           // 영향을 받은 행이 있는지 없는지에 대한 결과값을 받아온다.
           
           
        } catch (ClassNotFoundException | SQLException e) {
           // OracleDriver라는 클래스가 없거나 ---> ojdbc.jar
           // 대소문자
           // id, pw
           System.out.println("데이터 베이스 연결 실패");
           e.printStackTrace();
        }finally {
           // finally : 예외상황이 발생하더라도
           // 꼭한번은 실행되는 코드들이 {}
           
           // 사용한적이 있으면 conn, psmt를 close하자
           
              try {
                 // 반드시 자원은 사용한 순서 역순으로 반납해야한다!
                 
                 if(psmt != null)
                    psmt.close();
                 
                 if(conn != null)
                    conn.close();
                 
              } catch (SQLException e) {
                 System.out.println("자원 반납 오류");
                 e.printStackTrace();
              }
        }
		return cnt;
	}
	
	
	
	// [5]회원탈퇴
	public int delete(String id, String pw) {
		int cnt = 0;
		Connection conn = null;
		PreparedStatement psmt = null;
		
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "shopping";
			String db_pw = "12345";
			// 연결권한 확인
			conn = DriverManager.getConnection(db_url,db_id,db_pw);
			
			// sql문 준비 (행 삭제)
			String sql = "DELETE FROM MEMBER WHERE id = ? AND pw = ?";
			
			psmt = conn.prepareStatement(sql); 
			
			// ? 인자를 채워주자
			psmt.setString(1, id);
			psmt.setString(2, pw);
			
			cnt = psmt.executeUpdate();  // 결과값 : 
			
			
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("데이터베이스 연결실패");
			e.printStackTrace();
			
		}finally {
			// 자원반납을 하기위해.
			// finally : 예외상황이 발생하더라도
			// 꼭한번은 실행되는 코드들이 {}
			
			// 사용한적이 있으면 conn, psmt를 close하자
			
			try {
				// 반드시 자원은 사용한 순서 역순으로 반납해야한다!
				
				if(psmt != null)
					psmt.close();
				
				if(conn != null)
					conn.close();
				
			} catch (SQLException e) {
				System.out.println("자원 반납 오류");
				e.printStackTrace();
			}
		}
		return cnt;
	}

	
	
	
}
