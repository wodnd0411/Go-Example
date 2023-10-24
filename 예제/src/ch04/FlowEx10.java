package ch04;

import java.util.Scanner;

public class FlowEx10 {

	public static void main(String[] args) {
		// 별을 이용해 직각삼각형 출력
		Scanner scanner = new Scanner(System.in);
		int num = 0;
		
		System.out.print("*을 출력할 라인의 수를 입력하시오 : ");
		num = scanner.nextInt();
		
		for(int i = 0; i < num; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}

}
