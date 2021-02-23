package com.callor.applications;

import java.util.Random;
import java.util.Scanner;

public class Array_01 {
	
	public static void main(String[] args) {
		
		// 정수 100개를 저장할 배열변수를 선언하고
		// 생성(초기화 : 사용할 준비하라)
		int[] intNums = new int[100];
		
		// Random클래스를 사용하여 rnd객체를 선언하고
		// = new Random()을 사용하여
		// rnd 객체를 인스턴스화(化..으로 만든다) 시킨다
		// rnd : Random 클래스의 인스턴스
		Random rnd = new Random();
		
		// 0 ~ intNums.length -1 횟수만큼
		// 반복하여 반복문을 실행하겠다.
		/*
		 * 0 ~ intNums.length까지의 정수를 만들어서
		 * intNums의 위치값으로 정하고
		 * 
		 * 1 ~ 10까지의 임의 숫자를 생성하여
		 * intNums의 배열에 채워 넣어라
		 */
		for(int i = 0 ; i < intNums.length ; i++) {
			
			// intNums의 i번째 위에 정수 100을 저장하라
			// i값은 0 ~ (intNums.length -1) 까지
			// 값을 갖게 되므로 전체 배열 100개에
			// 정수 100을 저장하라
			// intNums[i] = 100;
			
			// rnd 인스턴스의 nextInt() method를 호출(실행)하라
			// 매개변수값으로 10을 전달하라
			// Random 클래스의 nextInt() method에 
			// 정수10을 전달하고 실행하여
			// return하는 결과를 변수에 저장하라
			// return된 결과에 1을 더하기
			// 변수에는 1 ~ 10 까지 중 한개의 숫자가 저장된다
			// 임의로 생성된 숫자를 intNums의 i번째 위치에 저장하라
			intNums[i] = rnd.nextInt(10) + 1;
		}
		
		Scanner scan = new Scanner(System.in);
		int count = 0;
		
		System.out.print(" 1 ~ 10까지 중 정수 입력 : ");
		int num = scan.nextInt();
		for(int i = 0 ; i < intNums.length ; i++) {
			if(intNums[i] == num) {
					count++;
			}
		}
		System.out.println(num + " 의 개수 : " + count);
	}
}
