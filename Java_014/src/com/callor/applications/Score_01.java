package com.callor.applications;

import java.util.Scanner;

public class Score_01 {
	
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		int[] intKor = new int[3];
		int[] intEng = new int[3];
		int[] intMath = new int[3];
		
		System.out.println("국어점수 입력 : ");
		for(int i = 0 ; i < 3 ; i++) {
			intKor[i] = scan.nextInt();
		}
		
		System.out.println("수학점수 입력 : ");
		for(int i = 0 ; i < 3 ; i++) {
			intEng[i] = scan.nextInt();
		}
		
		System.out.println("영어점수 입력 : ");
		for(int i = 0 ; i < 3 ; i++) {
			intMath[i] = scan.nextInt();
		}
		
		System.out.println("===========================================");
		System.out.println("국어\t영어\t수학\t");
		System.out.println("-------------------------------------------");
		
		for(int i = 0 ; i < 3 ; i++) {
			System.out.println(intKor[i] + "\t" + intEng[i] + "\t" + intMath[i]);
		}
		System.out.println("--------------------------------------------");
		
	}
	
	
	
	
	

}
