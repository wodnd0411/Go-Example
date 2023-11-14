package ch06;

// ��������(varargs) -> ���������� �迭�� �̿�
// �������ڰ� ����� �޼��带 ȣ���� �� �迭�� ���� ������
public class VarArgsEx {

	public static void main(String[] args) {
		String[] strArr = {"100", "200", "300"};
		
		                // concatenate(delim, String... args)
		System.out.println(concatenate("", "100", "200", "300"));
		System.out.println(concatenate("-", strArr));
		System.out.println(concatenate(",", new String[] {"1", "2", "3"}));
		System.out.println("[" + concatenate(",", new String[0]) + "]");
		System.out.println("[" + concatenate(",") + "]");
	}
	
	// String... args���� ��� ��
	static String concatenate(String delim, String... args) {
		String result = "";
		
		for(int i = 0; i < args.length; i++) {
			result += args[i] + delim;
		}
		
		return result;
	}
	
//	static String concatenate(String... args) {
//		return concatenate("", args);
//	}

}
