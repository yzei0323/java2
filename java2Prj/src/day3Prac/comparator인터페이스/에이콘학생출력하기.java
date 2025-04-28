package day3Prac.comparator인터페이스;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class 에이콘학생출력하기 {

	public static void main(String[] args) {
		
		
		ArrayList< Acorn> list  = new ArrayList<>();
		  
		  
		  list.add( new Acorn("test01" ,"1234"));
		  list.add( new Acorn("test02" ,"0000"));
		  list.add( new Acorn("atest03" ,"9999"));
		  
		  
		  //정렬하기
		  
		  
		  //Comparator 인터페이스를 사용
		  Collections.sort(list, new Comparator<Acorn>() {

			@Override
			public int compare(Acorn o1, Acorn o2) {	//o1: 기준, o2: 비교
				
				return o1.getId().compareTo(o2.getId());	//기준이 사전상 뒤에 있으면 양수가 전달됨
					
			}});
		  
		  
		  list.forEach(item -> System.out.println(item));
		  
		  System.out.println("비번으로 정렬");
	//	  Collections.sort(list, (o1,o2)->{return o1.getPw().compareTo(o2.getPw());});
		  Collections.sort(list, (o1,o2)->o1.getPw().compareTo(o2.getPw()));
		  
		  list.forEach(item -> System.out.println(item));
		  
		  
		  
		  //제네릭 static매서드
		  //에이콘학생 아이디로 정렬
		  System.out.println("아이디로 정렬");
		  Collections.sort(list, Comparator.<Acorn,String>comparing(item->item.getId() ));
		  list.forEach(item -> System.out.println(item));
		  
		  
		  //에이콘학생 이름으로 정렬
		  System.out.println("이름으로 정렬");
		  Collections.sort(list, Comparator.<Acorn,String>comparing( (item)->{return item.getPw();}));
		  Collections.sort(list, Comparator.<Acorn,String>comparing( (item)-> item.getPw() ));
		  
		  list.forEach(item->System.out.println(item));
		  
		  
		  //에이콘학생 비밀번호 정렬, 역순으로 (내림차순)
		  Collections.sort(list, Comparator.<Acorn, String>comparing((item)->{return item.getPw();}).reversed());
		  
		  System.out.println("비밀번호 역순으로 정렬");
		  list.forEach(item->System.out.println(item));
		  
		  
		  Collections.sort(list, new Comparator<Acorn>() {

			@Override
			public int compare(Acorn o1, Acorn o2) {
				//오름차순 //반대로 내림차순
//				return o1.getPw().compareTo(o2.getPw());  //기준(앞에 있는 애)가 크면 자리 교환 -> 오름차순
				return o2.getPw().compareTo(o1.getPw());  // 뒤-앞 
			}});
		  
		  System.out.println("비밀번호 역순으로 정렬2");
		  list.forEach(item->System.out.println(item));
		  
	}

}
