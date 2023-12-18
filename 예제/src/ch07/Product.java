package ch07;

public class Product {

	int price; // 제품 가격
	int bonusPoint; // 제품 구매 시 제공하는 보너스 점수
	
	Product() {
		price = 0;
		bonusPoint = 0;
	}
	
	Product(int price) {
		this.price = price;
		this.bonusPoint = (int)(price * 0.1);
	}
	
}

class MyTv extends Product {
	
	MyTv() {
		// 부모 클래스의 생성자 Product(int price)를 호출
		super(100); // Tv의 가격을 100으로 지정
	}
	
	// Object 클래스의 toString을 오버라이딩
	public String toString() {
		return "Tv";
	}
	
}

class MyComputer extends Product {
	
	MyComputer() {
		super(200);
	}
	
	public String toString() {
		return "Computer";
	}
	
}

class MyAudio extends Product {
	
	MyAudio() {
		super(50);
	}
	
	public String toString() {
		return "Audio";
	}
	
}