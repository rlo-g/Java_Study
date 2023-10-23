package 일차원배열;

import java.util.Random;

public class ex09_로또번호출력 {

	public static void main(String[] args) {
		// 로또 번호 만들기
		// 6칸까리 정수형 배열
		// 각각 임의의 값으로 초기화 (1~10)
		// 중복된 값은 제거할 것
		// 배열에 들어있는 값 출력하기
		
		System.out.println("==== 로또 타임 ====");
		System.out.println("이번주 출력번호는요 ... !! 두구두구두구!!!!!!!");
		Random rd = new Random();
		int[] lotto = new int[6];
		
		for (int i = 0; i < lotto.length; i++) { 
			lotto[i] = rd.nextInt(10)+1;  // 0~9에 +1 해주므로 1~10이 배열에 들어감
					
			// 중복되어있는지 확인, 제거
			// 제거 : 다시 핸덤한 숫자를 재할당
			
			for (int j = 0; j < i; j++) {         // j : i 이전에 입력된 값들을 알기 위한 것이므로 j < i여야됨
				// 안쪽 for문의 조건이나 if문의 조건이 false일 결우 바깥의 for문의 순서가 i++;로 감
				
				if(lotto[i] == lotto[j]) {        // 자기 자신(i)을 제외한 앞 인덱스 값(j)들과 비교
					// 중복
					// lotto[i] : 새로 입력되고 있는 값
					// lotto[j] : 이미 앞쪽에 입력되어 있는 값
					i--;       // 중복된 값을 만났을 때 i-1
					break;     // 실행문(안쪽 for문)을 멈춤
					           // 다시 바깥쪽 for문으로 가서 i++;
					           // 중복된 값이 나오던 순서가 다시 시작됨 (i-1+1) > 로또 숫자 재할당
				}	
			}
			}
		for(int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
		
		} 
		

	}

