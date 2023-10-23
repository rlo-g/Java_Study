package ex01_변수;

public class Ex03_변수실습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 정수형 변수 num1에 10을 넣기
		// int num1 = 10;   
		int num1;  // 선언(정의)
		num1 = 10;  // 할당
		num1 = 100;
		
		System.out.println(num1);  // 10은 사라지고 100이 출력됨
		// 변수의특징 - 변수에 새로운 값을 할당하는 순간 
		// 이전의 값은 사라진다
		
		
		int myAge = 17;
		int yourAge = 18;
		
		///////////////////////
		// 나와 짝꿍의 나이 바꾸는 방법 >> 새로운 변수 설정   : "치환 알고리즘"
		
		int temp = myAge;     // 새로운 변수에 나의 나이 담기(데이터 타입 설정) : temp(중간에 담는 변수)
		myAge = yourAge;      // 나의 나이가 담긴 변수에 짝꿍의 나이가 담김(기존 데이터 없어짐)
		yourAge = temp;
		
		///////////////////////
		System.out.println("나의 나이 : " + myAge); // + 사용시 문자와 변수 잇기 가능
		System.out.println("짝꿍의 나이 : " + yourAge);

	}

}
