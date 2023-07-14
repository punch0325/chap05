
public class A07_Array3DExample {

	public static void main(String[] args) {
	
		//3차원 배열 - 3차원이니 입체적으로 생각하여야 함 (면과 행과 열로 이루어져 있음)
		int[][][] num = {
				{
					{1,2,3,4},
					{1,1,1,3},
					{1,2,3,4,5,6}	
				},
				{
					{5,6,7,8,9,6,6},
					{7,7,7,8},
					{3,4},
					{3}
				}
		};    
		
		for (int i =0; i<num.length; i++) {
			for (int j =0; j<num[i].length; j++) {
				for (int k =0; k<num[i][j].length; k++) {
					System.out.printf("%02d  ", num[i][j][k]);
				}
				System.out.println();
			}
			System.out.println();
		}
		
		
		System.out.println();
		System.out.println("-----------------------------------------------------------------------------------------------------------");
		System.out.println();
		
		
		int[][][] number = new int[3][10][20]; // 3면 10행 20열의 3차원 배열
		
//		for (int i = 0; i<number.length; i++) {
//			for(int j = 0; j<number[i].length; j++) {
//				for (int k =0; k<number[i][j].length; k++) {
//					number[i][j][k] = (int)(Math.random()*100+1);
//					System.out.printf("%02d  ", number[i][j][k]);
//				}
//				System.out.println();
//			}
//			System.out.println();
//		}
		
		
		for (int i = 0; i<10; i++) {
			for(int j = 0; j<20; j++) {
				do {
					number[0][i][j] = (int)(Math.random()*8+30);
					number[1][i][j] = (int)(Math.random()*8+40);
				}while(number[0][i][j]+10 == number[1][i][j]);
				
				number[2][i][j] = (int)(Math.random()*26+'A');
			}
		}

		for (int i = 0; i<number.length; i++) {
			for(int j = 0; j<number[i].length; j++) {
				for (int k =0; k<number[i][j].length; k++) {
					if (i==2) {
						System.out.printf("%c", number[i][j][k]);
					}else {
						System.out.printf("%02d  ", number[i][j][k]);
					}
				}
				System.out.println();
			}
			System.out.println();
		}
		
		
		
		for (int i = 0; i<10; i++) {
			for(int j = 0; j<20; j++) {
				System.out.printf("\033[%dm",number[0][i][j]);  //포그라운드
				System.out.printf("\033[%dm",number[1][i][j]);  //백그라운드
				System.out.printf("%c", number[2][i][j]);
			}
			System.out.println();
		}
		
		System.out.println("\033[0m"); // color reset
		
		
		
	}

}
