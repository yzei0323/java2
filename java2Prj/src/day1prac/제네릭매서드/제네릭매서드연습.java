package day1prac.제네릭매서드;

public class 제네릭매서드연습 {
	
	//
	public static int 선택하기int(int a, int b) {
		
		double r = Math.random(); // 0~1 미만의 임의 난수 
		
		//return r > 0.5 ? a: b;
		
		if(r>0.5) {
			return a;
		}else {
			return b;
		}
	}
	
	//
	public static String 선택하기String(String a, String b) {
		double r = Math.random();
		
		return r > 0.5 ? a: b;
	}
	
	//
	public static boolean 선택하기boolean(boolean a, boolean b) {
		double r = Math.random();
		
		return r > 0.5 ? a: b;
	}
}
