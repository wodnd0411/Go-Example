package ch03;
import java.util.Scanner;

public class OperatorEx25 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char ch = ' ';
		
		System.out.print("���� �ϳ��� �Է��Ͻÿ� : ");
		
		String input = scanner.nextLine();
		ch = input.charAt(0); // input���� ù��° ���ڸ� ����
		
		if(ch >= '0' && ch <= '9') {
			System.out.printf("�Է��Ͻ� ���ڴ�'%c'�̰� �����Դϴ�.%n", ch);
		}
		
		if(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
			System.out.printf("�Է��Ͻ� ���ڴ�'%c'�̰� �������Դϴ�.%n", ch);
		}
	}

}
