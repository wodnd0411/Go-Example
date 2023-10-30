package ch05;

public class ArrayEx13 {

	public static void main(String[] args) {
		char[] hex = {'C', 'A', 'F', 'E'};
		// 16진수 0 ~ 9, A ~ F
		String[] binary = {"0000", "0001", "0010", "0011", 
							"0100", "0101", "0110", "0111", 
							"1000", "1001", "1010", "1011", 
							"1100", "1101", "1110", "1111"};
		
		// 16진수 -> 2진수 변환값
		String result = "";
		
		for(int i = 0; i < hex.length; i++) {
			// 0 ~ 9
			if(hex[i] >= '0' && hex[i] <= '9') {
				// '3' - '0' = 3
				// binary[3] = "0011"
				result += binary[hex[i] - '0'];
			}
			// A ~ F
			else {
				// 'C' - 'A' = 67 - 65 = 2
				// 2 + 10 -> 12 -> 16진수 C
				// binary[12] = "1100" -> C
				result += binary[hex[i] - 'A' + 10];
			}
		}
		
		// String(char[] value)
		System.out.println("hex : " + new String(hex));
		System.out.println("binary : " + result);
	}

}
