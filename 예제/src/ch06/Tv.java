package ch06;

// ��ü ����
public class Tv {
	// �������(�Ӽ�)
	String color;
	boolean power;
	int channel;
	
	// �޼���(���)
	void power() {power = !power;}
	void channelUp() { ++channel; }
	void channelDown() { --channel; }
}
