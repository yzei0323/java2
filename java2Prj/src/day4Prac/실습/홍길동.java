package day4Prac.실습;

public class 홍길동 implements Cook {

	@Override
	public String cook(String food) {
		System.out.println("길동Cook");
		return food;
	}

	@Override
	public void 돼지불백만들기() {
		System.out.println("길동Cook");
		
	}

	@Override
	public void 모둠쌈밥만들기() {
		System.out.println("길동Cook");
		
	}

	@Override
	public void 불고기된장찌개만들기() {
		System.out.println("길동Cook");
		
	}

}
