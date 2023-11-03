package ch05;

// Ŀ�ǵ�������κ��� �ݾ��� �Է¹޴´�
// ������ ������ ������ �Ž��� ���� ����
// �Ž��� �� ���� �����ϸ� "�Ž��� ���� �����մϴ�" ���
public class Exercise5_7 {
	
	public static void main(String[] args) {
		// Ŀ�ǵ������ 0�� ��
		if(args.length != 1) {
			System.out.println("USAGE : java Exercise5_7 3120");
			System.exit(0); // ���α׷� ����
		}
		
		// �Է��� ���ڿ��� ���ڷ� ��ȯ
		int money = Integer.parseInt(args[0]);
		
		System.out.println("money = " + money);
		
		int[] coinUnit = {500, 100, 50, 10}; // ���� ����
		int[] coin = {5, 5, 5, 5}; // ������ ���� ���� ����
		
		for(int i = 0; i < coinUnit.length; i++) {
			int coinNum = 0; // ������ ����, ������ �Ѿ�� ���� ������ ����
			coinNum = money / coinUnit[i];
			
			// ����� ������ ���� ��
			if(coin[i] >= coinNum) {
				coin[i] -= coinNum;
			}
			// ����� ������ ������ �迭 coin�� �ִ� ��ŭ�� ����
			else {
				coinNum = coin[i];
				coin[i] = 0;
			}
			
			// money - (���� ���� * ���� ����)
			money = money - (coinUnit[i] * coinNum);
			
			System.out.println(coinUnit[i] + "�� : " + coinNum + "��");
		}
		
		// �Ž��� ���� ������ �ܵ��� ���� ���
		if(money > 0) {
			System.out.println("�Ž��� ���� �����մϴ�.");
			System.exit(0); // ���α׷� ����
		}
		
		System.out.println("=���� ������ ����=");
		for(int i = 0; i < coinUnit.length; i++) {
			System.out.println(coinUnit[i] + "�� : " + coin[i] + "��");
		}
	}

}
