
public class A05_ArrayExample {

	public static void main(String[] args) {
		
		// 배열 (참조 타입) - 배열은 1차원 2차원 3차원... 무한으로 늘어날 수 있음
		int[] num = {10 , 20 , 30, 50};
		
		String str = "java-c/c++-python-html-css";
		
		String[] array = str.split("-");  // .split() : 괄호 안에 표시한 기호를 기준으로 값을 잘라서 저장하는 메소드
		
		// 배열의 데이터 한자리를 인덱스라고 하는데 인덱스는 0부터 시작이다 즉 4개의 데이터가 배열에 대입되었다면, 0~3의 인덱스가 있는 것
		for (int i = 0; i<array.length; i++) {
			System.out.println(array[i]);
		}
		
		
		System.out.println();
		System.out.println("-----------------------------------------------------------------------------------------------------------");
		System.out.println();
		
		
		num = new int[] {1 , 2, 3};  //배열은 한번 변수를 선언한 뒤에 타입 없이 데이터를 대입 할 수 있는 기본 타입이나 String 타입과는 다르기 때문에
		                                         //new 연산자를 이용하여 데이터를 넣을 수 있다.    즉, num = {1,2,3};은 안된다 
		
		for (int i = 0; i<num.length; i++) {
			System.out.println(num[i]);
		}

		
		System.out.println();
		System.out.println("-----------------------------------------------------------------------------------------------------------");
		System.out.println();
		
		
		num[0] = 100;
		num[1] = 3;
		num[2]= 2;
		//이런식으로 인덱스 마다 데이터 값을 재대입 할 수도 있음
		
		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(num[2]);
		//for문을 사용하지 않고 인덱스마다 값을 출력하는 방법
		
		System.out.println();
		System.out.println("-----------------------------------------------------------------------------------------------------------");
		System.out.println();
		
		
		int[] number = new int[10];  // 배열의 초기값 설정하는 법. 중괄호 안에 들어 간 숫자가 인덱스의 갯수가 된다 즉, 0~9의 총 10개의 인덱스 생성
		
		for(int i = 0; i <number.length; i++) {
			number[i] = (int) (Math.random()*100+1);
			System.out.println(number[i]);
		}

		
		
	}

}
