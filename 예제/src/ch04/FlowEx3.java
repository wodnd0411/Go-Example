package ch04;

import java.util.Scanner;

public class FlowEx3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int score = 0; // �л� ����
		char grade = ' '; // �л� ����
		
		System.out.print("�л��� ������ �Է��Ͻÿ� : ");
		score = scanner.nextInt();
		
		if(score >= 90) {
			grade = 'A';
		}
		else if(score >= 80) {
			grade = 'B';
		}
		else if(score >= 70) {
			grade = 'c';
		}
		else {
			grade = 'D';
		}
		
		System.out.printf("�л��� ������ %c�Դϴ�.%n", grade);
	}

}
