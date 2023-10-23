package 이차원배열;

public class ex04_이차원배열_숙제 {

	public static void main(String[] args) {
		// 5x5 배열
		// 각 열마다 -1
		// 각 행마다 +5
		
		int[][] array = new int[5][5];
		
		int num = 21;

		
		for (int j = 0; j < 5; j++) {
			for (int i = 4; i >= 0; i--) {
				array[j][i] = num;
				num++;
			}
		}
		
		
		for(int j = 0; j < 5; j++) {
			for(int i = 0; i < 5; i++) {
				System.out.print(array[j][i] + "\t");
			}
			System.out.println();
		}

	}

}
