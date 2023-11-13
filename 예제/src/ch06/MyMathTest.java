package ch06;

public class MyMathTest {

	public static void main(String[] args) {
		MyMath mm = new MyMath(); // MyMath 객체 생성
		
		long result1 = mm.add(5L, 3L); // MyMath클래스의 add메서드 호출
		long result2 = mm.substract(5L, 3L); // MyMath클래스의 substract메서드 호출
		long result3 = mm.multiply(5L, 3L); // MyMath클래스의 multiply메서드 호출
		double result4 = mm.divide(5L, 3L);// MyMath클래스의 divide메서드 호출
		
		System.out.println("add(5L, 3L) = " + result1);
		System.out.println("substract(5L, 3L) = " + result2);
		System.out.println("multiply(5L, 3L) = " + result3);
		System.out.println("divide(5L, 3L) = " + result4);
	}

}
