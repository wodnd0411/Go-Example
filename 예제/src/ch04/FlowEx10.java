package ch04;

import java.util.Scanner;

public class FlowEx10 {

	public static void main(String[] args) {
		// ���� �̿��� �����ﰢ�� ���
		Scanner scanner = new Scanner(System.in);
		int num = 0;
		
		System.out.print("*�� ����� ������ ���� �Է��Ͻÿ� : ");
		num = scanner.nextInt();
		
		for(int i = 0; i < num; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}

}
