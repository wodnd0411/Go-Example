package ch06;

public class CallStackTest2 {

	public static void main(String[] args) {
		System.out.println("main(String[] args)�� ���۵�");
		firstMethod();
		System.out.println("main(String[] args)�� �����");
		
	}
	
	static void firstMethod() {
		System.out.println("firstMethod()�� ���۵�");
		secondMethod();
		System.out.println("firstMethod()�� �����");
	}
	
	static void secondMethod() {
		System.out.println("secondMethod()�� ���۵�");
		System.out.println("secondMethod()");
		System.out.println("secondMethod()�� �����");
	}

}
