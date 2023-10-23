package 이차원배열;

public class ex06_이채원배열_예제 {

	public static void main(String[] args) {
		// 5x5 배열
		// 21부터 시작
		// ㄹ형태로 숫자 증가
		
		int[][] arr = new int[5][5];
		
		int num = 1;
		
		// 00 01 02 03 04 > arr[0][i] i++, num++
		// 14 13 12 11 10 > arr[1][i] i--, num++
		// 20 21 22 23 24 > arr[2][i] i++, num++
		
		for(int j = 0; j < 5; j++) {
			if(j % 2 == 0) {
				for(int i = 0; i < 5; i++) {
					arr[j][i] = num;
					num++;
				}
			}else {
				for(int i = 4; i >= 0; i--) {
					arr[j][i] = num;
					num++;
				}
			}
		}
		
		for(int j = 0; j < 5; j++) {
			for(int i = 0; i < 5; i++) {
				System.out.print(arr[j][i] + "\t");
			}
			System.out.println();
		}
		
		

	}

}
