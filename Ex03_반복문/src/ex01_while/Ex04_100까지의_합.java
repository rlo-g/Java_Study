package ex01_while;

public class Ex04_100까지의_합 {

	public static void main(String[] args) {
		// 1부터 100까지의 합: 5050
		
		int num = 1;            // 1부터 100까지 증가할 변수
		int sum = 0;            // 1부처 100까지의 합을 저장할 변수
		
		while (num <= 100) {       // while문은 조건식이 true일 때만 실행(반복)
			sum = num + sum;       // sum += num;
			num++;             
		}
		System.out.println("1부터 100까지의 합: " + sum);

	}

}

