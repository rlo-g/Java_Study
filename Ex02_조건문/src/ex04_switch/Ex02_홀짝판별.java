package ex04_switch;

import java.util.Scanner;

public class Ex02_홀짝판별 {

	public static void main(String[] args) {
		// 정수를 입력받아 홀짝 판별
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
								
		switch (num % 2) {
		
		case 0 :
			System.out.println("짝수입니다!");
			break;
		case 1 :          // 모두 0 아니면 1이므로 default로 써도 됨
			System.out.println("홀수입니다!");
			break;       // 아래 더 이상 코드가 없으므로 안 써도 됨 
		}
		sc.close();

	}

}
