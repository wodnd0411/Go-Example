package ch07;

public class SingletonTest {

	public static void main(String[] args) {
//		Singleton s = new Singleton(); // 생성자가 private
		Singleton s = Singleton.getInstance(); // 인스턴스 생성, 객체 주소를 return
	}

}
