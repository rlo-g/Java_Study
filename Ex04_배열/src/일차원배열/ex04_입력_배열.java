package 일차원배열;

import java.util.Scanner;

public class ex04_입력_배열 {

	public static void main(String[] args) {
		
		// 사용자가 입력한 값으로 배열 초기화
		// 1번 숫자 ~ 6번 숫자
		
		// 1. 입력 도구 가져오기
		Scanner sc = new Scanner(System.in);
		
		int[] number = new int[6];  // 공간만 만들어놓고 사용자가 입력한 값 받기
		
		
		for (int i = 0; i < number.length; i++) {
			System.out.print(i+1 + "번 숫자 : ");    // 인덱스는 0부터 시작하므로 1번부터 시작하려면 i+1
			number[i] = sc.nextInt();
			
		}
		
		// 입력한 값이 배열에 잘 들엉갔는지 전체 데이터 출력
		for(int i = 0; i <number.length; i++) {
			System.out.print(number[i] + " ");
		}
		sc.close();
		
		

	}

}
