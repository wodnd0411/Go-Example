package ch04;

public class Exercise4_2 {

	public static void main(String[] args) {
		int sum = 0;
		
		for(int i = 1; i <= 20; i++) {
			// 2�� ����� 3�� ����� �ƴ� ��
			if(i % 2 != 0 && i % 3 != 0) {
				sum += i;
			}
		}
		
		System.out.printf("1���� 20���� 2 �Ǵ� 3�� ����� �ƴ� ���� ���� : %d%n", sum);
	}

}
