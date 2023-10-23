package ex02_do_while;

import java.util.Random;
import java.util.Scanner;

public class Ex04_plus게임 {

	public static void main(String[] args) {
		// 랜덤으로 나오는 숫자를 더하는 게임
		
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
		
		// 정답 시 카운트
		// 마지막 게임 종료시 최종 맞춘 개수를 보여준다 > 정답횟수 : 00번
		
		
		int num1 = rd.nextInt(10) + 1;
		// () 범위 안에서만 랜덤숫자를 뽑음: 10 > 0~9 중 랜덤. + 1 해주면 1~10
		int num2 = rd.nextInt(10) + 1;
		/// num이 while 밖에 있으면 문제가 똑같음
		
		int life = 3;  // 목숨 3개 설정
		int cnt = 0;   // 정답 횟수 저장할 변수
		
		
	    while(life > 0) {       // life를 차감하는 else문이 while문 내에 있음. life가 0이 되면 게임이 종료됨
	        System.out.print(num1 + "+" + num2 + "=");
	        int inputNum = sc.nextInt();
	          
	           // 정답확인
	        int answer = num1 + num2;
	        
	        if(inputNum == answer) {          // 정답일 경우
	           System.out.println("Success!!!");
	           cnt += 1;
	           num1 = rd.nextInt(10) + 1;
	           num2 = rd.nextInt(10) + 1;
	        }else {                           // 오답일 경우
            System.out.println("Fail....");
            life--;
            System.out.println("남은 목숨 : " + life);    // 틀렸을 경우에만 목숨 차감
            }
	       }
	    System.out.println("게임종료.");
	    System.out.print("정답횟수 : " + cnt + "번");
	    sc.close();

		
		
		

					
				}

			
		}


