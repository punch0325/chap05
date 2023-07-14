
public class A01_EqualityExample {

	public static void main(String[] args) {
		
		// ' == ' 와 ' != ' 연산자는 primitive 타입과 reference(참조) 타입 모두 사용 가능하다. 
		// ' + '는 사용은 가능하지만, 문자열 타입에서는 산수적인 더하기가 아니라 그냥 이어주는 역할로서 사용된다.

		
		int num1 = 100;
		int num2 = 100;
		System.out.println(num1==num2);
		
		String str1 = new String("Hello");
		String str2 = new String("Hello");
		
		System.out.println(str1 == str2);
		System.out.println(str1 != str2);
		// 다만 참조 타입에서의 '==' , '!='연산자는 변수안에 들어있는 데이터의 값을 비교하는 것이 아니라,
		// 참조 타입 변수에 저장된 데이터 메모리의 주소를 비교하게 된다.
		System.out.println(str1.equals(str2));
		// 그래서 String 타입의 데이터(값) 비교는 .equals 메소드를 사용한다. 
		
		
		
		
		
	}

}
