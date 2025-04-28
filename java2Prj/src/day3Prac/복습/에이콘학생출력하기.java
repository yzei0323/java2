package day3Prac.복습;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Consumer;

public class 에이콘학생출력하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	  ArrayList< Acorn> list  = new ArrayList<>();
	  
	  
	  list.add( new Acorn("test01" ,"1234"));
	  list.add( new Acorn("test02" ,"0000"));
	  list.add( new Acorn("test03" ,"9999"));
	  
	  
	  
	  //출력하기 
	  list.forEach(  ( item)->{ System.out.println( item.getId() +" "+ item.getPw()); });
	  
	  
	  
	  list.forEach(   new Consumer<Acorn>() {
		@Override
		public void accept(Acorn t) {
			// TODO Auto-generated method stub
			System.out.println( t.getId() +" "+ t.getPw());			
		}});
	  
	  
	  
	  //   Consumer <? super Acorn> 
	  //  <>  -> Acorn 과 Acorn 부모까지 허용
	   list.forEach(   new Consumer<Object>() {
		@Override
		public void accept(Object t) {
			// TODO Auto-generated method stub
			 Acorn acorn = (Acorn)t;
			System.out.println( acorn.getId() +" "+ acorn.getPw());			
		}});
	  
	  
	   
	   //이름있는 클래스로 구현
	  
	  class AA implements Consumer<Acorn>{

		@Override
		public void accept(Acorn t) {
			System.out.println( "이름 있는 클래스로 구현" + t) ;
			
		}
		  
	  }
	   
	  list.forEach( new AA());
	   
	   
	   
	   
	  //정렬하기
	  
	  //ArraysList  => Collections 라이브러리
	  //Collections.sort(list);   => 정렬의 기준이 객체요소에 있어야 함 !   Comparable   구현해야함 
	  
	  Collections.sort(list,   new Comparator<Acorn>() {

		@Override
		public int compare(Acorn o1, Acorn o2) {
			// TODO Auto-generated method stub
			return  o1.getId().compareTo( o2.getId());   // 기준의 문자열이 사전상뒤에 있으면 양수가 전달됨 
		}});
	  
	  
	  
	  
	  
	  
	  //출력하기
	  
	  list.forEach( ( item)->{ System.out.println( item +"람다식1");});
		 
	  
	  //매개변수 한 개  -> 괄호 생략
	  //수행할 코드가 한 줄 인경우  -> 중괄호블럭 생략 
	  list.forEach( item  -> System.out.println( item +"람다식2") );
	  
	  
	  
	  
	  list.sort(( o1, o2)-> o1.getPw().compareTo(o2.pw));
	  list.sort( (o1, o2)  -> { return   o1.getPw().compareTo(o2.pw) ; });	  
	  list.sort(( o1, o2)->{ return  o1.getPw().compareTo( o2.pw) ;});	  
	  list.sort((o1, o2) -> o1.getPw().compareTo(o2.pw) );
	  
	  
	  
	  
	  
	  
	  
	  
	  

	}

}
