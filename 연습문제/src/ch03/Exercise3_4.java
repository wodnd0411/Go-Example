package ch03;

import java.util.Scanner;

public class Exercise3_4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input = 0;
		
		int result = 0;
		
		System.out.print("���� �ڸ� ������ �Է��Ͻÿ� : ");
		input = scanner.nextInt();
		
		result = (input / 100) * 100; // ���� �ڸ��� �̾Ƽ� ���
		
		System.out.println(result);
	}

}
