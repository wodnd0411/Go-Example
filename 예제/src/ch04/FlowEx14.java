package ch04;

import java.util.Scanner;

public class FlowEx14 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input = 0;
		int answer = 0;
		
		answer = (int)(Math.random() * 100) + 1; // 1�� 100������ ������ �� ����
		
		do {
			System.out.print("1�� 100������ ������ �Է��Ͻÿ� : ");
			String tmp = scanner.nextLine();
			input = Integer.parseInt(tmp);
			
			if(answer > input) {
				System.out.println("�� ū ���� �Է��Ͻÿ�.");
			}
			else if(answer < input) {
				System.out.println("�� ���� ���� �Է��Ͻÿ�.");
			}
		} while (input != answer);
		
		System.out.println("�����Դϴ�.");
	}

}
