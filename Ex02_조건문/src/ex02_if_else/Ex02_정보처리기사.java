package ex02_if_else;

import java.util.Scanner;

public class Ex02_정보처리기사 {

	public static void main(String[] args) {
		// 한 과목 당 8개 이상 정답, 총 정답 개수 60개 이상일 시 합격
		
		Scanner sc = new Scanner(System.in);
		System.out.print("DB : ");
		int db = sc.nextInt();
		
		System.out.print("전자계산기 구조 : ");
		int cal = sc.nextInt();
		
		System.out.print("OS : ");
		int os = sc.nextInt();

		System.out.print("데이터통신 : ");
		int data = sc.nextInt();
		
		System.out.print("소프트웨어공학 : ");
		int sw = sc.nextInt();
		
		boolean isCheck1 = (db + cal + os + data + sw) >= 60;
		boolean isCheck2 = db >= 8 && cal >= 8 && os >=8 && data >= 8 && sw>= 8;
		
		
		if (isCheck1 && isCheck2) {
			System.out.println("합격입니다!");
		}else {
			System.out.println("불합격입니다...");
		}
		
		sc.close();
		
//		if (db < 8 || cal < 8 || os < 8 || data < 8 || sw < 8) {
//			System.out.println("불합격입니다!");
//		}else {
//			if (all >= 60) {
//				System.out.println("합격입니다!");
//			}else {
//				System.out.println("불합격입니다!");
//			}
//			
//		}

	}

}
