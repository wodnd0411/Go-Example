package ch05;

public class ArrayEx14 {

	public static void main(String[] args) {
		String src = "ABCDE";
		
		for(int i = 0; i < src.length(); i++) {
			char ch = src.charAt(i); // src�� i��° ���ڸ� ch�� ����
			
			System.out.println("src.charAt(" + i + ") : " + ch);
		}
		
		// StringŬ���� src�� char�� �迭�� ��ȯ
		char[] chArr = src.toCharArray();
		
		System.out.println(chArr);
	}

}
