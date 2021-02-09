package com.callor.start.jdk.keyinput;

import java.util.Random;
import java.util.Scanner;

public class KeyInput_03 {
	
	public static void main(String[] args) {
		
		Random rnd = new Random();
		int num1 = rnd.nextInt(100);
		
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자입력 >> ");
		int intSum = scan.nextInt();
		if(num1 > intSum) {
			System.out.println(num1 + " 보다 작다");
		}
		if(num1 == intSum) {
			System.out.println(num1 + " 와 같다");
		}
		if(num1 < intSum) {
			System.out.println(num1 + " 보다 크다");
		}
		
		
	}

}
