package ch03;

public class OperatorEx8 {

	public static void main(String[] args) {
		int a = 1_000_000;
		int b = 2_000_000;
		
//		long c = a * b; // ���� �ʰ� -> �����Ⱚ
		long c = (long)a * (long)b;
		
//		long a = 1_000_000; // �ڵ� ����ȯ 1_000_000�� int��
//		long b = 2_000_000; // �ڵ� ����ȯ 2_000_000�� int��
//		
//		long c = a * b;
//		
		System.out.println(c);
	}

}
