package com.callor.shop.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.shop.CartVO;
import com.callor.shop.service.CartService;

public class CartServiceV1 implements CartService {
	
	// 키보드에 값을 입력해서 사용할 수 있게 Scanner 클래스를 가져와 scan이라는 객체변수 선언
	private Scanner scan;
	// CartVO 클래스를 객체배열 변수 cartList로 선언
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
		// 구매자를 담는 strUserName 변수 선언하고 저장
		String strUserName = scan.nextLine();
		
		System.out.print("상품명 >> ");
		// 상품명을 담는 strProductName 변수 선언하고 저장
		String strProductName = scan.nextLine();
		
		// if() 조건문에 해당하는 가격을 담을 정수형 변수 intPrice 선언 및 초기화 
		int intPrice = 0;
		while(true) {
			System.out.print("단가 >> ");
			String strPrice = scan.nextLine();
			try {
				// 문자열형 변수를 정수형으로 바꾸어 변수intPrice로 값을 저장
				intPrice = Integer.valueOf(strPrice);
				if(intPrice < 1) {
					System.out.println("가격은 1원이상 !!!");
				} else {
					break;
				}
			} catch (Exception e) {
				System.out.println("가격은 숫자로만 !!!");
			}
		} // 단가 while end
		
		// if() 조건문에 해당하는 수량을 담을 정수형 변수 intQty 선언 및 초기화
		int intQty = 0;
		while(true) {
			System.out.print("수량 >> ");
			String strQty = scan.nextLine();
			try {
				// strQty에 담긴 값을 정수형으로 바꾸어 intQty에 저장
				intQty = Integer.valueOf(strQty);
				if(intQty < 1) {
					System.out.println("수량은 1개이상 !!!");
				} else {
					break;
				}
			} catch (Exception e) {
				System.out.println("수량은 숫자로만 !!!");
			}
		} // 수량 while end
		// CartVO 클래스를 가져와 사용할 수 있는 cartVO 객체변수 선언
		CartVO cartVO = new CartVO();
		// 입력한 값들을 set을 통해 담아둔다
		cartVO.setUserName(strUserName);
		cartVO.setProductName(strProductName);
		cartVO.setPrice(intPrice);
		cartVO.setQty(intQty);
		cartVO.setTotal(intPrice * intQty);
		// 입력받은 cartVO에 리스트를 추가
		cartList.add(cartVO);
	}

	@Override
	// 장바구니 전체 리스트 보기
	public void printAllCart() {
		System.out.println("* 전체 장바구니 리스트");
		System.out.println("===============================================");
		System.out.println("구매자\t상품명\t단가\t수량\t합계");
		System.out.println("-----------------------------------------------");
		// Total값의 합 변수 선언
		int allTotal = 0;
		// 장바구니 리스트 개수를 정수형 변수 nSize에 값을 담는다
		int nSize = cartList.size();
		for( int i = 0 ; i < nSize ; i++) {
			System.out.printf("%s\t%s\t%d\t%d\t%d\n",
					// cartList에 get을 통해 set되어있는 값들을 불러온다
					cartList.get(i).getUserName(), 
					cartList.get(i).getProductName(), 
					cartList.get(i).getPrice(), 
					cartList.get(i).getQty(), 
					cartList.get(i).getTotal());
			// Total 값들을 다 더하여 allTotal에 값을 저장
			allTotal += cartList.get(i).getTotal();
		}
		System.out.println("-----------------------------------------------");
		System.out.printf("%s\t%s\t%d\n",
				"합계", nSize + "가지", allTotal);
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
		// 입력한 값과 일치하는 경우의 수를 담을 num 선언
		int num = 0;
		int nSize = cartList.size();
		for( int i = 0 ; i < nSize ; i++) {
			// 입력한 UserName과 출력되는 구매자이름이 같을 경우에만 출력하고 값을 더한다
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
		System.out.printf("%s\t%s\t%d\n",
				"합계", num + "가지", allTotal);
		System.out.println("===============================================");
	}

	
}
