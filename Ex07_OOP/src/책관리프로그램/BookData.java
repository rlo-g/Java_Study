package 책관리프로그램;

public class BookData {
	
	// 1. 필드
	
	private String title;
	private int price;
	private String writer;
	
	
	// 2. 메서드
	public BookData(String title, int price, String writer) {
		this.title = title;
		this.price = price;
		this.writer = writer;
	}
	
	// getter/setter
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}

}

