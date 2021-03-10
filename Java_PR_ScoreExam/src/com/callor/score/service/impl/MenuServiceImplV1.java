package com.callor.score.service.impl;

import java.util.Scanner;

import com.callor.score.service.MenuService;
import com.callor.score.values.Values;

public class MenuServiceImplV1 implements MenuService {
	
	private Scanner scan;
	public MenuServiceImplV1() {
		// TODO Auto-generated constructor stub
		scan = new Scanner(System.in);
	}

	@Override
	public Integer selectMenu() {
		// TODO Auto-generated method stub
		while(true) {
			System.out.println(Values.dLine(50));
			System.out.println("성적표");
			System.out.println(Values.sLine(50));
			System.out.println("1. 점수입력");
			System.out.println("2. 파일저장");
			System.out.println("3. 성적일람표 출력");
			System.out.println("QUIT. 종료");
			System.out.println(Values.sLine(50));
			System.out.print("입력 >> ");
			String strMenu = scan.nextLine();
			if(strMenu.equals("QUIT")) {
				break;
			}
			try {
				Integer intMenu = Integer.valueOf(strMenu);
				if(intMenu >= Values.MENU_START && intMenu <= Values.MENU_LAST) {
					return intMenu;
				} else {
					System.out.println("메뉴는 1 ~3 까지 선택");
				}
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("메뉴선택은 QUIT, 1 ~3 까지 정수만 가능");
			}
		}
		return null;
	}
}
