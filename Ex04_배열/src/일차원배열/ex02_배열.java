package 일차원배열;

public class ex02_배열 {

	public static void main(String[] args) {
		// 정수형 배열 arr을 생성
		// 다음과 같은 값으로 초기화 하기
		// 3, 10, 4, 8, 17, 22, 31
		
		// 1. arr 배열에 들어있는 값을 for문을 사용하여 한번에 출력하기
		
		int[] arr = {3, 10, 4, 8, 17, 22, 31};
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		
		
		// 2. arr 배열에 들어있는 값들 중 짝수만 출력하기

		for(int k = 0; k < arr.length; k++) {
			if(arr[k] % 2 == 0) {
				System.out.println(arr[k]);
			}
		}
		
		
		// 3. arr 배열에 들어있는 값들 중에서 가장 큰 수를 출력하기 (선택) 
		// 배열 안에 있는 값들에 하나씩 접근하면서 서로 비교하기 
		// 비교가 시작될(비교할) 기준값 만들기
		
		int max = arr[0];   
		// 만약 max = 0;일 때, 배열에 들어가있는 모든 값들이 음수라면 정확한 결과 값을 받아볼 수 없기 때문에
		// 배열 안에 들어있는 값들로만 비교를 해야한다!
		
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}	
		}
		System.out.println("가장 큰 값은 " + max + "입니다.");
		
	
	}

}
