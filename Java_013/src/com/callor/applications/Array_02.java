package com.callor.applications;

import java.util.Random;

public class Array_02 {
	
	public static void main(String[] args) {
		
		Random rnd = new Random();
		int[] intNum = new int[10];
		
		for(int i = 0 ; i < 10 ; i++) {
			intNum[i] = rnd.nextInt(100) + 1;
		}
		
		// 배열에 저장된 전체 합계 계산
		int intSum = 0;
		for(int i = 0 ; i < 10 ; i++) {
			System.out.print(intNum[i] + " \t");
			intSum += intNum[i];
		}
		System.out.println(intSum);
		
		// 배열에 저장된 값중 짝수들의 합계 계산
		int intEvenSum = 0;
		for(int i = 0 ; i < 10 ; i++) {
			System.out.print(intNum[i] + " \t");
			if(intNum[i] % 2 == 0) {
				intEvenSum += intNum[i];
			}
		}
		System.out.println(intEvenSum);
		
	}

}
