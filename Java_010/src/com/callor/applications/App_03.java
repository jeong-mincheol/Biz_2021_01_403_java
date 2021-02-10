package com.callor.applications;

import java.util.Scanner;

public class App_03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.print("숫자입력 >> ");
			int num1 = scan.nextInt();

			if (num1 < 2 || 9 < num1) {
				System.out.println("경고");
			} else {
				System.out.println("==============================");
				System.out.println("구구단 " + num1 + "단");
				System.out.println("------------------------------");

				for (int i = 0; i < 8; i++) {
					int num2 = i + 2;
					System.out.println(num1 + " x " + num2 + " = " + num1 * num2);
				}
			}
		}
	}
}
