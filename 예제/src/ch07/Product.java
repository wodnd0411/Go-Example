package ch07;

public class Product {

	int price; // ��ǰ ����
	int bonusPoint; // ��ǰ ���� �� �����ϴ� ���ʽ� ����
	
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
		// �θ� Ŭ������ ������ Product(int price)�� ȣ��
		super(100); // Tv�� ������ 100���� ����
	}
	
	// Object Ŭ������ toString�� �������̵�
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