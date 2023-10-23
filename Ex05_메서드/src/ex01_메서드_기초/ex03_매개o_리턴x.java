package ex01_메서드_기초;

public class ex03_매개o_리턴x {

	public static void main(String[] args) {
		
		// 매개변수 있고, 리턴타입 없다(void ---> 텅 빈)
		// 전달인자 있고, 리턴타입 자리에 데이터 타입이 명시 x (return 키워드가 안 온다)
		// void가 오는 경우는 메서드가 순수하게 기능 자체를 가지고 있는 경우
		// ex_ syso, compile을 하는 기능..
		
		// sumPrint : 숫자 2개를 전달 받아서 다한 결과값을 출력해주는 기능
		
		sumPrint(3,5);
		

	}
	
	// sumPrint 만들기
	public static void sumPrint(int num1, int num2) {
		// num1, num2 더한 결과값을 출력
		System.out.println(num1 + num2);
		// void라는 리턴타입은 return이 안 와도 됨!!
	}

}
