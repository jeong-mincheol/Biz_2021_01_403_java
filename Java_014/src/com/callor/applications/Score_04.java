package com.callor.applications;

import java.util.Random;

public class Score_04 {
	
	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		int[] intKor = new int[3];
		int[] intEng = new int[3];
		int[] intMath = new int[3];
		
		String[] strName = new String[] {"홍길동","이몽룡","성춘향"};
		
		for(int index = 0 ; index < strName.length ; index++) {
			intKor[index] = rnd.nextInt(100);
			intEng[index] = rnd.nextInt(100);
			intMath[index] = rnd.nextInt(100);
		}
		
		System.out.println("====================================");
		System.out.println("이름\t국어\t영어\t수학");
		System.out.println("------------------------------------");
		
		for(int i = 0 ; i < strName.length ; i++) {
			System.out.printf("%s\t%d\t%d\t%d\n", strName[i], intKor[i], intEng[i], intMath[i]);
		}
		System.out.println("====================================");
		
	}

}
