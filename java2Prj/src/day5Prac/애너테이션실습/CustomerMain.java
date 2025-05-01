package day5Prac.애너테이션실습;

import java.lang.reflect.Field;

public class CustomerMain {

	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
		// TODO Auto-generated method stub
		
		
		//
		Customer c  = new Customer("홍길동", "010-111-22222121212121");

		// customer  객체 검증하기 	
		검증하기(  c);
		
		
	}

	private static void 검증하기( Object c ) throws IllegalArgumentException, IllegalAccessException {
		 
		
		//1. 객체에 대한 클래스 정보 얻어오기 
		Class clazz  =c.getClass();		
		
		
		//2. 필드정보 가져오기 
		
		Field[] fields  = clazz.getDeclaredFields();
		
		//3. 필드에 애너테이션 정보 가져오기 
		//4. 실제값과 애너테이션 정보 값을 판별하기 
		
		for( Field field : fields ) {			
			
			//각 필드정보 가져오기  , 필드이름, 필드의 실제값, 필드타입 , 필드 애너테이션 정보			
			    MAXLen  anno =field.getAnnotation(MAXLen.class);  //필드에 애너테이션 	 		
		 		
		 		if( anno != null) {
		 		    String name  = field.getName();  // 필드이름
			 		String value  =(String)field.get( c);  //필드의 값  (객체의 정보제공해야 함)
		 		 	
			 		int maxlen =anno.length();			 		
			 		
			 		if( value.length()  <=  maxlen){			 			
			 			System.out.println("성공");
			 		}else {
			 			System.out.println("실패");
			 			throw new  RuntimeException("검증실패");
			 		}
			 			 			
		 		} 
		} 
	}
	
	

}
