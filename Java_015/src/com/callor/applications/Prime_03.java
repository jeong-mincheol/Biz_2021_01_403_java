package com.callor.applications;

import java.util.Scanner;

import com.callor.applications.service.PrimeServiceV2;

public class Prime_03 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("2이상의 정수입력 : ");
		int num = scan.nextInt();
		
		PrimeServiceV2 psV2 = new PrimeServiceV2();
		// 설명...
		int result = psV2.prime(num);
		if(result < 0) {
			System.out.println((num + "은 소수가 아님"));
		} else {
			System.out.println(num + "은 소수");
		}
	}

}
