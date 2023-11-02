package ch05;

import java.util.Scanner;

// �������� ����� ���� �� ���ڸ� �Է��ϸ� 0���� �ٲٱ�
public class MultiArrEx2 {

	public static void main(String[] args) {
		final int SIZE = 5;
		int[][] bingo = new int[SIZE][SIZE]; // 5x5 ������
		
		Scanner scanner = new Scanner(System.in);
		int input = 0; // �Է°�
		
		// �������� 1 ~ 25�� �ʱ�ȭ
		for(int i = 0; i < SIZE; i++) {
			for(int j = 0; j < SIZE; j++) {
				bingo[i][j] = (i * SIZE) + j + 1;
			}
		}
		
		// �������� ����(1 ~ 25)���� ���´�
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
			// ������ ���
			for(int i = 0; i < SIZE; i++) {
				for(int j = 0; j < SIZE; j++) {
					System.out.printf("%2d ", bingo[i][j]);
				}
				
				System.out.println();
			}
			System.out.println();

			System.out.print("����(1 ~ 25)�� �Է��Ͻÿ�(���� 0) : ");
			input = scanner.nextInt();
			
			// �Է°��� ������ ���� ������ 0���� ��ü
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
