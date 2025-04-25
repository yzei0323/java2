package day2Prac.forEach;

import java.util.ArrayList;
import java.util.function.Consumer;

import day2Prac.복습실습.Moving;

public class forEach사용하기 {

	public static void main(String[] args) {
		
		ArrayList<Moving> list = new ArrayList<>();
		
		list.add(new Moving("장주원", "구룡포", 100));
		list.add(new Moving("이미현", "경기", 80));
		list.add(new Moving("김두식", "문산", 90));
		list.add(new Moving("전영석", "봉평" , 88));
		
		
		//출력
		for(Moving m : list) {
			System.out.println(m);
		}
		
		
		/*	
		interface Consumer<T>
		{
			void accept (T t);
		}
		
		
		interface Consumer{
			void accept (Object o);
		}
	 	*/
		
		
	//	Consumer 인터페이스를 익명으로 구현 
	//	1) 이름있는 클래스로 구현   2) 익명 클래스   3) 람다식(함수형 인터페이스만 가능!)
		
		list.forEach(new Consumer() {

			@Override
			public void accept(Object t) {
				
				Moving m = (Moving) t;
				System.out.println( m.getName() + m.getAlias() + " 안녕하세요 저는 도영콘서트를 가야합니다" );
			}});
		
		
		list.forEach(new Consumer<Moving>() {

			@Override
			public void accept(Moving t) {
				System.out.println(t.getName()+t.getAlias()+" 3층 절대 안갈거임 ㅛㅂ");
				
			}});
		
		
		// Consumer 인터페이스를 구현하는 방법 -> 람다식으로 구현 (함수형 인터페이스만 가능!)
		list.forEach( (abc)->{System.out.println(abc.getName()+abc.getAlias()+" 람다람다 이거 정처기에 나왔던 것 같음 개같은거");} );
		// ()->{}   이거를 쓰셍요 이게 제일 좋음
		
		
		//중괄호를 생략할 수도 있음 근데 일단 위에거를 쓰는게 좋다 ㅇㅋㅇㅋ
		//매개변수가 없는 경우에는 생략을 할 수 업성요 글구 수행할 코드가 한줄일 경우에만 생략가능합니다 
		list.forEach( item -> System.out.println(item.getAlias()) );
		
	}

}
