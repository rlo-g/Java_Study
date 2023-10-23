package 일차원배열;

public class ex01_배열기초 {

	public static void main(String[] args) {
		// 배열: '같은 타입의 데이터'를 관리하기 위해 사용하는 자료 구조
		
		// 1. 인덱스로 이루어진 자료구조
		// 2. 순차적 접근이 가능한 자료구조
		
		// 학생 세명의 이름을 저장하자!
		String stu1 = "송은지";
		String stu2 = "박은희";
		String stu3 = "조효인";
		
		// 따로따로 저장된 변수들은 순차적으로 접근이 불가능함
//		for (int i = 1; i <= 3; i++) {
//			System.out.println(stu+i);  // 오류
		
		
		// 이름이라는 같은 타입의 데이터를 하나로 관리할 수 있는 배열
		// 1. 배열 선언 방법
		// 자료형[] 배열명 = new 자료형[배열의 크기];
		// + 배열은 선언 및 생성을 할 때 크기가 정해져 있다 (뒷쪽에서 크기 변경 불가)
		String[] stu = new String[3];
		// stu라는 주소값을 가진 변수 생성 > 방 세 칸짜리 배열을 만듦
		// 배열의 크기는 선언 및 생성을 할 때 정해짐
		
		
		
		System.out.println(stu);  // 세칸짜리 공간이 저장되어 있는 주소값
		stu[0] = "송은지";  // 자료를 0번재 방에 넣어주겠습니다.
		stu[1] = "박은희";
		stu[2] = "조효인";
		System.out.println(stu[0]);
		
		// stu[3] = "방가영";  >> 3번 인덱스 값은 존재하지 않음
		// syntax Error : 빨간줄 (문법적으로 치명적인 오류)
		// Exception  : 실행을 시켜야 확인할 수 있는 오류
		
		
		// 인덱스 값을 사용해서 세명의 이름을 for문을 통해 출력
		for (int i = 0; i <= 2; i++) {           // i < 3
			System.out.println(stu[i]);
		}
		
		// 2. 배열의 크기 : 배열명.length
	    System.out.println("배열의 크기 :" + stu.length);
	    
	    // 인덱스 값에 접근을 할 때 :  '0'부터 '배열크기-1'까지'
	   
	    // 배열을 만드는 방법2
	    String[] office = {"송은지", "조효인", "박은희","구루미"};  // 적어준 순서대로 인덱스 갑세 배열됨
	    // + 배열을 만드는 2번재 방법도 아래쪽에서 크기 변경은 불가능하다
	    // 바꾸고 싶으면 선언 및 초기화 하는 곳에 와서 변경을 해야한다.
	    // 변경 시 안에 있는 데이터가 초기화 된다 ~사라졌다가 다시 입력된다~
	    
	    for(int i = 0; i < office.length; i++) {
	    	// i : 0~4 (다섯번 반복)
	    	System.out.println(office[i]);
	    }
	    
			
		}
		

	}


