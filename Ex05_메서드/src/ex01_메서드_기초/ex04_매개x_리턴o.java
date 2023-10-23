package ex01_메서드_기초;

public class ex04_매개x_리턴o {

	public static void main(String[] args) {
		
		// 매개변수 없고, 리턴타입이 있는 (로직 안에 return 키워드 작성)
		// 전달인자는 없고, 리턴타입 자리에 데이터 타입이 명시되어 있는 메서드
		
		// getName() > 출력문 안에 넣고 실행 시 내 이름이 보여지게 만들자!
		
		System.out.println(getName());
		
		
		

	}
	public static String getName() {
		return "송은지";
	}

}
