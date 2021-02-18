package com.callor.applications.service;

import java.util.Scanner;

public class ClassServiceV1 {
	
	Scanner scan = new Scanner(System.in);
	
	public void add(int intNum1, int intNum2) {
		int intSum = intNum1 + intNum2;
		System.out.println(intNum1 + " + " + intNum2 + " = " + intSum);
	} 
	
	public void add(int intNum, float floatNum) {
		float floatSum = intNum + floatNum;
		System.out.println(intNum + " + " + floatNum + " = " + floatSum);
	}
	
	public void add(double dbNum, float floatNum) {
		double dbSum = dbNum + floatNum;
		double dbMinus = dbNum - floatNum;
		double dbMul = dbNum * floatNum;
		double dbDiv = dbNum / floatNum;
		
		System.out.println(dbNum + " + " + floatNum + " = " + dbSum);
		System.out.println(dbNum + " - " + floatNum + " = " + dbMinus);
		System.out.println(dbNum + " * " + floatNum + " = " + dbMul);
		System.out.println(dbNum + " / " + floatNum + " = " + dbDiv);
	}

}
