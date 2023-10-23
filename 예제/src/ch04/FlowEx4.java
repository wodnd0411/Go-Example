package ch04;

import java.util.Scanner;

public class FlowEx4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int score = 0; // 학생 점수
		char grade = ' '; // 학생 학점
		char opt = ' '; // + -
		
		System.out.print("학생의 점수를 입력하시오 : ");
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
			System.out.printf("학생의 학점은 %c입니다.%n", grade);
		}
		else {
			System.out.printf("학생의 학점은 %c%c입니다.%n", grade, opt);
		}
	}

}
