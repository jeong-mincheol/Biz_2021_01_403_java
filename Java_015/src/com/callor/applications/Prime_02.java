package com.callor.applications;

import java.util.Scanner;

import com.callor.applications.service.PrimeServiceV1;

public class Prime_02 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("2이상의 정수 입력 : ");
		int intNum = scan.nextInt();
		
		PrimeServiceV1 psV1 = new PrimeServiceV1();
		psV1.prime(intNum);
		
		
	}

	

}
