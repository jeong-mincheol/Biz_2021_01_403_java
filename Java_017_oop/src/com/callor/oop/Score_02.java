package com.callor.oop;

import java.util.Scanner;

import com.callor.oop.model.ScoreVO;
import com.callor.oop.service.ScoreServiceV1;

public class Score_02 {

	public static void main(String[] args) {

		ScoreVO scoreVO = new ScoreVO();
		
		ScoreServiceV1 ssV1 = new ScoreServiceV1();

		Scanner scan = new Scanner(System.in);

		
			System.out.print("학생이름 : ");
			String strName = scan.nextLine();
			scoreVO.strName = strName;
			
			scoreVO.setIntKor(ssV1.inputScore("국어")+ "");
			// sVO.intEng = ssV1.inputScore("영어");
			// sVO.intMath = ssV1.inputScore("수학");
			
	

	}

	}