package day4Prac.reflect;

import java.lang.reflect.InvocationTargetException;

public class Ex02 {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
	
		//1. 클래스정보 얻어오기
		//클래스로부터 클래스정보 얻어오기
		Class clazz = Member.class;
		
		
		//2. clazz 객체를 생성하기
		//기본생성자를 사용하여 객체생성하기
		Member m = (Member)clazz.getDeclaredConstructor().newInstance();
		
		
		//3. 객체의 매서드 호출하기
		m.printInfo();
		m.printSquare(3);
		
		
		//매개변수 있는 생성자로 객체 생성하기
		Member m2 = (Member) clazz.getDeclaredConstructor(String.class, String.class)
									.newInstance("yzei", "0106");
		m2.printInfo();
		
	}

}
