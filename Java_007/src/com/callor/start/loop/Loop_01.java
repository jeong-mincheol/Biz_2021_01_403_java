package com.callor.start.loop;

public class Loop_01 {
	
	public static void main(String[] args) {
		
	int num = 0;
	
	for( num = 100 ; num <= 1000 ; num += 100) {
		System.out.println(num);
	}
	    System.out.println("=============================");
	    /*
	     * 보편적으로 for() 반복문을 사용하여 코딩을 할 때
	     * int num = 0 : 시작값은 보통 0으로 초기화를 한다
	     * num < 10 : 종료를 위한 비교연산 등호를 가급적 사용하지 않는다
	     * num += 1 : 증가값(변화값) 가급적 1씩 증가, 감소 하도록 코딩한다
	     * 
	     */
	    for(int num3 = 0 ; num3 < 10 ; num3 += 1) {
	    	
	    	int num1 = (num3 + 1) * 100;
	    	System.out.println(num1);
	    }
	    System.out.println("====================");
	int num2 = 0;
	
	for( num2 = 1 ; num2 <= 10 ; num2 += 1) {
		System.out.println(num2 + ".홍길동");
	}
	System.out.println("=======================");
	for(int num4 = 0 ; num4 < 10 ; num4 += 1) {
		System.out.println((num4 + 1) + ".홍길동");
	}
	System.out.println("=======================");
	for(int num4 = 0 ; num4 < 10 ; num4 += 1) {
		int num6 = num4 + 1;
	
		System.out.println(num6 + ".홍길동");
	}
	}
}
