package day3Prac.실습;

import java.util.ArrayList;
import java.util.stream.Stream;

public class CustomerMain {

	public static void main(String[] args) {
	
		ArrayList<Customer> list = new ArrayList<>();
		list.add(new Customer("yzei","황예지","vvip",1000));
		list.add(new Customer("renjun","황인준","vip",323));
		list.add(new Customer("jeno","이제노","vip",423));
		list.add(new Customer("haechan","이동혁","bronze",660));
		list.add(new Customer("mark","이민형","vvip",802));
		list.add(new Customer("jaemin","나재민","bronze",814));
		list.add(new Customer("chenle","종천러","vvip",1122));
		list.add(new Customer("jisung","박지성","vip",205));
		list.add(new Customer("do0","김도영","bronze",201));
		list.add(new Customer("jungwoo","김정우","vvip",219));
		
		
		//stream으로 얻어오기
		
		//출력하기
		System.out.println("== list 정보 출력하기 ==");
		Stream<Customer> stream = list.stream();  	//아 여기서 이미 Stream<Customer>해서 밑에는 안해도되나ㅗ바
		stream.forEach( (item) -> {System.out.println(item); });
		
		//요소 개수 출력 (몇명 정보가 들어있는지)
		System.out.println("== list에 몇명 정보 들어있는지 출력 ==");
		stream = list.stream();
		long count = stream.count();
		System.out.println(count+"명");
		
		
		//1. vvip인 사람이 몇명인지 출력
		System.out.println("== vvip가 몇명인지 출력 ==");
		stream = list.stream();
		long count2 = stream.filter(item->item.getGrade().equals("vvip")).count();
		System.out.println(count2+"명");
		
		//2. vip인 사람 누구인지 출력
		System.out.println("== vip인 사람 출력 ==");
		stream = list.stream();
		stream.filter(item->item.getGrade().equals("vip")).forEach(item -> System.out.println(item.toString()));
		
		//3. 포인트 높은 순으로 정렬해서 출력 (내림차순)
		System.out.println("== 포인트순 출력(내림차순) ==");
		stream = list.stream();
		stream.sorted( (o1,o2)-> o2.getPoint()-o1.getPoint()).forEach( item -> System.out.println(item));
		
		
		
	}

}
