package ex02_연산자;

import java.util.Scanner;

public class Ex03_시분초_구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 3723 > 1시 2분 3초
		
		Scanner sc = new Scanner(System.in);
		System.out.print("초 입력: ");
		int totalSecond = sc.nextInt();
		
		int hr = totalSecond / 3600;
		//System.out.println(num1);
		
		int min = (totalSecond - hr*3600) / 60;    // totalSecond % 3600 / 60
		//System.out.println(num2);

		int sec = (totalSecond - hr*3600) % 60;    // totalSecon % 3600 % 60
		//System.out.println(num3);
		
		System.out.println(hr + "시 " + min + "분 " + sec + "초" );
	}

}
