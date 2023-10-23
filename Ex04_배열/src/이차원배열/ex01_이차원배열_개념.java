package 이차원배열;

public class ex01_이차원배열_개념 {

	public static void main(String[] args) {
		// 이차원 배열
		// 1차원 배열 안에 1차원 배열이 들어가 있는 자료구조
		
		
		// 1. 이차원 배열 선언하기
		
		// 자료형[][] 배열명 = new 자료형[배열의 크기1][배열의 크기2];
		// 배열의 크기1 : arr 주소값에 들어갈 배열의 크기
		// 배열의 크기2 : 배열의 크기1의 인덱스 안으로 들어가는 배열의 크기 > arr 안에 있는 배열(배열의 크기1)에 들어갈 배열의 크기
		
		int[][] arr = new int[5][4];
		
		System.out.println(arr);     
		System.out.println(arr[0]); // 배열의 크기2만큼 배열이 들어가 있는 주소값
		System.out.println(arr[0][2]);  // 실제 데이터를 가져오는 방법
		// arr[0][2] :  arr 주소값 접근 > 0번 인덱스 접근 > 2번 인덱스 접근
		
		//length
		System.out.println(arr.length);   // arr에 있는 배열의 크기 (배열의 크기1)
		System.out.println(arr[0].length);  // 배열 안에 들어있는 배열의 크기 (배열의 크기2)
		

	}

}
