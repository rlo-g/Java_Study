package 이차원배열;

public class ex03_이차원배열_예제 {

	public static void main(String[] args) {
		
		// 5x5 배열
		// 21부터 시작
		// 숫자가 세로로 증가 
		
		int[][] array = new int[5][5];
		
		int num = 21;
		
		for (int j = 0; j < 5; j++) {
			for(int i = 0; i < 5; i++) {
				array[i][j] = num;
				num++;
			}
		}
		for (int j = 0; j < 5; j++) {
			for(int i = 0; i < 5; i++) {
				System.out.print(array[j][i]+"\t");
			}
			System.out.println();
		}


	}

}
