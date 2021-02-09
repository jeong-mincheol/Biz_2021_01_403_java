package com.callor.start;

public class Multiple_01 {
	
	public static void main(String[] args) {
		
		for( int i = 0 ; i < 100 ; i++) {
			boolean bYes1 = i % 3 == 0;
			if(bYes1) {
				System.out.println("3의 배수 " + i);
			}
		}
		for( int i = 0 ; i < 100 ; i++) {
			boolean bYes2 = i % 9 == 0;
			if(bYes2) {
				System.out.println("9의 배수 " + i);
			}
		}
		int num = 0;
		for( int i = 0 ; i < 100 ; i++) {
			boolean bs3 = i % 3 == 0;
			boolean bs9 = i % 9 == 0;
			boolean bYes3 = bs3 && bs9;
			if (bYes3) {
				num += i;
			}
		}
		System.out.println("3의 배수이면서 9의 배수인 수들의 합 : " + num);
		
	}

}
