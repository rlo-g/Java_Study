package ex03_Aniaml;

public class Bird extends Animal {
	
	// 조류는 동무링 가진 기능들을 가 가질 수 있다
	// 조류의 설계도
	// 조류도 울고, 움직이고, 숨쉬고 , 이름, 성별도 있음
	// 상속에서 사용되는 키워드 extends
	
	// 알을 낳다
	public void egg() {
		System.out.println("알을 낳음");  // 기능과 데어ㅓ의 범위가 넒어짐
		
		
	// 오버라이딩
	// move를 물려받긴 할 건데 안에 있는 로직을 다르게 구현하고 싶다
	// : 상속 관계에서 메서드를 재정의 (구현을 다르게, 로직을 다르게)
	// 하는 것을 오버라이딩일고 한다.
	// 단, 같은 이름 사용
		
		
	// alt shift s > override/implement...
		
	}

	@Override  // < 어노테이션
	public void move() {
		
		// move 메서드를 구현할 수 있도록 자동완성
		System.out.println("날아다닌다");
		
	}

}
