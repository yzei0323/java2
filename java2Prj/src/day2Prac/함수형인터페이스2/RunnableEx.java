package day2Prac.함수형인터페이스2;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class RunnableEx {

	public static void main(String[] args) {
		
		
		/*
		 interface Runnable{
		 	void run();
		 } 
		*/

		Runnable r = new Runnable() {

			@Override
			public void run() {
				
				System.out.println("익명 run !!");
				
			}};
			
		r.run();
		
		
		//
		Runnable r2 = ()->{
			System.out.println("람다 run !!");
		};
		
		r2.run();
		
		
	/*	//제네릭타입은 객체타입가능하 , int -> Integer, double -> Double
		
		interface Consumer<T> {
			void accept(T t)
		}
	*/	
		
		Consumer<Integer> c = new Consumer<Integer> () {

			@Override
			public void accept(Integer t) {
				
				t=t-100;
				t=t-200;
				System.out.println(t);
				
			}};
			
		c.accept(1000);
			
			
		//
		Consumer<String> c2 = (str)->{System.out.println(str);};
		c2.accept("람다 조아~~ 월요일 좋아~~");
		
		ArrayList<String> likes = new ArrayList<>();
		likes.add("책");
		likes.add("커피");
		likes.add("사과");
		
		
		//
		likes.forEach( (item)->{System.out.println(item+" 람다");});
		
		likes.forEach(new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println(t + " 익명");				
			}});
		
		
		// Supplier<T> T get()
	      /*
	       
	        interface Supplier<T>{ T get(); }
	       
	      */

		Supplier<String> s = ()->{ return "람다로 구현한 문자열";};
		
		String result = s.get();
		System.out.println(result);
		
		Supplier<String> s2 = new Supplier<String>() {

			@Override
			public String get() {
				
				return "~~~ !! 익명 문자열 제공";
			}};
		
		String result2 = s2.get();
		System.out.println(result2);
		
		
		
		//
		class A implements Supplier<String>{

			@Override
			public String get() {
				
				return "문자열 이름있는 클래스로 구현";
			}};
			
		A a = new A();
		String result3 =a.get();
		System.out.println(result3);
		
		
		//
		/*
		interface Predicate<T>{
			Boolean test(T t);
		}
		*/
		
		Predicate<String> p = (str)->{
			
			if(str.equals("hello")) {
				return true;
			}else {
				return false;
			}
		};
		
		boolean resultb = p.test("hello");
		boolean resultb2 = p.test("hello!");
		
		System.out.println(resultb);
		System.out.println(resultb2);
		
		
		//매개변수로 숫자를 입력 받아서 짝수판단 (true, false)
		Predicate<Integer> p2 = new Predicate<Integer>() {

			@Override
			public boolean test(Integer t) {
				if(t%2==0) {
				return true;
				}else {
					return false;
				}
			}};
			
		boolean rtn1 = p2.test(10);
		boolean rtn2 = p2.test(7);
		
		System.out.println(rtn1);
		System.out.println(rtn2);
		
		
		//
		/*
		interface Function<T, R> {
			R apply(T t);
		}
		*/
		
		
		Function<Integer, Integer> f = (num)->{ return num*2 ;};
		int rtn3 = f.apply(100);
		
		System.out.println(rtn3);
		
		
		//
		Function<Integer, int[]> f2 = (num)->{
			int[] arr = {9,10,3};
			return arr;
		};
		
		
		int[] rtn4 = f2.apply(1000);
		
		for(int i=0; i<rtn4.length; i++) {
			System.out.println(rtn4[i]+" ");
		}
	}
}
	
	
 