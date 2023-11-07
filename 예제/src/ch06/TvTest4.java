package ch06;

public class TvTest4 {

	public static void main(String[] args) {
		Tv[] tvArr = new Tv[3]; // 길이가 3인 객체 배열 생성 -> 참조변수 3개
		
		for(int i = 0; i < tvArr.length; i++) {
			tvArr[i] = new Tv(); // Tv객체 생성 후 Tv객체 배열의 각 요소에 Tv객체의 주소를 저장
			tvArr[i].channel = i + 10;
		}
		
		for(int i = 0; i < tvArr.length; i++) {
			tvArr[i].channelUp();
			System.out.println("tvArr[" + i + "].channel = " + tvArr[i].channel);
		}
	}

}
