package ch03;

import java.util.Scanner;

public class Exercise3_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int itemNum = 0; //���� ��
		int box = 0; // �ٱ��� ��
		
		System.out.print("���� ������ �Է��Ͻÿ�(1�ڽ��� 10����). : ");
		itemNum = scanner.nextInt();
		
		while(itemNum < 0) {
			System.out.print("������ �˸°� �Է��Ͻÿ�.(only ���)");
			itemNum = scanner.nextInt();
		}
		
		// itemNum > 0
//		if(itemNum % 10 == 0) {
//			box = itemNum / 10;
//			System.out.println("�ڽ��� ���� : " + box);
//		}
//		else {
//			box = (itemNum / 10) + 1;
//			System.out.println("�ڽ��� ���� : " + box);
//		}
		box = (itemNum / 10) + ((itemNum % 10 > 0) ? 1 : 0);
		System.out.println("�ڽ��� ���� : " + box);
	}

}
