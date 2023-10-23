package ex02_연산자;

public class Ex01_산술연산자 {

	public static void main(String[] args) {
		// 산술연산자
		int num1 = 7;
		int num2 = 3;
		
		int result1 = num1 + num2;
		System.out.println(result1);
		int result2 = num1 - num2;
		System.out.println(result2);
		int result3 = num1 * num2 ;
		System.out.println(result3);
		
		int result4 = num1 / num2 ;     // 몫을 가져오는 연산자
		System.out.println(result4);    // 2.333 > 2 : int 정수형이므로 몫의 뒷부분이 나오지 않음
		
		double result5 = num1 / num2 ;
		System.out.println(result5);    // 2.333333 
		
		int result6 = num1 % num2;
		System.out.println(result6);    // 나머지 가져오는 연산자
		
		
		// 문자열과 숫자를 더한다면?
		System.out.println("바나나" + 8 + 2);    // 바나나82 > 사칙연산 우선순위로 인해 2 더할 때 바나나8(문자)+2가 됨
		System.out.println("바나나" + (8 + 2));  // 바나나10
		System.out.println("바나나" + 8 * 2);    // 바나나16
		
		System.out.println("81" + 3 * 2 + 2 + 4);  // 81624 (81은 문자열이므로, 문자열+숫자는 옆으로 붙음)

	}

}
