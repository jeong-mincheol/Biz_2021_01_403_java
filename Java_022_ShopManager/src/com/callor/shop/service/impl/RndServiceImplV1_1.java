package com.callor.shop.service.impl;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
// 처음만든것
public class RndServiceImplV1_1 {
	
	private String numsFile;
	private List<Integer> intList;
	private Random rnd;
	// 생성자method
	public RndServiceImplV1_1() {
		numsFile = "src/com/callor/shop/files/nums.txt";
		intList = new ArrayList<Integer>();
		rnd = new Random();
	}
	
	public void makeNums() {
			
			for(int i = 0 ; i < 100 ; i++) {
				Integer num = rnd.nextInt(1000) + 1;
				
				intList.add(num);
			}
	}
	
	public void saveFileNums() {
		FileWriter fileWriter = null;
		PrintWriter printer	= null;
		
		try {
			fileWriter = new FileWriter(numsFile);
			printer = new PrintWriter(fileWriter);
			
			
			for(Integer n : intList) {
				printer.print(n + ":");
				// 5개마다 줄을 바꾸는 방법은?
			}
			printer.close();
			fileWriter.close();
		} catch (IOException e) {
			
		}
	}
}
