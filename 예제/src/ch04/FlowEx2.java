package ch04;

import java.util.Scanner;

public class FlowEx2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = "";
		int num = 0;
		
		System.out.print("���ڸ� �ϳ� �Է��Ͻÿ� : ");
		input = scanner.nextLine();
		
		num = Integer.parseInt(input); // input�� ������ ��ȯ
		
		if(num == 0) {
			System.out.println("�Է��Ͻ� ���ڴ� 0�Դϴ�.");
		}
		else {
			System.out.println("�Է��Ͻ� ���ڴ� 0�� �ƴմϴ�.");
		}
		
		System.out.printf("�Է��Ͻ� ���ڴ� %d�Դϴ�.%n", num);
	}

}
