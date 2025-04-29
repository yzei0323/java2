package day4Prac.변경에유리한코드;

public class Main2 {

	public static void main(String[] args) {
	
		
		//Dog객체 두 개 만들기
		/*
		Animal dog = new Dog();
		dog.bark();
		
		Animal dog2 = new Dog();
		dog2.bark();
		*/
		
		//Dog -> Cat으로 	바꾸기
		Animal cat = new Cat();
		cat.bark();
		
		Animal cat2 = new Cat();
		cat2.bark();

	}

}
