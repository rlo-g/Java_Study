package 도서관리프로그램;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("[1]도서등록 [2]도서조회 [3]도서검색 [4]종료  >>  ");
			int select = sc.nextInt();
			
			
			if(select == 1) {
				// 도서등록
				System.out.println("============ 도서 등록 ============");
				
				System.out.print("책 제목 : ");
				String title = sc.next();
				
				System.out.print("책 저자 : ");
				String name = sc.next();
				
				System.out.print("책 가격 : ");
				int price = sc.nextInt();
				
				System.out.print("책 번호 : ");
				String num = sc.next();
				System.out.println("================================");
				
				
				// 4가지 데이터를 입력받아서 하나의 자료형으로 묶어주자 >> VO
				BookVO vo = new BookVO(title, name, price, num);
				
				// Controller에 있는 insert에 사용자가 입력한 vo를 보내준다
				Controller con = new Controller();

				// 사용자가 입력한 vo를 controller에서 판단해서 다시 main으로 보내준다
				con.insert(vo);
				
				System.out.println();
				
				
			}else if(select == 2) {
				// 도서조회
				
				System.out.println("============ 도서 조회 ============");
				System.out.println("도서명" + "\t" + "저자" + "\t" + "가격" + "\t" + "책번호");
				System.out.println("================================");
				

				Controller con = new Controller();
				con.select();
				
				System.out.println();
				
				
				
			}else if(select == 3) {
				// 도서검색
				
				System.out.print("검색하고 싶은 책 이름을 적어주세요 >> ");
				String title = sc.next();
				
				System.out.println("============ 도서 검색 ============");
				System.out.println("도서명" + "\t" + "저자" + "\t" + "가격" + "\t" + "책번호");
				System.out.println("================================");
				
				
				
				// title도 보호화 시켰으므로
				// VO에서 title만 초기화 시킬 수 있는 생성자를 만들어 줬음(오버로딩)
				// vo 객체 생성, 매개변수로 사용자가 입력한 title 값을 받아서 vo에 저장..
				BookVO vo = new BookVO(title);
				
				// Controller 객체 생성
				Controller con = new Controller();
				// Controller의 selectOne에 입력받은 vo를 보낸다.
				con.selectOne(vo);
				
				System.out.println();
				
				
				
			}else if(select == 4) {
				// 종료
				System.out.println("프로그램을 종료합니다.");
				break;
				
				
			}else {
				System.out.println("다시 입력해주세요");
			}
			
		}

	}

}
