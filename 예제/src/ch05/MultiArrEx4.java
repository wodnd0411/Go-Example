package ch05;

import java.util.Scanner;

// �ܾ� ���߱�
public class MultiArrEx4 {

	public static void main(String[] args) {
		// 3x2 ���
		String[][] words = {
				{"chair", "����"},
				{"computer", "��ǻ��"},
				{"integer", "����"}
		};
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0; i < words.length; i++) {
			System.out.print("Q" + (i + 1) + ". " + words[i][0] + "�� ����? : ");
			String input = scanner.nextLine();
			
			if(input.equals(words[i][1])) {
				System.out.println("�����Դϴ�.");
			}
			else {
				System.out.println("Ʋ�Ƚ��ϴ�.");
				System.out.println("������ " + words[i][1] + "�Դϴ�.");
			}
		}
	}

}
