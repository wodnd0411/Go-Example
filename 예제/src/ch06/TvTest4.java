package ch06;

public class TvTest4 {

	public static void main(String[] args) {
		Tv[] tvArr = new Tv[3]; // ���̰� 3�� ��ü �迭 ���� -> �������� 3��
		
		for(int i = 0; i < tvArr.length; i++) {
			tvArr[i] = new Tv(); // Tv��ü ���� �� Tv��ü �迭�� �� ��ҿ� Tv��ü�� �ּҸ� ����
			tvArr[i].channel = i + 10;
		}
		
		for(int i = 0; i < tvArr.length; i++) {
			tvArr[i].channelUp();
			System.out.println("tvArr[" + i + "].channel = " + tvArr[i].channel);
		}
	}

}
