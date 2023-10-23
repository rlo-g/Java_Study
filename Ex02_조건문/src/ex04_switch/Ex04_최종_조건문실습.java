package ex04_switch;

import java.util.Scanner;

public class Ex04_최종_조건문실습 {

	public static void main(String[] args) {
		// 자판기 프로그램
		// 금액을 입력하고 메뉴를 고른 뒤 잔돈 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.println("금액을 입력하세요.");
		int money = sc.nextInt();
		
		System.out.println("메뉴를 고르세요.");
		System.out.print("1. 콜라(800원) 2. 생수(500원) 3. 비타민워터(1500원) >> ");
		int menu = sc.nextInt();
		
		
				
		switch (menu) {
		case 1:
			if (money - 800 < 0) {
				System.out.println("돈이 부족합니다");
				System.out.println("잔돈 : " + money);
			}else {
				int outputMoney = money - 800;
				int c = outputMoney / 1000;
				int o = outputMoney % 1000 / 500;
				int b = outputMoney % 1000 % 500 / 100;
				System.out.println("잔돈 : " + outputMoney + "원");
				System.out.println("천원: " + c + "개," + " 오백원: " + o + "개, " + " 백원: " + b + "개");
			}
			break;
		case 2:
			if (money - 500 < 0) {
				System.out.println("돈이 부족합니다");
				System.out.println("잔돈 : " + money);
			}else {
				System.out.println("잔돈 : " + (money - 500) + "원");
			}
			break;
		case 3:
			if (money - 1500 < 0) {
			    System.out.println("돈이 부족합니다");
				System.out.println("잔돈 : " + money);
			}else {
				System.out.println("잔돈 : " + (money - 1500) + "원");
			}
			break;
		default:
			System.out.println("다시 골라주세요");
			
		}
		sc.close();
		
		

	}

}
