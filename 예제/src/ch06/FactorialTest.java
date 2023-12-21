package ch06;

public class FactorialTest {

	public static void main(String[] args) {
		int result = factorial(3);
		
		System.out.println(result);
	}
	
	static int factorial(int num) {
		if(num == 1) {
			return 1;
		}
		else {
			return num * factorial(num - 1);
		}
		
	}

}
