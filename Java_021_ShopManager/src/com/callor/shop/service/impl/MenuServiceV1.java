package com.callor.shop.service.impl;

import java.util.Scanner;

import com.callor.shop.service.MenuService;

public class MenuServiceV1 implements MenuService {
	
	// Scanner 클래스를 사용해서 scan이라는 객체를 선언 (메모리 관리를 위해 사용)
	private Scanner scan;
	public MenuServiceV1() {
		// 위에서 선언된 scan객체를 초기화(생성)하여 사용할 준비를 되게 한다
		scan = new Scanner(System.in);
	}
	

	@Override
	public Integer SelectMenu() {
		
		while(true) {
			System.out.println("==============================");
			System.out.println("빛나라 쇼핑몰 2021");
			System.out.println("------------------------------");
			System.out.println("1. 장바구니 상품 담기");
			System.out.println("2. 장바구니 전체 리스트 보기");
			System.out.println("3. 구매자별 장바구니 리스트 보기");
			System.out.println("QUIT. 끝내기");
			System.out.println("==============================");
			// 입력을 받고 엔터를 누르면 String으로 선언된 변수 StrMenu에 저장된다
			String strMenu = scan.nextLine();
			if(strMenu.equals("QUIT")) {
				break;
			}
			try {
				Integer intMenu = Integer.valueOf(strMenu);
				if(intMenu >=1 && intMenu <= 3) {
					return intMenu;
				} else {
					System.out.println("메뉴는 1 ~ 3 까지 정수만 입력가능");
				}
			} catch (Exception e) {
				System.out.println("메뉴는 QUIT, 1 ~ 3 까지 정수만 입력가능");
			}
			
		}
		
		return null;
	}

}
