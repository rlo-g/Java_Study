package 저금통;

public class PiggyBank {
	
	// 저금통 클래스 (저금통이 설꼐되는 곳)
	
	
	// 1. 필드(속성)
	// 데이터, 변수, 속성
	
    // 잔액
	private int money;  // 틀을 만드는 것이므로 선언만 >> private로 필드를 함부로 접근하지 못하도록 감춤
	
	// private
	// : 클래스 내부에 있는 메서드를 통해서만 접근 가능하도록 도와주는 접근제한자
	// - private로 감사진 필드에 접근하고 싶으면
	// 클래스 내부에 메서드가 설계되어 있어야 한다. 
	// 수정(초기화, set), 가져와서 확인(get)할 때 사용하려먼...
	
	// getter / setter
	// : private로 감싸진 필드에 접근할 수 있도록
	//  클래스 내부에 만들어진 메서드
	
	// money를 수정할 수 있는 메서드 (main 내에서 필드의 값 수정)
	public void setMoney(int money) {
		this.money = money;  // 현재 클래스에 있는 money를 받아온 money로 바꿔줌
	}
	
	// money의 값을 확인할 수 있는 메서드
	public int getMoney() {
		return money;    // 필드에 있는 moeny 값을 돌려준다.
	}
	
	
	
	
	// 1.5 생성자(메서드)
	// - 생성자의 이름은 클래스의 이름과 동일 (대소문자도 구분)
	// - 생정자도 메서드
	// - 생성자는 리턴타입이 없다 (void xxx)
	// - 새로운 생성자를 만들면 기본 생성자는 사용할 수 없다
	//     > 기본생성자도 사용하고 싶으면 코드로 작성해줘야 한다.
	// - 기본생성자는 클래스를 만들 때 생략되어 있다.
	public PiggyBank(int money) {
		this.money = money;  // money를 받아와서 현재 필드에 있는 money를 초기화
		
	}
	
	
	
	// 2. 메서드(기능)
	
	// 입금
	public void deposit(int money) {  
		// 매개변수 int money : main에서 받아온 입금할 금액
		// 메인으로부터 받아온 돈을 필드 money에 더해준다
		
		// 가지고 있는 money = 현재 필드 money(가지고 있는 money)  + main에서 받아온 입금 금액
		this.money = this.money + money;
	}
		
	// 출금
	public void withdraw(int money) {
		this.money -= money;
	}
		
	// 잔액 확인
	public void showMoney() {

		System.out.println("잔액 : " + money);
		// 매개변수로 money를 사용하는 것이 아니므로 필드에 있는 money인 것을 알 수 있기 때문에
		// this를 사용하지 않음
	}
	

}
