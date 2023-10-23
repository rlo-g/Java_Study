package Person;

public class Main {	
	public static void main(String[] args) {
		
		
		// Class가 실행되는 공간
		// 설꼐도를 사용해서 Object(객체)를 만드는 공간
		
		
		// 설계도의 이름 변수명 = new 설계도의 이름();
		Person p1 = new Person("햄미", 5, "여자", 15, "메이플월드");   // () : 생성자
		                         // 
		
		// . : 참조하다
		p1.name = "햄미";
		p1.age = 5;
		p1.gender = "여자";
		p1.height = 15;
		p1.local = "메이플월드";
		
		System.out.println("이름 : " + p1.name);
		System.out.println("나이 : " + p1.age);
		System.out.println("성별 : " + p1.gender);
		System.out.println("키 : " + p1.height);
		
		p1.breathe();
		p1.eat();
		p1.sleep();
		
		System.out.println();
		
		// 설계도를 하나 만들어 놓으면 여러개의 객체를 생성할 수 있다!!
		// 짝꿍의 이름, 나이, 성별, 키, 거주지 입력
		// 설계도 Person을 사용해서 p2 만듣기
		
		Person p2 = new Person();
		
		p2.name = "허연지";
		p2.age = 27;
		p2.gender = "여자";
		p2.height = 160;
		p2.local = "양산동";
		System.out.println("이름 : " + p2.name);
		System.out.println("나이 : " + p2.age);
		System.out.println("성별 : " + p2.gender);
		System.out.println("키 : " + p2.height);
		System.out.println("거주지 : " + p2.local);
		
		
		// p1과 p2의 주소는 서로 다르다!!
		// 레퍼런스형 객체형 변수... > heap 메모리...
		// static ~ 정적 메모리 영역
		
		
	


	}

}
