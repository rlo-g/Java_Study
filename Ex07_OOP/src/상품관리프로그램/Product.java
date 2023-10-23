package 상품관리프로그램;

public class Product {
	
	// class > 내가 정의한 자료를 담을 수 있다.
	
	// 1. 필드 (데이터를 담을 수 있는 변수)
	private String name;     // 물건이름
	private int unitPrice;   //  단가
	private int amount;      // 수량
	
	
	
	
	// 2. 메서드 ( 데이터를 가지고 움직이는 함수)
	public Product(String name, int unitPrice, int amount) {
		this.name = name;
		this.unitPrice = unitPrice;
		this.amount = amount;
	}
	
	// **생성자**
	// 객체를 생성하는 역할
	// 객체를 생설할 때 반드시 한 번만 호출된다.
	// 생성자를 만들지 않아도 사용할 수 있는 이유?
	// 기본 생성자가 존재하기 때문에
	
	
	
	// 필드에 있는 값을 돌려주는 메서드(getter)
	public String getName() {
		return name;
	}
	
	public int getUnitPrice() {
		return unitPrice;
	}
	
	public int getAmount() {
		return amount;
	}
	
	// 값을 받아와 필드에 넣는 메서드 - 값을 수정해줌 (setter)
	public void setName(String name) {
		this.name = name;
	}
	
	public void setUnitPirce(int unitPrice) {
		this.unitPrice = unitPrice;
	}
	
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	
	

}
