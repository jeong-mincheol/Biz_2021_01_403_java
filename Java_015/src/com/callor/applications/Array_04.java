package com.callor.applications;

import java.util.Random;
import java.util.Scanner;

public class Array_04 {
	
	public static void main(String[] args) {
		
		int[] intNums = new int[100];
		
		Random rnd = new Random();
		
		for(int i = 0 ; i < intNums.length ; i++) {
			intNums[i] = rnd.nextInt(10) + 1;
		}
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("1 ~ 10까지의 정수 중 하나 입력 : ");
		int keyNum = scan.nextInt();
		
		/*
		 *  변수는 앞에서 어떤 값을 저장했던 상관없이
		 *  가장 마지막에 저장한 값만 가지고 있다
		 */
		int answer = 0;
		for(int i = 0 ; i < intNums.length ; i++ ) {
			if(keyNum == intNums[i]) {
				// 키보드로 입력한 값이 일치할 때마다 
				// 그 위치를 answer에 저장한다.
				answer = i;
			}
		}
		// answer에 저장된 값은 가장 마지막으로 같은 값만 담고 있다.
		System.out.println(keyNum + "가 마지막으로 나타나는 위치 : " + answer);
	}
}
