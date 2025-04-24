package day1prac.제네릭매서드;

public class PrintExGMain {

	public static void main(String[] args) {

		PrintExG.<Integer>print(10);
		PrintExG.<Acorn>print(new Acorn("KYM", "김유민", 120));
		PrintExG.<String>print("문자열 출력해줭");
		
	}

}
