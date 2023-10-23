package ch02;

class PrintfEx2 {
	
	public static void main(String[] args) {
		String url = "www.codechobo.com";

		float f1 = .10f;   // 0.10, 1.0e-1(1.0 x 10�� -1��)
		float f2 = 1e1f;   // 10.0, 1.0e1, 1.0e+1(1.0 x 10�� 1��)
		float f3 = 3.14e3f;
		double d = 1.23456789;

		System.out.printf("f1 = %f, %e%n", f1, f1); 
		System.out.printf("f2 = %f, %e%n", f2, f2); 
		System.out.printf("f3 = %f, %e%n", f3, f3);

		System.out.printf("d = %f%n", d);
		System.out.printf("d = %14.10f%n", d); // ��ü 14�ڸ� �� �Ҽ��� �Ʒ� 10�ڸ�

		System.out.printf("[%s]%n", url);
		System.out.printf("[%20s]%n", url); // 20ĭ ����� ��������
		System.out.printf("[%-20s]%n", url); // 20ĭ ����� ��������
		System.out.printf("[%.8s]%n", url);  // ���ʿ��� 8���ڸ� ���
	}
	
}
