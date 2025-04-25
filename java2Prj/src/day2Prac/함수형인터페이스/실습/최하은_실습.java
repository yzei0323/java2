package day2Prac.함수형인터페이스.실습;

//인터페이스
interface InterPrac {

	  int dan(int a);

}

public class 최하은_실습 {

	public static void main(String[] args) {
		
		System.out.println("이름 있는");
		class GuGu implements InterPrac{

			@Override
			public int dan(int a) {
				int result1=0;
				for(int i=1; i<=9; i++) {
					result1 = a*i;
					System.out.println(a + " x " + i + " = " + result1);
				}
				return result1;
			}
			
		}
		GuGu g = new GuGu();
		g.dan(5);
		
		System.out.println("익명클래스");
		InterPrac r1 = new InterPrac() {

			@Override
			public int dan(int a) {
				int result2=0;
				for(int i=1; i<=9; i++) {
					result2 = a*i;
					System.out.println(a + " x " + i + " = " + result2);
				}
				return result2;
			}
			
		};
		
		r1.dan(2);
		
		System.out.println("람다식");
		InterPrac r2 = (a) -> {
			int result3=0;
			for(int i=1; i<=9; i++) {
				result3 = a*i;
				System.out.println(a + " x " + i + " = " + result3);
			}
			return result3;};
			r2.dan(3);
	}
	
}
