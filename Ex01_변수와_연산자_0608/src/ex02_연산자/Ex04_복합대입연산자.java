package ex02_연산자;

public class Ex04_복합대입연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// = : 대입연산자. 우측의 값을 왼쪽에 넣겠다
		
		// 복합대입연산자: +=, -=, /=, %=, *= ...
		int a = 10;
		
		// 기존 a 값을 날리지 않고 10을 더 더하려면?
		a += 10;   // a = a + 10; 
		
		a -= 5;    // a = a - 5
		a /= 2;    // a = a / 2; > 5
		
		
		// 복합대입연산자 우선순위
		int num = 29;
		num -= 2 + 3 * 4;        // 복합대입연산자를 쓰면 우선순위가 달라짐 > num = num - (2+3+4) = 15 : 뒷부분 먼저 처리
		System.out.println(num);
		
		

	}

}
