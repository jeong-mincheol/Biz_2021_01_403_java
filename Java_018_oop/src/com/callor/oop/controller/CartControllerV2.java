package com.callor.oop.controller;

import com.callor.oop.model.CartVO;

public class CartControllerV2 {
	
	public static void main(String[] args) {
		
		CartVO[] cartVO = new CartVO[3];
		
		cartVO[0] = new CartVO();
		cartVO[0].setCartUserName("홍길동");
		cartVO[0].setCartPname("초코파이");
		cartVO[0].setCartStd("큼");
		cartVO[0].setCartDate("2021-02-26");
		cartVO[0].setCartTime("11:17");
		cartVO[0].setCartPrice(1000);
		cartVO[0].setCartQty(10);
		cartVO[0].setCartTotal(10*1000);
		
		System.out.println(cartVO[0].toString());
		
		cartVO[1] = new CartVO();
		cartVO[1].setCartUserName("홍길동");
		cartVO[1].setCartPname("바나나킥");
		cartVO[1].setCartStd("작음");
		cartVO[1].setCartDate("2021-02-26");
		cartVO[1].setCartTime("11:15");
		cartVO[1].setCartPrice(500);
		cartVO[1].setCartQty(10);
		cartVO[1].setCartTotal(10*500);
		
		System.out.println(cartVO[1].toString());
		
		cartVO[2] = new CartVO();
		cartVO[2].setCartUserName("홍길동");
		cartVO[2].setCartPname("신라면");
		cartVO[2].setCartStd("적당");
		cartVO[2].setCartDate("2021-02-26");
		cartVO[2].setCartTime("11:20");
		cartVO[2].setCartPrice(1000);
		cartVO[2].setCartQty(30);
		cartVO[2].setCartTotal(30*1000);
		
		System.out.println(cartVO[2].toString());
		// === cartVO의 개수가 3개인 상태
		// 상품한가지를 더 카트에 넣고 싶다
		cartVO = new CartVO[4];
		
		cartVO[3] = new CartVO();
		cartVO[3].setCartUserName("홍길동");
		cartVO[3].setCartPname("바나나우유");
		
		System.out.println("=============================");
		System.out.println("카트 내용");
		System.out.println("-----------------------------");
		for(int i = 0 ; i < cartVO.length ; i++) {
			System.out.println(cartVO[i].toString());
		}
				
		
		
	}

}
