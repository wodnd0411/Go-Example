package ch04;

public class FlowEx17 {

	public static void main(String[] args) {
		for(int i = 1; i <= 10; i++) {
			if(i % 3 == 0) {
				continue; // for�� ������ �̵�(�ݺ��� ����X)
			}
			
			System.out.println(i);
		}
	}
	
}
