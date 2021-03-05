package com.callor.shop.files;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class FileWriter_01 {

	public static void main(String[] args) {
		// 파일이름을 저장할 문자열형 변수를 만든다
		String rndFileName = "src/com/callor/shop/files/nums.txt";
		// Random클래스에 새로운 객체를 선언하여 사용할 준비를 한다
		Random rnd = new Random();
		
		// FileWriter 클래스를 가져와 fileWriter라는 객체를 선언하고 null 입력 후 사용할 준비를 한다 
		FileWriter fileWriter = null;
		// PrinterWriter 클래스를 가져와 printer라는 객체를 선언하고 null 입력 후 사용할 준비를 한다
		PrintWriter printer = null;

		// 
		try {
			fileWriter = new FileWriter(rndFileName);
			printer = new PrintWriter(fileWriter);

			for (int i = 0; i < 100; i++) {
				int num = rnd.nextInt(1000) + 1;
				printer.print(num);
				
			}
			
			printer.close();
			fileWriter.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
