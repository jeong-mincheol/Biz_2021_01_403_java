package com.callor.shop;

import com.callor.shop.service.impl.CartServiceV1;
import com.callor.shop.service.impl.MenuServiceV1;

public class CartEx_01 {
	
	public static void main(String[] args) {
		
		// MenuServiceV1클래스를 사용할 객체변수 msV1 선언
		MenuServiceV1 msV1 = new MenuServiceV1();
		// CartServiceV1클래스를 사용할 객체변수 csV1 선언
		CartServiceV1 csV1 = new CartServiceV1();
		
		
		while(true) {
			// MenuServiceV1에 selectMenu method에 입력할 값을 menu에 담는다
			Integer menu = msV1.SelectMenu();
			if(menu == null) {
				break;
			} else if(menu == 1) {
				csV1.inputCart();
			} else if(menu == 2) {
				csV1.printAllCart();
			} else if(menu == 3) {
				csV1.printUserCart();
			}
		}
		
	}

}
