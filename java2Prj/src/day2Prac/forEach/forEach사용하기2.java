package day2Prac.forEach;

import java.util.ArrayList;
import java.util.function.Consumer;

public class forEach사용하기2 {

	public static void main(String[] args) {
		
		
		ArrayList<String> names = new ArrayList<>();
		
		names.add("윤현기");
		names.add("이정호");
		names.add("박예린");
		names.add("김민환");
		names.add("김유민");
		names.add("박수경");
		names.add("이수민");
		names.add("박시우");
		names.add("이동우");
		names.add("오윤석");
		names.add("정연수");
		names.add("최지태");
		names.add("김보성");
		names.add("임형택");
		names.add("최하은");
		names.add("황예지");

		
		//Consumer 인터페이스
		names.forEach( (item)->{System.out.println(item);} );
		
		System.out.println("======== 출력 한번 더 ========");
		names.forEach( (abc)->{System.out.println(abc);} );
		
		System.out.println("======= 또 출력 =======");
		names.forEach( bb->System.out.println(bb) );
				
		System.out.println("========= 또 또 출력 =========");
		for(String s : names) {	//forEach
			System.out.println(s);
		}
		
		
		
		// 1. 이름있는 클래스로 구현하기 (A 클래스 만들어볼게용   B도 만들게용 이건 제네릭아닌거) 
		// 2. 익명으로 구현하기
		
		names.forEach(new B());		// B클래스객체의 accept...
		//forEach 매서드 내부에 반복문이 있다
		//반복하면서 리스트의 요소를 제공한다
		
		
		//Consumer() {} => 익명클래스 작성하는 방법
		System.out.println("!!!!!!! 익명으로 출력 !!!!!!!!!!");
		names.forEach(new Consumer() {

			@Override
			public void accept(Object t) {
				String s = (String) t;
				System.out.println(s);
			}});
		
		
		//제네릭
		System.out.println("!!!!! 이것도 익명으로 출력인데 이건 제네릭!!!!!!!");
		names.forEach(new Consumer<String>() {

			@Override
			public void accept(String t) {
			
				System.out.println(t + "!!!!!");
				
			}});
		
		
		
		//라이브러리를 사용할 때
		//인터페이스를 구현해야 사용되는 매서드(라이브러리)를 사용할 수 있다
		
		// 1) 이름 있는 클래스
		// 2) 익명클래스
		// 3) 람다식(구현할 약속(매서드)이 한 개인 인터페이스)
	}

}
