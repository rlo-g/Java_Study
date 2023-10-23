package 학점관리프로그램;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		// Student 객체를 담을 수 있는 ArrayList 생성
		ArrayList<Student> studentList = new ArrayList<>(); 
		
		
		System.out.println("============= 학점 관리 프로그램 ============");
		
		while(true) {
			System.out.print("[1]성적입력 [2]전체조회 [3]학생검색 [4]프로그램 종료 >> ");
			int select = sc.nextInt();
			
			if(select == 1) {
				// 성적 입력
				System.out.print("이름 : ");
				String name = sc.next();
				
				System.out.print("학번 : ");
				String number = sc.next();
				
				System.out.print("Java 점수 : ");
				int scoreJava = sc.nextInt();
				
				System.out.print("Web 점수 : ");
				int scoreWeb = sc.nextInt();
				
				System.out.print("Android 점수 : ");
				int scoreAndroid = sc.nextInt();
				
				System.out.println();
				
				// 입력받은 정보를 저장할 배열 생성
				Student s = new Student(name, number, scoreJava, scoreWeb, scoreAndroid);
				
				// 생성한 배열을 ArrayList에 추가
				studentList.add(s);
				
				
			}else if(select == 2) {
				// 전체 조회
				System.out.println("================== 전체 조회 =================");
				System.out.println("이름\t학번\tJava\tAndroid\tWeb");
				
				for(int i = 0; i < studentList.size(); i++) {
					if(studentList.size() == 0) {
						System.out.println("조회 할 데이터가 없습니다.");
						break;
					}
					System.out.println(studentList.get(i).getName() + "\t" + studentList.get(i).getNumber() + "\t"
							+ studentList.get(i).getScoreJava() + "\t" + studentList.get(i).getScoreAndroid() + "\t"
							+ studentList.get(i).getScoreWeb());
				}
				
			}else if(select == 3) {
				
				
			}else if(select == 4) {
				// 프로그램 종료
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			System.out.println("=======================================");
		}

	}

}
