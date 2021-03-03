package com.callor.shop.service;

public interface CartService {
	
	// 장바구니 상품 담기
	public void inputCart();
	// 장바구니 전체 리스트 보기
	public void printAllCart();
	// 구매자별 장바구니 리스트 보기
	public void printUserCart();

}
