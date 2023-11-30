package ch07;

public class TVCR extends Tv {
	
	VCR vcr = new VCR(); // 포함 관계
	int counter = vcr.counter;
	
	void play() {
		vcr.play();
	}
	
	void stop() {
		vcr.stop();
	}
	
	void rew() {
		vcr.rew();
	}

	void ff() {
		vcr.ff();
	}
	
}

// 상속 관계
//class TV {
//	
//	boolean power; // 전원 상태 on off
//	int channel;
//	
//	void power() { power = !power; }
//	void channelUp() { channel++; }
//	void channelDown() {channel--; }
//	
//}

// 포함 관계
class VCR {
	
	boolean power;
	int counter = 0;
	
	void power() { power = !power; }
	void play() {}
	void stop() {}
	void rew() {}
	void ff() {}
	
}