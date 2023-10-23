package 책관리프로그램;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// 객체 배열
		// 자료형[] 레퍼런스 변수명 = new 자료형[배열의 크기];   >> 자료형은 여러 자료형이 담겨있는 클래스 이름
		
		// BookData 자료형을 가진 변수들만 저장할 수 있다
		BookData[] bookList = new BookData[5];  // 각각 bookdata 자료형으로 묶인 채로 bookList에 저장됨
		
		// b1은 BookData 자료형을 가진 상태
		BookData b1 =  new BookData("Java", 21000, "홍길동"); // BookData라는 자료형을 가진 b1. b1 안에 들어있는 필드 : title, price, writer 
		
//		// 객체배열에 값을 대입
		bookList[0] = b1;
//		// b1과 같은 공간 안에 서로 다른 자료인 BookData(string, price, title)이 저장됨
//		// 북데이터 자료형을 가진 b1을 넣을 수 ㅇㅆ다..
//		
//		System.out.println(bookList[0]); // b1에 대한 title.price.writer가 저장되어 있는 주소값
////		
        // 데이터를 접근하기 위해서는 get 사용
//		System.out.println(bookList[0].getTitle());
		
		
		
		// 북데이터 자료형을 관리하는 배열에 들어갈 데이터 만들기
		
		// 1) b2~b5 만들기
		BookData b2 = new BookData("C++", 29000, "박문수");
		BookData b3 = new BookData("Database", 31000, "김장독");
		BookData b4 = new BookData("Android", 18000, "이순신");
		BookData b5 = new BookData("Web", 26000, "김철수");
		
		
		// 2) b1~b5를 배열에 저장하기
		bookList[1] = b2;
		bookList[2] = b3;
		bookList[3] = b4;
		bookList[4] = b5;
		
		
		// 3) 배열 안에 들어있는 값들에 접근하는 방법을 사용하여
		// 사용자로부터 입력받은 금액으로 구매할 수 있는 책의 정보 출력하기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("금액을 입력하세요 : ");
		int money = sc.nextInt();
		
		System.out.println("구매 가능한 책 목록");
		
		// bookList에 저장되어있는 책 중에서 가격이 입력 받은 값보다 작은 것들을 출력
		for(int i = 0; i < bookList.length; i++) {
			if(money >= bookList[i].getPrice()) {
				// 사용자가 입력한 가격과 bookList에 들어있는 가격들을 비교
				System.out.println("[" + bookList[i].getTitle() + ", " +
			bookList[i].getWriter() + ", " + bookList[i].getPrice() + "원]");
				
			}
		}
	
		
		

	}}		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		