package ch02;

class VarEx2 {
	
	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		int tmp = 0; // �ӽ� �����
	
		System.out.println("x:"+ x + " y:" + y);
		
		tmp = x; // �ӽ� ����ҿ� x�� ����
		x = y;
		y = tmp;

		System.out.println("x:"+ x + " y:" + y);
	}
	
}
