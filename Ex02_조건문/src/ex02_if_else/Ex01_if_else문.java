package ex02_if_else;

public class Ex01_if_else문 {

	public static void main(String[] args) {
		// if-else
		// 참과 거짓 두 분류 상황에서 제어를 하고싶을 때 사용하는 조건문
		// 참인 조건에 해당하지 않는 것들은 다 else로 넘어오기 때문에 조건식 따로 필요하지 않음
		
		int num = 10;
		
		if (num % 2 == 1) {
			System.out.println(num + "은(는) 홀수입니다.");
		}else {
			System.out.println(num + "은(는) 짝수입니다.");
		}

	}

}
