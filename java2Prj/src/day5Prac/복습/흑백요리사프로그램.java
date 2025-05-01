package day5Prac.복습;

import java.util.List;

public class 흑백요리사프로그램 {

	요리사리스트 list=null;
	
	
	public void setList(요리사리스트 list) {
		this.list = list;
	}

	
	public void run() {
		
		System.out.println("흑백요리사 프로그램 시작");
		// 1. 흑요리사 또는 백요리사 선택
		
		System.out.println("요리사 명단입니다");
		//
		List<String> cookList = list.getChefList();
		for(String cook : cookList) {
			System.out.println(cook+"요리사");
		}
		
	}


	public static void main(String[] args) {
	
		흑백요리사프로그램 p = new 흑백요리사프로그램();
		//
		//p.setList(new 백요리사리스트());
		p.setList(new 흑요리사리스트());
		p.run();
	
	}

}
