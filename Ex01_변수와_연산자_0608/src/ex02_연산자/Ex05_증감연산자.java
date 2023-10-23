package ex02_연산자;

public class Ex05_증감연산자 {

	public static void main(String[] args) {
		// 증감연산자
		// 변수의 값을 1 올리거나 1 감소시키는 연산자
		int num = 10;
		
		// 증가
		
		System.out.println(++num);      // 11 : 변수 num 자체가 1이 증가됨
		System.out.println(num);        // 11
		
		System.out.println(num++);        // 10
		System.out.println(num);          // 11
		
		// ++가 변수 앞에 붙으면 먼저 1 증가 하고 후처리
		// ++가 변수 뒤에 붙으면 출력 먼저 하고 그 다음에 변수 값이 1 증가
		
		
		// 감소
		int num2 = 10;
		System.out.println(--num2);       // 9. 실제 num의 값도 9가 됨
		System.out.println(num2);         // 9
		
		System.out.println(num2--);       // 10
		System.out.println(num2);         // 9
		
		
		

	}

}
