package ch07;

public class Tv {

	boolean power; // ���� ���� on off
	int channel; // ä��
	
	void power() { power = !power; }
	void channelUp() { channel++; }
	void channelDown() {channel--; }
	
}
