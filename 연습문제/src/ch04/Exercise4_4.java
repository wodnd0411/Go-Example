package ch04;

public class Exercise4_4 {

	public static void main(String[] args) {
		int num = 0;
		int sum = 0;
		
		do {
			num++;
			
			if(num % 2 == 0) {
				sum -= num;
			}
			else {
				sum += num;
			}
		} while (sum < 100);
		
		System.out.printf("%d���� ���ϸ� ������ 100�̻��� �ȴ�(���� : %d).%n", num, sum);
	}

}
