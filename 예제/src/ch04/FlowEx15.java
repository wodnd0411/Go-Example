package ch04;

public class FlowEx15 {

	public static void main(String[] args) {
		// 3 6 9 ����
		for(int i = 1; i <= 100; i++) {
			System.out.print("i = " + i);
			
			// i�� for�� ��� ���ǹǷ� �ٸ� ������ ����
			int tmp = i;
			
			do {
				// tmp�� ���ڸ��� 3�� ����̸鼭 ���ڸ��� 0�ΰ� ����
				if((tmp % 10) % 3 == 0 && tmp % 10 != 0) {
					System.out.print(" ¦");
				}
			} while ((tmp /= 10) != 0);
			
			System.out.println();
		}
	}

}
