package ex03_for;

public class Ex06_심플구구단 {

	public static void main(String[] args) {
		// 구구단 2단 출력하기
		
		/*
		 * System.out.println("<2단>"); for (int i = 1; i <= 9; i++) {
		 * System.out.println("2x" + i + "=" + 2*i); }
		 */
		
		
		// 2단~9단까지 출력하세요
//		for (int n = 2; n <= 9; n++) {
//			System.out.println("=== " + n + "단 ===");
//			for (int i = 1; i <= 9; i++) {
//				System.out.println(n + "x" + i + "=" + n*i);
//				System.out.println();
//			}
//		}
		
		for (int n = 2; n <= 9; n++) {
			System.out.print(n + "단 : ");
			for (int i = 1; i <= 9; i++) {
				System.out.print(n + "x" + i + "=" + n*i + " ");
			}
			System.out.println();
		}

		}

	}


