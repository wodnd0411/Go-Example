package ch02;

class PrintfEx1 {
	
	public static void main(String[] args) {
		byte  b = 1;
		short s = 2;
		char  c = 'A';

		int  finger = 10;
		long big = 100_000_000_000L;
		long hex = 0xFFFF_FFFF_FFFF_FFFFL ;  // long hex = 0xFFFFFFFFFFFFFFFFL;

		int octNum = 010;       //  8진수 10, 10진수로는 8
		int hexNum = 0x10;      // 16진수 10, 10진수로는 16
		int binNum = 0b10;      //  2진수 10, 10진수로는 2

		System.out.printf("b = %d%n", b);
		System.out.printf("s = %d%n", s);
		System.out.printf("c = %c, %d %n", c, (int)c);
		System.out.printf("finger = [%5d]%n",  finger); // 5칸을 만들고 우측정렬
		System.out.printf("finger = [%-5d]%n", finger); // 5칸을 만들고 좌측정렬
		System.out.printf("finger = [%05d]%n", finger); // 5칸을 만들고 우측정렬 후 나머지는 0으로
		System.out.printf("big = %d%n", big);
		System.out.printf("hex = %#x%n", hex); // '#'은 접두사(16진수 0x, 8진수 0)
		System.out.printf("octNum = %o, %d%n", octNum, octNum);
		System.out.printf("hexNum = %x, %d%n", hexNum, hexNum);
		// 2진수 지시자는 없어서 2진 문자열로 나타냄
		System.out.printf("binNum = %s, %d%n", Integer.toBinaryString(binNum), binNum);
	}
	
}
