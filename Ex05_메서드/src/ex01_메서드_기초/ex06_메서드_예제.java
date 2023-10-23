package ex01_메서드_기초;

public class ex06_메서드_예제 {

	public static void main(String[] args) {
		
		// 2개의 양수를 받아 2개의 숫자 중 더 큰 수를 반환하는 메서드
		// 만약, 두 숫자가 같다면 0을 반환
		
		int num1 = 10;
		int num2 = 24;
		int result = largerNumber(num1, num2);
		System.out.println("큰 수 확인 : " + result);

	}
	public static int largerNumber(int num1, int num2) {
		if(num1 > num2) {
			return num1;
		}else if(num1 == num2) {
			return 0;
		}else {
			return num2;   // else if문을 사용했으면 반드시 else문으로 닫아줘야한다.
			               // 발생할 수 있는 모든 경우에 대해서 return이 필요하다.
		}
	}
	

}
