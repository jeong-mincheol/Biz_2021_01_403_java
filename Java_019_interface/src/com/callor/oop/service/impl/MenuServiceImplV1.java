package com.callor.oop.service.impl;

import java.util.Scanner;

public class MenuServiceImplV1 {
	
	private Scanner scan = new Scanner(System.in);
	
	public void selectMenu() {
		
		while(true) {
			System.out.println("================================");
			System.out.println("Java Menu System v1");
			System.out.println("--------------------------------");
			System.out.println("1. 카트추가");
			System.out.println("2. 카트삭제");
			System.out.println("3. 카트리스트");
			System.out.println("Q. 끝내기");
			System.out.println("--------------------------------");
			System.out.print("선택 >> ");
			String strInput = scan.nextLine();
			
			try {
				if(strInput == "Q") {
					System.out.println("종료");
				}
				int input = Integer.valueOf(strInput);
				if(input == 1) {
					System.out.println("카트추가");
				}
				if(input == 2) {
					System.out.println("카트삭제");
				}
				if(input == 3) {
					System.out.println("카트리스트");
				}
			} catch (Exception e) {
				return; 
			}
			} 
			
		}
		
	}