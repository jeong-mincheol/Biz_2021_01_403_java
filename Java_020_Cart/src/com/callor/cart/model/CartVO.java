package com.callor.cart.model;

public class CartVO {
	
	// 인스턴수 변수 선언
	// 프로젝트를 만드는데 필요한 데이터를 생각 : 추상화
	// 인스턴스 변수를 private 화 : 은닉
	private String UserName;
	private String proName;
	private String date;
	private String time;
	private int qty;
	private int price;
	private int total;
	
	// private화 한 인스턴스 변수들에 값을 저장하고 내보내는 (읽고 쓰게하기 위해) getter & setter
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getProName() {
		return proName;
	}
	public void setProName(String proName) {
		this.proName = proName;
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
	// toSTring을 호출하면 VO 데이터를 나열해준다
	// method에서 어떠한 일을 하는지는 모르지만 이런 값을 return해서 표시해줄 수 있다 : 캡슐화
	public String toString() {
		return "CartVO [UserName=" + UserName + ", proName=" + proName + ", date=" + date + ", time=" + time + ", qty="
				+ qty + ", price=" + price + ", total=" + total + "]";
	}
	
	
	

}
