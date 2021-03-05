package com.callor.shop.model;

public class CartVO {
	
	// CartVO vo = new CartVO();
	// vo.userName = "값"
	private String UserName;
	private String productName;
	private int qty;
	private int price;
	private int total;
	
	// 매개변수가 있는 생성자를 만들게 되면 
	// 매개변수가 없는 "기본" 생성자를 임의로 반드시 만들어 주어야 한다
	public CartVO() {
	}
	
	public CartVO(String userName, String pName, int qty, int price) {
		this.UserName = userName;
		this.productName = pName;
		this.qty = qty;
		this.price = price;
		
	}

	
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	@Override
	public String toString() {
		return "CartVO [UserName=" + UserName + ", productName=" + productName + ", qty=" + qty + ", price=" + price
				+ ", total=" + total + "]";
	}
	
	

}
