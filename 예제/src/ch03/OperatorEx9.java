package ch03;

public class OperatorEx9 {

	public static void main(String[] args) {
		long a = 1_000_000 * 1_000_000; // long = int * int 우항 범위 초과
		long b = 1_000_000 * 1_000_000L; // long = int * long
		
		System.out.println(a);
		System.out.println(b);
	}

}
