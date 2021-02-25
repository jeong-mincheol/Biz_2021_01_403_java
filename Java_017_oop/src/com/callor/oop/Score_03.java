package com.callor.oop;

import java.util.Scanner;

import com.callor.oop.model.ScoreVO;

public class Score_03 {

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
				scoreVO.setIntKor(strKor);

				// intKor에 -1이 담겨있으면
				// 다시 입력을 하도록 해야 한다.
				if (scoreVO.getIntKor() < 0) {
					System.out.println("국어점수 유효성 검사 실패");
					continue;
				}
				break;
			}
			while (true) {
				System.out.print("영어점수 : ");
				String strEng = scan.nextLine();
				scoreVO.setIntEng(strEng);
				if(scoreVO.getIntEng() < 0) {
					System.out.println("영어점수 유효성검사 실패");
					continue;
				}
				break;
			}

			System.out.print("수학점수 : ");
			String strMath = scan.nextLine();
			scoreVO.intMath = Integer.valueOf(strMath);

		} // end while

	}

}
