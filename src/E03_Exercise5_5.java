
public class E03_Exercise5_5 {

	public static void main(String[] args) {
//		 [5-5]다음은 1과 9사이의 중복되지 않은 숫자로 이루어진 3자리 숫자를 만들어내는 프로그램이다. (1)~(2)에 알맞은 코드를 넣어서 프로그램을 완성하시오.

		int[] ballArr = {1,2,3,4,5,6,7,8,9};
		int[] ball3 = new int[3];
		
		// 배열 ballArr의 임의의 요소 개를 골라서 위치를 바꾼다 번 반복 2 . 20
		for(int x=0;x < 20;x++) {
			int i = (int)(Math.random() * ballArr.length);
			int j = (int)(Math.random() * ballArr.length);
			int tmp = 0;
		
		/*
		(1) 알맞은 코드를 넣어 완성하시오.
		*/
		}
		
		
		// 배열 ballArr의 앞에서 개의 수를 배열 로 복사한다 3 ball3 .
		/* (2) */
		for(int i=0;i<ball3.length;i++) {
			System.out.print(ball3[i]);
		}
		
		
		
		
	}

}
