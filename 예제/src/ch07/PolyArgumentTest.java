package ch07;

public class PolyArgumentTest {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		
		// Product p = new MyTv();
		// b.buy(p);
		b.buy(new MyTv());
		b.buy(new MyComputer());
		
		System.out.println("���� ���� �ݾ��� " + b.money + "�Դϴ�.");
		System.out.println("���� ���ʼ� ������ " + b.bonusPoint + "�Դϴ�.");
	}

}
