package day1prac.정렬;

public class 변수교환하기 {

	public static void main(String[] args) {

		int a=10;
		int b=20;

		System.out.println("a="+a);
		System.out.println("b="+b);
		 
		//교환하기 (자료형은 그 뭐야 교환할 객체의?? 자료형이랑 같아야함)
		
		//임시변수
		int temp;
		temp=a;
		a=b;
		b=temp;
		
		System.out.println("a="+a);
		System.out.println("b="+b);
	}

}
