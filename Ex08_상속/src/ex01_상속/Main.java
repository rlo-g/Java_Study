package ex01_상속;

public class Main {

	public static void main(String[] args) {
		
		/* <상속>
		 * : 부모 클래스의 코드를 자식 클래스에서 물려받아 사용하는 것
		 *    > 예외
		 *     : 메서드나 필드 앞에 private라고 되어있으면 물려받지 못한다!
		 *     : 클래스명 앞에 final이라고 적혀있으면 이 클래스는 최종 수정이 안 되는 클래스를 의미한다 > 상속 불가능!!
		 *     
		 * 프로그래밍에서는 상속을 단순히 물려받는 것에 그치는 게 아니라
		 * 물려받은 후 자식 클래스에 특성에 맞게 확장시키는 개념으로 생각한다
		 *
		 * 자바에 상속 시 extends라는 키워드를 사용
		 * 
		 * 부모 클래스 : Super Class
		 * 자식 클래스 : Sub Class
		 * 
		 * <상속의 특징>
		 * 1. 동시에 두개 이상의 상속을 받을 수 없다.
		 * 2. 여러번 걸쳐서 상속을 해주는 것은 가능하다. (a < b < c < d < e 상속)
		 * 3. 모든 클래스는 최상위 부모로 Object 클래스를 가지게 된다.
		 * 
		 **/
		
		Animal a = new Animal();
		a.swimming();
		
		cat c = new cat();
		c.swimming(); 
		// cat이라는 클래스는 Animal 클래스에게 상속 받았기 때문에 swimming()을 물려받아 사용할 수 있음
		
		
		
		
	}

}
