package ch04;

import java.util.Scanner;

public class Exercise4_13 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String input = "";
		char ch = ' ';
		boolean isNumber = true;
		
		System.out.print("���ڿ��� �Է��Ͻÿ� : ");
		input = scanner.nextLine(); // �������� �Ǻ��ϱ� ���� ���ڿ� �Է�
		
		for(int i = 0; i < input.length(); i++) {
			ch = input.charAt(i); // �� ���ھ� ch�� ��´�
			
			// ch�� �������� �Ǻ�
			if((ch - '0') >= 0 && (ch - '0') < 10) {
				isNumber = true;
			}
			else {
				isNumber = false;
				
				break;
			}
		}
		
		if(isNumber) {
			System.out.println("�����Դϴ�.");
		}
		else {
			System.out.println("���ڰ� �ƴմϴ�.");
		}
	}

}
