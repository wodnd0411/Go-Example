package ch04;

import java.util.Scanner;

public class FlowEx13 {
	
	public static void main(String[] args) {
		// 각 자릿수의 합
		Scanner scanner = new Scanner(System.in);
		int num = 0;
		int sum = 0;
		
		System.out.print("숫자를 입력하시오 : ");
		String tmp = scanner.nextLine();
		num = Integer.parseInt(tmp);
		
		while(num != 0) {
			sum += num % 10; // sum = sum + (num % 10);
			
			num /= 10; // num = num / 10;
		}
		
		System.out.println(sum);
	}
	
}
