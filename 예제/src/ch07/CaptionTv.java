package ch07;

public class CaptionTv extends Tv {
	
	boolean caption; // ĸ�� ���� on off
	
	void displayCaption(String text) {
		// caption�� true�� text ���
		if(caption) {
			System.out.println(text);
		}
	}

}
