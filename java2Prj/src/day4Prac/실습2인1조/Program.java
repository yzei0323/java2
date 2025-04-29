package day4Prac.실습2인1조;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;
import java.util.Scanner;

public class Program {
	
	Teach teach;


	public void setTeach(Teach teach) {
		this.teach = teach;
	}

	public void run() {
		System.out.println("열심히 공부합시다");
		while(true) {
			System.out.println("어느 과목 수업 들으실건가요? ");
			System.out.println("1.국어  2.영어  3.수학");
			Scanner sc = new Scanner(System.in);
			String subject = sc.next();
			
			switch (subject) {
			case "국어":
				teach.국어수업듣기();
				System.out.println(subject+" 수업 열심히 들으세요~");
				return;
			case "영어":
				teach.영어수업듣기();
				System.out.println(subject+" 수업 열심히 들으세요~");
				return;
			case "수학":
				teach.수학수업듣기();
				System.out.println(subject+" 수업 열심히 들으세요~");
				return;
			default:
				System.out.println("다른 과목 선택하세요!");
			}	
		}
			
	}



	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		
	//	Program p = new Program(new 김선생님());
	//	Program p = new Program(new 박선생님());
	//	p.run();
		
		Properties properties = new Properties();
		properties.load(new FileReader("src/day4Prac/실습2인1조/config.txt"));
			
		String name = (String) properties.get("Teach");
			
		Class clazz = Class.forName(name);
		Teach teach = (Teach) clazz.getDeclaredConstructor().newInstance();
		
		Program p = new Program(); 
		p.setTeach(teach);
		p.run();
	}

}
