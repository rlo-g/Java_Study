package ex02_do_while;

import java.util.Scanner;

public class Ex03_로그인_프로그램 {

	public static void main(String[] args) {
		// 로그인 프로그램
		// 아이디와 패스워드를 입력받아 일치하면 프로그램 종료
		// 잂치하지 않으면 일치할 때까지 아이디와 패스워드를 입력받는다
		
		Scanner sc = new Scanner(System.in);
		String id = "hamm";
		String pw = "1234";    // JDBC를 아직 안 배웠으므로 변수에 저장해두기

		
		do {
			System.out.print("ID : ");
			String inputId = sc.next();     // 문자열 입력받음
			
			System.out.print("PW : ");
			String inputPw = sc.next();
			
			if(inputId.equals(id) && inputPw.equals(pw)) {        
				// 문자열 비교: 비교할 문자.equals(비교하고 싶은 문자)
				System.out.println("로그인 성공!");
				break;
			}else {
				System.out.println("아이디와 비밀번호가 잘못되었습니다.");
			}
			
		}while(true);
		sc.close();

	}

}
