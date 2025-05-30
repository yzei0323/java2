package day1prac.정렬;

import java.util.Arrays;
import java.util.Comparator;

public class 객체배열정렬하기 {

	public static void main(String[] args) {

		
		Acorn[] list = new Acorn[5];
		
		list[0] = new Acorn("LJH", "이정호", 500);
		list[1] = new Acorn("KMH", "김민환", 600);
		list[2] = new Acorn("KYM", "김유민", 150);
		list[3] = new Acorn("PSK", "박수경", 450);
		list[4] = new Acorn("LSM", "이수민", 830);
		
		
		
		//0~4
		for(int i=0; i<list.length; i++) {
			Acorn acorn= list[i];
			System.out.println(acorn);		//acorn.toString();
		
		}
		
		//정렬하기 포인트순(오름차순)
//		Arrays.sort(list);
		///이대로 실행하면 오류가 납니다
		
		//
		System.out.println("포인트순 정렬, 오름차순");
		for(int i=0; i < list.length; i++) {
			Acorn acorn = list[i];
			System.out.println(acorn); //acorn.toString();
		}
		
		//정렬하기(오름차순)
		
		Arrays.sort(list, new Comparator() {

			@Override
			public int compare(Object o1, Object o2) { //기준, 비교
				// TODO Auto-generated method stub
				
				Acorn a1 = (Acorn)o1;
				Acorn a2 = (Acorn)o2;
				
				return a1.point - a2.point;	  // 기준이 크면 양수가 전달됨
			}});
		
		
		System.out.println("정렬 - 포인트순");
		
		System.out.println("포인트순 정렬, 오름차순");
		for(int i=0; i < list.length; i++) {
			Acorn acorn = list[i];
			System.out.println(acorn); //acorn.toString();
		}
		
	}

}
