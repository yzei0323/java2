package day2Prac.함수형인터페이스;

import java.util.ArrayList;

public class 오윤석 implements MyRunnable {

	@Override
	public void run() {
		// 실행하고 싶은 코드 작성
		ArrayList<String> lunch = new ArrayList<>();
		lunch.add("편의점");
		lunch.add("간편식");
		lunch.add("한식");
		lunch.add("양식");
		lunch.add("중식");
		
		// 랜덤 인덱스 생성
        int randomIndex = (int)(Math.random() * lunch.size());

        // 선택된 점심 출력
        String selected = lunch.get(randomIndex);
        System.out.println("오늘의 점심은: " + selected);
	}
}
