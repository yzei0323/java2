package day2.lamda.매개변수전달;

import java.util.ArrayList;
import java.util.function.Consumer;

public class 매개변수로전달된_람다식3 {

	public static void main(String[] args) {
		 
		
		ArrayList<String> list  = new ArrayList<>();
		
		list.add("장경호");
		list.add("최문길");
		list.add("용지민");
		list.add("송병화");
		
		
		
		list.forEach(  new Consumer< String> () {

			@Override
			public void accept(String t) {
				  System.out.println( t);
				
			}}); 
		
		
		//함수형인터페이스라면  람다식으로 
		list.forEach( t -> System.out.println( t));
		
	 
		
	}

}
