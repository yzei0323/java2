package day1prac.정렬;

public class this확인하기 {

	public static void main(String[] args) {

		Acorn a = new Acorn("PSW", "박시우", 250);
		Acorn b = new Acorn("LDW", "이동우", 100);

		
		int result = a.compareTo(b);
		//a가 기준 b가 비교대상
		//compareTo 메서드를 호출한 객체a가 this

		System.out.println(result);
		//값이 양수,음수,0 중에 뭐인지 확인하고 교환해서 정렬하는거
	}

}
