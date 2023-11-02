package ch05;

import java.util.Scanner;

// 빙고판을 만들고 범위 내 숫자를 입력하면 0으로 바꾸기
public class MultiArrEx2 {

	public static void main(String[] args) {
		final int SIZE = 5;
		int[][] bingo = new int[SIZE][SIZE]; // 5x5 빙고판
		
		Scanner scanner = new Scanner(System.in);
		int input = 0; // 입력값
		
		// 빙고판을 1 ~ 25로 초기화
		for(int i = 0; i < SIZE; i++) {
			for(int j = 0; j < SIZE; j++) {
				bingo[i][j] = (i * SIZE) + j + 1;
			}
		}
		
		// 빙고판의 숫자(1 ~ 25)들을 섞는다
		for(int i = 0; i < SIZE; i++) {
			for(int j = 0; j < SIZE; j++) {
				int x = (int)(Math.random() * SIZE); // 0 ~ 4
				int y = (int)(Math.random() * SIZE);
				
				int tmp = bingo[i][j];
				bingo[i][j] = bingo[x][y];
				bingo[x][y] = tmp;
			}
		}
		
		do {
			// 빙고판 출력
			for(int i = 0; i < SIZE; i++) {
				for(int j = 0; j < SIZE; j++) {
					System.out.printf("%2d ", bingo[i][j]);
				}
				
				System.out.println();
			}
			System.out.println();

			System.out.print("숫자(1 ~ 25)를 입력하시오(종료 0) : ");
			input = scanner.nextInt();
			
			// 입력값이 빙고판 내에 있으면 0으로 교체
			for(int i = 0; i < SIZE; i++) {
				for(int j = 0; j < SIZE; j++) {
					if(bingo[i][j] == input) {
						bingo[i][j] = 0;
					}
				}
			}
		} while (input != 0);
	}

}
