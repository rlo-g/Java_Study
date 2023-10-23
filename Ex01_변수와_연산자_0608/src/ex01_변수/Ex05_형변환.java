package ex01_변수;

public class Ex05_형변환 {

	public static void main(String[] args) {
		// 형 변환(타입변환) - 현재의 자료형을 다른형태의 자료형으로 변환하는 과정
		
		byte num1 = 100;   // 1byte
		int num2 = num1;   // 4byte 작은 타입에서 큰타입으로 담을 때는 이상 없이 변환 가능 > 자동 형변황
		byte num3 = (byte)num2;  // 강제 형변환
		
		// System.out.println(num2);
		// System.out.println(num3);
		
		
		// 실수형태의 형변환
		double num4 = 100.11;   // 8byte
		int num5 = (int)num4;
		System.out.println(num5);   // 실행시 소숫점 안 나옴  > 실수형태 자료형을 정수형에 넣으면 실수는 날아간다
		
		float num6 = 3.14F;     // 4byte
		int num7 = (int)num6;        // 같은 4byte지만 실수를 더 큰 형태로 봄 > 강제 형변환(소숫점 표현 불가)
		
		int num8 = 100;
		float num9 = num8;     // 자동 형변환 > 실수형인 100.0으로 표현됨
		
		

	}

}
