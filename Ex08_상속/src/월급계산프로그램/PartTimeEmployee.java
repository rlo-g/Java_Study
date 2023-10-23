package 월급계산프로그램;

public class PartTimeEmployee extends Employee{
	
	int workDay;
	
	public PartTimeEmployee(String empno, String name, int pay, int workDay) {
		super(empno, name, pay);
//		this.empno = empno;
//		this.name = name;
//		this.pay = pay;
		this.workDay = workDay;
	}

	@Override
	public int getMoneyPay() {
		// 월 급여
		return pay*workDay;
	}
	
	

}
