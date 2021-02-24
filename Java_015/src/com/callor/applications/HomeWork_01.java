package com.callor.applications;

import java.util.Random;

import com.callor.applications.service.PrimeServiceV2;

public class HomeWork_01 {
	
	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		// 0 ~ 99까지 있는 정수형 배열 num선언
		int num[] = new int[100];
		
		// 배열num에 2 ~ 101 사이의 무작위 정수를 넣는다
		for(int i = 0 ; i < num.length ; i++ ) {
			num[i] = rnd.nextInt(1000) + 2;
		}
		
		// PrimeServiceV2 클래스를 선언
		PrimeServiceV2 psV2 = new PrimeServiceV2();
		
		// 총합을 나타내기 위한 변수로 sum 선언
		int sum = 0;
		
		// PrimeServiceV2 클래스에 prime() method를 가져와 결과값을 변수 keyNum에 저장하고
		// keyNum이 0보다 크면 실수이므로 그 값을 출력하고 
		// 나온값들을 sum에 더한다
		for(int i = 0 ; i < num.length ; i++) {
			int keyNum = psV2.prime(num[i]);
			if(keyNum > 0) {
				System.out.println(keyNum);
				sum += keyNum;
			}
		}
		// 해당되는 결과 값을 모두 더한 sum의 값을 출력한다
		System.out.println("소수인 수들의 합 : " + sum);
		
	}

}
