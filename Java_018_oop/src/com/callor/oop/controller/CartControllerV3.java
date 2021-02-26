package com.callor.oop.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.oop.model.CartVO;

public class CartControllerV3 {
	
	public static void main(String[] args) {
		
		List<CartVO> cartList = new ArrayList<CartVO>();
		
		Scanner scan = new Scanner(System.in);
		
		CartVO cartVO = new CartVO();
		System.out.print("구매자이름 : ");
		cartVO.setCartUserName(scan.nextLine());
		System.out.print("상품명 : ");
		cartVO.setCartPname(scan.nextLine());
		System.out.print("수량 : ");
		String strNum = scan.nextLine();
		int num = Integer.valueOf(strNum);
		cartVO.setCartQty(num);
		System.out.print("가격 : ");
		String strPrice = scan.nextLine();
		int Price = Integer.valueOf(strPrice);
		cartVO.setCartPrice(Price);
		cartList.add(cartVO);
		System.out.println("==================================");
		
		cartVO = new CartVO();
		System.out.print("구매자이름 : ");
		cartVO.setCartUserName(scan.nextLine());
		System.out.print("상품명 : ");
		cartVO.setCartPname(scan.nextLine());
		System.out.print("수량 : ");
		String strNum1 = scan.nextLine();
		int num1 = Integer.valueOf(strNum1);
		cartVO.setCartQty(num1);
		System.out.print("가격 : ");
		String strPrice2 = scan.nextLine();
		int Price2 = Integer.valueOf(strPrice2);
		cartVO.setCartPrice(Price2);
		cartList.add(cartVO);
		System.out.println("==================================");
		
		cartVO = new CartVO();
		System.out.print("구매자이름 : ");
		cartVO.setCartUserName(scan.nextLine());
		System.out.print("상품명 : ");
		cartVO.setCartPname(scan.nextLine());
		System.out.print("수량 : ");
		String strNum3 = scan.nextLine();
		int num3 = Integer.valueOf(strNum3);
		cartVO.setCartQty(num3);
		System.out.print("가격 : ");
		String strPrice3 = scan.nextLine();
		int Price3 = Integer.valueOf(strPrice3);
		cartVO.setCartPrice(Price3);
		cartList.add(cartVO);
		System.out.println("==================================");
		
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
