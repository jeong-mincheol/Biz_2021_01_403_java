package com.callor.score.service;

public interface ScoreService {
	
	// 점수 생성
	public void makeScore();
	// 점수 저장
	public void saveScoreToFile();
	// 점수 불러오기 후 총점, 평균 계산 후 리스트 출력
	public void loadScoreFromFile();

}
