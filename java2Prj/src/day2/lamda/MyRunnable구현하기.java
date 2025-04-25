package day2.lamda;

import java.util.ArrayList;

interface MyRunnable{
	void run();
}


// MYRunnable 인터페이스 람다식으로 구현하기

public class MyRunnable구현하기 {

	public static void main(String[] args) {
	 
	 
		MyRunnable  r0 = new MyRunnable(){

			@Override
			public void run() {
				   System.out.println(" run~~~~"); 
				
			}};
		
	   r0.run();		
		
		
		MyRunnable  r =  () ->{			
			System.out.println("run !!!! lamda");		
			
		};				
		r.run();
		
		//수행할 코드가 한 줄인경우  {   } 중괄호 블럭 생략할 수 있다.
		MyRunnable r1 = () -> System.out.println("hi");
		r1.run();
		
		 
		
		
		MyRunnable r2 = () ->{			
			
			System.out.println("<<에이콘 학생명단입니다 화이팅^^ >>");
			String[] names= {"김도현",  "김무궁",  "김세중",   "김세현",  "김솔",  "김정석",  "김채운",   "백바울",  "소병학",  "송병화",  "송수빈", "용지민", "이상민",  "이효진", "장경호", "전우선", "전지형", "전우선",  "정보란", "주상길","주형준", "최문길", "최형진", "하예진", "황지영"
		 };

			for( String name : names) {
				System.out.println( name);
			} 
		};
		
		
		
		r2.run();
		
		
		 
			
			
			

	}

}
