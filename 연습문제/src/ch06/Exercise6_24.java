package ch06;

public class Exercise6_24 {

	public static void main(String[] args) {
		int value = 5;
		System.out.println(value + "�� ���� : " + abs(value));
		
		value = -10;
		System.out.println(value + "�� ���� : " + abs(value));
	}
	
	static int abs(int num) {
		if(num >= 0) {
			return num;
		}
		else {
			return -num;
		}
		
		// return (num >= 0) ? num : -num;
	}

}
