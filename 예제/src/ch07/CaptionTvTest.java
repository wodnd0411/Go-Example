package ch07;

public class CaptionTvTest {

	public static void main(String[] args) {
		CaptionTv ctv = new CaptionTv();
		ctv.channel = 10; // �θ� Ŭ�����κ��� ��� ���� ���
		
		ctv.channelUp(); // �θ� Ŭ�����κ��� ��� ���� ���
		System.out.println(ctv.channel);
		
		ctv.displayCaption("Hello"); // caption�� false�� ��¾ȵ�
		
		ctv.caption = true;
		ctv.displayCaption("Hello");
	}

}
