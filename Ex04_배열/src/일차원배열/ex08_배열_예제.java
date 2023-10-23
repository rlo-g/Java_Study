package 일차원배열;

import java.util.Scanner;

public class ex08_배열_예제 {

	public static void main(String[] args) {
		// 정답이 정해져 있는 문제에 대해
		// 사용자로부터 답을 입력 받아 정답 판별하기
		// 결과, 총점 출력
		
		// 배점은 각 20점, 답 - 1, 4, 3, 2, 1
		
		Scanner sc = new Scanner(System.in);
		int[] answer = { 1, 4, 3, 2, 1};       // 정답
		int[] input = new int[5];              // 사용자가 입력한 답을 관리하는 배열
		int sum = 0;                           // 총점
		
		System.out.println("==채첨하기==");
		System.out.println("답을 입력하세요");
		
		for (int i = 0; i < answer.length; i++) {
			System.out.print(i+1 + "번 답 >> ");
			input[i] = sc.nextInt();
		}
		System.out.println("==정답확인==");
		
		for(int i = 0; i < answer.length; i++) {
			if(answer[i] == input[i]) {
				System.out.print("O ");
				sum += 20;
			}else {
				System.out.print("X ");
			}
		}
		System.out.print(" 총점 : " + sum);
		
	
		sc.close();
		

	}

}
