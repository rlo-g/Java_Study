package 상품관리프로그램;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 입력한 제품 정보를 담아줄 리스트 생성하기
		ArrayList<Product> list = new ArrayList<>();    // Product라는 객체는 각각의 자료형이 묶여있는 자료형
		
		
		while(true) {
			System.out.print("[1]물건 추가  [2]예상 판매량 조회  [3]종료 >> ");
			int select = sc.nextInt();
		
				
			if(select == 3) {
				System.out.println("프로그램 종료");
				break;
					
					
			}else if(select == 1) {
						
				System.out.print("물건 이름 : ");
				String name = sc.next();
										
				System.out.print("단가 : ");
				int unitPrice = sc.nextInt();
					
				System.out.print("수량 : ");
				int amount = sc.nextInt();
					
				System.out.println();
				
				// Product 객체를 저장할 배열 생성
				
				Product p = new Product(name, unitPrice, amount);  // 입력한 정보들을 차곡차곡 넣아주기 위해 while문에 앞서 ArrayList 사용
				list.add(p); // ArrayList에 배열 p를 추가한다
				
				
					
				
			}else if(select == 2) {
				System.out.println("제품명\t단가\t수량");
				
				int sum = 0;
				
				for(int i = 0; i < list.size(); i++) {
					System.out.println(list.get(i).getName() + "\t" + list.get(i).getUnitPrice() + "\t" + list.get(i).getAmount());
	
				    sum += list.get(i).getUnitPrice() * list.get(i).getAmount(); 
					}

			    System.out.println("판매 시 매출 : " + sum);
					
			}else {
				System.out.println("다시 입력해주세요.");
				
			}
			}
	 		}
			
		}




