package ex01_ArrayList_기초;

import java.util.ArrayList;
import java.util.Scanner;

public class ex02_뮤직플레이어 {

	public static void main(String[] args) {
		
		// 노래 리스트가 저장될 ArrayList 만들기 : musicList
		// 노래 리스트란? "가수 이름 - 노래 제목" : String
		
		ArrayList<String> musicList = new ArrayList<>();
		
		
		// 입력하는 도구 가져오기
		Scanner sc = new Scanner(System.in);
		
		
		// 사용자에게 보여지는 화면 구현하기
		// 사용자가 4번을 누르기 전까지 반복하기
		while(true) {     
			System.out.print("[1]노래조회 [2]노래추가 [3]노래삭제 [4]종료 >> ");
			
			// 숫자 입력받기 : select에 변수 저장
			int select = sc.nextInt();
			System.out.println();
			
			
			if(select == 1) {
				// 1번 선택, ArrayList에 데이터가 있으면 재생목록 보여주기
				//                          없으면 "재생목록이 없습니다."
				
				System.out.println("========현재 재생 목록========");
				
				
				if(musicList.size() == 0) {
					// 재생 목록이 없을 때
					System.out.println("재생 목록이 없습니다.");
					
				}else {
					// 재생 목록이 있을 때
					for(int i = 0; i < musicList.size(); i++) {
						System.out.println(i+1 + ". " + musicList.get(i));
					}
				}
				System.out.println("=========================");
				
				
				
			}else if(select == 2) {
				// 2번 > 마지막 위치에 추가 / 원하는 위치에 추가
				
				System.out.print("[1]마지막 위치에 추가 [2]원하는 위치에 추가 >> ");
				int num2 = sc.nextInt();
				System.out.println();
				
				if(num2 == 1) {
					// 노래를 마지막 위치에 추가할 때
					
					System.out.print("추가할 노래 입력 >> ");
					String list = sc.next();
					
					musicList.add(list);     // 추가한 노래를 뮤직리스트에 넣어주기
					System.out.println();
					
					System.out.println("추가가 완료되었습니다.");
					System.out.println();
					
					
				}else if(num2 == 2) {
					// 노래를 원하는 위치에 추가할 때
					
					System.out.print("추가할 노래 입력 >> ");
					String list = sc.next();
					
					System.out.print("추가할 위치 입력 >> ");
					int index = sc.nextInt();
					System.out.println();
					
					musicList.add(index-1, list); 
					System.out.println("추가가 완료되었습니다.");
					System.out.println();
					
					
					
				}
			}else if(select == 3) {
				// 3번 > 선택 삭제 / 전체 삭제
				
				System.out.println("========현재 재생 목록========");
				
				if(musicList.size() == 0) {
					// 재생목록 없을 경우 띄우는 것
					System.out.println("재생 목록이 없습니다.");
					System.out.println("=========================");
			
					
				}else {
					// 재생목록 있을 경우 리스트 띄우고 삭제 방법 물어보기
					
					for(int i = 0; i < musicList.size(); i++) {
						System.out.println(i+1 + ". " + musicList.get(i));
					}
					System.out.println("=========================");
					
					System.out.print("[1]선택삭제 [2]전체삭제 >> ");
					int num3 = sc.nextInt();
					
					if(num3 == 1) {
						// 선택 삭제의 경우
						
						System.out.print("삭제할 노래 선택 >> ");
						int num4 = sc.nextInt();
						musicList.remove(num4-1);
						
						System.out.println();
						System.out.println("노래가 삭제되었습니다.");	
						System.out.println();
						
					}else if (num3 == 2) {
						// 전체 삭제의 경우
						
						musicList.clear();
						System.out.println();
						System.out.println("전체 리스트가 삭제되었습니다.");
						System.out.println();
					}
				}
				
				
			}else if(select == 4) {
				// 4를 입력하면 "프로그램 종료"
				System.out.println("프로그램 종료");
				break;
				// 가장 근접한 반복문을 빠져나가는 키워드 >> while문 빠져나간다
				
				
			}else {
				// 1부터 4가 아닌 다른 숫자를 입력하면 "잘못 입력했습니다."
				System.out.println("다시 입력해주세요.");
				System.out.println();
				
			}			
			
		}
		sc.close();
	}

}
