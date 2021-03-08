package com.callor.score.service.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.callor.score.model.ScoreVO;
import com.callor.score.service.ScoreService;
import com.callor.score.values.Values;

public class ScoreServiceImplV1 implements ScoreService {
	
	// method에서 공통으로 사용할 것들 인스턴스 변수 선언
	// 객체배열 선언
	private List<Integer> scoreList;
	// 파일이름을 담을 문자열형 선언 
	private String fileName;
	
	// 생성자 method
	public ScoreServiceImplV1() {
		scoreList = new ArrayList<Integer>();
		fileName = "src/com/callor/score/scoreList.txt";
	}

	@Override
	// 점수 생성
	public void makeScore() {
		Random rnd = new Random();
		// 점수 100개 생성
		for(int i = 0 ; i < 100 ; i++) {
			Integer intScore = rnd.nextInt(100) + 1;
			// 객체배열 scoreList에 저장
			scoreList.add(intScore);
		}
	}

	@Override
	// 점수 저장
	public void saveScoreToFile() {
		FileWriter fileWriter = null;
		PrintWriter printer = null;
		
		try {
			fileWriter = new FileWriter(fileName);
			printer = new PrintWriter(fileWriter);
			
			// 5개씩 끊어서 처리하기 위해 정수형 변수 count 생성(초기화)
			int count = 0;
			// scoreList 배열의 값들을 n에 저장 후 5개 마다 엔터
			for(Integer n : scoreList) {
				printer.print(n + ":");
				if(++count % 5 == 0) {
					printer.println();
				}
			}
			// 사용한 FileWriter와 PrintWriter를 종료 
			printer.close();
			fileWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	// 파일 가져와서 총점 평균 계산 후 성적 리스트 출력
	public void loadScoreFromFile() {
		List<ScoreVO> scoreList = new ArrayList<ScoreVO>();
		List<String> strLines = new ArrayList<String>();
		fileName = "src/com/callor/score/scoreList.txt";
		
		// 글자를 읽는 클래스
		FileReader fileReader = null;
		BufferedReader buffer = null;
		
		try {
			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader);
			
			while(true) {
				// 1줄씩 읽어오는 코드
				String str = buffer.readLine();
				if(str == null) {
					break;
				}
				strLines.add(str);
			}
			// 사용종료
			buffer.close();
			fileReader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		// 과목마다 점수를 넣어준다
		for(String str : strLines) {
			// :지워주기
			String[] nums = str.split(":");
			ScoreVO scoreVO = new ScoreVO();
			scoreVO.setIntKor(Integer.valueOf(nums[0]));
			scoreVO.setIntEng(Integer.valueOf(nums[1]));
			scoreVO.setIntMath(Integer.valueOf(nums[2]));
			scoreVO.setIntMusic(Integer.valueOf(nums[3]));
			scoreVO.setIntHistory(Integer.valueOf(nums[4]));
			// 배열에 값을 저장
			scoreList.add(scoreVO);
		}
		// 배열마다 총합과 평균 계산
		for(ScoreVO vo : scoreList) {
			int sum = vo.getIntKor();
			sum += vo.getIntEng();
			sum += vo.getIntMath();
			sum += vo.getIntMusic();
			sum += vo.getIntHistory();
			
			float avg = (float)sum / 5;
			vo.setIntTotal(sum);
			vo.setFloatAvg(avg);
			
		}
		System.out.println(Values.dLine);
		System.out.println("국어\t영어\t수학\t음악\t국사\t총점\t평균");
		System.out.println(Values.sLine);
		
		// 값 출력
		for(ScoreVO vo : scoreList) {
			System.out.print(vo.getIntKor() + "\t");
			System.out.print(vo.getIntEng() + "\t");
			System.out.print(vo.getIntMath() + "\t");
			System.out.print(vo.getIntMusic() + "\t");
			System.out.print(vo.getIntHistory() + "\t");
			System.out.print(vo.getIntTotal() + "\t");
			System.out.printf("%3.2f\n", vo.getFloatAvg());
		}
		System.out.println(Values.dLine);
		
	}

}
