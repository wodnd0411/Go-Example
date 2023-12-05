package ch07;

public class FinalCardTest {

	public static void main(String[] args) {
		Card2 c = new Card2("HEART", 10);
//		c.NUMBER = 5; // NUMBER는 상수라서 값 변경불가
		
		System.out.println(c.KIND);
		System.out.println(c.NUMBER);
		System.out.println(c);
	}

}

class Card2 {
	
	// 상수지만 선언과 함께 초기화하지 않고 생성자로 단 한 번만 초기화 가능
	final String KIND;
	final int NUMBER;
	
	static int width = 100;
	static int height = 200;
	
	Card2() {
		this("HEART", 1);
	}
	
	Card2(String kind, int number) {
		KIND = kind;
		NUMBER = number;
	}
	
	public String toString() {
		return KIND + " " + NUMBER;
	}
	
}