package day3Prac.comparator인터페이스;

public class Main {

	public static void main(String[] args) {
		
		A요리사 a = new A요리사();
		a.구절판만들기();
		a.불고기전골만들기();
		
		
		//김치만두   ㅈㄴ 맛있겠다
		//static 매서드사용법 (객체생성과 무관함
		//인터페이스이름(클래스이름).static매서드 호출
		
		한식요리가가능한.김치만두만들기();
		
		B요리사 b = new B요리사();
		

	}

}
