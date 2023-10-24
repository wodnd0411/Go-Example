package ch04;

public class FlowEx8 {

	public static void main(String[] args) {
		int sum = 0;
		
		// 1부터 50까지의 합
		for(int i = 1; i <= 10;i++) {
			sum = sum + i; // sum += i;
		}
		
		System.out.println(sum);
	}

}
