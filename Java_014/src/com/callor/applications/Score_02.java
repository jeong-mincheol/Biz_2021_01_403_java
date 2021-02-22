package com.callor.applications;

import java.util.Scanner;

public class Score_02 {
	
	public static void main(String[] args) {
		
		String[] strName = new String[3]; 
		String[] intKor = new String[3];
		String[] intEng = new String[3];
		String[] intMath = new String[3];
		
		Scanner scan = new Scanner(System.in);
		
		for(int index = 0 ; index < strName.length ; index++ ) {
			System.out.print("학생이름 : ");
			strName[index] = scan.nextLine();
			System.out.print("국어점수 : ");
			// 문자열형으로 입력받고
			// String strSubj = scan.nextLine();
			// 문자열형 숫자를 정수로 변경하여 저장
			// intKor[index] = Integer.valueOf(strSubj);
			intKor[index] = scan.nextLine();
			System.out.print("영어점수 : ");
			intEng[index] = scan.nextLine();
			System.out.print("수학점수 : ");
			intMath[index] = scan.nextLine();
			
			// scan.nextLine();
		}
		System.out.println("==================================");
		System.out.println("이름\t국어\t영어\t수학");
		System.out.println("----------------------------------");
		
		for(int i = 0 ; i < strName.length ; i++) {
			System.out.printf("%s\t%s\t%s\t%s\n", strName[i], intKor[i], intEng[i], intMath[i]);
		}
		System.out.println("===================================");
		
	}

}
