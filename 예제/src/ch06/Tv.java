package ch06;

// 객체 정의
public class Tv {
	// 멤버변수(속성)
	String color;
	boolean power;
	int channel;
	
	// 메서드(기능)
	void power() {power = !power;}
	void channelUp() { ++channel; }
	void channelDown() { --channel; }
}
