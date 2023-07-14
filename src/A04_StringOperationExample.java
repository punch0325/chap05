
public class A04_StringOperationExample {

	public static void main(String[] args) {
		

		
		String str1 = "자바 프로그래밍";
		
		String str2 = str1.replace("자바", "JAVA"); // .replace() : 해당 문자열을 원하는 문자열로 바꾸는 메소드 
		String str3 = str2.toLowerCase();            // .toLowerCase() : 모든 대문자를 소문자로 바꾸는 메소드
		String str4 = str3.substring(3);				// .substring() : 데이터 값을 원하는 만큼 잘라내는 메소드
		
		System.out.println("str1 : "+str1);
		System.out.println("str2 : "+str2);
		System.out.println("str3 : "+str3);
		System.out.println("str4 : "+str4);
		System.out.println("    Hello   Java  ".trim());  // .trim(): 사이드의 공백을 지워주는 메소드(가운데 공백은 지워지지 않음)

		
		/* 
		  - Mutable (수정이 가능한 데이터)
		  - Immutable (수정이 불가한 데이터)	
		  
		  String 타입은 Immutable 데이터를 저장하기 때문에 메소드들을 사용하여 데이터를 바꿔도 원래의 변수 데이터가 바뀌는 것이 아니므로
		  새로운 변수를 선언하여 바뀐 데이터를 받아주어야 한다.
		  
		 */
		
		
	}

}
