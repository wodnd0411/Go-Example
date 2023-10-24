package ch04;

import java.util.Scanner;

public class FlowEx14 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input = 0;
		int answer = 0;
		
		answer = (int)(Math.random() * 100) + 1; // 1과 100사이의 임의의 수 저장
		
		do {
			System.out.print("1과 100사이의 정수를 입력하시오 : ");
			String tmp = scanner.nextLine();
			input = Integer.parseInt(tmp);
			
			if(answer > input) {
				System.out.println("더 큰 수를 입력하시오.");
			}
			else if(answer < input) {
				System.out.println("더 작은 수를 입력하시오.");
			}
		} while (input != answer);
		
		System.out.println("정답입니다.");
	}

}
