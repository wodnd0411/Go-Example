package ch05;

public class ArrayEx19 {

	public static void main(String[] args) {
		// ���� ���� ����
		int[][] score = {
							{100, 100, 100},
							{20, 20, 20},
							{30, 30, 30},
							{40, 40, 40},
							{50, 50, 50}
						};
		
		
		System.out.println("===========================");
		System.out.println("��ȣ  ����    ����      ����     ����    ���");
		
		for(int i = 0; i < score.length; i++) {
			int sum = 0;
			float avg = 0.0f;
			
			System.out.printf("%d", i + 1);
			
			for(int j = 0; j < score[i].length; j++) {
				System.out.printf("%5d", score[i][j]);
				
				sum += score[i][j];
			}
			
			avg = (float)sum / 3;
			System.out.printf("%5d %5.1f%n", sum, avg);
		}
		
		System.out.println("===========================");
	}

}
