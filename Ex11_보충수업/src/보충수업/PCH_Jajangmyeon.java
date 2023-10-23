package 보충수업;

public class PCH_Jajangmyeon extends PBK_Jajangmyeon{
	                        // 상속 받음
	public void makeGoonManDo(){
		System.out.println("바삭한 군만두를 튀겨냅니다");
		
	}
	
	public void makeJajang() {
		// 오버라이드
		// 부모에게 물려받은 것을 상황에 맞게 변화시켜 재정의 (이름은 그대로)
		System.out.println("짜장면 위에 민초를 올린다...");
	}
	
	

}
