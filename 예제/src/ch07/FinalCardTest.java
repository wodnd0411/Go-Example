package ch07;

public class FinalCardTest {

	public static void main(String[] args) {
		Card2 c = new Card2("HEART", 10);
//		c.NUMBER = 5; // NUMBER�� ����� �� ����Ұ�
		
		System.out.println(c.KIND);
		System.out.println(c.NUMBER);
		System.out.println(c);
	}

}

class Card2 {
	
	// ������� ����� �Բ� �ʱ�ȭ���� �ʰ� �����ڷ� �� �� ���� �ʱ�ȭ ����
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