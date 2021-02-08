package com.callor.start;

public class Multiple_01 {

	public static void main(String[] args) {

		int sum = 0;
		for (int i = 0; i < 100; i++) {
			int num = i + 7;
			boolean bYes = num % 3 == 0;
			
			// if(num % 3 == 0)
			// if(bYes == true)
			if (bYes) {
				System.out.println(num + "는 3의배수");
				sum += num;
			}
		} //for end 
		System.out.println("3의 배수합 : " + sum);
	}
}
