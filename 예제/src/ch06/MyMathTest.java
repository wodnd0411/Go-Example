package ch06;

public class MyMathTest {

	public static void main(String[] args) {
		MyMath mm = new MyMath(); // MyMath ��ü ����
		
		long result1 = mm.add(5L, 3L); // MyMathŬ������ add�޼��� ȣ��
		long result2 = mm.substract(5L, 3L); // MyMathŬ������ substract�޼��� ȣ��
		long result3 = mm.multiply(5L, 3L); // MyMathŬ������ multiply�޼��� ȣ��
		double result4 = mm.divide(5L, 3L);// MyMathŬ������ divide�޼��� ȣ��
		
		System.out.println("add(5L, 3L) = " + result1);
		System.out.println("substract(5L, 3L) = " + result2);
		System.out.println("multiply(5L, 3L) = " + result3);
		System.out.println("divide(5L, 3L) = " + result4);
	}

}
