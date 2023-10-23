package ex01_메서드_기초;

public class ex02_매개o_리턴o {

	public static void main(String[] args) {
		// 매개변수 있고, 리턴타입 있다
		// 전달인자 있고, 리턴타입 자리에 데이터 타입이 명시되어 있다 >> return
		// 2개의 숫자를 뺄셈한 결과값을 받을 수 있는 minus라는 메서드
		
		minus(8, 3);
		System.out.println(minus(8, 3));

	}
	// main 밖
	
	public static int minus(int num1, int num2) {
		return num1-num2;
	}

}
