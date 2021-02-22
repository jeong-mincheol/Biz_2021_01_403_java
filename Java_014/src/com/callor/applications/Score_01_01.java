package com.callor.applications;

import java.util.Scanner;

public class Score_01_01 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] intKor = new int[3];
		int[] intEng = new int[3];
		int[] intMath = new int[3];
		
		for(int i = 0 ; i < 3 ; i++) {
			System.out.print("국어점수 입력 : ");
			intKor[i] = scan.nextInt();
			
			System.out.print("영어점수 입력 : ");
			intEng[i] = scan.nextInt();
			
			System.out.print("수학점수 입력 : ");
			intMath[i] = scan.nextInt();
			
			System.out.println("------------------------------");
		}
		
		System.out.println("================================");
		System.out.println("국어\t영어\t수학\t");
		System.out.println("--------------------------------");
		
		for(int i = 0 ; i < 3 ; i++) {
			System.out.printf("%d\t%d\t%d\n", intKor[i], intEng[i], intMath[i]);
		}
		System.out.println("---------------------------------");
		
	}
	
}
