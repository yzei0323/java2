package day4Prac.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Ex06 {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException {
		
		
		//클래스 정보 호출해오기
		Class clazz = Class.forName("day4Prac.reflect.Member"); 
		
		Member m = (Member)clazz.getDeclaredConstructor().newInstance(args);

		
		// printInfo();
		// Member m = new Member();
		// m.printInfo();
		// printInfo();   //객체정보 전달됨
		
		//특정매소드만 호출해오기
		Method method = clazz.getDeclaredMethod("printInfo"); //printInfo라는 이름을 가진 매서드를 찾아와줘
		method.invoke(m);
	
		
		
		//printSquare
		Method method2 = clazz.getDeclaredMethod("printSquare", int.class);
		
		//매서드호출
		method2.invoke(m, 5);
		
	}

}
