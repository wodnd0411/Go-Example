package ch06;

class Data1 { // �����Ϸ��� �ڵ����� �⺻ ������ �߰�����
	
	int value;
	
//	Data1() {
//		
//	}
	
}

class Data2 { // �����ڰ� �ֱ� ������ �����Ϸ��� �⺻ ������ �ڵ� �߰� X
	
	int value;
	
//	Data2() {
//		
//	}
	
	Data2(int v) {
		value = v;
	}
	
}

public class ConstructorTest {

	public static void main(String[] args) {
		Data1 d1 = new Data1();
//		Data2 d2 = new Data2(); // Data2() �⺻ �����ڰ� ����
	}

}
