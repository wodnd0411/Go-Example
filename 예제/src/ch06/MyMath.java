package ch06;

public class MyMath {
	
	int add(int a, int b) {
		System.out.print("int add(int a, int b) - ");
		
		return a + b;
	}
	
	int add(int[] a) {
		System.out.print("int add(int[] a) - ");
		
		int result = 0;
		
		for(int i = 0; i < a.length; i++) {
			result += a[i];
		}
		
		return result;
	}
	
	long add(int a, long b) {
		System.out.print("long add(int a, long b) - ");
		
		return a + b;
	}
	
	long add(long a, int b) {
		System.out.print("long add(long a, int b) - ");
		
		return a + b;
	}
	
	long add(long a, long b) {
		System.out.print("long add(long a, long b) - ");
		
		long result = a + b;
		
		return result;
	}
	
	long substract(long a, long b) { return a - b; }
	long multiply(long a, long b) { return a * b; }
	double divide(double a, double b) { return a / b; }

}
