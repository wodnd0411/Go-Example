package ch03;

import java.util.Scanner;

public class Exercise3_5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input = 0;
		
		int result = 0;
		
		System.out.print("������ �Է��Ͻÿ� : ");
		input = scanner.nextInt();
		
		result = input / 10; // ���� �ڸ� ���� ������ ����
		
		System.out.println(result * 10 + 1);
	}

}
