package com.callor.oop.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.oop.model.CartVO;

public class CartControllerV3_01 {
	
	public static void main(String[] args) {
		
		List<CartVO> cartList = new ArrayList<CartVO>();
		
		Scanner scan = new Scanner(System.in);
		
		CartVO cartVO = new CartVO();
		
		for(int i = 0 ; i < 3 ; i++) {
			
			System.out.print("구매자이름 : ");
			String userName = scan.nextLine();
			
			System.out.print("상품명 : ");
			String pName = scan.nextLine();
			
			System.out.print("수량 : ");
			String strNum = scan.nextLine();
			int num = Integer.valueOf(strNum);
			
			System.out.print("가격 : ");
			// 3000이라고 입력하면 "3000"으로 입력되어
			// 문자열이다
			String strPrice = scan.nextLine();
			// "3000" 문자열형 숫자를 정수 3000으로 변경하여
			// Price 변수에 저장
			int Price = Integer.valueOf(strPrice);
			
			cartVO.setCartUserName(userName);
			cartVO.setCartPname(pName);
			cartVO.setCartQty(num);
			cartVO.setCartPrice(Price);
			
			cartList.add(cartVO);
			// cartVO = carList.get(i);
			System.out.println("==================================");
		}
		
		System.out.println("============================");
		System.out.println("장바구니");
		System.out.println("----------------------------");
		
		for(int i = 0 ; i < 3 ; i++) {
			cartVO = cartList.get(i);
			System.out.printf("%s\t%s\t%d\t%d\n",
					cartVO.getCartUserName(),
					cartVO.getCartPname(),
					cartVO.getCartPrice(),
					cartVO.getCartQty());
		}
	}

}
