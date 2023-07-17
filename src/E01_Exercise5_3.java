
public class E01_Exercise5_3 {

	public static void main(String[] args) {
		//[5-3] 배열 arr에 담긴 모든 값을 더하는 프로그램을 완성하시오 
		
		
		int[] arr = {10, 20, 30, 40, 50};
		int sum = 0;
		
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
//		System.out.println(arr[4]);

		for (int i = 0; i <arr.length; i++) {
			System.out.print(arr[i]);
			if (arr[i] != arr[4]){
				System.out.print(" + ");
				sum += arr[i];
			}else {
				sum += arr[i];
			}
		}
		
		System.out.println(" = "+sum+"(sum값)");
		//150이 나와야함
	}

}
