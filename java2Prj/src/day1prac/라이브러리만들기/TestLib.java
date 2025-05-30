package day1prac.라이브러리만들기;


// 1. 별을 3개 출력하는 기능
// 2. 특정문자를 3번 출력하는 기능 ( 문자는 Char -> 'A')
// 3. 당신의 코드를 3번 실행하는 기능 -> 인터페이스 활용


public class TestLib {
	
	// 1. 별 3개
	public void Star3() {
		for(int i=1; i<=3; i++) {
			System.out.print("*");
		}
		System.out.println("");
	}
	
	void printStar() {
		System.out.print("* * *");
	}
	
	// 2. 특정문자 3번
	public void Char3(char a) {
		for(int i=1; i<=3; i++) {
			System.out.print(a);
		}
		System.out.println("");
	}

	void printChar(char a) {
		System.out.printf("%c %c %c", a, a, a);
	}
	
	
	//라이브러리를 제공할 때
	//결정할 수 없는 코드가 생김 =>
	//인터페이스 활용함 (라이브러리를 제공하는 사람이)
	
	//interface 코드 { void run(); }
	
	public void runCode(코드 code) {
		
		for(int i=1; i<=3; i++) {
			//System.out.println(i);
			code.run();
		}
	}
	
}
