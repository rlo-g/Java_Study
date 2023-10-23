package ex03_for;

import java.util.Scanner;

public class Ex03_배수출력 {

	public static void main(String[] args) {
		// 숫자를 입력받고, 그 숫자의 배수 10개를 나타내기
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		
		for (int i = 1; i <= 10; i++) {
			System.out.print(num*i + " ");
		}
		sc.close();
		

		

	}

}
