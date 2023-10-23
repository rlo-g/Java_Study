package 뮤직플레이어;

public class Music {
	
	// 노래정보: 1.가수명(String) 2.노래제목(String) 3.발매년도(int) 4.시간(int) 5.경로
	
	// 필드
	private String singer;
	private String title;
	private int year;
	private int time;
	private String path;
	
	
	// private에 따른 getter/setter 메서드
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	
	// 메서드 오버로딩 - 동일한 이름의 메서드를 정의하는 방법
	// 하는 이유? - 획일화
	// 1. 매개변수 개수가 다를 때
	// 2. 매개변수의 데이터 타입이 다를 때
	// >> 둘 중 하나만 만족하면 사용 가능
	
	
	// 사용자 정의 생성자
	public Music(String singer, String title, int year, int time, String path) {
		this.singer = singer;
		this.title = title;
		this.year = year;
		this.time = time;
		this.path = path;
	}
    // 단축키 : alt + shift + s > generate constructor using...
}
