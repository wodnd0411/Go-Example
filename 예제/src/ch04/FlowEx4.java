package ch04;

import java.util.Scanner;

public class FlowEx4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int score = 0; // �л� ����
		char grade = ' '; // �л� ����
		char opt = ' '; // + -
		
		System.out.print("�л��� ������ �Է��Ͻÿ� : ");
		score = scanner.nextInt();
		
		if(score >= 90) {
			grade = 'A';
			
			if(score >= 98) {
				opt = '+';
			}
			else if(score < 94) {
				opt = '-';
			}
		}
		else if(score >= 80) {
			grade = 'B';
			
			if(score >= 88) {
				opt = '+';
			}
			else if(score < 84) {
				opt = '-';
			}
		}
		else if(score >= 70) {
			grade = 'C';
			
			if(score >= 78) {
				opt = '+';
			}
			else if(score < 74) {
				opt = '-';
			}
		}
		else {
			grade = 'D';
		}
		
		if(opt == ' ') {
			System.out.printf("�л��� ������ %c�Դϴ�.%n", grade);
		}
		else {
			System.out.printf("�л��� ������ %c%c�Դϴ�.%n", grade, opt);
		}
	}

}
