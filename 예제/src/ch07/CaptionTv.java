package ch07;

public class CaptionTv extends Tv {
	
	boolean caption; // 캡션 상태 on off
	
	void displayCaption(String text) {
		// caption이 true면 text 출력
		if(caption) {
			System.out.println(text);
		}
	}

}
