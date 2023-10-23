package ex01_while;

public class Ex02_홀수만_출력 {

	public static void main(String[] args) {
		// while을 사용하여 1부터 100까지 홀수만 출력
		
		int num = 1;
		
		while (num <= 100) {
			if (num%2 == 1) {
				System.out.println(num);
			}
			num++;
			
		}
		

	}

}
