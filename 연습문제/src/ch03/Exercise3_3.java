package ch03;

import java.util.Scanner;

public class Exercise3_3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input = 0;
		
		String result = "";
		
		System.out.print("���ڸ� �Է��Ͻÿ� : ");
		input = scanner.nextInt();
		
		result = (input > 0) ? "���" : ((input == 0) ? "0" : "����");
		System.out.println(result);
	}

}
