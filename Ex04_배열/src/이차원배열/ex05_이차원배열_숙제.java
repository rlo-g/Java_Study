package 이차원배열;

public class ex05_이차원배열_숙제 {

	public static void main(String[] args) {
		// 5x5배열
		// 45에서 시작
		// 각 행마다 -1
		// 각 열마다 -5
		
		int[][] array = new int[5][5];
		
		int num = 45;
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				array[j][i] = num;
				num--;
			}
		}
		
//		for (int j = 4; j >= 0; j--) {
//			// j 4 3 2 1 0  5번
//			
//			for(int i = 4; i >= 0; i--) {
//				// i 4 3 2 1 0  5번
//				array[i][4] = num;
//				num++;
//			}
//		}

		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
		
		

	}

}
