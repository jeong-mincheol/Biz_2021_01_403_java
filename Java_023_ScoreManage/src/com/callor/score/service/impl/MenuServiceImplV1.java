package com.callor.score.service.impl;

import java.util.Scanner;

import com.callor.score.service.MenuService;
import com.callor.score.values.Values;

public class MenuServiceImplV1 implements MenuService {
	
	// Scanner 클래스를 가져와 scan 객체변수 선언
	private Scanner scan;
	
	public MenuServiceImplV1() {
		// 키보드로 입력받을 수 있게 준비
		scan = new Scanner(System.in);
	}

	@Override
	// 메뉴 선택
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
				// 입력한 값을 정수로 변환
				intMenu = Integer.valueOf(strMenu);
				// 입력한 값을 정수로 변환했을 때 범위내이면 값을 return
				if(intMenu >= Values.MENU_START && intMenu <= Values.MENU_FINAL) {
					return intMenu;
				} else { // 범위내 정수가 아니면 밑에 출력문을 보여주고 다시 입력
					System.out.println("업무는 1 ~ 3 까지 중에서 선택");
				}
			} catch (Exception e) { // 입력한 값이 범위내의 값도 아니고 QUIT도 아니면 밑의 출력문을 보여주고 다시 입력
				System.out.println("메뉴는 QUIT, 1 ~ 3 까지만 가능");
			}
			
		}
	}

}
