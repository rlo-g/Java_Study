package ex01_while;

import java.util.Scanner;

public class Ex03_다이어트 {

	public static void main(String[] args) {
		// 다이어트 관리 프로그램
		// 현재 몸무게, 목표 몸무게 입력받고 주차 별 감량 몸무게 입력받기
		// 목표 몸무게 달성 시 축하 문구 출력하고 입력 종료
		
		Scanner sc = new Scanner(System.in);
		System.out.print("현재 몸무게: ");
		int weight = sc.nextInt();
		
		System.out.print("목표 몸무게: ");
		int goal_w = sc.nextInt();
		
		int week = 1; 
		
		while (weight >= goal_w) {
			System.out.print(week + "주차 감량 몸무게 : ");
			int minus_w = sc.nextInt();
			weight = weight - minus_w;
			week++;
		}
		System.out.println(weight + "kg 달성!! 축하합니다!");
		sc.close();
		
	}


}
