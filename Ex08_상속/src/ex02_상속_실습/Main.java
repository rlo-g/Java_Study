package ex02_상속_실습;

public class Main {

	public static void main(String[] args) {
		
		Beginner b = new Beginner();
		b.level = 12;
		b.nickName = "햄미";
		b.hp = 200;
		b.mp = 70;
		b.exp = 820;
		
		b.snailThrow();
		b.agileMovement();
		b.recovery();
		
		Warrior w = new Warrior();
		w.level = 32;
		w.nickName = "멈뭄미";
		w.hp = 1200;
		w.mp = 320;
		w.exp = 120;
		
		w.smash();
		w.snailThrow();
		
		Wizard wi = new Wizard();
		wi.snailThrow();

	}

}
