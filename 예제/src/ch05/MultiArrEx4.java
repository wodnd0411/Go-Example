package ch05;

import java.util.Scanner;

// 단어 맞추기
public class MultiArrEx4 {

	public static void main(String[] args) {
		// 3x2 행렬
		String[][] words = {
				{"chair", "의자"},
				{"computer", "컴퓨터"},
				{"integer", "정수"}
		};
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0; i < words.length; i++) {
			System.out.print("Q" + (i + 1) + ". " + words[i][0] + "의 뜻은? : ");
			String input = scanner.nextLine();
			
			if(input.equals(words[i][1])) {
				System.out.println("정답입니다.");
			}
			else {
				System.out.println("틀렸습니다.");
				System.out.println("정답은 " + words[i][1] + "입니다.");
			}
		}
	}

}
