
public class B01_Car {
	int model;
	int speed; 
	//필드 : 클래스(객체)의 속성을 표현함 
	
	void forward() {
		int num = 0 ;  // 변수 (로컬변수, 스택변수, 임시변수, 블럭변수)
		System.out.println("전진 ...");
	}
	
	void backward() {
		System.out.println("후진 ...");
	}
	
	
	
	
	public static void main(String[] args) {
		B01_Car car1 = new B01_Car(); //객체 생성
		car1.forward();
		car1.backward();
		
		B01_Car car2 = null;
		// 한번 new 연산자로 객체를 생성하고 나면 이후엔 new를 사용하지 않아도 된다.
		
		

	}

}
