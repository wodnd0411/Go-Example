package ch03;

public class OperatorEx14 {

	public static void main(String[] args) {
		char c = 'a';
		
		// �ҹ��� ���
		for(int i = 0; i < 26; i++) {
			System.out.print(c++);
		}
		System.out.println();
		
		// �빮�� ���
		c = 'A';
		for(int i = 0; i < 26; i++) {
			System.out.print(c++);
		}
		System.out.println();
		
		// ���� 0 ~ 9 ���
		c = '0';
		for(int i = 0; i < 10; i++) {
			System.out.print(c++);
		}
		System.out.println();
	}

}
