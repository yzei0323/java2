package day2Prac.함수형인터페이스;

import java.util.ArrayList;

public class 코드실행Main {

	public static void main(String[] args) {
		 
		
		
		
		ArrayList<MyRunnable> list  = new ArrayList<>();		
		
		list.add( new 우주연());
		list.add( new 윤현기());
		list.add( new 박예린()); 
		list.add( new 박수경());
		list.add( new 김유민());
		list.add( new 김보성());
		list.add( new  이수민());
		list.add( new  이동우());
		list.add( new  박시우());
		list.add( new  황예지());
	 
		
		
		
		
		//반복문으로 호출하기
		for(  MyRunnable  r : list) {
			r.run();
		}
		
		
		//forEach로 반복하기		
		list.forEach(  code  -> code.run());
		
		

	}

}
