package ch04;

import java.util.Scanner;

public class Exercise4_14 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int user = 0; // ������� ��
		int com = (int)(Math.random() * 100) + 1; // 1 ~ 100 ������ ������ ��
		int count = 0; // �� ������ ������� ī��Ʈ
		
		do {
			System.out.print("1�� 100 ������ ���� �Է��Ͻÿ� : ");
			user = scanner.nextInt();
			
			count++;
			
			if(user > com) {
				System.out.println("���ڸ� ���߽ÿ�.");
			}
			else if(user < com) {
				System.out.println("���ڸ� ���̽ÿ�.");
			}
		} while (user != com);
		
		System.out.println("����� : " + user);
		System.out.println("��ǻ�� : " + com);
		System.out.println("�õ� Ƚ�� : " + count);
	}

}
