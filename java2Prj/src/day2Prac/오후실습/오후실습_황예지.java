package day2Prac.오후실습;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class 오후실습_황예지 {

	public static void main(String[] args) {
		
		//1. Runnable 버킷리스트 출력 - 입력없 반환없
		Runnable r = ()->{
			System.err.println("2025 나의 버킷리스트");
			System.out.println("블로그 매달 쓰기~~ 이미 글렀음");
		};
		r.run();
		
		//2. Consumer 3만원으로 장보기 - 입력있 반환없
		Consumer<Integer> c = (money)->{
			System.err.println(money+"원으로 샤브샤브 장보기");
			
			money-=8000;
			System.out.println("우삼겹: 8000원  잔액:"+money+"원");
			money-=2000;
			System.out.println("청경채: 2000원  잔액:"+money+"원");
			money-=3000;
			System.out.println("알배추: 3000원  잔액:"+money+"원");
			money-=2000;
			System.out.println("숙주: 2000원  잔액:"+money+"원");
			money-=1500;
			System.out.println("팽이버섯: 1500원  잔액:"+money+"원");
			money-=3000;
			System.out.println("가쓰오부시장국: 3000원  잔액:"+money+"원");
			money-=4000;
			System.out.println("스위트 칠리소스: 4000원  잔액:"+money+"원");
			
			System.out.println(money+"원이나 남았잖아~~~ 대박");
		};		
		c.accept(30000);
		
		//3. Supplier 요리만들기 -입력없 반환있
		Supplier<String> s = ()->{
			System.err.println("샤브샤브 레시피");
			System.out.println("1. 냄비에 물 1L와 가쓰오부시장국 반컵을 넣고 끓입니다.");
			System.out.println("2. 숙주, 알배추, 청경채, 팽이버섯을 먹기 좋은 크기로 자릅니다.");
			System.out.println("3. 냄비에 손질한 야채를 모두 넣어줍니다.");
			System.out.println("4. 우삼겹도 냄비 가운데에 넣어주고 뚜껑을 닫습니다.");
			System.out.println("5. 팔팔 끓을 때까지 기다리면 끝~~");
			System.out.println("6. 다 건져먹고 우동 넣거나 계란죽 먹으면 됩니다~~~~");
			return "샤브샤브";
			
		};
		
		String result = s.get();
		System.out.println(result);
		
		//4. Predicate 요리 확인하기 -입력있 반환있
		Predicate<String> p = (str)->{
			if(str.equals(result)) {
				return true;
			}else {
				return false;
			}
		};
		
		System.err.println("이게 정말 제가 만든 요리가 맞나요??????");
		boolean resultBoolean = p.test("샤브샤브");
		if(resultBoolean) {
			System.out.println("정답입니다~");
		}else {
			System.out.println("틀렸습니다ㅜ,ㅜ");
		}
		
		
		
		
		
	}
}
