package ch03;

public class OperatorEx8 {

	public static void main(String[] args) {
		int a = 1_000_000;
		int b = 2_000_000;
		
//		long c = a * b; // 범위 초과 -> 쓰레기값
		long c = (long)a * (long)b;
		
//		long a = 1_000_000; // 자동 형변환 1_000_000은 int형
//		long b = 2_000_000; // 자동 형변환 2_000_000은 int형
//		
//		long c = a * b;
//		
		System.out.println(c);
	}

}
