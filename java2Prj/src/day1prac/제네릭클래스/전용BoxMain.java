package day1prac.제네릭클래스;

public class 전용BoxMain {

	public static void main(String[] args) {
		
		
		BoxInteger box1 = new BoxInteger();
		box1.setItem(3); // 3 -> Integer객체로 자동으로 만들어줌 auto Boxing
		int result = box1.getItem();
		
		
		BoxString box2 = new BoxString();
		box2.setItem("문자열전용");
		String result2 = box2.getItem( );
		System.out.println(result2);
		
		
		BoxAcorn box3 = new BoxAcorn();
		box3.setItem(new Acorn("KYM", "김유민"));
		box3.getItem();
		
		
		//
		BoxG<Integer> gbox1 = new BoxG<>();
		gbox1.setItem(10);
		Integer gresult = gbox1.getItem();
	 
		BoxG<String> gbox2 = new BoxG<>();
		gbox2.setItem("문자열 담긴다");
		String gresult2 = gbox2.getItem();
		
		BoxG<Acorn> gbox3 = new BoxG<>();
		gbox3.setItem(new Acorn("KYM", "김유민"));
		Acorn gresult3 = gbox3.getItem();
		System.out.println(gresult3);
	}

}
