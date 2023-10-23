package 인터페이스;

public interface PokeMon {
		
	/* 인터페이스
	 * : 프로젝트 지침서, 설계도
	 * 
	 * 1) 필드
	 *   : final을 사용하여 상수 형태로 만들어 주고, 선언과 초기화가 되어있어야 한다.
	 *    >> final String name = "햄미";
	 * 
	 * 2) 메서드
	 * 단, 메서드는 반드시!! 선언만 되어 있어야 한다
	 * 인터페이스는 일반 메서드를 포함할 수 없다!
	 * 무조건 추상 메서드만 포함할 수 있다
	 */
	
	
	// 포켓몬 게임을 만드는 개발자!
	// 만드는 게임에 들어있는 모든 캐릭터들은
	// 공격, 특수공격을 할 수 있어야 된다
	
	
	// 메서드
	// 일반 공격 : attack
	public abstract void atk();
	
	// 특수 공격 : specialAtk
	public abstract void specialAtk();
	

}
