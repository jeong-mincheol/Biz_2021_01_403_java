package com.callor.score;

import java.util.Random;

public class Score_01 {

	public static void main(String[] args) {

		// {}안의 데이터을 가진 배열 strName 선언
		String[] strName = new String[] { "홍길동", "이몽룡", "성춘향", "장녹수", "임꺽정" };
		// {}안의 데이터를 가진 배열 strAddress 선언
		String[] strAddress = new String[] { "서울시", "익산시", "남원시", "한양시", "함흥시" };
		// {}안의 데이터를 가진 배열 strSubject 선언
		String[] strSubject = new String[] { "국어", "영어", "수학" };

		// strName배열의 개수만큼 정수형 배열 선언
		int[] intKor = new int[strName.length];
		int[] intEng = new int[strName.length];
		int[] intMath = new int[strName.length];
		int[] intSum = new int[strName.length];
		float[] floatAvg = new float[strName.length];

		// Random클래스 가져오기
		Random rnd = new Random();

		// 선언한 정수형 배열에 무작위 값(1 ~ 100) 점수 저장하기
		for (int i = 0; i < strName.length; i++) {
			intKor[i] = rnd.nextInt(100) + 1;
			intEng[i] = rnd.nextInt(100) + 1;
			intMath[i] = rnd.nextInt(100) + 1;
		} // for end
		// 총합을 나타내는 배열에 총합값 저장하기
		for (int i = 0; i < strName.length; i++) {
			intSum[i] = intKor[i];
			intSum[i] += intEng[i];
			intSum[i] += intMath[i];
		} // for end
		// 총합값을 가져와서 실수형으로 변경하여 평균값 저장하기
		for (int i = 0; i < strName.length; i++) {
			floatAvg[i] = (float) intSum[i] / strSubject.length;
		} // for end

		System.out.println("============================================================");
		System.out.println("이름\t주소\t국어\t영어\t수학\t총점\t평균");
		System.out.println("------------------------------------------------------------");
		// 이름배열(strName)의 개수만큼 각각의 값 표출하기 
		for (int i = 0; i < strName.length; i++) {
			System.out.printf("%s\t%s\t%d\t%d\t%d\t%d\t%3.2f\n",
					strName[i], strAddress[i], intKor[i], intEng[i], intMath[i], intSum[i], floatAvg[i]);
		} // for end
		System.out.println("============================================================");

	} // main end

} // class end
