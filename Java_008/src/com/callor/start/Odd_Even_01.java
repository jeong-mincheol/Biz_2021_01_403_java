package com.callor.start;

public class Odd_Even_01 {

	public static void main(String[] args) {
		
		int sum = 0;
		for( int i = 0 ; i < 100 ; i++ ) {
			
			boolean bYes = (i+1) % 2 == 0;
			// bYes가 true 이면 
			if(bYes) {
				// 값을 변수에 계속 더하라
				sum += i+1;
			}
	
		}
		// 결과값을 출력하라
		System.out.println("1부터 100까지 중 짝수의 합 = " + sum);

		sum = 0;
		for( int i = 0 ; i < 100 ; i++ ) {
			
			if(i % 2 > 0) {
				sum += i;
			}
		}
		System.out.println("1부터 100까지 중 홀수의 합 = " + sum);
		
		//위에서 선언하고 사용했던 변수를 "재사용하기"
		// 반드시 초기화(clear)해야 한다.
		sum = 0; 
		
          for( int i = 0 ; i < 100 ; i++ ) {
			boolean bYes = (i+1) % 2 == 0;
			// if(bYes = False) 
			if(!bYes) {
				sum += i+1;
				}
			}
          System.out.println("홀수의합 : " + sum);
			
			
	}

}
