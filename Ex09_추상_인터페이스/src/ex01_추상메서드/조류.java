package ex01_추상메서드;

public abstract class 조류 {
	// 추상 클래스만 추상 메서드를 포함 가능!!
	// public abstract class ~
	
	
	// 메서드 (설계만 : 선언만) ---> 추상 메서드
	
	// 울기
	public abstract void cry();
	// 춤직이기
	public abstract void move();
	
	// 알낳기 (공통적)
	public void egg() {
		System.out.println("알을 낳는다");
	}

}
