package day4Prac.reflect;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class 파일읽기 {

	public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
	
		BufferedReader br = new BufferedReader(new FileReader("src/day4Prac/reflect/config.txt"));
		String line = br.readLine();
		System.out.println(line);
		
		String [] info = line.split("=");
		
		String key = info[0];
		String value = info[1];
		
		System.out.println(value);	//객체생성, 매서드 호출
		
		
		Class clazz = Class.forName(value);
		
		//객체생성하기    //기본생성자
		Member m = (Member)clazz.getDeclaredConstructor().newInstance();
		
		
		//매서드 가져오기
		Method method = clazz.getDeclaredMethod("printInfo");
		Method method2 = clazz.getDeclaredMethod("printSquare", int.class);
		
		//매서드 호출하기
		method.invoke(m);
		method2.invoke(m, 5);
		
		
	}

}
