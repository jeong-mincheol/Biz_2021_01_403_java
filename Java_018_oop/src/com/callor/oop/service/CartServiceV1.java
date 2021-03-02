package com.callor.oop.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.oop.model.CartVO;

public class CartServiceV1 {

		// cartList 객체를 인스턴스변수로 선언
		List<CartVO> cartList = new ArrayList<CartVO>();
		
		// inputCart() method 선언
		public void inputCart() {
			
			// 키보드에서 상품정보를 입력받게 Scanner 클래스를 가져온다 
			Scanner scan = new Scanner(System.in);
			// 상품정보의 변수들을 저장하고 읽게 하기 위한 cartVO 객체생성
			CartVO cartVO = new CartVO();
			
			// 구매자 데이터를 입력하고 strUserName에 담는다
			System.out.print("구매자 : ");
			String strUserName = scan.nextLine();
			cartVO.setCartUserName(strUserName);
			
			// 상품명 데이터를 입력하고 strPName에 담는다
			System.out.print("상품명 : ");
			String strPName = scan.nextLine();
			cartVO.setCartPname(strPName);
			
			// 수량을 담을 변수 intQty 생성
			// 수량은 2이상이라는 조건을 충족해야만 하므로
			// 입력값이 2미만이거나 숫자가 아니라면 다시 입력하게 한다
			// 조건에 맞는 입력값 strQty를 정수형으로 바꿔서 intQty에 값을 담는다
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
			} // end while
			cartVO.setCartQty(intQty);
			
			// 가격을 담을 변수 intPrice 생성
			// 가격은 1000원 이상이여야 하므로 
			// 입력값이 1000원 미만이거나 숫자로 입력하지 않으면 다시 입력
			// 조건에 맞는 입력값 strPrice을 정수형으로 바꿔서 intQty에 값을 담는다
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
			} // end while
			cartVO.setCartPrice(intPrice);
			
			cartList.add(cartVO);
			
		}
		// printCartList() method를 선언
		public void printCartList() {
			System.out.println("==================================");
			System.out.println("구매자\t상품명\t단가\t수량");
			System.out.println("----------------------------------");
			// 장바구니에 담긴 개수를 변수 nSize에 담는다
			int nSize = cartList.size();
			// 장비구니에 담긴 개수의 데이터들을 출력한다
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
