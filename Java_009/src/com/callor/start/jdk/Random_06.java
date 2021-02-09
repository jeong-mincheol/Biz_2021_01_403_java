package com.callor.start.jdk;

import java.util.Random;

public class Random_06 {

	public static void main(String[] args) {

		Random rnd = new Random();

		for (int i = 0; i < 100; i++) {
			int num = rnd.nextInt(100) + 1;
			System.out.println((i + 1) + ".  " + num);

			if (num > 34) {
				break;
			}
		}

	}

}
