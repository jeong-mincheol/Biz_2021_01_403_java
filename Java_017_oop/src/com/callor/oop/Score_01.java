package com.callor.oop;

import java.util.Scanner;

import com.callor.oop.model.ScoreVO;

public class Score_01 {

	public static void main(String[] args) {

		ScoreVO scoreVO = new ScoreVO();

		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.print("학생이름 : ");
			String strName = scan.nextLine();
			scoreVO.strName = strName;

			while (true) {
				System.out.print("국어점수 : ");
				String strKor = scan.nextLine();
				
				try {
					int intKor = Integer.valueOf(strKor);
					// scoreVO.intKor = intKor;
					scoreVO.setIntKor(strKor);
					break;
				} catch (Exception e) {
					System.out.println("국어점수는 숫자로만 입력");
					continue;
				}
			}

			System.out.print("영어점수 : ");
			String strEng = scan.nextLine();

			System.out.print("수학점수 : ");
			String strMath = scan.nextLine();

		} // end while
	}
}

