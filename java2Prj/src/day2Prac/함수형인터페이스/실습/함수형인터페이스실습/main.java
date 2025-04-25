package day2Prac.함수형인터페이스.실습.함수형인터페이스실습;


public class main
{
	public static void main(String[] args)
	{
		// 1
		cal a = new add();
		cal s = new sub();
		cal m = new mul();
		cal d = new div();
		
		System.out.println(a.cal(10, 10));
		System.out.println(s.cal(10, 10));
		System.out.println(m.cal(10, 10));
		System.out.println(d.cal(10, 10));
		
		// 2
		cal a2 = new cal() {
			@Override
			public int cal(int a, int b) {
				return a + b;
			}
		};
		
		cal s2 = new cal() {
			@Override
			public int cal(int a, int b) {
				return a - b;
			}
		};
		
		cal m2 = new cal() {
			@Override
			public int cal(int a, int b) {
				return a * b;
			}
		};
		
		cal d2 = new cal() {
			@Override
			public int cal(int a, int b) {
				return a / b;
			}
		};
		
		System.out.println(a2.cal(10, 10));
		System.out.println(s2.cal(10, 10));
		System.out.println(m2.cal(10, 10));
		System.out.println(d2.cal(10, 10));
		
		// 3
		cal a3 = (x, y) -> x + y;
		cal s3 = (x, y) -> x - y;
		cal m3 = (x, y) -> x * y;
		cal d3 = (x, y) -> x / y;

		System.out.println(a3.cal(10, 10));
		System.out.println(s3.cal(10, 10));
		System.out.println(m3.cal(10, 10));
		System.out.println(d3.cal(10, 10));
	}
}
