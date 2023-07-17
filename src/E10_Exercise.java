import java.util.Scanner;

public class E10_Exercise {

	public static void main(String[] args) {
		
		boolean run = true;
		int studentNum = 0;
		int[] score = null;
		Scanner scanner = new Scanner(System.in);
		
		while(run){
			System.out.println("────────────────────────────────────────────────────");
			System.out.println("   1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("────────────────────────────────────────────────────");
			System.out.print("선택 > ");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) {
				System.out.print("학생 수를 입력하세요 > ");
				studentNum = scanner.nextInt();
				score = new int[studentNum];
			}else if (selectNo == 2) {
				for(int i = 0 ; i<score.length; i++) {
					System.out.print("score["+i+"]"+" > ");
					score[i] = scanner.nextInt();
				}
			}else if (selectNo == 3) {
				for(int i = 0; i<score.length; i++) {
					System.out.println("score["+i+"]"+" : "+score[i]);
				}
			}else if (selectNo == 4) {
				int max = 0;
				int sum = 0;
				double avg = 0;
				
				for (int i =0; i < score.length; i++) {
					if(max > score[i]) {
						max = score[i];
					}
					sum += score[i];
				}
				avg = sum / score.length;
				
				System.out.println("최고 점수 : "+max);
				System.out.println("평균 점수 : "+avg);
			}else if (selectNo == 5) {
				run = false;
			}
		}
		
		System.out.println("프로그램 종료");
		
		
		
		
		
		
		
		
	}

}
