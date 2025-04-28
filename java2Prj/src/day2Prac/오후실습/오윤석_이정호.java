package day2Prac.오후실습;

import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class 오윤석_이정호 {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int[] count = { 0 };
	
	// 게임 주제 설명
	Runnable r = () -> {
	    System.out.println("업다운 게임을 시작합니다");
	    System.out.println("1~100까지의 숫자 중 한가지를 골라주세요");
	    System.out.println("");
	};
	r.run();

	// 랜덤 숫자 뽑기
	Supplier<Integer> num = () -> {
	    int random = (int) (Math.random() * 100) + 1;
	    return random;
	};

	int outputNum = num.get();
	// System.out.println(outputNum);

	// 업다운 게임
	Consumer<Integer> game = (answer) -> {
	    while (true) {
		System.out.print("숫자 입력: ");
		int inputNum = scan.nextInt();
		count[0]++;

		if (inputNum > answer) {
		    System.out.println("DOWN!");
		} else if (inputNum < answer) {
		    System.out.println("UP!");
		} else {
		    System.out.println("정답입니다! 횟수: " + count[0]);
		    break;
		}
	    }
	};

	game.accept(outputNum);

	Predicate<Integer> check = (cs) -> {
	    if (cs <= 5) {
		return true;
	    } else {
		return false;
	    }
	};

	int countResult = count[0];

	boolean result = check.test(countResult);
	if (result) {
	    System.out.println("상품권을 드립니다.");
	}

    }

}
