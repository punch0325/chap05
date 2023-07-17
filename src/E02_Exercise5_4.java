
public class E02_Exercise5_4 {

	public static void main(String[] args) {
//		[5-4] 2차원 배열 arr에 담긴 모든 값의 총합과 평균을 구하는 프로그램을 완성하시오 
		
		int[][] arr = {
				{ 5, 5, 5, 5, 5},
				{10,10,10,10,10},
				{20,20,20,20,20},
				{30,30,30,30,30}
		};
		
		int total = 0;
		float average = 0;
		
		for(int i = 0; i < arr.length; i++) {
			double k = arr.length * arr[i].length;
			for(int j = 0; j<arr[i].length; j++) {
				total += arr[i][j];
			}
			average = (float) (total/k);
		}
	
		
		System.out.println("total="+total);  //325가 나와야함
		System.out.println("average="+average);  // 16.25가 나와야함
		

	}

}
