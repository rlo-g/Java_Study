package ex01_while;

public class Ex01_while {

	public static void main(String[] args) {
		// 반복문 - 조건이 성립할 때까지 반복하는 문법
		// while
		
		// while을 사용해 1부터 5까지 출력하기
		int num = 1;              
		while (num <= 5) {             // (num == 5)는 num이 5라면 중괄호 실행, false면 실행 안 함 >> num이 5보다 작거나 같을 때까지
			System.out.println(num);
			num = num + 1;             // num += 1,  num++, >> num 증가시켜서 다시 담아 조건식에 맞는지 확인
		}
		

	}

}
