package ch04;

import java.util.Scanner;

public class Exercise4_15 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String input = "";
		char tmp1 = ' ';
		char tmp2 = ' ';
		boolean isPalindrome = true; // ȸ���� true false
		
		System.out.print("���ڿ��� �Է��Ͻÿ� : ");
		input = scanner.nextLine();
		
		for(int i = 0; i < input.length(); i++) {
			tmp1 = input.charAt(i); // ù��° ���ں���
			tmp2 = input.charAt(input.length() - 1 - i); // ������ ���ں���
			
			if(tmp1 != tmp2) {
				isPalindrome = false;
			}
		}
		
		if(isPalindrome) {
			System.out.println(input + "�� ȸ���� �Դϴ�.");
		}
		else {
			System.out.println(input + "�� ȸ������ �ƴմϴ�.");
		}
	}

}
