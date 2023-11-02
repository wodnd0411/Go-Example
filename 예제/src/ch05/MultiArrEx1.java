package ch05;

import java.util.Scanner;

// �ش� ��ǥ�� ������ �� ��ġ�� ���߸� O Ʋ���� X
public class MultiArrEx1 {

	public static void main(String[] args) {
		final int SIZE = 10; // �迭 ���� 10���� ����
		int x = 0; // �Է¹��� ��ǥ�� ù��° ��
		int y = 0; // �Է¹��� ��ǥ�� �ι�° ��
		
		// �Է��� ��ǥ�� ǥ��
		// 1��� 1���� ���ȣ�� ����ȣ ǥ��
		// ��ǥ�� ǥ�õǴ� ���� 9x9ũ�� ��
		char[][] board = new char[SIZE][SIZE]; // 10x10 ũ��
		
		// ������ �� ��ġ ���� 0�� �ٴ�, 1�� ��
		// 9x9 ũ��
		int[][] shipBoard = {
			  //  1  2  3  4  5  6  7  8  9
				{ 0, 0, 0, 0, 0, 0, 1, 0, 0 }, // 1
				{ 1, 1, 1, 1, 0, 0, 1, 0, 0 }, // 2
				{ 0, 0, 0, 0, 0, 0, 1, 0, 0 }, // 3
				{ 0, 0, 0, 0, 0, 0, 1, 0, 0 }, // 4
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0 }, // 5
				{ 1, 1, 0, 1, 0, 0, 0, 0, 0 }, // 6
				{ 0, 0, 0, 1, 0, 0, 0, 0, 0 }, // 7
				{ 0, 0, 0, 1, 0, 0, 0, 0, 0 }, // 8
				{ 0, 0, 0, 0, 0, 1, 1, 1, 0 }, // 9
		};
		
		// board�迭�� 1�࿡ ���ȣ, 1���� ����ȣ ����
		for(int i = 1; i < SIZE; i++) {
			board[i][0] = (char)(i + '0'); // ���� + '0' = ���� -> ����
			board[0][i] = (char)(i + '0');
		}
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.print("��ǥ�� �Է��Ͻÿ�(���� 00) : "); // ex) 33�̸� (3, 3) ��ǥ
			String input = scanner.nextLine();
			
			// ��ǥ�� (0, 0)�̸� ����
			if(input.equals("00")) {
				System.out.println("����");
				break;
			}
			// ��ǥ�� �ùٸ� ���(�� ����)
			else if(input.length() == 2) {
				x = input.charAt(0) - '0'; // ���� - '0' = ���� -> ����
				y = input.charAt(1) - '0';
			}
			// ��ǥ�� �ùٸ��� ���� ���(�� ���� �̻�)
			else {
				System.out.println("�߸��� �Է��Դϴ�. �ٽ� �Է��Ͻÿ�");
				
				continue; // �߸��� �Է��̸� ó������ ���� �Է¹ް� �ϱ�, �ݺ��� ó������
			}
			
			// �Է��� ��ǥ�� ���� �� ��ġ�� ��ġ�ϸ� O �ƴϸ� X
			// �迭 board�� ���ȣ�� ����ȣ ������ �迭 shipBoard�� ���� ���� 1�� ���̳���
			if(shipBoard[x - 1][y - 1] == 1) {
				board[x][y] = 'O';
			}
			else {
				board[x][y] = 'X';
			}
			
			// �Է��� ��ǥ ǥ��
			for(int i = 0; i < SIZE; i++) {
				for(int j = 0; j < SIZE; j++) {
					System.out.print(board[i][j]);
				}
				
				System.out.println();
			}
			
			// �Է��� ���� board[x][y]�� ���� �� ��ġ�� �´���
			if(shipBoard[x - 1][y - 1] == 1) {
				System.out.println("���� ���� ��ġ�� ã�ҽ��ϴ�.");
				break;
			}
			else {
				System.out.println("�� �Դϴ�. �ٽ� �õ��Ͻÿ�.");
				
				continue;
			}
		}
	}

}
