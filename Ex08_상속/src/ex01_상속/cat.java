package ex01_상속;

public class cat extends Animal{
	// 상속 시
	// class명 옆에 "extends + 상속 받고 싶은 class명"
	// 부모(Animal)가 가진 기능을 사용할 수 있음
	
	public void grooming() {
		// Animal에는 없는 기능 >> 부모로부터 기능을 물려받기는 하지만
		// 자식 스스로 특화된 기능을 만들어낸다
		System.out.println("구르르릉");
		
		
	}
	
	

}
