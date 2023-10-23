package ch02;

class VarEx2 {
	
	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		int tmp = 0; // 임시 저장소
	
		System.out.println("x:"+ x + " y:" + y);
		
		tmp = x; // 임시 저장소에 x값 저장
		x = y;
		y = tmp;

		System.out.println("x:"+ x + " y:" + y);
	}
	
}
