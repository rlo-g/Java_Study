package ex03_for;

public class Ex05_plus_minus {

	public static void main(String[] args) {
		// 1부터 100까지 출력
		// 홀수는 양의 정수, 짝수는 음의 정수로 출력
		
		for ( int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.print("-" + i + " ");    // -1*i 
			}else {
				System.out.print(i + " ");
			}
		}

	}

}
