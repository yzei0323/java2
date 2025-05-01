package day5Prac.애너테이션실습;

import java.lang.reflect.Field;

public class StoreMain {

	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
		
		
		//Store객체 검증하기 
		
		
		Store s  = new Store(5,10 );
		
				
		//필드에 정해진 애너테이션의 정보와 같은지 검증하기 
		
		
		//1. 객체의 클래스의 정보가져오기 
		
		Class clazz  = s.getClass();
		
		
		//2. 선언된 필드정보 가져오기 
		Field[] fields  =   clazz.getDeclaredFields();
		
		
		for(  Field field : fields ) {			
			//
			 System.out.println( field.getName()  +   field.get( s));	
			Count  anno =field.getAnnotation(Count.class);
			
			System.out.println( "애너테이션"  + anno);
			 
			if(anno != null ) {  // Count애너테이션을 필드가 가지고 있으면
				
				//애너테이션에 설정된 값
				int  expectedValue  = anno.value();				
				
				//실제 객체의 필드(속성)의 값 
				int value  = (int)field.get( s);
				System.out.println( expectedValue   +":" + value  );	
				//비교
				
				
				if(expectedValue  == value  ) {
					System.out.println( "성공");
				}else {
					System.out.println( "실패");
				}
			 
			}			
			
			
			 
			
		}
		
		
		
		
		

	}

}
