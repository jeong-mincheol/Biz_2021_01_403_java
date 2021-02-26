package com.callor.oop.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.oop.model.CartVO;

public class CartServiceV1 {
		
		List<CartVO> cartList = new ArrayList<CartVO>();
		
		public void inputCart() {
			
			Scanner scan = new Scanner(System.in);
			CartVO cartVO = new CartVO();
			
			System.out.print("구매자 : ");
			String strUserName = scan.nextLine();
			cartVO.setCartUserName(strUserName);
			
			System.out.print("상품명 : ");
			String strPName = scan.nextLine();
			cartVO.setCartPname(strPName);
			
			int intQty = 0;
			while(true) {
				System.out.print("수량 : ");
				String strQty = scan.nextLine();
				try {
					intQty = Integer.valueOf(strQty);
					if(intQty < 2) {
						System.out.println("수량은 2이상");
						continue;
					}
				} catch (Exception e) {
					System.out.println("수량은 숫자로 입력하세요");
					continue;
				}
				break;
			}
			cartVO.setCartQty(intQty);
			
			int intPrice = 0;
			while(true) {
				System.out.print("가격 : ");
				String strPrice = scan.nextLine();
				try {
					intPrice = Integer.valueOf(strPrice);
					if(intPrice < 1000) {
						System.out.println("가격은 1000원이상");
						continue;
					}
				} catch (Exception e) {
					System.out.println("가격은 숫자로 입력하세요");
					continue;
				}
				break;
			}
			cartVO.setCartPrice(intPrice);
			
			cartList.add(cartVO);
			
		}
		
		public void printCartList() {
			System.out.println("==================================");
			System.out.println("구매자\t상품명\t단가\t수량");
			int nSize = cartList.size();
			for(int i = 0 ; i < nSize ; i++) {
				System.out.printf("%s\t%s\t%d\t%d\n", 
						cartList.get(i).getCartUserName(),
						cartList.get(i).getCartPname(),
						cartList.get(i).getCartPrice(),
						cartList.get(i).getCartQty()
						);
			}
		}
		
		
		
	
	

}