package ex03_for;

import java.util.Scanner;

public class Ex08_약수구하기 {

	public static void main(String[] args) {
		// 입력 받은 정수의 약수를 구하세요
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		System.out.print(num + "의 약수 : ");
		
		for (int n = 1; n <= num; n++) {
			if (num % n == 0) {
				System.out.print(n + " ");
			}
		}
		sc.close();
	

	}

}
