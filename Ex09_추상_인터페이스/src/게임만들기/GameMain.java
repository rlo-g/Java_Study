package 게임만들기;

import java.util.Scanner;

public class GameMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//gamerule에 있는 것을 사용...(기능 구현 ㄴㄴ, 메인에다 이름만 가져다 작성)
		// 사용자에게 입력 받을 것...
		Scanner sc = new Scanner(System.in);
		
		GameDummy game = new GameDummy();
		
		
		System.out.println("=========== Start! ==========");
		
		
		for(int i = 1; i < 6; i++) {
			// 다섯번의 게임 진행
			System.out.print("[1]게임시작 [2]종료  >>  ");
			int select = sc.nextInt();
			System.out.println();
			
			if(select == 1) {
				// 게임시작 선택 시 문제 생성
					
				System.out.println("┌────────────────────┐");
				// 출제된 문제 불러오기
				game.getQuizMsg();
				System.out.println("└────────────────────┘");
				
				System.out.print("정답 : ");
				int answer = sc.nextInt();
				System.out.println();
				// checkAnswer에게 답을 보냄
				game.checkAnswer(answer);
				
				if(game.checkAnswer(answer) == false) {
					// 답이 틀리면 다시 답을 입력...
					
					for(int j = 1; j < 4; j++) {
						// 한 문제 당 세번의 기회
					System.out.println("오답입니다!! 다시 입력해주세요!!!");
					System.out.println("정답 : ");
					answer = sc.nextInt();
					game.checkAnswer(answer);
					
					if (game.checkAnswer(answer)) {
						// 정답이면 끝!!
						System.out.println("정답입니다!!!");
						break;
					}
					
					}
					// 정답을 세 번 다 틀리면 게임오버
					System.out.println("========= GAME OVER =========");
					break;
				}
				
				}
				
			}
			
		}
		
				
		
		



}


