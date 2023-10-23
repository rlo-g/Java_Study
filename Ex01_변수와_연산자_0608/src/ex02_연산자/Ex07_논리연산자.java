package ex02_연산자;

public class Ex07_논리연산자 {

	public static void main(String[] args) {
		// 논리연산자 - 결과값 = true or false
		// Not, And, Or
		
		// Not - boolean 결과를 반대로 보여줌 (부정, 반대)
		boolean isCheck1 = true;
		System.out.println(!isCheck1);      // not 연산자: ! >> 결과를 반대로 보여줌 (출력값 = false)
		
		// And - 좌항의 결과와 우항의 결과가 모두 true일 때만 결과가 true > 아니면 전부 false
		int num1 = 10;
		int num2 = 5;
		int num3 = 3;
		int num4 = 7;
		
		System.out.println(num1 > num2 && num3 > num4 );   // and 연산자: && / true+false이므로 false
		System.out.println(num1 > num2 && num3 < num4 );   // true+true이므로 true
		
		// Or - 좌황 또는 우항의 결과가 하나라도 true이면 결과는 true. 좌항과 우항 둘 다 false면 결과는 false
		System.out.println(num1 > num2 || num3 > num4);    // or 연산자: ||  >> 좌항이 true이므로 true
		System.out.println(num1 < num2 || num3 > num4);    // false+false이므로 false

	}

}
