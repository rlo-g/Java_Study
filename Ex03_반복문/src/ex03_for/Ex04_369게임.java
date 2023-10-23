package ex03_for;

public class Ex04_369게임 {

	public static void main(String[] args) {
		// 끝자리 수가 3, 6, 9일 때는 "박수" 출력
		// 끝자리 수가 5일 때는 "으악"을 출력
		// 그 외의 나머지 수는 그냥 숫자 출력
		
		for(int i = 1; i <= 50; i++) {
			if(i % 10 == 3 || i % 10 == 6 || i % 10 == 9 ) {
				System.out.println("박수");
			}else if (i % 10 == 5) {
				System.out.println("으악");
			}else {
				System.out.println(i);
			}
		}

	}

}
