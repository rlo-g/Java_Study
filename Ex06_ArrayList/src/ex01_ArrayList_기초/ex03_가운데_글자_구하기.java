package ex01_ArrayList_기초;

import java.util.ArrayList;
import java.util.Scanner;

public class ex03_가운데_글자_구하기 {

	public static void main(String[] args) {
		
		System.out.println(getMiddle("test"));

	}
	
	
	
	public static String getMiddle(String word) {
		// 단어를 입력 받아서 가운데 글자 반환하기
		// 단어의 길이 짝수: 가운데 두글자 반환
		// 홀수: 가운데 글자 반환
		
		
		
		ArrayList<String> spell = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		word = sc.next();
		

		// for문으로 돌려서 한 문자씩 뽑아서 배열에 저장하기??
		for(int i = 0; i < spell.size(); i++) {
			char temp = word.charAt(i);
		
			
			
			
			
				
			}
		return null;
		
		// 홀수면 >> num/2 +1이 가운데 글자
		// 짝수면 >> num/2, num/2 +1이 가운데 두글자
			
		}
		
		
		
		
		
	}


