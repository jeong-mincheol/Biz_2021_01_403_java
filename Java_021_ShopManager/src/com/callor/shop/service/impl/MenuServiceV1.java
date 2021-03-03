package com.callor.shop.service.impl;

import java.util.Scanner;

import com.callor.shop.service.MenuService;

public class MenuServiceV1 implements MenuService {
	// 메뉴를 입력해서 선택할 수 있게 Scanner 클래스 가져오기
	private Scanner scan;
	public MenuServiceV1() {
		scan = new Scanner(System.in);
	}
	

	@Override
	// 메뉴를 보여주고 입력할 수 있는 SelectMenu() method 생성
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
			// 내용을 입력하고 그 내용을 strMenu 문자열형 변수 strMenu를 선언
			String strMenu = scan.nextLine();
			// 입력한 문자열과 QUIT를 비교해서 같으면 끝낸다
			if(strMenu.equals("QUIT")) {
				break;
			}
			try {
				// 입력한 문자열이 정수일 경우 정수형으로 형태를 변환시키고 
				// intMenu라는 변수에 저장한다
				Integer intMenu = Integer.valueOf(strMenu);
				// 입력값이 1이상 3이하의 정수라면 그 값을 return
				if(intMenu >=1 && intMenu <= 3) {
					return intMenu;
					// 입력값이 1이상 3이하의 정수가 아니라면 밑의 문자열을 출력하고 다시 입력
				} else {
					System.out.println("메뉴는 1 ~ 3 까지 정수만 입력가능");
				}
				// 입력값이 정수가 아니라면 밑의 문자열을 출력하고 다시 입력
			} catch (Exception e) {
				System.out.println("메뉴는 QUIT, 1 ~ 3 까지 정수만 입력가능");
			}
			
		}
		
		return null;
	}

}
