package ch06;

public class Exercise6_22 {

	public static void main(String[] args) {
		String str = "123";
		System.out.println(str + "�� �����Դϱ�? " + isNumber(str));
		
		str = "12o34";
		System.out.println(str + "�� �����Դϱ�? " + isNumber(str));
	}
	
	static boolean isNumber(String str) {
		// �Ű� ������ ��ȿ�� �˻�
		if(str == null || str.equals("")) {
			return false;
		}
		
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i); // �� ���ھ� ����
			
			if(ch < '0' || ch > '9') {
				return false;
			}
		}
		
		return true;
	}

}
