package ch05;

// �־��� �迭�� �ð�������� 90�� ȸ�����Ѽ� ���
public class Exercise5_9 {

	public static void main(String[] args) {
		// 4x5 ���
		char[][] star = {
				{'*', '*', ' ', ' ', ' '},
				{'*', '*', ' ', ' ', ' '},
				{'*', '*', '*', '*', '*'},
				{'*', '*', '*', '*', '*'}
		}; 
		
		// 5x4 ���
		char[][] result = new char[star[0].length][star.length];
		
		// �迭 star���� �ð�������� 90�� ȸ�� �� ���� ����
		for(int i = 0; i < star.length; i++) {
			for(int j = 0; j < star[i].length; j++) {
				result[j][i] = star[star.length - 1 - i][j];
			}
		}
		
		// star ���
		for(int i = 0; i < star.length; i++) {
			for(int j = 0; j < star[i].length; j++) {
				System.out.print(star[i][j]);
			}
			
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		// result ���
		for(int i = 0; i < result.length; i++) {
			for(int j = 0; j < result[i].length; j++) {
				System.out.print(result[i][j]);
			}
			
			System.out.println();
		}
	}

}
