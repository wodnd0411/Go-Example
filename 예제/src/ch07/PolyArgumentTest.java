package ch07;

public class PolyArgumentTest {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		
		// Product p = new MyTv();
		// b.buy(p);
		b.buy(new MyTv());
		b.buy(new MyComputer());
		
		System.out.println("현재 남은 금액은 " + b.money + "입니다.");
		System.out.println("현재 보너수 점수는 " + b.bonusPoint + "입니다.");
	}

}
