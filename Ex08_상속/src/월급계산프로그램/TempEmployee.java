package 월급계산프로그램;

public class TempEmployee extends Employee{
	
	public TempEmployee(String empno, String name, int pay) {
		super(empno, name, pay);
//		this.empno = empno;
//		this.name = name;
//		this.pay = pay;
	}

	@Override
	public int getMoneyPay() {
		// 월급여
		return pay/12;
	}
	
	

}
