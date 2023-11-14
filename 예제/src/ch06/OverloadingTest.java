package ch06;

public class OverloadingTest {

	public static void main(String[] args) {
		MyMath mm = new MyMath();
		
		System.out.println("mm.add(3, 3) = " + mm.add(3, 3));
		System.out.println("mm.add(3, 3L) = " + mm.add(3, 3L));
		System.out.println("mm.add(3L, 3) = " + mm.add(3L, 3));
		System.out.println("mm.add(3L, 3L) = " + mm.add(3L, 3L));
		
		int[] a = {1, 2, 3};
		System.out.println("mm.add(a) = " + mm.add(a));
	}

}
