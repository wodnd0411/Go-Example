package ch07;

public class DeckTest {

	public static void main(String[] args) {
		Deck d = new Deck(); // ī�� �� ��(Deck)�� �����.
		Card c = d.pick(0); // ���� ���� ���� ���� ī�带 �̴´�.
		System.out.println(c); // System.out.println(c.toString());�� ����
		
		d.shuffle(); // ī�带 ���´�.
		c = d.pick(0); // ���� �Ŀ� ���� ���� ī�� �̴´�.
		System.out.println(c);
	}

}
