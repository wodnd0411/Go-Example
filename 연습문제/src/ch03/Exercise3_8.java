package ch03;

public class Exercise3_8 {

	public static void main(String[] args) {
		byte a = 10;
		byte b = 20;
		byte c = (byte)(a + b);
		
		char ch = 'A';
		ch = (char)(ch + 2);
		
		float f = 3f / 2;
		long l = 3000 * 3000 * 3000L;
		
		// f2�� d�� ���е� ���� ������ �ٸ� ���� �����
		float f2 = 0.1f;
		double d = 0.1;
		boolean result = ((float)d == f2);
		
		System.out.println("c = " + c);
		System.out.println("ch = " + ch);
		System.out.println("f = " + f);
		System.out.println("l = " + l);
		System.out.println("result = " + result);
	}

}
