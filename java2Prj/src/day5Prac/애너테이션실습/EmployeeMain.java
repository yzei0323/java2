package day5Prac.애너테이션실습;

import java.lang.reflect.Field;


public class EmployeeMain {

	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
 
		Employee e  = new Employee("윤현기" ,"Monday");
		//검증하기(e);
		
		
		
		Employee e2  = new Employee("박예린" ,"Thursday");
		 검증하기(e2);
		

		
	}
	
	

	private static void 검증하기( Object  obj) throws IllegalArgumentException, IllegalAccessException {
		// TODO Auto-generated method stub
		
		//클래스 정보
		
		//  ?  => ? extends Object 
		// Class<?>  clazz  =obj.getClass();
	     Class clazz  =obj.getClass();
	     
	     
	     Field[] fields =  clazz.getDeclaredFields();
	     
	     
	     for(  Field  item  : fields) {
	    	 
	    	 // item  =>필드 객체 	    	 
	    	
	    	 
	    	 
	    	 //애너테이션 값 가져오기 
	    	 
	    	 WeekDaysAvail anno  = item.getAnnotation( WeekDaysAvail.class);
	    	 
	    	 
	    	 if(anno != null ) {
	    		 String value  = (String)item.get(obj);  // Monday
	    		 String[] days= anno.value();  //  {  "Monday", "Friday"}}
	    		 
	    		 
	    		 //확인하기 
	    		 
	    		 boolean result=false;
	    		 for(  String day : days) {
	    			 if(value.equals(day) ) {
	    				 result=true;
	    			 }
	    		 }
	    		 
	    		 
	    		 
	    		 // 
	    		 
	    		 if( result  ==true) {
	    			 System.out.println("해당 요일에 쉴수 있습니다");
	    		 }else {
	    			 System.out.println("해당 요일에 쉴수 없습니다");
	    		 }
	    	 }
	    	 
	    	 
	     }
	     
		
		
		
	}
	
	
	

}
