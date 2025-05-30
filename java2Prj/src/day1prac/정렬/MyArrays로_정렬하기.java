package day1prac.정렬;

public class MyArrays로_정렬하기 {

	public static void main(String[] args) {
		
		Acorn[] list = new Acorn[5];
		
		list[0] = new Acorn("LJH", "이정호", 500);
		list[1] = new Acorn("KMH", "김민환", 600);
		list[2] = new Acorn("KYM", "김유민", 150);
		list[3] = new Acorn("PSK", "박수경", 450);
		list[4] = new Acorn("LSM", "이수민", 83);

		
		// MyComparator() {} => 익명클래스 작성법 (오해금지!!! => 인터페이스를 이름없이 작성하는 것
		// new => 객체생성 
		MyArrays.sort(list, new MyComparator() {

			@Override
			public int compare(Object o1, Object o2) {
				
				Acorn a1 = (Acorn) o1;
				Acorn a2 = (Acorn) o2;
				
				return a1.point - a2.point;
				
			}});
		
		
		//
		System.out.println("정렬 후");
		for(int i=0; i<list.length; i++) {
			Acorn acorn = list[i];
			System.out.println(acorn);
		}
	}

}
