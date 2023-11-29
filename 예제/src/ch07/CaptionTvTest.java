package ch07;

public class CaptionTvTest {

	public static void main(String[] args) {
		CaptionTv ctv = new CaptionTv();
		ctv.channel = 10; // 부모 클래스로부터 상속 받은 멤버
		
		ctv.channelUp(); // 부모 클래스로부터 상속 받은 멤버
		System.out.println(ctv.channel);
		
		ctv.displayCaption("Hello"); // caption이 false라서 출력안됨
		
		ctv.caption = true;
		ctv.displayCaption("Hello");
	}

}
