package 학생정보관리프로그램;

public class Student {
	
	// 학생 정보 관리 프로그램에 대한 설계도
	
	
	
	// 1. 필드 : 캡슐화 하기 (private로 감싸기)
	private String name;
	private String number;
	private int age;
	private int scoreJava;
	private int scoreWeb;
	private int scoreAndroid;
	
	// private : 클래스 내부에 메서드를 통해서만 접근이 가능
	// 내부에 getter/setter 생성 (데이터의 무결성, 정확성, 일관성을 지켜주기 위해 사용)
	// : setter 사용은 지양
	
	
	
	// 2. 생성자
	public Student(String name, String number, int age, int scoreJave, int scoreWeb, int scoreAndroid) {
		// main으로부터 받아온 매개변수를 현재 필드에 대입
		this.name = name;
		this.number = number;
		this.age = age;
		this.scoreJava = scoreJava;
		this.scoreWeb = scoreWeb;
		this.scoreAndroid = scoreAndroid;
	}
	
	
	// 3. 메서드 show() : 출력하는 기능
	public void show() {
		System.out.println(name + "님 안녕하세요.");
		System.out.println("[ " + number + ", " + age + "살 ]");
		System.out.println(name + "님의 Java 점수는 " + scoreJava + "점 입니다.");
		System.out.println(name + "님의 Web 점수는 " + scoreWeb + "점 입니다.");
		System.out.println(name + "님의 Android 점수는 " + scoreAndroid + "점 입니다.");
		System.out.println("=============================================");
	}
	
	
	// getter/setter
	// getter : 데이터를 가져와서 확인할 수 있도록 도와주는 메서드
	public String getName() {
		return name;
	}
	
	// setter : 데이터를 수정할 수 있도록 도와주는 메서드
	public void setName(String name) {
		this.name = name;
	}

	// 자동완성 단축키 alt + shift + s > generate g and s..
	public String getNumber() {
		return number;
	}


	public void setNumber(String number) {
		this.number = number;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public int getScoreJava() {
		return scoreJava;
	}


	public void setScoreJava(int scoreJava) {
		this.scoreJava = scoreJava;
	}


	public int getScoreWeb() {
		return scoreWeb;
	}


	public void setScoreWeb(int scoreWeb) {
		this.scoreWeb = scoreWeb;
	}


	public int getScoreAndroid() {
		return scoreAndroid;
	}


	public void setScoreAndroid(int scoreAndroid) {
		this.scoreAndroid = scoreAndroid;
	}
	
	
	

}
