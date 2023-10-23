package ex02_연산자;

import java.util.Scanner;

public class Ex10_삼항연산자_농구공분리 {

	public static void main(String[] args) {
		// 한개의 상자에는 농구공이 다섯개씩 들어갈 수 있다.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("농구공의 개수를 입력하세요 : ");
		int num = sc.nextInt();
		
		int temp = num / 5;
		
		int result = num / 5 == 0 ? temp : temp + 1;
		System.out.println("필요한 상자의 수 : " + result);
		
		sc.close();

	}

}
