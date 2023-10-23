package ex02_연산자;

import java.util.Scanner;

public class Ex02_산술연산자_실습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 세자리 숫자를 입력받아 십의 자리 이하 값을 다 버리기 ( 534 > 500 )
		
		Scanner sc = new Scanner(System.in);     // ctrl+shift+o
		System.out.print("정수 입력 >> ");
		int num = sc.nextInt();
		
		// 1. 몫을 활용하기 
		int result1 = num / 100 * 100;
		
		
		System.out.println("결과 확인 >> " + result1);
		
		// 2. 나머지
		int result2 = num - num % 100 ;
		
		// 3. 변칙
		String result3 = num / 100 + "00";
		
		
		sc.close();
		
		

	}

}
