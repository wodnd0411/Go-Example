package ch03;
import java.util.Scanner;

public class OperatorEx32 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input = 0;
		int absInput = 0;
		
		System.out.print("������ ���� ������ �Է��Ͻÿ� : ");
		input = scanner.nextInt();
		
		absInput = (input >= 0) ? input : -input;
		System.out.printf("�Է��� ���� ������ %d�Դϴ�.%n", absInput);
	}

}
