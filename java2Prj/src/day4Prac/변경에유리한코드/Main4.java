package day4Prac.변경에유리한코드;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

public class Main4 {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
	
		Animal animal = getAnimal();
		animal.bark();
		
		Animal animal2 = getAnimal();
		animal2.bark();
		
	}

	
	private static Animal getAnimal() throws FileNotFoundException, IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		// TODO Auto-generated method stub
		
	//	return new Dog();
	//	return new Cat();
		
		Properties p = new Properties( );
		p.load(new FileReader("src/day4Prac/변경에유리한코드/config.txt"));
		String name = (String) p.get("Animal");
		
		System.out.println(name);	//day4Prac.변경에유리한코드.Dog
		//클래스이름을 가지고 동적으로 객체를 생성하기
		
		Class clazz = Class.forName(name);
		
		// 클래스정보를 가진 객체를 통해서 인스턴스(객체)를 생성할 수 있다
		Animal animal = (Animal)clazz.newInstance();
		//clazz.getDeclaredConstructor().newInstance();
		
		return animal;
	}

}
