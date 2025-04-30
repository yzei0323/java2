package day5Prac.애너테이션실습;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MyLibMain {

	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		MyLib lib = new MyLib();
		// lib.printStar();

		Class clazz = lib.getClass();
		
		Method[] methods = clazz.getDeclaredMethods();
		
		
		for( Method method : methods) {
			
			System.out.println(method);
			
			
			//@Before 애너테이션
			Before anno = method.getAnnotation(Before.class);
			
			if(anno != null) {
				//
				String beforeStr = anno.before();
				System.out.println(beforeStr);
				
				//매서드 이전
				method.invoke(lib);
				
				//매서드 이후
				
			}
			
		}
	}

}
