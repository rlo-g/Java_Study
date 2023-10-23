package 일차원배열;

import java.util.Scanner;

public class ex06_배열_예제 {

	public static void main(String[] args) {
		
		// 수박 게임
		// 1차원 문자형 배열 선언 > '수', '박'으로 초기화
		// 숫자를 입력받아 숫자대로 문자 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("==== 수박 게임 Start! ====");
		
		String[] arr = {"수", "박"};
		
		System.out.print("숫자를 입력해주세요 >> ");
		int num = sc.nextInt();
		
		
		for(int i = 0; i < num; i++) {     // 글자 출력 num번 반복
			if(i % 2 != 0) {              
				System.out.println(i+1 + "번째 반복 : " + arr[1]);
			}else {
				System.out.println(i+1 + "번째 반복 : " + arr[0]);
			}
		}
		sc.close();
		
		

	}

}
