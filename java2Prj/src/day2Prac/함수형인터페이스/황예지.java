package day2Prac.함수형인터페이스;

public class 황예지 implements MyRunnable {

	@Override
	public void run() {
		int sum=0;
		for(int i=1; i<=10; i++){
			if(i%2==0) {
				sum+=i;
			}
		}
		System.out.println("1부터 10까지 짝수를 더해봤어용>,< ㅋㅋ " + sum);
		
	}

}
