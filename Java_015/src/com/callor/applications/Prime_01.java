package com.callor.applications;

import java.util.Scanner;

public class Prime_01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("2이상의 정수를 입력하시오 : ");
		int keyNum = scan.nextInt();
		
		for (int i = 2 ; i < keyNum; i++) {
			boolean bYes = keyNum % i == 0;
			if(bYes) {
				System.out.println("소수가 아니다");
				break;
			}

		}
		
		int pos = 0;
		for(pos = 2 ; pos < keyNum ; pos++) {
			if(keyNum % pos == 0) {
				break;
			}
		}
		System.out.println(pos);
		// pos의 값은?
		// for 반복문이 중간에 break되면
		// 항상 pos < keyNum
		
		
		if(pos < keyNum) {
			System.out.println(keyNum + "는 소수가 아님");
		} // for 반복문이 break없이 모두 완료되었으면
		else {
			System.out.println(keyNum + "은 소수");
		}

	}

}
