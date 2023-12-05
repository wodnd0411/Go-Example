package ch07;

// final이 붙어서 상속 불가능
public final class Singleton {
	
	private static Singleton s = new Singleton();
	
	// 생성자가 private이기 때문에 상속 불가능
	// 생성자가 private이기 때문에 외부에서 호출 불가능, 인스턴스 생성 불가능
	private Singleton() {
		// ...
	}
	
	// 외부에서 인스턴스 접근 가능
	public static Singleton getInstance() {
		if(s == null) {
			s = new Singleton();
		}
		
		return s;
	}

}
