package 월급계산프로그램;

public  abstract class Employee {
	
	/* employee 클래스 (일반래스)
	 * 1)추상 메서드를 포함하고 있는 클래스는 반드시 추상 클래스가 되어야한다!
	 * 2) 추상 클래스도 일반 메서드를 포함할 수 있다!
	 * 3) 추상 클래스이지만 추상 메서드가 없을 수도 있다
	 * * 방법  : public abstract class 클래스명 {
	 * 4) 추상 클래스는 객체 생성(실체화)가 불가능하다!
	 *   > 개념적인 존재이기 때문에 공통적인 특징만을 모아놓은 추상적이 개념이기 때문에...
	 * 
	 */
	
	
	// Regular, PartTime, TempEmployee가 가지고 있는
	// 공통적인 필드, 메서드가 있음!!
	// > Regular, PartTime, TempEmployee에게 상속
	
	
	// 필드
	// private : 데이터 보호에는 좋다
	// ---> 클래스 내부에 설계되어있는 메서드를 통해서만 접근이 가능하도록 도와준다.

	// protected : 상속 관계에 있는 클래스들끼리, 같은 패키지에 있는 클래스들끼리는 접근이 가능하도록 도와주는 접근제한자
	
	protected String empno;  // 사번
	protected String name;   // 이름
	protected int pay;       // 연봉
	
	
	
	
	
	public Employee(String empno, String name, int pay) {
		this.empno = empno;
		this.name = name;
		this.pay = pay;
	}

	
	
	// 메서드
	
	// 부모 클래스에 있는 getMonetPay는 자식 클래스에서 매번 구현단(바디)이 바뀌는 중..
	// >> 틀만 만들어서 자식에세 상속 : 추상클래스
	// abstract 키워드를 통해서 일반메서드를 추상메서드로 만들 수 있다
	// 추상메서드 : 선언만 되어있고, 바디가 없는( {}중괄호 ) 메서드이다!
	
	// 추상메서드가 포함된 순간 일반 클래스는 추상 클래스로 바뀌어야 한다..

	
	public abstract int getMoneyPay();
	
	
	
	public String print() {
		// 사번 : 이름 : 연봉
		return empno + " : " + name + " : " + pay;
	}

	

}
