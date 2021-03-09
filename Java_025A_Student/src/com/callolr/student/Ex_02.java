package com.callolr.student;

import java.util.Random;

public class Ex_02 {
	
	// String은 틀리면 안된다
	// 하나의 키워드라 생각
	public static void main(String[] args) {
		/*
		 *  Random클래스를 사용하여 1 ~ 100 까지 범위의 임의의 정수를 생성하여 
		 *  이 정수가 짝수인지 홀수인지 판별
		 */
		Random rnd = new Random();
		int num = rnd.nextInt(100) + 1;
		if(num % 2 == 0) {
			System.out.println(num + "는 짝수");
		} else {
			System.out.println(num + "는 홀수");
		}
	}

}
