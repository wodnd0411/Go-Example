package ch04;

import java.util.Scanner;

public class FlowEx5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int month = 0;
		
		System.out.print("���� ���� �Է��Ͻÿ� : ");
		month = scanner.nextInt();
		
		switch(month) {
			case 3:
			case 4:
			case 5:
				System.out.println("������ ������ ���Դϴ�.");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println("������ ������ �����Դϴ�.");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println("������ ������ �����Դϴ�.");
				break;
			case 12:
			case 1:
			case 2:
				System.out.println("������ ������ �ܿ��Դϴ�.");
				break;
			default :
				System.out.println("�߸��� ���Դϴ�.");
					
		}
	}

}
