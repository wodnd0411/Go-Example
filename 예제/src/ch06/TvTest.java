package ch06;

public class TvTest {

	public static void main(String[] args) {
		// ��ü ����
		Tv t = new Tv(); // TvŬ������ �ν��Ͻ� ����, t�� Tv�ν��Ͻ��� �ּ� ����
		
		// ��ü ���
		// TvŬ������ �������� t�� ���ؼ��� �ν��Ͻ��� ���� ����
		t.color = "black";
		t.power(); // false -> true
		t.channel = 7; // TvŬ������ ������� channel�� ���� 7�� ����
		t.channelDown(); // channel�� �ϳ� ����� 7 -> 6
		
		System.out.println("TV�� ������ " + t.color + "�Դϴ�.");
		System.out.println("���� ä���� " + t.channel + "�Դϴ�.");
		
		if(t.power) {
			System.out.println("���� TV�� �����ֽ��ϴ�.");
		}
		else {
			System.out.println("���� TV�� �����ֽ��ϴ�.");
		}
	}

}
