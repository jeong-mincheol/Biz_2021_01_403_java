package com.callor.applications;

import java.util.Scanner;

public class Score_01 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("점수는 0 ~ 100 까지만 입력할 수 있음");
		System.out.print("국어점수 : ");
		int kor = scan.nextInt();
		System.out.print("영어점수 : ");
		int eng = scan.nextInt();
		System.out.print("수학점수 : ");
		int mat = scan.nextInt();
		
		int sum = kor + eng + mat;
		float avg = (kor + eng + mat)/3f;
		
		System.out.println("==========================================");
		System.out.println("국어\t 영어\t 수학\t 총점\t 평균");
		System.out.println("------------------------------------------");
		System.out.println(kor + " \t " + eng + " \t " + mat + " \t " + sum + " \t " + avg);
		System.out.println("==========================================");
		
	}

}
