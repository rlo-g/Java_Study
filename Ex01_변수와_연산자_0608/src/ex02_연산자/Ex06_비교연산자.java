package ex02_연산자;

public class Ex06_비교연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
		int num2 = 5;
		int num3 = 10;
		int num4 = 5;
		
		// 비교연산자의 결과값은 항상 true / false 로 나온다 (데이터 타입: boolean)
		System.out.println(num1 > num2);     // true 
		System.out.println(num1 < num2);     // false
		System.out.println(num1 == num3);    // ==(값이 같다) true
		System.out.println(num1 != num3);    // !=(같지않다) false
		System.out.println(num1 >= num3);    // >=(이상) true
		System.out.println(num1 <= num3);    // <=(이하) true

	}

}
