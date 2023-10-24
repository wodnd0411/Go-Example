package ch04;

import java.util.Scanner;

public class FlowEx11 {

	public static void main(String[] args) {
		// 구구단 2단 ~ 9단 출력
		for(int i = 2; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				System.out.printf("%d X %d = %d%n", i, j, i * j);
			}
			
			System.out.println();
		}
	}

}
