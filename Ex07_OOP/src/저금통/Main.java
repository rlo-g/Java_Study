package 저금통;

public class Main {

	public static void main(String[] args) {
		
		
		// 1) 저금통 설계도를 사용해서 저금통을 1개 만들어주자
		PiggyBank pig1 = new PiggyBank(1500);
		
		
//		// 2) 저금통 초기금액을 1500원으로 설정
//		pig1.money = 1500;  // 필드를 1500원으로 설정(초기화)
		
		// 1) + 2)
		// 객체를 생성 + 필드를 초기화 ----> 새로운 생성자 만들기
		
		pig1.setMoney(2000);
		System.out.println(pig1.getMoney());
		
		// 3) 저금통에 700원을 입금 
		//   : 필드 money에 700원을 입금 >> 700원이라는 값을 기능에다가 보내줘야함
		pig1.deposit(700);
		
		
		// 4) 잔액 확인
		pig1.showMoney();
		
		
		// 5) 500원을 저금통에서 출금 
		pig1.withdraw(500);
		
		// 6) 잔액 확인
		pig1.showMoney();
		

	}

}
