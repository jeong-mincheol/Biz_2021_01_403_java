package com.callolr.student;

public class Ex_01 {
	
	// public static void main(String args[]) {}
	public static void main(String[] args) {
		
		// 두개의 정수를 변수에 담고 덧셈하여 출력하고
		int num1 = 0;
		int num2 = 0;
		
		num1 = 50;
		num2 = 100;
		
		int sum = num1 + num2;
		System.out.println(sum);
		
		int num3; // 초기화가 되지 않았기 때문에 오류가 발생
		num3 = 100;// 값을 추가해주거나 선언할 때 추가해 주어야 한다
		System.out.println(num3);
		
		int num4 = 0; // 초기화, clear한다 
	}

}
