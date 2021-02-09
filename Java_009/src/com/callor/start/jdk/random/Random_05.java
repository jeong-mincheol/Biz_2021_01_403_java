package com.callor.start.jdk.random;

import java.util.Random;

public class Random_05 {
	
	public static void main(String[] args) {
		
		Random rnd = new Random(); 
		
		int sum = 0;
		for(int i = 0 ; i < 100 ; i++) {
			int num = rnd.nextInt(100) + 1;
			System.out.println(num);
			if(num % 2 == 0) {
				sum += num;
			}
		}
		System.out.println(sum);
	}

}
