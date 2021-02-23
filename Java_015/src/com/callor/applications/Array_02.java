package com.callor.applications;

import java.util.Random;
import java.util.Scanner;

public class Array_02 {
	
	public static void main(String[] args) {
		
		int[] intNums = new int[100];
		
		Random rnd = new Random();
		
		for(int i = 0 ; i < intNums.length ; i++) {
			intNums[i] = rnd.nextInt(10) + 1;
		}
		
		Scanner scan = new Scanner(System.in);
		
		
		
		System.out.print("1 ~ 10까지 정수 중 하나 입력 : ");
		int numKey = scan.nextInt();
		
		/*
		 * for(int position = 0 ; position < intNums.length ; position++) {
		 * 		if(intNums[position] == numKey) {
		 * 				System.out.println(numKey + " 값 저장 위치 : " + position);
		 * 		}
		 * }
		 */
		
		for(int i = 0 ; i < intNums.length ; i++) {
			boolean bYes = numKey == intNums[i];
			if(bYes) {
				System.out.println("저장된 위치 : " + i);
			}
		}
		
	}

}
