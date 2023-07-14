
public class A02_StringExample {

	public static void main(String[] args) {

		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = new String("Hi");
		String str4 = new String("Hi");
		// String 참조 타입은 자주 사용하기 때문에 다른 참조 타입들과는 달리 new를 사용하지 않고도 바로 변수를 선언하여 데이터(리터럴)를 넣을 수 있다.
		
	
		
		System.out.println(str1 == str2);     // 리터럴을 사용하여 변수에 값을 넣었을 때, 값이 동일하면 그 변수들은 String 객체를 공유함으로 == 연산자로 비교하면 true가 나옴
		System.out.println(str1 == str3);
		System.out.println(str2 == str3);
		System.out.println(str3 == str4);    // new 객체 생성 연산자를 사용하여 값을 넣으면 서로 다른 String 객체를 생성하기 때문에 == 연산자로 비교하면 false가 나옴

		
		
		str3 = "Hello";
		System.out.println(str1 == str3);
		System.out.println(str2 == str3);

		
		
	}

}
