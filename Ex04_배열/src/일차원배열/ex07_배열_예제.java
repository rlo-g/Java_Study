package 일차원배열;

import java.util.Scanner;

public class ex07_배열_예제 {

	public static void main(String[] args) {
		// 배열을 통해 별읙 개수를 입력 받아서 별 출력하기
		
		Scanner sc = new Scanner(System.in);
		
		int[] star = new int[5];
		
		
		for(int i = 0; i < 5; i++) {
			System.out.print(i+1 + "번쩨 별의 개수 입력 >> ");
			star[i] = sc.nextInt();
		}
		for(int i = 0; i < 5; i++) {
			System.out.print(star[i] + " : ");
			for(int k = 0; k < star[i] ; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();

	
	}

}
