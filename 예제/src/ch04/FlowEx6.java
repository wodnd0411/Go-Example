package ch04;

import java.util.Scanner;

public class FlowEx6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int user = 0;
		int com = (int)(Math.random() * 3); // 0, 1, 2
		
		System.out.print("����(0), ����(1), ��(2) �� �ϳ��� �Է��Ͻÿ� : ");
		user = scanner.nextInt();
		
		System.out.println("����� " + user + "�Դϴ�");
		System.out.println("��ǻ�ʹ� " + com + "�Դϴ�");
		
		switch(user - com) {
			case -2:
			case 1:
				System.out.println("����� �̰���ϴ�.");
				break;
			case -1:
			case 2:
				System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
				break;
			case 0:
				System.out.println("�����ϴ�.");
		}
	}

}
