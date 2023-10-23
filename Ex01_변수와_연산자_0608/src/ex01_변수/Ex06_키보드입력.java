package ex01_변수;

import java.util.Scanner;

public class Ex06_키보드입력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 키보드로부터 입력 받을 수 있는 변수 생성 (Scanner)
		// 레퍼런스 자료형들은 값만 갖는 게 아니라 기능도 가짐
		Scanner sc = new Scanner(System.in);
		
		// 스캐너를 통해 정수를 입력받는 방법
		// 변수한테 부탁할 때 . 붙이기 > 무엇을 입력 받아줘
		System.out.print("숫자를 입력해주세요 : ");      // ln 줄바꿈을 의미하므로 print로 하면 옆에 숫자 입력받기 가능
		int temp = sc.nextInt();   // 콘솔창으로부터 숫자를 입력 받을 수 있음. 
		
		System.out.println("입력한 숫자는 -> " + temp);  
		// 앞에서 입력받을 숫자를 변수에 저장 (앞에 자료형 꼭 써주기). 문자와 변수 이을 때 + 사용하기
		
		sc.close();
		
		
		
		
		
		

	}

}
