package ch04;

import java.util.Scanner;

public class FlowEx2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = "";
		int num = 0;
		
		System.out.print("숫자를 하나 입력하시오 : ");
		input = scanner.nextLine();
		
		num = Integer.parseInt(input); // input을 정수로 변환
		
		if(num == 0) {
			System.out.println("입력하신 숫자는 0입니다.");
		}
		else {
			System.out.println("입력하신 숫자는 0이 아닙니다.");
		}
		
		System.out.printf("입력하신 숫자는 %d입니다.%n", num);
	}

}
