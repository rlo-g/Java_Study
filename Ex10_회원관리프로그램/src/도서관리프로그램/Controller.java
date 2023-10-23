package 도서관리프로그램;

import java.util.ArrayList;

public class Controller {
	
	// View랑 Model(DAO)가 소통할 수 있는 중간다리 역할
	
	// view가 보내준 내용을 model로
	// 결과값을 받아서 view로
	
	// [1]도서등록 : Main에서 보내준 VO를 받아서 DAO로 보내주는 역할
	public void insert(BookVO vo) {
		// 매개변수로 BookVo 자료형인 vo를 받아온다
		// 받아온 것을 그대로 DAO로 보내준다
		// DAO에 있는 메서드 insert 이용
		// main으로 받아온 vo를 dao로 보내준다
		// 출력기능이므로 void
		BookDAO dao = new BookDAO();
		int row = dao.insert(vo);  // DAO에서 vo 값을 받아와서 판단함 (main에서 보여질 결과값)
		if(row > 0) {
			System.out.println("도서등록 성공!");
		}else {
			System.out.println("도서등록 실패...");
		}

	}
	
	// [2]도서조회
	public void select() {
		
		// BookDAO한테 받아오기 위해 객체 생성
		BookDAO dao = new BookDAO();
		
		// 테이블 데이터를 결과값으로 받아옴
		// 타입을 관리하는 변수에 결과값을 담아줌
		ArrayList<BookVO> bookList = dao.select();
		
		for(int i = 0; i < bookList.size(); i++) {
			System.out.print(bookList.get(i).getTitle() + "\t");
			System.out.print(bookList.get(i).getName() + "\t");
			System.out.print(bookList.get(i).getPrice() + "\t");
			System.out.print(bookList.get(i).getNum() + "\t");
			
			System.out.println();
			
		}

	}
	
	
	// [3]도서검색
	public void selectOne(BookVO vo) {
		// private로 감싸진 자료형...
		
		// 매개변수로 String title 쓸 경우 :main에서 보내준 title을 받는다
		// DAO에서 값을 받아올 것이므로 매개변수 title
		
		
		// 사용자로부터 받아온 vo를 dao에 넘겨줄 것.
		
		BookDAO dao = new BookDAO();
		
		// main에서 입력 받은 vo를 DAO의 selectOne에 넣어 실행한 결과값을 BookVO형의 변수 vo에 담아준다
		vo = dao.selectOne(vo);
		
	
		System.out.println(vo.getTitle() + "\t" + vo.getName() + "\t" + vo.getPrice() + "\t" + vo.getNum());
		
		;

	}
	
	
	

}
