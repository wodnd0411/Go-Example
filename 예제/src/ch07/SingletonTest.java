package ch07;

public class SingletonTest {

	public static void main(String[] args) {
//		Singleton s = new Singleton(); // �����ڰ� private
		Singleton s = Singleton.getInstance(); // �ν��Ͻ� ����, ��ü �ּҸ� return
	}

}
