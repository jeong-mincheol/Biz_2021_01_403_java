package com.callor.applications.service;

public class PrimeServiceV1 {
	
	// 정수 1개를 매개변수로 갖는 prime() method
	// 매개 변수는 괄호안에서 선언한다
	public void prime(int intNum) {
		
		int pos = 0;
		// intNum과 1의 사이의 숫자에서 나뉘는지 확인
		for(pos = 2 ; pos < intNum ; pos++) {
			if(intNum % pos == 0) {
				break;
			}
		}
		
		if(pos < intNum) {
			System.out.println(intNum + " 는 소수가 아님");
		} else {
			System.out.println(intNum + " 은 소수");
		}
	}

}

