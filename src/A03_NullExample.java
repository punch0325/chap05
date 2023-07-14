
public class A03_NullExample {
	
	public static void main2(String[] args) {
		
		int num = 100/0;      // 정수에 0을 곱하거나 나누면 Exception 오류가 나온다
		System.out.println(num);
		
		System.out.println("Program End ...");
		
	}
	

	public static void main(String[] args) {
		
		String str1 = "Hello";
		String str2 = "Hi";
		String str3 = null;    // 참조하는 값이 없다는 뜻 (그러므로 참조 타입에서만 사용가능) 즉, null을 대입할 수 있으면 참조 타입이다.
		String str4 = " ";      // null과는 다르다
		
		System.out.println("str3의 값 : "+str3);
		System.out.println("str4의 값 : "+str4);
		
		
		System.out.println(str1.length());
		System.out.println(str2.length());
		System.out.println(str3.length());   // str3는 null이기 때문에 NullPointerException 오류가 나오므로 프로그램이 죽어서 이후의 실행문은 실행되지 않음
		
		System.out.println("Program End ...");
	}

}
