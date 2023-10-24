package ch04;

public class FlowEx16 {

	public static void main(String[] args) {
		int num = 1;
		int sum = 0;
		
		while(true) {
			sum += num;
			
			if(sum > 100) {
				break;
			}
			
			num++;
		}
		
		System.out.printf("num = %d, sum = %d%n", num, sum);
	}

}
