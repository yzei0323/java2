package day1prac.라이브러리만들기;

public class TestLibMain {

	public static void main(String[] args) {
		
		TestLib test = new TestLib();

		test.Star3();
		test.Char3('E');
		test.printChar('&');
		
		System.out.println();
		
		test.runCode(new 코드() {
			
			@Override
			public void run() {
				
				System.out.println("hi run");
				
			}});
		
		test.runCode(new AAA());
	}

}
