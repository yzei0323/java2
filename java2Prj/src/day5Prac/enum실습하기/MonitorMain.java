package day5Prac.enum실습하기;

public class MonitorMain {

	public static void main(String[] args) {
	
		
		Monitor monitor = new Monitor("와이드모니터", "DARK", "삼성");
		Monitor monitor2 = new Monitor("소형모니터", "LIGHT", "LG");
		Monitor monitor3 = new Monitor("중형모니터", "YELLOW", "삼성");
		
		System.out.println(monitor);
		System.out.println(monitor2);
		System.out.println(monitor3);
	}

}
