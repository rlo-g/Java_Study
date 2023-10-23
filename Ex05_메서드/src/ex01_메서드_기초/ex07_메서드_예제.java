package ex01_메서드_기초;

public class ex07_메서드_예제 {

	public static void main(String[] args) {
		
		// 완전수 구하기
		// 완전수 : 나를 제외한 약수의 합이 나와 같은 수
		// 6의 약수 : 1 2 3 6 >> 나를 제외한 약수의 합 : 6  >> 완전수
		
		// 1단계) 약수인지 아닌지 확인해주는 메서드 만들기
		int num1 = 10;
		int num2 = 2;
		boolean divisor = isDivisor(num1, num2);  
		                   // is라는 키워드가 붙은 메서드 리턴 타입은 boolean이다.
		System.out.println(divisor);
		
		
		
		// 2단계) 약수가 출력되는 메서드
		getDivisor(10);
		getDivisor(17);
		getDivisor(24);            // 타입 void
		
		
		
		// 3단계) 약수의 합을 구하여 반환
		int num = 10;
		int result = getSumOfDivisors(num);
		
		System.out.println(num + "의 약수의 합 : " + result);
		getDivisor(num);
		
		
		
		// 4단계) 완전수인지 아닌지를 판단해주는 메서드 isPerfectNumber
		int num3 = 10;
		
		boolean result2 = isPerfectNumber(num3);
		System.out.println("완전수인가요? : " + result2);
		
		// 완전수 : 자기 자신을 제외한 약수들의 합이 자기 자신과 같은 수 
		
		
		
		
		// 5단계) startValue~endValue 숫자 중 완전수를 출력
		int startValue = 1;
		int endValue = 10000;
		getPerfectNumber(startValue, endValue);
		
		

	}
	
	// 1. 약수인지 아닌지 판단해서 true/false를 돌려주는 메서드
	public static boolean isDivisor(int num1, int num2) {
		if(num1 % num2 == 0) {
			return true;
		}else {
			return false;
		}
		
	}
	
	
	
	// 2. 전달 받은 하나의 숫자에 대해 모든 약수를 출력하는 메서드
	public static void getDivisor(int num) {
		System.out.print(num + "의 약수 : ");
		
		for(int i = 1; i <= num; i++) {       
			if(isDivisor(num, i)) {                  // i가 num의 약수인가? (나누어 떨어지는가?)
				// isDivisor : num1을 num2로 나눴을 때 나누어 떨어지는가? (t/f)
				// if문 조건식 : num을 i로 나눴을 때 나누어 떨어지는가?
				System.out.print(i + " ");
			}
		}
		System.out.println();  
		
	}

	
	
	// 3. 약수의 합을 구하여 반환하는 메서드
	public static int getSumOfDivisors(int num) {
		// num의 약수들의 합
		int sum = 0;
		// 약수의 특징 : (자기 자신 / 2)보다 큰 값의 약수를 갖지 않음 
		for(int i = 1; i <= num/2; i++) {       // i <= num   >> return sum;
			if(isDivisor(num, i)) {
				sum += i;
			}
		}
		return sum+num;     // for문에서 num/2를 했으므로 약수 합에 자기자신이 포함이 되지 않기 때문에 +num	
	}
		
	
	// 4. 완전수인지 아닌지를 판단해주는 메서드
	public static boolean isPerfectNumber(int num3) {
		if(num3 ==(getSumOfDivisors(num3)-num3) ) {     
			// gSOD는 자기 자신까지 합한 수이기 때문에 자기 자신을 빼줘야 나머지 약수들의 합이 됨
			return true;
		}else {
			return false;
		}
	}
	
	
	// 5. startValue ~ endValue 사이의 수 중에서 완전수를 출력하는 메서드
	public static void getPerfectNumber(int startValue, int endValue) {
		System.out.print(startValue + "~" + endValue + "까지의 완전수 : ");
		for(int i = startValue; i <= endValue; i++) {
			if(isPerfectNumber(i)) { 
				// iPN은 boolean형이므로 판단할 때 t/f와 비교해야함 > iPN 자체가 boolean형이므로 비교 안 해도 됨
				System.out.print(i + " ");
				
			}
		}
		
	}
	
	
	
	
	
	
}
