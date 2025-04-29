package day1.오늘의요리사;

public class YerinCook  extends Cook implements 일식가능한 {
	public YerinCook(String name){
		super(name);
	}
	
	@Override
	public String 초밥만들기() {
		return "연어초밥 광어초밥 새우초밥 참치초밥 육회초밥 육사시미초밥 계란초밥";
	}
}
