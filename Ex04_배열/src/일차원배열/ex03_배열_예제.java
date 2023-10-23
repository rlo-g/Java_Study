package 일차원배열;

public class ex03_배열_예제 {

	public static void main(String[] args) {
		
		// 1. 정수형 데이터를 저장할 수 있는 arr 배열 생성
		
		// 2. 문제에 적혀있는 값으로 초기화
		// ( 23, 45, 85, 17, 6, 89, 47, 56, 68, 17 )
		
		int[] arr = {23, 45, 95, 17, 6, 89, 47, 56, 68, 17};		
		
		
		// 3. arr에 들어있는 값들 중에서 가장 큰 값 출력
		
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("가장 큰 값은 " + max +"입니다.");
		
		// 4. arr에 들어있는 값들 중 가장 작은 값 출력
		int min = arr[0];
		for (int k = 1; k < arr.length; k++) {
			if (arr[k] < min) {
				min = arr[k];
			}
		}
		System.out.println("가장 작은 값은 " + min + "입니다.");
		


	}

}
