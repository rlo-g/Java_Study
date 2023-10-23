package ex04_switch;

import java.util.Scanner;

public class Ex01_switch {

	public static void main(String[] args) {
		// switch를 활용한 메뉴 선택
		// 1. 햄버거 2. 자장면 3. 제육볶음 4. 초밥
		
		Scanner sc = new Scanner(System.in);
		System.out.println("======점심메뉴 추천======");
		System.out.print("1.햄버거 2.짜장면 3.제육볶음 4.초밥 >> ");
		int menu = sc.nextInt();
		
		switch (menu) {
		case 1:          // 1번 선택했을 경우
			System.out.println("동명동 본투비버거를 추천해드릴게요!");
			break;    // 그 다음 case로 이동하지 않고 switch문 종료
		case 2:
			System.out.println("동명동 열도지 간짜장을 추천합니다!");
			break;
		case 3:
			System.out.println("수라간 제육볶음을 추천드립니다~");
			break;
		case 4:
			System.out.println("알아서 찾아가세요~^^");
			break;
		default:    // 해당되지 않는 것이 오면 실행
			System.out.println("정확한 숫자를 입력해주세요!!!");
			break; // 굳이 안 써도 됨!
		}
		sc.close();
	
	}

}
