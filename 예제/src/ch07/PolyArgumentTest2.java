package ch07;

public class PolyArgumentTest2 {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		
		b.buy(new MyTv());
		b.buy(new MyComputer());
		b.buy(new MyAudio());
		
		b.summary();
	}

}
