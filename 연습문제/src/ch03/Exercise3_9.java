package ch03;

public class Exercise3_9 {

	public static void main(String[] args) {
		char ch = 'z';
		
		// ch�� �����ڿ� ������ ��츸 true
		boolean b = ((ch >= '0' && ch <= '9') || (ch >= 'A' && ch <= 'Z') 
				|| (ch >= 'a' && ch <= 'z')) ? true : false;
		
		System.out.println(b);
	}

}
