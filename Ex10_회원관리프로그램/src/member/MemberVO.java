package member;

public class MemberVO {
	// 로그인의 경우 (select 할 때)
	// 여러 정보를 한 번에 받아오고 싶을 경우
	// int, String 등 다양한 자료형의 데이터를 담을 수 있는 사용자 생성 데이터 타입을 만들어야 한다. (MemberVO)
	
	private String id;
	private String pw;
	private String nick;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	
	public MemberVO(String id, String pw, String nick) {
		this.id = id;
		this.pw = pw;
		this.nick = nick;
	}
	
	

}
