package day4Prac.계산기프로그램;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;
import java.util.Scanner;

public class Program8 {

	//직접 생성하지 않고 외부에서 생성된 계산기 객체 주입하기
	//세터주입
	Calculator calculator;
	
	
	//세터주입
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}
	
	
	public void run() {
		
		System.out.println("프로그램 시작 ~!! ver7");
		System.out.println("두 수를 입력하세요");
		
		Scanner sc = new Scanner(System.in);
		int su1 = sc.nextInt();
		int su2 = sc.nextInt();
		
		int total = calculator.add(su1, su2);
	
		System.out.println(total);
	}
	
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
	
		//Program8 p = new Program8();
		//p.setCalculator(new A());
		//p.setCalculator(new B());
		//p.run();
		
		
		Properties properties = new Properties();
		properties.load(new FileReader("src/day4Prac/계산기프로그램/config.txt"));
		//꺼내오기
		String name = (String) properties.get("Calculator");
		
		
		Class clazz = Class.forName(name);
		Calculator calculator = (Calculator)clazz.getDeclaredConstructor().newInstance();
		
		Program8 p = new Program8();
		p.setCalculator(calculator);
		p.run();
		
		
		//소스를 바꾸는게 아니라 메모장에 config.txt파일에 .A .B만 바꾸면 바뀜 대박 오~~~
		
		

	}

}
