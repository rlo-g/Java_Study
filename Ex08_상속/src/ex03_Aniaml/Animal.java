package ex03_Aniaml;

public class Animal {
	
	// 동물 설계도
	// 1) 필드
	String name;
	String gender;
	
	// 2) 메서드(기능, 행위, 행동)
	//   : 숨쉬기, 움직이기, 울기!
	
	public void breathe() {
		System.out.println("숨쉰다!");
	}
	public void move() {
		System.out.println("걸어다닌다");
	}
	public void cry() {
		System.out.println("운다");
	}

}
