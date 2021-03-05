package com.callor.score.service.impl;

import java.util.Scanner;

import com.callor.score.service.MenuService;
import com.callor.score.values.Values;

public class MenuServiceImplV1 implements MenuService {
	
	private Scanner scan;
	
	public MenuServiceImplV1() {
		scan = new Scanner(System.in);
	}

	@Override
	public Integer selectMenu() {
		while(true) {
			System.out.println(Values.dLine);
			System.out.println("빛나라 고교 성적처리 시스템");
			System.out.println(Values.sLine);
			System.out.println("1. 학생성적 점수 생성");
			System.out.println("2. 학생성적 점수 파일에 저장");
			System.out.println("3. 성적 결과 확인");
			System.out.println("QUIT. 끝내기");
			System.out.println(Values.dLine);
			System.out.print("선택 >> ");
			String strMenu = scan.nextLine();
			if(strMenu.equals("QUIT")) {
				return null;
			}
			Integer intMenu = null;
			try {
				intMenu = Integer.valueOf(strMenu);
			} catch (Exception e) {
				System.out.println("메뉴는 QUIT, 1 ~ 3 까지만 가능");
				continue;
			}
			if(intMenu >=1 && intMenu <=3) {
				return intMenu;
			} else {
				System.out.println("업무는 1 ~ 3 까지 중에서 선택");
			}
		}
	}

}
