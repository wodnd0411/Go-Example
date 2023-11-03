package ch05;

import java.util.Scanner;

// ���ڿ��� �Է¹ް� ���ڿ� ���ڸ� ��ȣȭ�ؼ� ���
public class Exercise5_10 {

	public static void main(String[] args) {
		// ���ĺ� ��ȣǥ
		// a b c d ''' x y z
		char[] abcCode = {'`', '~', '!', '@', '#', '$', '%', '^', '&', '*', 
				'(', ')', '-', '_', '+', '=', '|', '[', ']', '{', '}', ';',
				':', ',', '.', '/'
		};
		
		// ���� ��ȣǥ
		// 0 ~ 9
		char[] numCode = {'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p'};
		
		// ��ȣȭ ���
		String result = "";
		
		// ��ȣȭ�� ���� ���ĺ��� ���ڸ� �Է�
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("��ȣȭ�� ���ڿ��� �Է��Ͻÿ� : ");
		String str = scanner.nextLine();
		
		for(int i = 0; i < str.length(); i++) {
			// �Է°��� �� ���ھ� ���� 
			char ch = str.charAt(i);
			
			// ch�� �ҹ����� ��
			if(ch >= 'a' && ch <= 'z') {
				ch = abcCode[ch - 'a'];
				result += ch;
			}
			// ch�� �빮���� ��
			else if(ch >= 'A' && ch <= 'Z') {
				ch = abcCode[ch - 'A'];
				result += ch;
			}
			// ch�� ������ ��
			else if(ch >= '0' && ch <= '9') {
				ch = numCode[ch - '0'];
				result += ch;
			}
		}
		
		System.out.println("�Է��� ���ڿ� : " + str);
		System.out.println("��ȣȭ �� ���ڿ� : " + result);
	}

}
