package com.callor.varriable;

public class Varriable_01 {
	
	public static void main(String[] args) {
		
		// 연산하고자 하는 원래값이 저장되는 변수
		int Num1 = 0;
		int Num2 = 0;
		
		// 변수에 연산할 값을 저장하기
		Num1 = 70;
		Num2 = 90;
		
		// 연산결과를 저장할 변수 선언과 초기화 
		int result1 = 0;   
		int result2 = 0;   
		int result3 = 0;   
		int result4 = 0;   
		int result5 = 0;   
		
		// 연산결과를 변수에 저장하기
		result1 = Num1 + Num2;
		result2 = Num2 - Num1;
		result3 = Num1 * Num2;
		result4 = Num2 / Num1;
		result5 = Num2 % Num1;
		
		// 변수에 저장된 결과를 Console에 출력
		// 30 + 40 = 70
		System.out.println("30 + 40 = " + (30 + 40));
		
		System.out.println(Num1 + " + " + Num2 + " = " + (result1));
		System.out.println(Num2 + " - " + Num1 + " = " + (result2));
		System.out.println(Num1 + " x " + Num2 + " = " + (result3));
		System.out.println(Num2 + " / " + Num1 + " = " + (result4));
		System.out.println(Num2 + " MOD " + Num1 + " = " + (result5));
		
	}

}
