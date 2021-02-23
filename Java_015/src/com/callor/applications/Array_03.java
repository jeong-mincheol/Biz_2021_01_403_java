package com.callor.applications;

import java.util.Random;
import java.util.Scanner;

public class Array_03 {
	
	public static void main(String[] args) {
		
		int[] intNums = new int[100];
		
		Random rnd = new Random();
		
		for(int i = 0 ; i < intNums.length ; i++) {
			intNums[i] = rnd.nextInt(10) + 1;
		}
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("1 ~ 10까지의 정수 중 하나 입력 : ");
		int numKey = scan.nextInt();
		for(int i = 0 ; i < intNums.length ; i++) {
			if(intNums[i] == numKey) {
				System.out.println(numKey + "가 나타나는 최초의 위치 : " + i);
				break;
			}
		}
		
	}

}
