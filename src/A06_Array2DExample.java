
public class A06_Array2DExample {

	public static void main(String[] args) {
		
		// 2차원 배열
		int[] [] nums = {
				{1,2,3,4},
				{5,6,7,8,9},
				{10}       // 열은 갯수가 다 다를 수 있음
		};
		System.out.println(nums.length); // .length : 배열의 .length는 행의 갯수를 구해준다.
		
		int sum = 0;
		for (int i = 0; i<nums.length; i++) {
			for(int j = 0; j<nums[i].length; j++) {
				sum += nums[i][j];
			}
		}
		
		System.out.println(sum);
		
		
		
		int[][] number = new int[3] [4]; //3행 4열의 2차원 배열
		
		
		for (int i = 0; i<number.length; i++) {
			for(int j = 0; j<number[i].length; j++) {
				number[i][j] = (int)(Math.random()*8+30);
			}
		}
	
		for (int i = 0; i<number.length; i++) {
			for(int j = 0; j<number[i].length; j++) {   //number[i].length : 기본 length메소드는 행의 갯수를 출력하지만, 행의 값을 준 length메소드는 해당 행의 열갯수를 출력
				System.out.print(number[i][j] + "  ");
			}
			System.out.println();
		}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
