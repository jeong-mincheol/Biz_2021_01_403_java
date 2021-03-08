package com.callor.iolist.model;

public class IolistVO {
	
	private String date; // 거래일자
	private String product; // 상품명
	private String account; // 거래처명
	private String client; // 대표자명
	private int intsort; // 구분
	private int purchase; // 매입단가
	private int sales; // 매출단가
	private int count; // 수량
	
	private int purTotal; // 매입*수량
	private int saleTotal; // 매출*수량
	
	public IolistVO() {
	}
	
	
	public IolistVO(String date, String product, String account, String client, int intsort, int purchase, int sales,
			int count) {
		super();
		this.date = date;
		this.product = product;
		this.account = account;
		this.client = client;
		this.intsort = intsort;
		this.purchase = purchase;
		this.sales = sales;
		this.count = count;
	}


	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getClient() {
		return client;
	}
	public void setClient(String client) {
		this.client = client;
	}
	public int getIntsort() {
		return intsort;
	}
	public void setIntsort(int intsort) {
		this.intsort = intsort;
	}
	public int getPurchase() {
		return purchase;
	}
	public void setPurchase(int purchase) {
		this.purchase = purchase;
	}
	public int getSales() {
		return sales;
	}
	public void setSales(int sales) {
		this.sales = sales;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getPurTotal() {
		return purTotal;
	}
	public void setPurTotal(int purTotal) {
		this.purTotal = purTotal;
	}
	public int getSaleTotal() {
		return saleTotal;
	}
	public void setSaleTotal(int saleTotal) {
		this.saleTotal = saleTotal;
	}
	@Override
	public String toString() {
		return "IolistVO [date=" + date + ", product=" + product + ", account=" + account + ", client=" + client
				+ ", intsort=" + intsort + ", purchase=" + purchase + ", sales=" + sales + ", count=" + count
				+ ", purTotal=" + purTotal + ", saleTotal=" + saleTotal + "]";
	}
	
	

}
