package 뮤직플레이어;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

import javazoom.jl.player.MP3Player;
import javazoom.jl.player.advanced.PlaybackEvent;

public class Main {

	public static void main(String[] args) {
		
		// 노래를 실행, 정지해주는 객체
		MP3Player mp3 = new MP3Player();
		
		// mp3 노래를 실행하기 위해서는 노래가 위치하고 있는 경로 필요
//		mp3.play("C:\\Users\\gjaischool\\Documents\\카카오톡 받은 파일\\mp3\\뉴진스-HypeBoy.mp3");

		
		
		Scanner sc = new Scanner(System.in);
		// 노래 정보 : 1.가수명(String) 2.노래제목(String) 3.발매년도(int) 4.시간(int) 5.경로
		
//		// 객체 생성 (사용자 정의 생성자를 이용하지 않을 경우)
//		Music m1 = new Music();
//		m1.setSinger("아이들");	// 입력	  
//		System.out.println(m1.getSinger());  // 출력
		
		Music m1 = new Music("뉴진스", "Hype Boy", 2022, 237, "C:\\Users\\gjaischool\\Documents\\카카오톡 받은 파일\\mp3\\뉴진스-HypeBoy.mp3");
		// Music이라는 클래스의 객체 m1은 하나의 노래 정보를 담고있다
		Music m2 = new Music("엔시티드림", "Broken Melodies", 2023, 210, "C:\\Users\\gjaischool\\Documents\\카카오톡 받은 파일\\Broken Melodies-NCT DREAM.mp3");
		Music m3 = new Music("르세라핌", "이브, 프시케 그리고 푸른수염의 아내", 2023, 187, "C:\\Users\\gjaischool\\Documents\\카카오톡 받은 파일\\르세라핌 이브 프시케 그리고 푸른 수염의 아내.mp3");
		Music m4 = new Music("카라", "When I Move", 2022, 212, "C:\\Users\\gjaischool\\Documents\\카카오톡 받은 파일\\mp3\\카라-WhenIMove.mp3");
		Music m5 = new Music("Woodz", "난 너 없이", 2022, 222, "C:\\Users\\gjaischool\\Documents\\카카오톡 받은 파일\\난 너 없이 (I hate you)-3-WOODZ.mp3");
		Music m6 = new Music("르세라핌", "Antifragile", 2022, 202, "C:\\Users\\gjaischool\\Documents\\카카오톡 받은 파일\\mp3\\르세라핌-Antifragile.mp3");
		
		
		ArrayList<Music> musicList = new ArrayList<>();
		musicList.add(m1);
		musicList.add(m2);
		musicList.add(m3);
		musicList.add(m4);
		musicList.add(m5);
		musicList.add(m6);
		
		
		int point = 0;    // 몇번째 노래가 재생되는지 위치(노래의 순서)가 저장되는 변수
		                  // while문 안에 있으면 반복될 때 계속 초기화 되므로 바깥에서 선언
		
		
		
		// 선택
		while(true) {
			System.out.print("[1]재생 [2]정지 [3]이전곡 [4]다음곡 [5]목록 [6]종료 >> ");
			int select = sc.nextInt();
			System.out.println();
			
			if(select == 1) {
				// 재생
				
				System.out.println("================= 재생 =================");
				System.out.println();
				
				if(mp3.isPlaying()) {
					// mp3가 노래를 실행하고 있는지 알려주는 메서드 > 실행 되면(true) 노래 멈추기 (노래 겹쳐 나오는 것을 방지)
					mp3.stop();
				}
				mp3.play(musicList.get(point).getPath());   // musicList의 point번째에 있는 경로를 가져와서 노래 실행
				
				System.out.println(point+1 + "." + musicList.get(point).getSinger()
						+ " - " + musicList.get(point).getTitle() + " (" + musicList.get(point).getTime() + "초)");
				System.out.println();
				System.out.println("======================================");
				
				
			}else if(select == 2) {
				// 노래 정지
				
				System.out.println("================= 정지 =================");
				System.out.println();
				
				mp3.stop();
				
				System.out.println(point+1 + "." + musicList.get(point).getSinger()
						+ " - " + musicList.get(point).getTitle() + " (" + musicList.get(point).getTime() + "초)");
				System.out.println();
				System.out.println("======================================");
				
				
			}else if(select == 3) {
				// 이전곡
				
				System.out.println("================ 다음곡 ================");
				System.out.println();
				
				
				if(mp3.isPlaying()) {
					mp3.stop();
				}
				mp3.play(musicList.get(point).getPath());
				point--;      // 이전곡을 누르면 point 감소 > 인덱스 감소로 노래가 이전 순서로 넘어감

				
				if (point < 0) {
					// point가 0보다 작아질 경우, (ArrayList 크기 -1)로 초기화 = ArrayList의 마지막 인덱스
					//  >> 1번에서 6번 노래로 이동
					
					
					if(mp3.isPlaying()) {
						mp3.stop();
					}
					point = musicList.size()-1;
					mp3.play(musicList.get(point).getPath());
				}
				
				System.out.println(point+1 + "." + musicList.get(point).getSinger()
						+ " - " + musicList.get(point).getTitle() + " (" + musicList.get(point).getTime() + "초)");
				System.out.println();
				System.out.println("======================================");
				
				
			}else if(select == 4) {
				// 다음곡
				// 현재 : 1번 노래가 나온다면 다음곡을 선택할 시 2번 노래가 출력되도록
				
				System.out.println("================ 다음곡 ================");
				System.out.println();
				
				
				     // 다음곡을 누르면 point 증가 > 인덱스 증가로 노래가 다음 순서로 넘어감
				if(mp3.isPlaying()) {
					mp3.stop();
				}
				mp3.play(musicList.get(point).getPath());
				point++; 
				
				if (point >= musicList.size()) {
					// point가 마지막 인덱스보다 커질 경우, 다시 첫번째로 되돌아감
					
					if(mp3.isPlaying()) {
						mp3.stop();
					}
					point = 0;
					mp3.play(musicList.get(point).getPath());
					

				}
				
				System.out.println(point+1 + "." + musicList.get(point).getSinger()
						+ " - " + musicList.get(point).getTitle() + " (" + musicList.get(point).getTime() + "초)");
				System.out.println();
				System.out.println("======================================");
				
				
			}else if(select == 5) {
				// 노래목록
				
				System.out.println("================= 목록 =================");
				for(int i = 0; i < musicList.size(); i++) {
					System.out.println(i+1 + "." + musicList.get(i).getSinger() 
							+ " - " + musicList.get(i).getTitle() + " (" + musicList.get(i).getTime() + "초)");
				}
				System.out.println("======================================");
				
				
			}else if(select == 6) {
				// 종료
				
				if(mp3.isPlaying()) {
					mp3.stop();
				}
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			
			
		}

	}

}
