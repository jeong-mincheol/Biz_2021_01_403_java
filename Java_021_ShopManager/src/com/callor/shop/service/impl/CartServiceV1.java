package com.callor.shop.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.shop.CartVO;
import com.callor.shop.service.CartService;

public class CartServiceV1 implements CartService {
	
	private Scanner scan;
	private List<CartVO> cartList;
	public CartServiceV1() {
		scan = new Scanner(System.in);
		cartList = new ArrayList<CartVO>();
	}
	

	@Override
	// 장바구니에 상품 담기
	public void inputCart() {
		System.out.println("장바구니에 넣기");
		System.out.print("구매자 >> ");
		String strUserName = scan.nextLine();
		
		System.out.print("상품명 >> ");
		String strProductName = scan.nextLine();
		
		int intPrice = 0;
		while(true) {
			System.out.print("단가 >> ");
			String strPrice = scan.nextLine();
			try {
				intPrice = Integer.valueOf(strPrice);
				if(intPrice < 1) {
					System.out.println("가격은 1원이상 ");
				} else {
					break;
				}
			} catch (Exception e) {
				System.out.println("가격은 숫자로만 ");
			}
		} // 단가 while end
		
		int intQty = 0;
		while(true) {
			System.out.print("수량 >> ");
			String strQty = scan.nextLine();
			try {
				intQty = Integer.valueOf(strQty);
				if(intQty < 1) {
					System.out.println("수량은 1개이상 ");
				} else {
					break;
				}
			} catch (Exception e) {
				System.out.println("수량은 숫자로만 ");
			}
		} // 수량 while end
		
		// CartList 정보생성
		CartVO cartVO = new CartVO();
		cartVO.setUserName(strUserName);
		cartVO.setProductName(strProductName);
		cartVO.setPrice(intPrice);
		cartVO.setQty(intQty);
		cartVO.setTotal(intPrice * intQty);
		cartList.add(cartVO);
	}

	@Override
	// 장바구니 전체 리스트 보기
	public void printAllCart() {
		System.out.println("* 전체 장바구니 리스트");
		System.out.println("===============================================");
		System.out.println("구매자\t상품명\t단가\t수량\t합계");
		System.out.println("-----------------------------------------------");
		int allTotal = 0;
		int nSize = cartList.size();
		for( int i = 0 ; i < nSize ; i++) {
			System.out.printf("%s\t%s\t%d\t%d\t%d\n",
					cartList.get(i).getUserName(), 
					cartList.get(i).getProductName(), 
					cartList.get(i).getPrice(), 
					cartList.get(i).getQty(), 
					cartList.get(i).getTotal());
			allTotal += cartList.get(i).getTotal();
		}
		System.out.println("-----------------------------------------------");
		System.out.printf("합계\t%d가지\t%d\n", nSize, allTotal);
		System.out.println("===============================================");
	}

	@Override
	// 구매자별 장바구니 리스트 보기
	public void printUserCart() {
		System.out.print("구매자이름 : ");
		String UserName = scan.nextLine();
		System.out.println("* " + UserName + " 장바구니 리스트");
		System.out.println("===============================================");
		System.out.println("구매자\t상품명\t단가\t수량\t합계");
		System.out.println("-----------------------------------------------");
		int allTotal = 0;
		int num = 0;
		int nSize = cartList.size();
		for( int i = 0 ; i < nSize ; i++) {
			if(UserName.equals(cartList.get(i).getUserName())) {
				System.out.printf("%s\t%s\t%d\t%d\t%d\n",
						cartList.get(i).getUserName(), 
						cartList.get(i).getProductName(), 
						cartList.get(i).getPrice(), 
						cartList.get(i).getQty(), 
						cartList.get(i).getTotal());
				allTotal += cartList.get(i).getTotal();
				++num;
			}
		}
		System.out.println("-----------------------------------------------");
		System.out.printf("합계\t%d가지\t%d\n", num, allTotal);
		System.out.println("===============================================");
	}

	
}
