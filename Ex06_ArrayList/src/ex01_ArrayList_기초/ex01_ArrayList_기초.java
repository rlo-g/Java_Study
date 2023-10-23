package ex01_ArrayList_기초;

import java.util.ArrayList;

public class ex01_ArrayList_기초 {

	public static void main(String[] args) {
		
		
		// ArrayList를 사용해보자
		
		// 1. ArrayList 선언 및 초기화
		
		ArrayList<String> name = new ArrayList<>();    // 데이터 x일 때 : name이라는 주소칸만 생성된 상태
		
		// import 단축키 : ctrl + shift + o
		// <> : 제네릭
		// 반드시 레퍼런스형 변수만 들어갈 수 있다
		// ex_ int, float, double.. 사용 불가능 
		// String, Integer, Float... 사용 가능
		
		// Object : 상속
		// Object로 데이터를 받아서 String으로 자동 형변환 하는 중 . . .
		
		
		// 2. 데이터 추가하기 :  name.add()
		
		// 1) add(데이터 값)
		name.add("햄미");      // name이라는 주소값 안에 "햄이"가 들어간 칸이 생성됨
		name.add("멈뭄미");
		name.add("고먐미");     // 햄미, 멈뭄미 뒤로 들어가게 됨

		// 2) add(인덱스 값, 데이터 값)            <--- 오버로딩
		name.add(1, "부우");      // 부우를 1번 인덱스에 넣어주겠습니다  >> 다른 데이터들 뒤로 밀려남
		
		
		
		// 3. 데이터 가져오기
		// get(인덱스)
		name.get(1);   // 출력 기능 x >> 데이터확인 불가
		System.out.println(name.get(1));

		
		// for문을 사용해 name의 전체 데이터 출력하기
		for(int i = 0; i < name.size(); i++) {
			// ArrayList의 크기 : .size()
			System.out.print(name.get(i) + " ");
		}
		System.out.println();
		
		
		// 4. 데이터 삭제
		// 1) 선택 삭제 : remove(인덱스)
		name.remove(1);
		System.out.println(name.size());
		System.out.println(name.get(2));
		
		// 2) 전체 삭제 : clear()
		name.clear();
		System.out.println(name.size());
		
		
			
		
	}

}
