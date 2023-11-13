package ch06;

public class ReferenceParamEx2 {

	public static void main(String[] args) {
		int[] arr = {10}; // 길이가 1인 배열 arr를 10으로 초기화
		System.out.println("main() : x = " + arr[0]);
		
		change(arr); // 배열 arr의 주소가 담긴 참조변수 arr
		
		System.out.println("After change(x)");
		System.out.println("main() : x = " + arr[0]);
	}
	
	static void change(int[] arr) {
		arr[0] = 1000;
		
		System.out.println("change() : x = " + arr[0]);
	}

}
