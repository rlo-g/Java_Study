package 보충수업;

public class PDY_Jajangmyeon extends PBK_Jajangmyeon {

	// 부모가 추상클래스일 경우
	// 추상 클래스를 상속받는 순간, 추상 메서드를 자식 클래스에서 구현시켜줘야 한다!!
	@Override
	public void makeJajang() {
		// 추상 클래스를 상속받았으므로 메서드를 무조건!! 구현해야함 (부모에는 명확한 메서드가 없으므로, 강제구현)
		System.out.println("고수가 듬뿍 올라간 짜장면");
		
	}

}
