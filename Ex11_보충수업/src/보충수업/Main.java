package 보충수업;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// 박병관 짜장면집
//		PBK_Jajangmyeon pbk = new PBK_Jajangmyeon();  // 객체 생성 (레퍼런스 변수 생성)
		
		// >> 추상 클래스는 객체를 생성할 수 없다!!!
		// 자식 클래스에서 객체를 생성하는 것은 가능 (메서드를 구현해놨으므로. 업캐스팅 가능)
		
//		pbk.makeJajang();   // 객체에게 요청
		
		
		// 박충현 짜장면집
		PCH_Jajangmyeon pch = new PCH_Jajangmyeon();
//		pch.makeJajang();      // 부모로부터 받은 메서드가 아니라 자신(자식)의 메서드가 나옴(재정의 한 메서드-오버라이드)
//		pch.makeGoonManDo();
		
		
		// 박보경 짜장면집
		PBG_Jajangmyeon pbg = new PBG_Jajangmyeon();
//		pbg.makeJajang();
		
		// 박종권 짜장면집
		PJG_Jajangmyeon pjg = new PJG_Jajangmyeon();
//		pjg.makeJajang();
		
		// 박다영 짜장면집
		PDY_Jajangmyeon pdy = new PDY_Jajangmyeon();
		
		
		// PCH_Jajangmyeon(자식)로 만들어진 객체를 PBK(부모)에 넣음 : 캐스팅(형변환)
		// 업캐스팅 : 자식타입이 부모타입으로 형변환(↑)
		PBK_Jajangmyeon p1 = pch;
//		p1.makeGoonManDo(); >> 부모 타입으로 변환된 자식 개체는 자식 클래스에서 확장시켰던 메서드 사용 불가능!!!  
//		p1.makeJajang();  // 오버라이드 했던 메서드는 그대로 사용 가능함
		
		PBK_Jajangmyeon p2 = pbg;
//		p2.makeJajang();
		
		PBK_Jajangmyeon p3 = pjg;
//		p3.makeJajang();
		
		PBK_Jajangmyeon p4 = pdy;
		
		// 업캐스팅 시키는 이유?
		// 자식들의 데이터 타입이 같아지므로 자식들을 ArrayList로 묶을 수 있다
		ArrayList<PBK_Jajangmyeon> list = new ArrayList<>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		
		for(int i = 0; i < list.size(); i++) {
			list.get(i).makeJajang();
		}
		
//		PCH_Jajangmyeon pch2 = p1;  >> 부모 타입으로 형변환 됐던 자식이 다시 자식 타입으로 되돌아 가려고 하면 오류
		// 1. p1이 PCH 출신인지 이 코드만 보고 알 수 없음
		// 2. 
		PCH_Jajangmyeon pch2 = (PCH_Jajangmyeon)p1;  // 강제형변환 : 다운캐스팅

		

		
		
		
		

	}

}
