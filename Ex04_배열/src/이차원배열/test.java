package 이차원배열;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
        int num = sc.nextInt();

		int[][] arr = new int[num-1][num-1];
		
		int start = 1;
		
		// 00 01 02 03 04 > arr[0][i] i++, num++
		// 14 13 12 11 10 > arr[1][i] i--, num++
		// 20 21 22 23 24 > arr[2][i] i++, num++
		
		for(int j = 0; j < num -1; j++) {
			if(j % 2 == 0) {
				for(int i = 0; i < num-1; i++) {
					arr[j][i] = start;
					start++;
				}
			}else {
				for(int i = num-1; i >= 0; i--) {
					arr[j][i] = start;
					start++;
				}
			}
		}
		
		for(int j = 0; j < num-1; j++) {
			for(int i = 0; i < num-1; i++) {
				System.out.print(arr[j][i] + "\t");
			}
			System.out.println();
		}    

	}

}
