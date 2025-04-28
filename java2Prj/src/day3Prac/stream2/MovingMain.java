package day3Prac.stream2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Stream;

public class MovingMain {

	public static void main(String[] args) {
	
		
		ArrayList<Moving> list = new ArrayList<>();
		
		list.add( new Moving("장주원" ,"구룡포",100));
		list.add( new Moving("이미현" ,"경기",80));
		list.add( new Moving("김두식" ,"문산",88));
		list.add( new Moving("장주원" ,"구룡포",100));
		
		
		//스트림으로 얻어와서 이름 출력하기
		Stream <Moving> stream = list.stream();
		stream.forEach( (item) -> {System.out.println(item.getName()); });
		// stream.forEach( item -> System.out.println(item.getName()) );
	
		
		//스트림으로 얻어와서 요소 개수 구하기
		System.out.println("스트림으로 얻어와서 요소 개수 구하기");
		stream = list.stream();
		long count = stream.count();
		System.out.println(count);
		
		
		//스트림으로 얻어와서 파워가 90 이상인 요소 출력하기
		System.out.println("스트림으로 얻어와서 파워가 90이상인 요소 개수 구하기");
		stream = list.stream();
		long count2 = stream.filter( item -> item.getPower()>=90).count();
		System.out.println(count2);
		
		
		//스트림으로 얻어와서 파워가 90이상인 요소 출력하기
		System.out.println("스트림으로 얻어와서 파워가 90이상이 요소 출력하기");
		stream = list.stream();
		stream.filter( item -> item.getPower() >= 90).forEach( item -> System.out.println(item));
		
		
		//스트림으로 얻어와서 정렬하고 출력하기 (파워순 오름차순)
		System.out.println("스트림으로 얻어와서 파워순으로 정렬하기(오름차순)");
		stream = list.stream();
		stream.sorted((o1,o2)->o1.getPower() - o2.getPower()).forEach( item->System.out.println(item));
		
		//파워 내림차순
		System.out.println("스트림으로 얻어와서 파워순으로 정렬하기(내림차순)");
		stream = list.stream();
		stream.sorted((o1,o2)->o2.getPower() - o1.getPower()).forEach( item->System.out.println(item));
		
		
		//
		stream = list.stream();
		stream.sorted(Comparator.<Moving,String>comparing((item)->{return item.getName();})).forEach(item->System.out.println(item));
		
	}

}
