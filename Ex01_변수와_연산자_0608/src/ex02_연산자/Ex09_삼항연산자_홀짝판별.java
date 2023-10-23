package ex02_연산자;

import java.util.Scanner;

public class Ex09_삼항연산자_홀짝판별 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);     // 레퍼런스 자료형
		System.out.print("정수를 입력하세요 : ");      // 줄바꿈 x : println > print
		int num = sc.nextInt();
		
		int temp = num % 2;
		
		String result = temp == 0 ? num + "은(는) 짝수입니다" : num + "은(는) 홀수입니다";
		System.out.println(result);
		
		sc.close();

	}

}
