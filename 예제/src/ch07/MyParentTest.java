package ch07;

public class MyParentTest {

	public static void main(String[] args) {
		MyParent p = new MyParent();
		
//		System.out.println(p.prv); // ����
		System.out.println(p.dft);
		System.out.println(p.prt);
		System.out.println(p.pub);
	}

}

class MyParent { // ���� ������ default
	
	private int prv; // ���� Ŭ����
	int dft; // ���� ��Ű��
	protected int prt; // ���� ��Ű�� + �ڼ�(�ٸ� ��Ű��)
	public int pub; // ���� ���� ����
	
	public void printMembers() {
		System.out.println(prv);
		System.out.println(dft);
		System.out.println(prt);
		System.out.println(pub);
	}
	
}