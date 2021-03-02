package com.callor.oop.controller;

import com.callor.oop.service.CartServiceV1;

public class CartControllerV5 {
	
	public static void main(String[] args) {
		// CartServiceV1 클래스를 가져온다 
		CartServiceV1 csV1 = new CartServiceV1();
		
		// 데이터를 입력하고 저장할 intputCart() method를 가져온다
		csV1.inputCart();
		// 입력하고 저장한 데이터를 출력할 printCartList() method를 가져와 값을 출력한다
		csV1.printCartList();
		
	}

}
