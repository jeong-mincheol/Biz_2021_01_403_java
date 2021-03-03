package com.callor.shop.service.impl;

import java.util.Scanner;

import com.callor.shop.service.MenuService;

public class MenuServiceV1 implements MenuService {
	
	private Scanner scan;
	public MenuServiceV1() {
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
