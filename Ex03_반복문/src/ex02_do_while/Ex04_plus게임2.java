package ex02_do_while;

import java.util.Random;
import java.util.Scanner;

public class Ex04_plus게임2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//난수를 뽑는 방법
		Random rd = new Random();     // 스캐너처럼 유틸 저장하기
		
		System.out.println("====Plus Game====");
		
		
		// 틀렸을 때는 기존 문제를
		// 성공했을 때는 새로운 문제를 출력
		// 힌트. 계속 같은 문제를 출제, 성공할 때만 새로운 문제 뽑기
		
		// 첫게임을 시작할 때는 3개의 목숨이 주어진다
		// 문제의 답이 틀렸을 때는 목숨을 하나씩 차감하고 알려준다
		// 예 - 첫번째 문제 틀렸을 시 ) 남은 목숨 2개
		// 마지막으로 목숨이 0이 되는 순간 게임은 종료된다
		
		int num1 = rd.nextInt(10) + 1;
		// () 범위 안에서만 랜덤숫자를 뽑음: 10 > 0~9 중 랜덤. + 1 해주면 1~10
		int num2 = rd.nextInt(10) + 1;
		/// num이 while 밖에 있으면 문제가 똑같음
		
		while (true) {

			System.out.print(num1 + "+" + num2 + "="); // println에서 ln을 지웠으므로 입력받는 값이 옆에 나옴

			int inputNum = sc.nextInt();

			// 정답 확인
			int answer = num1 + num2;
			if (inputNum == answer) {
				System.out.println("Success!!!");
				System.out.print("계속 하시겠습니까? >> ");
				String ans = sc.next();
				if (ans.equals("Y")) {
					num1 = rd.nextInt(10) + 1;
					num2 = rd.nextInt(10) + 1;
				}else if (ans.equals("N")) {
					System.out.println("게임종료");
					break;
				}
			}else {
				System.out.println("Fail....");
				System.out.print("계속 하시겠습니까? >> ");
				String ans = sc.next();
				if (ans.equals("Y")) {
					
				}else if (ans.equals("N")) {
					System.out.println("게임종료");
					break;
				}
			}
		}
		sc.close();
		
	}


	}
