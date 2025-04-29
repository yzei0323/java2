package day4Prac.reflect;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.stream.Stream;

public class Ex05 {

	public static void main(String[] args) throws ClassNotFoundException {
		
		
		Class clazz = Class.forName("day4Prac.reflect.Member");
		
		Method[] methods = clazz.getDeclaredMethods();
		
		
		for(Method m : methods) {
			System.out.println(m);
		}
		
		
		//객체배열을 스트림으로 얻어오기
		Stream.of(methods).forEach( s->System.out.println(s));
		
		//기본형배열, 객체배열
		//Arrays.stream(methods).forEach( s->System.out.println(s));
		
		
		
	}

}
