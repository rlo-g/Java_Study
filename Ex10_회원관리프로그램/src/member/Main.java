package member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		// DAO 클래스 안에 있는 메소드를 사용하기 위해 객체 생성
		MemberDAO dao = new MemberDAO();
		
		
		Scanner sc = new Scanner(System.in);
		// CRUD : 어떠한 프로그램이든 기본적으로 존재해야하는 기능들
		
		while(true) {
			
			System.out.print("[1]회원가입 [2]로그인 [3]회원목록 [4]회원정보수정 [5]회원탈퇴 [6]종료 >> ");
			int menu = sc.nextInt();
			
			
			if(menu == 1) {
				// 회원가입
				
				System.out.println("======== 회원가입 ========");
				// 아이디, 패스워드, 닉네임
				System.out.print("아이디 입력 : ");
				String id = sc.next();
//				sc.nextLine(); // 띄어쓰기가 가능함!! 
				
				System.out.print("패스워드 입력 : ");
				String pw = sc.next();
				
				System.out.print("닉네임 입력 : ");
				String nick = sc.next();
				System.out.println();
				
				
				// JDBC를 MemberDAO 클래스에 옮김
			
				
				// MemberDAO 클래스에 옮겨놓은 DB에 입력받은 값을 보내서 결과값을 받아온다
				int cnt = dao.join(id, pw, nick);
				
				if(cnt > 0) {
					// cnt = 1일 경우, 실행이 되는 것이므로 update 성공
					System.out.println("회원가입 성공!");
					System.out.println();
				}else {
					System.out.println("회원가입 실패....");
					System.out.println();
				}
			
				
			}else if(menu == 2) {
				// 로그인
				
				// 사용자한테 아이디, 비밀번호를 입력받아서
				// 테이블에 해당 데이터가 있는지 확인 후
				// 있으면 닉네임을 가져와서
				// "()님 로그인 성공하셨습니다!"
				
				
				// 사용자에게 아이디, 비밀번호 입력받기
				System.out.print("아이디 : ");
				String id = sc.next();
				System.out.print("비밀번호 : ");
				String pw = sc.next();
				System.out.println();
				
				
				// int, String 등 다양한 자료형을 담을 수 있는 사용자 생성 데이터 타입을 만들어야 한다. (MemberVO)
				MemberVO info = dao.login(id, pw);
				
				
				// 로그인 성공, 실패 판단
				if(info != null) {
					// 로그인 성공 시, info 안에 데이터를 담겨서 null이 아님
					System.out.println(info.getNick() + "님 환영합니다!");
					// info에 있는 private 되어있는 nick을 불러옴
				}else {
					System.out.println("로그인 실패....");
				}
				
				
				
				
			}else if(menu == 3) {
				// 전체 회원의 정보가 보여지게 만들기
				// 아이디   비밀번호   닉네임 
				// ---------------------
				//  a      a        a
				//  b      b        b
				
				// DAO에 있는 기능을 가져가다 사용
				dao.select();
				
				

				
				
						
				
				
			}else if(menu == 4) {
				// 회원정보 수정
				// 사용자로부터 아이디를 입력받아 비밀번호 변경하기
				
				// Query
				// UPDATE 테이블명 SET 컬럼명 조건문
				// 조건문 : 사용자가 입력한 아이디에 해당하는 비밀번호를 변경
				
				
				 // 사용자로부터 아이디를 입력받아서 비밀번호를 바꾸자!
	            // Query
	            // Update 테이블명 set 컬럼명 조건문
	            // 조건문 : 사용자가 입력한 아이디에 해당하는 비밀번호를 변경
				System.out.print("비밀번호를 변경할 아이디 입력 : ");
				String id = sc.next();

	            System.out.print("변경할 비밀번호 입력 >> ");
	            String pw = sc.next();
	            
	            
	            // DB를 불러온 MemberDAO에 id와 pw 값을 보내서 결과값 받아오기
	            int cnt = dao.update(id, pw);
	            
	            
	            if(cnt > 0) {
	                // update가 성공
	                System.out.println("비밀번호 변경 성공");
	             }else {
	                // update가 실패
	                System.out.println("비밀번호 변경 실패");
	             }
	            


				
				
			}else if(menu == 5) {
				// 회원탈퇴
				
				// 사용자한테 아이디랑 비밀번호를 입력받아서
				// 해당 정보가 있느면 테이블에서 정보가 사라지게 만들자
				System.out.print("회원 탈퇴 아이디 입력 : ");
				String id = sc.next();
				System.out.print("회원 탈퇴 비밀번호 입력 : ");
				String pw = sc.next();
				
				
				int cnt = dao.delete(id, pw);
				
				
				// 영향을 받은 행이 있는지 없는지에 대한 결과값을 받아온다.
				// 성공 시 "회원탈퇴 완료!"
				if(cnt > 0) {
					// update가 성공
					System.out.println("회원탈퇴 완료");
				}else {
					// update가 실패
					System.out.println("회원탈퇴 실패");
				}
				
				
				
			}else if(menu == 6) {
				// 종료
				System.out.println("프로그램을 종료합니다.");
				break;
				
			}else {
				// 목록에 없는 숫자 입력
				System.out.println("정확한 숫자를 입력해주세요.");
			}
			
	
		
		
		}
		
		

	}

}
