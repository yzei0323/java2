package day4Prac.실습;

import java.util.Scanner;

public class Program {
	
	Cook cook;

	public Program(Cook cook) {
	
		this.cook = cook;
	}

	public void run() {
		System.out.println("어서오세용 한식당입니다~~^-^");
		
		while(true) {
			
			System.out.println("어느 것을 주문하시겠어요?");
			System.out.println("1.돼지불백  2.모둠쌈밥  3.불고기된장찌개");
			Scanner sc = new Scanner(System.in);
			String food = sc.next();
			
			switch (food) {
			case "돼지불백":
				cook.돼지불백만들기();
				break;
			case "모둠쌈밥":
				cook.모둠쌈밥만들기();
				break;
			case "불고기된장찌개":
				cook.불고기된장찌개만들기();
				break;
			default:
				System.out.println("다른 메뉴 주문해주세요~");
			}	
		}

	}

	public static void main(String[] args) {
		
	//	Program p = new Program(new 홍길동());
		Program p = new Program(new 홍길순());
		p.run();

	}

}
