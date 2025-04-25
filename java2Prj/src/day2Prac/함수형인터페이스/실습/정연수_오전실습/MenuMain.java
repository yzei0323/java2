package day2Prac.함수형인터페이스.실습.정연수_오전실습;

import java.util.ArrayList;
import java.util.Random;

public class MenuMain {

	public static void main(String[] args) {
		Menu recMenu = new Menu();
		String todayMenu = recMenu.recommend();
		System.out.println("오늘의 메뉴는 " + todayMenu + "입니다.");
		
		//-------------------------------------------------
		
		MenuRecommend menu = new MenuRecommend() {

			@Override
			public String recommend() {
				 String[] menus = {"김밥", "짜장면", "라멘", "돈카츠", "국밥", "초밥", "버거", "샌드위치", "피자"};
					
					Random random = new Random();
					int randomIndex = random.nextInt(menus.length);
					
					String todayMenu = menus[randomIndex];
					
					return todayMenu;
			}
			
		};
		
		String todayMenu2 = menu.recommend();
		System.out.println("오늘의 메뉴는 " + todayMenu2 + "입니다.");
		
		//-------------------------------------------------------
		
		MenuRecommend menu2 = () -> {
			 String[] menus = {"김밥", "짜장면", "라멘", "돈카츠", "국밥", "초밥", "버거", "샌드위치", "피자"};
				
				Random random = new Random();
				int randomIndex = random.nextInt(menus.length);
				
				String todayMenuu = menus[randomIndex];
				
				return todayMenuu;
		};
		
		
		String todayMenu3 = menu2.recommend();
		System.out.println("오늘의 메뉴는 " + todayMenu3 + "입니다.");
		//---------------------------------------------------------
		WhatTimes times = new WhatTimes() {

			@Override
			public void TimesToRun(int index) {
				String menuTimes = null;
				//String[] saveRecord = new String[index-1];
				ArrayList<String> saveRecord = new ArrayList<String>();
				for(int i = 1; i<= index; i++) {
					menuTimes = menu.recommend();
					saveRecord.add(menuTimes);
					System.out.println(i + "회차 결과: " + saveRecord.get(i-1));
				}
				System.out.println(index + " 번 돌린 결과는 " + saveRecord.get(index-1) + "입니다.");
				
			}
			
		};
		
		times.TimesToRun(4);
	}
	
	
}
