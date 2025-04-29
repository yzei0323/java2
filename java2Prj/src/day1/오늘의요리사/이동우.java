package day1.오늘의요리사;

public class 이동우 extends Cook implements 한식가능한{

	public 이동우(String name) {
		super(name);
	}
	
	@Override
	public String 비빔밥만들기() {
		
		return "이동우 비빔밥 만들기";
	}

}
