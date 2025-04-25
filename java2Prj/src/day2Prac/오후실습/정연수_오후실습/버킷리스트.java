package day2Prac.오후실습.정연수_오후실습;

import java.util.ArrayList;

public class 버킷리스트 {

	
	
	public static void main(String[] args) {
		
		Runnable r = () -> {
			ArrayList<String> bucketList = new ArrayList<>();
			bucketList.add("내집 마련");
			bucketList.add("나만의 취미공간 꾸미기");
			bucketList.add("일본 도보 일주");
			bucketList.add("유럽 배낭여행");
			System.out.println(bucketList);
		};
		r.run();
		
	}
}
