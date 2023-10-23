package ex03_for;

public class Ex07_별찍기 {

	public static void main(String[] args) {
		// 1. 공포의 별 찍기
		// *
		// **
		// ***
		// ****
		
//		for (int i = 1; i <= 5; i++) {
//			for (int n = 1; n <= i; n++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
		
		// 2. 역순으로 별 찍기
		
//		for (int i = 1; i <= 5; i++) {
//			for (int n = 5; n >= i; n--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
		// 3. 별을 오른족부터 찍기
		for (int i = 1; i <= 5; i++) {
			for (int n = 5; n-1 >= i; n--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		

	}

}
