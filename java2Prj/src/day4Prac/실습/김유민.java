package day1.오늘의요리사;

public class 김유민 extends Cook implements 일식가능한{

	public 김유민(String name) {
		super(name);
		
	}
	
	@Override
	public String 초밥만들기() {
		return "신선한 초밥 만들기";
	}

}
