package ch04;

public class FlowEx15 {

	public static void main(String[] args) {
		// 3 6 9 게임
		for(int i = 1; i <= 100; i++) {
			System.out.print("i = " + i);
			
			// i는 for문 제어에 사용되므로 다른 변수에 저장
			int tmp = i;
			
			do {
				// tmp의 끝자리가 3의 배수이면서 끝자리가 0인건 제외
				if((tmp % 10) % 3 == 0 && tmp % 10 != 0) {
					System.out.print(" 짝");
				}
			} while ((tmp /= 10) != 0);
			
			System.out.println();
		}
	}

}
