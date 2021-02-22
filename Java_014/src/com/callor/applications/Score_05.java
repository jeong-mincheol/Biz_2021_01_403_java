package com.callor.applications;

import java.util.Random;

public class Score_05 {
	
	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		// 학생이름이 미리 정해진 경우
		// 개수를 지정하지 않고
		// 값들(이름들)을 지정하여 배열선언하기
		String[] strName = new String[] {"홍길동","이몽룡","성춘향"};
		
		// 학생이름 배열 개수만큼 과목성적을 저장할 배열 선언
		int[] intKor = new int[strName.length];
		int[] intEng = new int[strName.length];
		int[] intMath = new int[strName.length];
		
		// 점수를 입력(생성)하는 코드
		for(int index = 0 ; index < strName.length ; index++) {
			intKor[index] = rnd.nextInt(100)+1;
			intEng[index] = rnd.nextInt(100)+1;
			intMath[index] = rnd.nextInt(100)+1;
		}
		
		System.out.println("=============================================================");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-------------------------------------------------------------");
		
		// 총합과 평균을 계산하는 코드
		for(int i = 0 ; i < strName.length ; i++) {
			// 총점과 평균을 배열로 선언해서 해도 된다.
			// 되도록 분리해서 써주는게 좋다
			int intSum = intKor[i];
			intSum += intEng[i];
			intSum += intMath[i];
			float floatAvg = (float)intSum / 3;
			
			// 성적리스트 출력
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%3.2f\n",
					strName[i], intKor[i], intEng[i], intMath[i], intSum, floatAvg);
		}
		System.out.println("=============================================================");
		
	}

}
