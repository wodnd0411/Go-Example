package ch06;

// ������ �ڵ忡 ���ǵ� �������� �������� �����ض�
public class Exercise6_8 {

	public static void main(String[] args) {
		PlayingCard card = new PlayingCard(1, 1);
	}

}

class PlayingCard {
	
	int kind;
	int num;
	
	static int width;
	static int height;
	
	PlayingCard() {
		this(0, 0);
	}
	
	PlayingCard(int k, int n) {
		kind = k;
		num = n;
	}
	
}

// Ŭ���� ���� : width, height
// �ν��Ͻ� ���� : kind, num
// ���� ���� : k, n, args, card