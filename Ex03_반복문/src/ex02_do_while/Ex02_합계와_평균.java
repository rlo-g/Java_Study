package ex02_do_while;

import java.util.Scanner;

public class Ex02_합계와_평균 {

	public static void main(String[] args) {
		// 숫자를 계속 입력받다가 100 초과하는 숫자를 입력받을 시 입력 종료
		// 100을 벗어나는 수를 제외하고 입력된 자료의 합계와 평균 출력
		
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		double count = 0;
		
		do {
			System.out.print("숫자를 입력하세요 : ");
			int num = sc.nextInt();
			
			if(num > 100) {
				break;
			}
			sum += num;
			count++;
			
		}while(true);   // true면 계속 진행
		
		 System.out.println("합계: " + sum);
		 
		 double avg = sum / count;          
		 // int avg = sum*1.0/count >> sum이 double 형태로 변환
		 // double(sum/count) 강제형변환
		 System.out.println("평균: " + Math.round(avg*100)/100.0);
		 
		 sc.close();

	}


}
