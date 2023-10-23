package 인터페이스;

public class Pikca implements PokeMon{

	@Override
	public void atk() {
		System.out.println("몸통박치기");
		
	}

	@Override
	public void specialAtk() {
		System.out.println("백만볼트!");
		
	}
	
	// 사장님이 주신 인터페이스를 통해 피카츄 캐릭터를 완성해보자!
	// 인터페이스를 사용하는 키워드 : implements(구현) 상속받을 인터페이스명
	
	// 인터페이스도 추상클래스와 마찬가지ㅗ 구현을 강제화 하고 있다..
	// 추상클래스보다 훨씬 강조하는 형태
	// 인터페이스는 반드시 추상메섣, 상수만 포함할 수 있다
	//  + 다중상속이 가능하다!!  ( 기능 확장을 용이하게 만들기 위해서..)
	

}
