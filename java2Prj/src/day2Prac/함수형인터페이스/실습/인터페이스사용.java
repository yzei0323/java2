package day2Prac.함수형인터페이스.실습;

@FunctionalInterface
interface RandomPrint<T> {
	T getRandom(T... t);
}

public class 인터페이스사용 {
	public static void main(String[] args) {
		// 1) 이름이 있는 클래스를 만들고 실행하기
		class Lib implements RandomPrint<Integer> {
			@Override
			public Integer getRandom(Integer... t) {
				return t[(int) (Math.random() * t.length)];
			}
		}
		Lib intRan = new Lib();
		int num = intRan.getRandom(1, 2, 3, 4, 5);
		System.out.println("랜덤으로 뽑은 int : " + num);

		// 2) 익명객체를 만들고 실행하기
		RandomPrint<String> strRan = new RandomPrint<String>() {

			@Override
			public String getRandom(String... t) {
				return t[(int) (Math.random() * t.length)];
			}
		};
		String str = strRan.getRandom("하나", "둘", "삼", "넷", "오");
		System.out.println("랜덤으로 뽑은 String : " + str);

		// 3) 람다식
		RandomPrint<Double> dbRan = t -> t[(int) (Math.random() * t.length)];
		Double db = dbRan.getRandom(1.1, 1.2, 1.3, 1.4, 1.5);
		System.out.println("랜덤으로 뽑은 Double : " + db);
	}

}
