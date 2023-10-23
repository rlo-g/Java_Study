package ex03_다중if_else;

public class Ex01_다중if_else {

	public static void main(String[] args) {
		// 조건이 여러가지인 경우
		
		int money = 5000;
		
		if(money >= 5000) {
			System.out.println("수박주스");
		}else if (money >= 4000 ) {
			System.out.println("블루레몬 아이스티");
		}else if (money >= 3000) {
			System.out.println("아이스 아메리카노");
		}else if (money >= 2000) {
			System.out.println("얼음물");
		}else {
			System.out.println("드릴 수 있는 게 없습니다.");
		}

	}

}
