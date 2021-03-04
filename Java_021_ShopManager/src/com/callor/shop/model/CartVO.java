package com.callor.shop.model;

public class CartVO {
	
	// 장바구니에 필요한 데이터 인스턴스 변수 선언 
	// 인스턴스 변수 priavte화 
	private String userName;
	private String productName;
	private String date;
	private String time;
	private int qty;
	private int price;
	private int total;
	// private화 한 인스턴스 변수들에 값을 저장하고 내보낼 수 있게 하기
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
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
		return "ShopVO [userName=" + userName + ", productName=" + productName + ", date=" + date + ", time=" + time
				+ ", qty=" + qty + ", price=" + price + ", total=" + total + "]";
	}

}
