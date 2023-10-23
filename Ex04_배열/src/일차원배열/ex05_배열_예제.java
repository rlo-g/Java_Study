package 일차원배열;

import java.util.Scanner;

public class ex05_배열_예제 {

	public static void main(String[] args) {
		
		
		// 1. 입력하는 도구 가져오기
		// 2. 사용자가 입력한 다섯개의 점수들을 배열에 저장하기
		// 배열의 이름 : score
		// 3. 입력된 점수들을 모두 출력하기
		// 4. 최고점수, 최저 점수, 총합, 평균 출력
		
		Scanner sc = new Scanner(System.in);
		int[] score = new int[5];
		
//		int max = score[0];
//		int min = score[0];    ?? ?? 
		
		int sum = 0;
		
		for(int i = 0; i < score.length; i++) {
			System.out.print(i+1 + "번 점수 : ");
			score[i] = sc.nextInt();
			sum += score[i];
		}
		int max = score[0];
		int min = score[0];       // 사용자가 입력한 후에 max, min 초기화가 이루어져야한다.
		
		
		for(int i = 1; i < score.length; i++) {
			if(score[i] > max) {
				max = score[i];
			}
			if (score[i] < min) {
				min = score[i];
			}
				
		}

		System.out.println("최고점 : " + max);
		System.out.println("최저점 : " + min);
		System.out.println("총합 : " + sum);
		System.out.println("평균 : " + sum/(float)score.length);
		
		
		sc.close();
		
	}

}
