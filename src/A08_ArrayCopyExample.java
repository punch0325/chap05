
public class A08_ArrayCopyExample {

	public static void main(String[] args) {

		int[] nums = {9, 1, 3, 5, 7};
		
		int[] dest = new int[10];
		
		System.arraycopy(nums, 0, dest, 0, nums.length);
		
		nums = dest; // 이런식으로 하면 nums의 인덱스 크기가 10개로 늘어난다.
		
		System.out.println("nums의 인덱스 크기 : "+nums.length);
		
		System.out.println();
		for(int i = 0; i <nums.length; i++) {
			System.out.println(i+"번 인덱스 값 : "+nums[i]);
		}
		
		
		System.out.println();
		for (int n : nums) {
			System.out.println(n);
		}
		//향상된 for문 nums의 데이터를 n에게 대입한다
		
		
		
		
		
	}

}
