package 이차원배열;

public class ex02_이차원배열_예제 {

	public static void main(String[] args) {
		
		// 5x5 배열
		
		int[][] arr = new int[5][5];
		
		
		 // 00 01 02 03 04 (인덱스 값)
		 // 21 22 23 24 24 (들어가는 숫자)
		
		int num = 21;
		
		
		for (int j = 0; j < 5; j++) {
			for(int i = 0; i < 5; i++) {
				arr[j][i] = num;
				num++;
			}
		}
		for (int j = 0; j < 5; j++) {
			for(int i = 0; i < 5; i++) {
				System.out.print(arr[j][i]+"\t");
			}
			System.out.println();
		}

		
		
	}

}
