package ch03;

public class Exercise3_10 {

	public static void main(String[] args) {
		char ch = 'A';
		
		// ch�� �빮���� ��쿡�� �ҹ��ڷ� ����
		char lowerCase = (ch >= 'A' && ch <= 'Z') ? ((char)(ch + 32)) : (ch);
		
		System.out.println(ch);
		System.out.println(lowerCase);
	}

}
