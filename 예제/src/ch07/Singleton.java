package ch07;

// final�� �پ ��� �Ұ���
public final class Singleton {
	
	private static Singleton s = new Singleton();
	
	// �����ڰ� private�̱� ������ ��� �Ұ���
	// �����ڰ� private�̱� ������ �ܺο��� ȣ�� �Ұ���, �ν��Ͻ� ���� �Ұ���
	private Singleton() {
		// ...
	}
	
	// �ܺο��� �ν��Ͻ� ���� ����
	public static Singleton getInstance() {
		if(s == null) {
			s = new Singleton();
		}
		
		return s;
	}

}
