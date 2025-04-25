package day2Prac.함수형인터페이스;

public class MyRunnable인터페이스구현 {

	public static void main(String[] args) {
		
		//1. 이름있는 클래스
		우주연 a = new 우주연();
		a.run();
		
		MyRunnable r = a;  
		r.run();
		
		///내거
		황예지 s = new 황예지();
		s.run();
		MyRunnable ye = s;
		ye.run();
		
		
		//2. 익명
		MyRunnable r2 = new MyRunnable() {

			@Override
			public void run() {

				// 실행하고 싶은 코드 작성하기
				System.out.println("익명 구현 헤헤 배고프다");
			}};
			
		//익명으로 구현하고 실행하기
		r2.run();
		
		
		///내거
		MyRunnable ye2 = new MyRunnable() {

			@Override
			public void run() {
				int sum=0;
				for(int i=1; i<=10; i++){
					if(i%2==0) {
						sum+=i;
					}
				}
				System.out.println("1부터 10까지 짝수를 더해봤어용>,< ㅋㅋ " + sum);
			}};
			
		
		//3. 람다식
		MyRunnable r3 = ()->{ System.out.println("람다입니다람쥐푸핫"); };
		
		r3.run();  //호출을 까먹으시면 안됩니다용
		
		
		///
		MyRunnable ye3 = ()->{
		
			int sum=0;
			for(int i=1; i<=10; i++){
				if(i%2==0) {
					sum+=i;
				}
			}
			System.out.println("1부터 10까지 짝수를 더해봤어용>,< ㅋㅋ " + sum);
		};
		
		ye3.run();  //호출을 까먹으시면 안됩니다용
		
		
		
		}
	}
