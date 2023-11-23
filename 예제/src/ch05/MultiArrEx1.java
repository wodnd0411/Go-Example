package ch05;

import java.util.Scanner;

// 해당 좌표가 상대방의 배 위치를 맞추면 O 틀리면 X
public class MultiArrEx1 {

	public static void main(String[] args) {
		final int SIZE = 10; // 배열 길이 10으로 고정
		int x = 0; // 입력받은 좌표의 첫번째 값
		int y = 0; // 입력받은 좌표의 두번째 값
		
		// 입력한 좌표를 표시
		// 1행와 1열은 행번호와 열번호 표시
		// 좌표가 표시되는 곳은 9x9크기 내
		char[][] board = new char[SIZE][SIZE]; // 10x10 크기
		
		// 상대방의 배 위치 저장 0은 바다, 1은 배
		// 9x9 크기
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
		
		// board배열의 1행에 행번호, 1열에 열번호 저장
		for(int i = 1; i < SIZE; i++) {
			board[i][0] = (char)(i + '0'); // 숫자 + '0' = 숫자 -> 문자
			board[0][i] = (char)(i + '0');
		}
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.print("좌표를 입력하시오(종료 00) : "); // ex) 33이면 (3, 3) 좌표
			String input = scanner.nextLine();
			
			// 좌표가 (0, 0)이면 종료
			if(input.equals("00")) {
				System.out.println("종료");
				break;
			}
			// 좌표가 올바른 경우(두 글자)
			else if(input.length() == 2) {
				x = input.charAt(0) - '0'; // 문자 - '0' = 문자 -> 숫자
				y = input.charAt(1) - '0';
			}
			// 좌표가 올바르지 않은 경우(세 글자 이상)
			else {
				System.out.println("잘못된 입력입니다. 다시 입력하시오");
				
				continue; // 잘못된 입력이면 처음부터 새로 입력받게 하기, 반복문 처음으로
			}
			
			// 입력한 좌표가 상대방 배 위치와 일치하면 O 아니면 X
			// 배열 board는 행번호와 열번호 때문에 배열 shipBoard와 가로 세로 1씩 차이난다
			if(shipBoard[x - 1][y - 1] == 1) {
				board[x][y] = 'O';
			}
			else {
				board[x][y] = 'X';
			}
			
			// 입력한 좌표 표시
			for(int i = 0; i < SIZE; i++) {
				for(int j = 0; j < SIZE; j++) {
					System.out.print(board[i][j]);
				}
				
				System.out.println();
			}
			
			// 입력을 받은 board[x][y]가 상대방 배 위치가 맞는지
			if(shipBoard[x - 1][y - 1] == 1) {
				System.out.println("상대방 배의 위치를 찾았습니다.");
				break;
			}
			else {
				System.out.println("꽝 입니다. 다시 시도하시오.");
				
				continue;
			}
		}
	}
	
//	public static void main(String[] args) {
//		final int SIZE = 10;
//		int x = 0;
//		int y = 0;
//		
//		char[][] myCoordinate = new char[SIZE][SIZE];
//		
//		byte[][] shipCoordinate = {
//						  //  1  2  3  4  5  6  7  8  9
//							{ 0, 0, 0, 0, 0, 0, 1, 0, 0 }, // 1
//							{ 1, 1, 1, 1, 0, 0, 1, 0, 0 }, // 2
//							{ 0, 0, 0, 0, 0, 0, 1, 0, 0 }, // 3
//							{ 0, 0, 0, 0, 0, 0, 1, 0, 0 }, // 4
//							{ 0, 0, 0, 0, 0, 0, 0, 0, 0 }, // 5
//							{ 1, 1, 0, 1, 0, 0, 0, 0, 0 }, // 6
//							{ 0, 0, 0, 1, 0, 0, 0, 0, 0 }, // 7
//							{ 0, 0, 0, 1, 0, 0, 0, 0, 0 }, // 8
//							{ 0, 0, 0, 0, 0, 1, 1, 1, 0 }, // 9
//				};
//		
//		for(int i = 1; i < myCoordinate.length; i++) {
//			myCoordinate[i][0] = (char)(i + '0');
//			myCoordinate[0][i] = (char)(i + '0');
//		}
//		
//		Scanner sc = new Scanner(System.in);
//		
//		while(true) {
//			System.out.print("x좌표와 y좌표 입력(종료 0 0) : ");
//			x = sc.nextInt();
//			y = sc.nextInt();
//			
//			if(x == 0 && y == 0) {
//				System.out.println("종료");
//				
//				break;
//			}
//			else if(x > 9 || y > 9) {
//				System.out.println("잘못된 입력입니다.");
//				
//				continue;
//			}
//			else {
//				if(shipCoordinate[x - 1][y - 1] == 1) {
//					myCoordinate[x][y] = 'O';
//				}
//				else {
//					myCoordinate[x][y] = 'X';
//				}
//				
//				// myCoordinate 출력
//				for(int i = 0; i < myCoordinate.length; i++) {
//					for(int j = 0; j < myCoordinate[i].length; j++) {
//						System.out.print(myCoordinate[i][j]);
//					}
//					
//					System.out.println();
//				}
//			}
//		}
//	}

}
