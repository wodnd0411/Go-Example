package ch05;

// 배열 복사 방법1
public class ArrayEx3 {

	public static void main(String[] args) {
		int[] arr = new int[5];
		
		// 배열 arr에 값 저장
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		
		System.out.println("[배열 arr길이 변경 전]");
		System.out.println("arr.length : " + arr.length);
		for(int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "]" + arr[i]);
		}
		
		int[] tmp = new int[arr.length * 2]; // 배열 arr의 2배 길이인 배열 tmp 생성
		
		// 배열 tmp에 배열 arr의 값을 복사
		for(int i = 0; i < arr.length; i++) {
			tmp[i] = arr[i];
		}
		
		arr = tmp; // 배열 tmp의 주소를 참조변수 arr에 저장
		
		System.out.println("[변경 후]");
		System.out.println("arr.length : " + arr.length);
		for(int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "]" + arr[i]);
		}
	}

}
