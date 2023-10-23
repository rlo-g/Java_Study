package ex04_switch;

import java.util.Scanner;

public class Ex03_계절판별 {

	public static void main(String[] args) {
		// 12~2 겨울. 3~5 봄. 6~8 여름. 9~11 가을
		
		Scanner sc = new Scanner(System.in);
		System.out.print("월 입력 : ");
		int month = sc.nextInt();
		
		switch (month) {
		case 12, 1,2:
			System.out.println(month + "월은 겨울입니다!");
			break;
		case 3, 4, 5:
			System.out.println(month + "월은 봄입니다!");
			break;
		case 6, 7, 8:
			System.out.println(month + "월은 여름입니다!");
			break;
		case 9, 10, 11:
			System.out.println(month + "월은 가을입니다!");
		break;
		default:
			System.out.println("다시 입력해주세요");
			
		}
		sc.close();
		
	}

}
