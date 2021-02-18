package com.callor.applications.service;

public class ClassServiceV7 {
	
	public void guguDan(int dan) {
		System.out.println("=============================");
		System.out.printf("%d단 구구단\n", dan);
		System.out.println("-----------------------------");
		
		for(int i = 1 ; i < 10 ; i++) {
			int result = dan * i;
			System.out.printf("%d x %d = %d\n", dan, i, result);
		}
		System.out.println("=============================");
	}

}
