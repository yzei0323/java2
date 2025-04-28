package day3Prac.stream1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.stream.IntStream;

public class 로또만들기 {

	public static void main(String[] args) {
	
		//
		Set<Integer> lottos = new HashSet<>();  //중복제거
		
		Random r = new Random();
		
		for(int i=0; i<20; i++) {
			lottos.add(r.nextInt(46));
		}
		
		System.out.println("숫자 하나만 출력");
		System.out.println(lottos.size());
		
		Integer[] result = new Integer[6];
		Object[] lottoArray = lottos.toArray();	//set -> 난수배열 (6개만) -> 새로운 복사하기
		
		System.arraycopy(lottoArray, 0, result, 0, 6);
		//그니까 lottoArray를 result에 복사하는거임 ㅇㅇ 그리고 result를 출력하는거
		
		// lottoArray
		// 0  1  2 3  4  5  6  7  8  9  10  11  12  13  14
		// 7 44 45 5 18 11 15 20  28
		
		System.out.println(Arrays.toString(result));
		
		//스트림으로 로또번호
		System.out.println("스트림으로 로또번호 생성후 출력하기");
		IntStream stream = new Random().ints(1,46);
		stream.distinct().limit(6).sorted().forEach(lotto->System.out.print(lotto+", "));
		//distinct 중복제거  limit 개수  sorted 정렬
	}

}
