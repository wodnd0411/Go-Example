package ch05;

import java.util.Scanner;

// �Ž��� �� ����
// �Ž��� ���� ������ ���� ��
public class Exercise5_6 {

	public static void main(String[] args) {
		int[] coinUnit = {500, 100, 50, 10}; // ���� ����
		int money = 0;
		int moneyCount = 0; // ���� ����
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("�󸶸� �޾ҽ��ϱ�? : ");
		money = scanner.nextInt();
		
		for(int i = 0; i < coinUnit.length; i++) {
			moneyCount = money / coinUnit[i];
			money %= coinUnit[i];
//			money -= coinUnit[i] * moneyCount;
			
			System.out.println(coinUnit[i] + ": " + moneyCount + "��");
		}
	}

}
