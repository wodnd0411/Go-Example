package ch07;

public class Card {
	
	static final int KIND_MAX = 4; // 카드 무늬의 수
	static final int NUM_MAX = 13; // 무늬별 카드 수
	
	static final int SPADE = 4;
	static final int DIAMOND = 3;
	static final int HEART = 2;
	static final int CLOVER = 1;
	
	int kind;
	int number;
	
	Card() {
		this(SPADE, 1);
	}
	
	Card(int kind, int number) {
		this.kind = kind;
		this.number = number;
	}
	
	// 참조 변수의 출력 or 덧셈 연산자를 이용한 참조 변수와 문자열의 결합에는 자동으로 toString() 호출
	public String toString() {
		String[] kinds = {"", "CLOVER", "HEART", "DIAMOND", "SPADE"};
		String numbers = "0123456789XJQK"; // 숫자 10은 X로 표현
		
		return "kind : " + kinds[this.kind] + ", number : " + numbers.charAt(this.number); 
	}

}
