package day5Prac.애너테이션실습;

public class MyLib {

	@Before(before="매서드 실행시작합니다 ====== ^^" )
	public void printStar() {
		System.out.println("***");
	}
	
	
	public void printStar2(int num) {
		for(int i=0; i<=num; i++) {
			System.out.println("*");
		}
	}
}
