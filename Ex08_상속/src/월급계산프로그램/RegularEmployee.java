package 월급계산프로그램;

public class RegularEmployee extends Employee {

	
	// 필드
	int bonus;
	
	
	// 메서드
	public RegularEmployee(String empno, String name, int pay, int bonus) {
		// 상속 관계에서 부모클래스가 생성자를 가지고 있으면
		// 반드시 자식클래스에서도 생성자가 있어야 한다
		
		super(empno, name, pay);
		// 부모클래스 ---> 수퍼클래스
		/// super : 부모클래스를 지칭하는 키워드
		/// super() : 부모클래스의 생성자를 지칭하는 키워드
		
		
//		this.empno = empno;
//		this.name = name;
//		this.pay = pay;
		
		this.bonus = bonus;	  // 부모클래스에 없는 것만 작성
	}

	@Override
	public int getMoneyPay() {
		// 월 급여
		return (pay+bonus)/12;
	}
	
	
	
}
