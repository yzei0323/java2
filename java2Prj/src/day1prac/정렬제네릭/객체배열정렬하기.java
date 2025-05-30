package day1prac.정렬제네릭;

import java.util.Arrays;
import java.util.Comparator;

public class 객체배열정렬하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Acorn[] list = new Acorn[5];
		
		list[0] = new Acorn("LJH", "이정호", 500);
		list[1] = new Acorn("KMH", "김민환", 600);
		list[2] = new Acorn("KYM", "김유민", 150);
		list[3] = new Acorn("PSK", "박수경", 450);
		list[4] = new Acorn("LSM", "이수민", 83);
		
		
		for(int i=0; i<list.length; i++) {
			System.out.println(list[i]);  //list[i].toString();
		}
		
		/*
		interface Comparator {
			int compare(Object o1, Object o2);
		}
		interface Comparator<T>{
			int compareTo(T);
		}
		*/
		
	/*			
		Arrays.sort(list, new Comparator<Acorn>() {

			@Override
			public int compare(Acorn o1, Acorn o2) {
				// TODO Auto-generated method stub
				return o1.getPoint() - o2.point;
			}});
	*/
		
		/*
		Arrays.sort(list, new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				// TODO Auto-generated method stub
				
				Acorn a1 = (Acorn) o1;
				Acorn a2 = (Acorn) o2;
				
				return a1.point - a2.point;
			}});
		*/
		
		for(Acorn acorn : list) {
			System.out.println(acorn);
		}
		
		//
		Arrays.sort(list);
		
		for(Acorn acorn : list) {
			System.out.println(acorn);
		}
		
		
		//매서드 안에서 클래스 정의할 수 있다. 지역내부클래스
		
		class ComparatorImp implements Comparator<Acorn>{

			@Override
			public int compare(Acorn o1, Acorn o2) {
				// TODO Auto-generated method stub
				return o1.name.compareTo(o2.name);
			}
		}
		
		/*
		class ComparatorImp2 implements Comparator{

			@Override
			public int compare(Object o1, Object o2) {
				// TODO Auto-generated method stub
				return 0;
			}
		}
		
		*/
		
		Arrays.sort(list, new ComparatorImp());
		
		//
		for(Acorn acorn : list) {
			System.out.println(acorn);
		}
		
		//2. 익명클래스 작성
		Arrays.sort(list, new Comparator<Acorn>() {

			@Override
			public int compare(Acorn o1, Acorn o2) {
				// TODO Auto-generated method stub
				return o1.name.compareTo(o2.name);	//기준문자열이 뒤에 있으면 양수
													//기준이 비교대상 값보다 앞에 있으면 음수 
			}});
	}
	
}
