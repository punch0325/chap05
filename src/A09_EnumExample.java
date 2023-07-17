
public class A09_EnumExample {
	enum Gender {
		male , Female
	}
	// 한정된 값을 저장하려면 enum을 사용하여 타입을 만들어 줄 수 있다. 요일이나 성별 등의 정보를 저장할 때 사용함
	
	enum Color {
		Black,
		Red,
		Green,
		Yellow,
		Blue,
		Magenta,
		Cyan,
		White,
		Purple,
		Mint
	}
	
	
	public static void main(String[] args) {		
		Gender gender = null;
		// enum으로 만든 Gender 타입을 선언해줌
		
		gender = Gender.Female;
		System.out.println(gender);
		
		System.out.println();
		
		Color color1 = Color.Black;
		Color color2 = Color.Magenta;
		Color color3 = Color.White;
		
		System.out.println(color1);
		System.out.println(color2);
		System.out.println(color3);
		System.out.printf("[%d, %s]\n", color1.ordinal(), color1.toString());
		System.out.printf("[%d, %s]\n", color2.ordinal(), color2.toString());
		System.out.printf("[%d, %s]\n", color3.ordinal(), color3.toString());
		
		System.out.println();
		
		Color[] cols = Color.values();
		for(Color c : cols) {
			System.out.printf("[%d, %s]\n", c.ordinal(), c.toString());
		}
	
		
		System.out.println();
		
		for (int i = 0; i<10; i++) {
			for(int j = 0; j<10; j++) {
				Color fg = Color.values()[(int)(Math.random()*10)];
				Color bg = Color.values()[(int)(Math.random()*10)];
				
				System.out.printf("\033[%dm", fg.ordinal()+30);
				System.out.printf("\033[%dm", bg.ordinal()+40);
				
				char ch = (char) (Math.random()*26+'A');
				System.out.print(ch);	
			}
			System.out.println("\033[0m");
		}
		//VT100은 콘솔창이 아니라 터미널에서 확인해보는 게 정확함
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
