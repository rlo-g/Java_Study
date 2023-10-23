package ex01_변수;

public class Ex02_변수종류 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Java 변수의 종류
		
		// 정수형 데이터 타입
		// byte - 1byte 1
		// 컴퓨터가 저장할 수 있는 가장 작은 단위 1bit > bit*8 = 1byte (256개의 숫자 표현 가능 -128~ 127)
		byte num1 = 127;  //정수를 담을 수 있는 가장 작은 단위
		
		// short = 2byte
		short num2 = 5000;
		
		// int = 4byte = 2^32
		short num3 = 3333;
		
		// long = 8byte
		long num4 = 33333L; // int 범위를 넘어가는 숫자를 쓰고싶을 경우: L(l)
		
		
		// 실수형 데이터 타입
		// float = 4byte
		float num5 = 14.3F; 
		
		//double = 8byte
		double num6 = 3.24; // 기본 실수 타입으로 인식
		
		// 논리형
		// boolean = 1bit or 1byte
		boolean isCheck = true; 
		
		// 문자형(정수형) : 모든 문자들이 숫자로 매칭되어 있음 
		// char = 2byte
		char text = 'A';  // 문자형은 반드시 작은따옴표(한 글자만 됨). 65
		// 유니코드: 한글도 가능 : '가' > 숫자 매칭되어 있음		
		System.out.println(text + 1);  //66
		System.out.println((char)99);  //c    (모든 문자들이 숫자로 매칭되어 있으므로)
		
		
		
		
		
		

	}

}
