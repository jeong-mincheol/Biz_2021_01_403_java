package com.callor.applications;

import java.util.Random;

public class Array_05 {
	
	public static void main(String[] args) {
		
		int[] intNums = new int[100];
		Random rnd = new Random();
		
		for(int i = 0 ; i < intNums.length ; i++) {
			intNums[i] = rnd.nextInt(100) + 1; 
		}
		
		System.out.println("3의 배수 이면서 5의 배수인 값들 리스트");
		System.out.println("========================");
		
		int sum = 0;
		for(int i = 0 ; i < intNums.length ; i++) {
			// 3의배수인 경우를 bYes3, 5의배수인 경우를 bYes5
			boolean bYes3 = intNums[i] % 3 == 0;
			boolean bYes5 = intNums[i] % 5 == 0;
			// 3의 배수이면서 5의 배수인경우에 그값을 출력하고 그 값들을 더하라
			if(bYes3 && bYes5) {
				System.out.println(intNums[i]);
				sum += intNums[i];
			}
		}
		// 값들을 모두 더한 값을 출력
		System.out.println("3의 배수 이면서 5의 배수인 값들의 합 : " + sum);
	}

}
