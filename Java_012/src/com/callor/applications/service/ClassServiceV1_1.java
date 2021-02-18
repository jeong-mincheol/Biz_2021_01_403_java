package com.callor.applications.service;

public class ClassServiceV1_1 {
	
	/*
	 * Java코딩에서
	 * {} 내에서 같은 이름의 변수는 2번이상 선언 불가
	 * class {} 내에서 같은 이름의 method는 2번이상 선언불가
	 * 하지만, java에서는 method의 매개변수 개수, 타입이 다르면 
	 * 같은 이름의 method를 중복하여 선언할 수 있다.
	 */
	public void sum_int_int(int num1, int num2) {}
	public void sum_int_float(int num, float num2) {}
	// 한개의 클래스 내에서는 같은 이름의 method를 선언할 수 없다
	// 자바에서는 매개변수가 다르면 입력가능 
	// 중복선언, 다형성
	// 매개변수가 다르면 이름을 바꾸어서 나타내는게 좋다 

	public void add(int num1, int num2) {

	}

	public void add(int num1, float num2) {

	}

	public void add(double num1, float num2) {

	}

}
