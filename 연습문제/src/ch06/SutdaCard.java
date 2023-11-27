package ch06;

// Exercise6_1
public class SutdaCard {

	int num; // ī�� ����(1 ~ 10)
	boolean isKwang; // ���̸� true, �ƴϸ� false
	
	SutdaCard() {
		this(1, true);
	}
	
	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	
	String info() {
		String kwang = "";
		
		if(isKwang) {
			kwang = "K";
		}
		else {
			kwang = "";
		}
		
		return num + kwang;
	}
	
}
