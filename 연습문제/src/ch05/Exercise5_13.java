package ch05;

import java.util.Scanner;

// �ܾ��� ���ڵ��� ��� �����ְ� � �ܾ����� ���߱�
public class Exercise5_13 {

	public static void main(String[] args) {
		String[] words = {"television", "computer", "mouse", "phone"};
		
		Scanner scanner = new Scanner(System.in);
		
		// �迭 words�� �ܾ���� ����
		for(int i = 0; i < words.length; i++) {
			 // �迭 words�� �� ��Ҹ� char������ ����
			char[] question = words[i].toCharArray();
			
			for(int j = 0; j < question.length; j++) {
				int index = (int)(Math.random() * question.length);
				char tmp = question[j];
				question[j] = question[index];
				question[index] = tmp;
			}
			
			// new String(question)�� char���� ���� String���� ��ȯ
			System.out.printf("Q%d. %s�� ������ �Է��Ͻÿ� : ", i + 1, new String(question));
			String input = scanner.nextLine();
			
			if(input.equals(words[i])) {
				System.out.println("�����Դϴ�.");
			}
			else {
				System.out.println("�����Դϴ�.");
			}
		}
	}

}
