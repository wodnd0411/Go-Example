package ch06;

// ������ �Ű�����
public class ReferenceParamEx {

	public static void main(String[] args) {
		Data d = new Data();
		
		d.x = 10;
		System.out.println("main() : x = " + d.x);
		
		change(d); // ���������� �Է�(Data ��ü�� �ּҰ� ����� ��������)
		System.out.println("After change(d.x)");
		System.out.println("main() : x = " + d.x);
	}
	
	static void change(Data d) { // ������ �Ű����� -> �б�� ���� ����
		d.x = 1000;
		
		System.out.println("change() : x = " + d.x);
	}

}
