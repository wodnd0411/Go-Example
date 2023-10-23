package ch03;

public class OperatorEx14 {

	public static void main(String[] args) {
		char c = 'a';
		
		// 소문자 출력
		for(int i = 0; i < 26; i++) {
			System.out.print(c++);
		}
		System.out.println();
		
		// 대문자 출력
		c = 'A';
		for(int i = 0; i < 26; i++) {
			System.out.print(c++);
		}
		System.out.println();
		
		// 문자 0 ~ 9 출력
		c = '0';
		for(int i = 0; i < 10; i++) {
			System.out.print(c++);
		}
		System.out.println();
	}

}
