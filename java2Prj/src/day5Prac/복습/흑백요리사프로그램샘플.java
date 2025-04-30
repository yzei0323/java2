package day5Prac.복습;

import java.util.List;
import java.util.Scanner;

public class 흑백요리사프로그램샘플 { 
	
	요리사리스트  list=null;
	
	public void setList(요리사리스트 list) {
		this.list = list;
	}

	
	public void run() {		
		
		System.out.println("흑백요리사 프로그램 시작");			
		System.out.println("요리사 명단 입니다" );		
		//
		List<String> cookList  = list.getChefList();
		for( String   cook: cookList) {
			System.out.println(cook+"요리사");
		}
		
	} 
	
	
	
	
	
	

	public static void main(String[] args) {
		 
		흑백요리사프로그램샘플 p = new 흑백요리사프로그램샘플();
	
		// 1.흑요리사 , 또는 백요리사 선택				
		Scanner sc = new Scanner (System.in);		 
		System.out.println("요리사 선택 1.백요리사, 2.흑요리사");
		요리사리스트  cooklist= null;
		int choice  = sc.nextInt();		
		if( choice  == 1) {
			cooklist  = new  백요리사리스트();			
			
		}else if(choice  == 2) {
			cooklist  = new  흑요리사리스트();	
		}		
		
		//요리사리스트 세터 주입
		p.setList( cooklist  );
		 
		 //흑백요리사프로그램 실행하기 
		p.run();

	}

}
