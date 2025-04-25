package day2Prac.함수형인터페이스.실습.정연수_오전실습;

import java.util.Random;

public class Menu implements MenuRecommend{


	@Override
	public String recommend() {
        String[] menus = {"김밥", "짜장면", "라멘", "돈카츠", "국밥", "초밥", "버거", "샌드위치", "피자"};
		
		Random random = new Random();
		int randomIndex = random.nextInt(menus.length);
		
		String todayMenu = menus[randomIndex];
		
		return todayMenu;
	}
}
