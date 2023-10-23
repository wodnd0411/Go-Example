package ch04;

import java.util.Scanner;

public class FlowEx3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int score = 0; // 학생 점수
		char grade = ' '; // 학생 학점
		
		System.out.print("학생의 점수를 입력하시오 : ");
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
		
		System.out.printf("학생의 학점은 %c입니다.%n", grade);
	}

}
