package ch06;

public class TvTest {

	public static void main(String[] args) {
		// 객체 생성
		Tv t = new Tv(); // Tv클래스의 인스턴스 생성, t에 Tv인스턴스의 주소 저장
		
		// 객체 사용
		// Tv클래스의 참조변수 t를 통해서만 인스턴스에 접근 가능
		t.color = "black";
		t.power(); // false -> true
		t.channel = 7; // Tv클래스의 멤버변수 channel의 값을 7로 저장
		t.channelDown(); // channel을 하나 낮춘다 7 -> 6
		
		System.out.println("TV의 색깔은 " + t.color + "입니다.");
		System.out.println("현재 채널은 " + t.channel + "입니다.");
		
		if(t.power) {
			System.out.println("현재 TV는 켜져있습니다.");
		}
		else {
			System.out.println("현재 TV는 꺼져있습니다.");
		}
	}

}
