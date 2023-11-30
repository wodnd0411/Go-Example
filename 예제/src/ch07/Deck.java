package ch07;

public class Deck {
	
	final int CARD_NUM = 52; // ī���� ����
	Card[] cardArr = new Card[CARD_NUM]; // Card��ü �迭�� ���� ����
	
	// Deck�� ī�带 �ʱ�ȭ
	Deck() {
		int i = 0;
		
		for(int k = Card.KIND_MAX; k > 0; k--) {
			for(int n = 0; n < Card.NUM_MAX; n++) {
				cardArr[i++] = new Card(k, n + 1);
			}
		}
	}
	
	// ������ ��ġ(index)�� �ִ� ī�� �ϳ� ������ ��ȯ
	Card pick(int index) {
		return cardArr[index];
	}
	
	// Deck���� ������ ī�� �ϳ��� ����
	Card pick() {
		int index = (int)(Math.random() * CARD_NUM); // 0 ~ 51
		
		return pick(index);
	}
	
	// ī�� ����
	void shuffle() {
		for(int i = 0; i < cardArr.length; i++) {
			int r = (int)(Math.random() * CARD_NUM);
			
			Card tmp = cardArr[i];
			cardArr[i] = cardArr[r];
			cardArr[r] = tmp;
		}
	}

}
