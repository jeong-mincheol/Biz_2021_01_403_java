package com.callolr.student;

import java.util.Random;

/*
 * 정수형 배열 100개를 선언하여 
 * 10 ~ 100까지 임의의 정수를 생성하여 저장
 * 
 * 100개의 배열에 담긴 정수중에 소수들만 찾아서 
 * Console에 출력
 * 
 * 배열나오고 for문
 */
public class Ex_08 {
	
	public static void main(String[] args) {
		
		// 임의의 수를 생성할 Random클래스 선언 및 초기화
		Random rnd = new Random();
		
		// 정수형 배열 100개 선언
		int[] intList = new int[100];
		
		// 10 ~ 100까지 임의의 정수 생성
		for(int i = 0 ; i < intList.length ; i++) {
			int num = rnd.nextInt(91) + 10;
			int index = 0;
			for(index = 2 ; index < num ; index++) {
				if(num % index == 0) {
					break;
				}
			}
			if(index < num) {
				// System.out.println(num + "은 소수가 아님");
			} else {
				System.out.println(num + "은 소수");
			}
		}
		
		
		
		
		
		}
		
	}
