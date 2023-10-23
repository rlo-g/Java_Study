package ex03_Aniaml;

public class Penguin extends Bird{
	
	// 조류입니다
	// 알 낲고, 이름, 성별, 숨쉬고, 울고, 움직인다
	// 펭귄이 움직이는 형태는 "헤엄치다"입니다...
	// 울다 > "꿱꿱 울다."로 출력되도록 만들자...
	


	@Override
	public void move() {
		System.out.println("헤엄치다");
	}
	
	
	@Override
	public void cry() {
		System.out.println("꽥꽥 울다");
	}

}
