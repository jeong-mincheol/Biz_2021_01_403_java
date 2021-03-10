package com.callor.score.service.impl;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.score.model.ScoreVO;
import com.callor.score.service.ScoreService;
import com.callor.score.values.Values;

public class ScoreServiceImplV1 implements ScoreService {

	private String fileName;
	private List<ScoreVO> scoreList;

	public ScoreServiceImplV1() {
		// TODO Auto-generated constructor stub
		scoreList = new ArrayList<ScoreVO>();
		fileName = "src/com/callor/score/data/score.txt";
	}

	@Override
	public void inputScore() {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.print("학번을 입력하세요 >> ");
		String strNum = String.format("%05d", Integer.valueOf(scan.nextLine()));

		int intKor = 0;
		while (true) {
			System.out.print("국어점수 >> ");
			String strKor = scan.nextLine();
			try {
				intKor = Integer.valueOf(strKor);
				if (intKor < 0 || intKor > 100) {
					System.out.println("점수는 0 ~ 100점 내의 정수만 입력가능");
				} else {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("정수만 입력 가능!!!");
			}
		} // while end

		int intEng = 0;
		while (true) {
			System.out.print("영어점수 >> ");
			String strEng = scan.nextLine();
			try {
				intEng = Integer.valueOf(strEng);
				if (intEng < 0 || intEng > 100) {
					System.out.println("점수는 0 ~ 100점 내의 정수만 입력가능");
				} else {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("정수만 입력 가능!!!");
			}
		}

		int intMath = 0;
		while (true) {
			System.out.print("수학점수 >> ");
			String strMath = scan.nextLine();
			try {
				intMath = Integer.valueOf(strMath);
				if (intMath < 0 || intMath > 100) {
					System.out.println("점수는 0 ~ 100점 내의 정수만 입력가능");
				} else {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("정수만 입력 가능!!!");
			}
		}

		int intMusic = 0;
		while (true) {
			System.out.print("음악점수 >> ");
			String strMusic = scan.nextLine();
			try {
				intMusic = Integer.valueOf(strMusic);
				if (intMusic < 0 || intMusic > 100) {
					System.out.println("점수는 0 ~ 100점 내의 정수만 입력가능");
				} else {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("정수만 입력 가능!!!");
			}
		}
		ScoreVO scoreVO = new ScoreVO();
		scoreVO.setStrNum(strNum);
		scoreVO.setKor(intKor);
		scoreVO.setEng(intEng);
		scoreVO.setMath(intMath);
		scoreVO.setMusic(intMusic);
		scoreList.add(scoreVO);
		System.out.println("점수 저장 완료!");

	}

	public void saveScoreToFile() {

		FileWriter fileWriter = null;
		PrintWriter printer = null;

		try {
			fileWriter = new FileWriter(fileName);
			printer = new PrintWriter(fileWriter);
			for (ScoreVO vo : scoreList) {
				printer.print(vo.getStrNum() + ":");
				printer.print(vo.getKor() + ":");
				printer.print(vo.getEng() + ":");
				printer.print(vo.getMath() + ":");
				printer.print(vo.getMusic() + "\n");
			}
			printer.close();
			fileWriter.close();
			System.out.println("파일 저장 완료!");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void totalAndAvg() {
		for (ScoreVO vo : scoreList) {
			int sum = vo.getKor();
			sum += vo.getEng();
			sum += vo.getMath();
			sum += vo.getMusic();

			float avg = (float) sum / 4;

			vo.setTotal(sum);
			vo.setAvg(avg);
		}

		for (int i = 0; i < scoreList.size(); i++) {
			int korTotal = 0;
			int engTotal = 0;
			int mathTotal = 0;
			int musicTotal = 0;

			korTotal += scoreList.get(i).getKor();
			engTotal += scoreList.get(i).getEng();
			mathTotal += scoreList.get(i).getMath();
			musicTotal += scoreList.get(i).getMusicTotal();

			int allSum = korTotal + engTotal + mathTotal + musicTotal;

			float korAvg = (float) korTotal / scoreList.size();
			float engAvg = (float) engTotal / scoreList.size();
			float mathAvg = (float) mathTotal / scoreList.size();
			float musicAvg = (float) musicTotal / scoreList.size();

			float allAvg = (float) allSum / scoreList.size();

			scoreList.get(i).setKorTotal(korTotal);
			scoreList.get(i).setEngTotla(engTotal);
			scoreList.get(i).setMathTotal(mathTotal);
			scoreList.get(i).setMusicTotal(musicTotal);
			scoreList.get(i).setAllTotal(allSum);

			scoreList.get(i).setKorAvg(korAvg);
			scoreList.get(i).setEngAvg(engAvg);
			scoreList.get(i).setMathAvg(mathAvg);
			scoreList.get(i).setMusicAvg(musicAvg);
			scoreList.get(i).setAllAvg(allAvg);

		}

	}

	@Override
	public void printScore() {
		// TODO Auto-generated method stub
		this.totalAndAvg();

		System.out.println(Values.dLine(50));
		System.out.println("성적알림표");
		System.out.println(Values.dLine(50));
		System.out.println("학번\t국어\t영어\t수학\t음악\t총점\t평균");
		System.out.println(Values.sLine(50));
		int nSize = scoreList.size();
		for (int i = 0; i < nSize; i++) {
			System.out.print(scoreList.get(i).getStrNum() + "\t");
			System.out.print(scoreList.get(i).getKor() + "\t");
			System.out.print(scoreList.get(i).getEng() + "\t");
			System.out.print(scoreList.get(i).getMath() + "\t");
			System.out.print(scoreList.get(i).getMusic() + "\t");
			System.out.print(scoreList.get(i).getTotal() + "\t");
			System.out.printf("%3.2f\n", scoreList.get(i).getAvg());
		}

		System.out.println(Values.sLine(50));

		for (int i = 0; i < nSize; i++) {
			System.out.print("총점:" + "\t");
			System.out.print(scoreList.get(i).getKorTotal() + "\t");
			System.out.print(scoreList.get(i).getEngTotla() + "\t");
			System.out.print(scoreList.get(i).getMathTotal() + "\t");
			System.out.print(scoreList.get(i).getMusicTotal() + "\t");
			System.out.print(scoreList.get(i).getAllTotal() + "\t");
			System.out.println("x");

			System.out.print("평균:" + "\t");
			System.out.print(scoreList.get(i).getKorAvg() + "\t");
			System.out.print(scoreList.get(i).getEngAvg() + "\t");
			System.out.print(scoreList.get(i).getMathAvg() + "\t");
			System.out.print(scoreList.get(i).getMusicAvg() + "\t");
			System.out.print(" x " + "\t");
			System.out.printf("%3.2f\n", scoreList.get(i).getAllAvg());
		}
			System.out.println(Values.dLine(50));

		

	}

}
