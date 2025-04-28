package day3Prac.comparator인터페이스;

public interface 한식요리가가능한 {

	void 불고기전골만들기();
	void 구절판만들기();
	
	
	static void 김치만두만들기() {
		System.out.println( "<김치만두만들기>");
		System.out.println( "만두피 만들기");
		System.out.println( "김치넣기");
		System.out.println( "대파및 당면 양념한거 섞기");
		System.out.println( "중불에 15분 찌기");

	}

	// static default 차이
	// 사용법은 default 객체 생성후 사용가능
	// 오버라이드 가능하다
	// 다른 인스턴스 매서드 호출가능하다
	
	
	//공통된 기능을 제공하기 위해서 작성
	default void 김치만두만들기D() {
		
		//김치만들기 호출(), 인스턴스 매서드 호출 가능하다
		김치만들기();
		
		System.out.println( "<김치만두만들기>");
		System.out.println( "만두피 만들기");
		System.out.println( "김치넣기");
		System.out.println( "대파및 당면 양념한거 섞기");
		System.out.println( "중불에 15분 찌기");
	}
	
	void 김치만들기();
}
