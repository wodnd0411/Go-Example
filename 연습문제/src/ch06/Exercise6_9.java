package ch06;

// static�� �ٿ��� �ϴ� ����� �� ����(��, ��� ������ ���ݷ°� ������ ���ƾ� �Ѵ�.)?
// �� : weapon, armor, weaponUp(), armorUp()
//     -> ��� ������ ���ݷ°� ������ ���ƾ� �ϹǷ� static, static������ ����ϴ� �޼��嵵 static �ٿ��� ��
public class Exercise6_9 {
	
	public static void main(String[] args) {
		
	}
	
}

class Marine {
	
	// Marine�� ��ġ ��ǥ (x, y)
	int x = 0;
	int y = 0;
	
	int hp = 60; // ���� ü��
	int weapon = 6; // ���ݷ�
	int armor = 0; // ����
	
	void weaponUp() {
		weapon++;
	}
	
	void armorUp() {
		armor++;
	}
	
	void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
}