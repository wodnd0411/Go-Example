package ch03;

public class OperatorEx21 {

	public static void main(String[] args) {
		System.out.printf("10 == 10.0f -> %b%n", 10 == 10.0f);
		System.out.printf("'0' == 0 -> %b%n", '0' == 0); // '0'Àº 48
		System.out.printf("'A' == 65 -> %b%n", 'A' == 65); // 'A'´Â 65
		System.out.printf("'A' + 1 != 'B' -> %b%n", 'A' + 1 != 'B');
	}

}
