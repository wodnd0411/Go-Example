package ch07;

public class Deck {
	
	final int CARD_NUM = 52; // 카드의 갯수
	Card[] cardArr = new Card[CARD_NUM]; // Card객체 배열을 포함 관계
	
	// Deck의 카드를 초기화
	Deck() {
		int i = 0;
		
		for(int k = Card.KIND_MAX; k > 0; k--) {
			for(int n = 0; n < Card.NUM_MAX; n++) {
				cardArr[i++] = new Card(k, n + 1);
			}
		}
	}
	
	// 지정된 위치(index)에 있는 카드 하나 꺼내서 반환
	Card pick(int index) {
		return cardArr[index];
	}
	
	// Deck에서 임의의 카드 하나를 선택
	Card pick() {
		int index = (int)(Math.random() * CARD_NUM); // 0 ~ 51
		
		return pick(index);
	}
	
	// 카드 섞기
	void shuffle() {
		for(int i = 0; i < cardArr.length; i++) {
			int r = (int)(Math.random() * CARD_NUM);
			
			Card tmp = cardArr[i];
			cardArr[i] = cardArr[r];
			cardArr[r] = tmp;
		}
	}

}
