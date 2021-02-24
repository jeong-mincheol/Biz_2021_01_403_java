package com.callor.score;

import com.callor.score.model.ScoreVO;

public class ScoreServiceV2 {
	
	public int scoreSum(int kor, int eng, int math, int music, int art, int history) {
		int sum = kor;
		sum += math;
		sum += math;
		sum += music;
		sum += art;
		sum += history;
		return sum;
	}
	
	public int scoreSum(ScoreVO scoreVO) {
		int sum = scoreVO.intKor;
		sum += scoreVO.intEng;
		sum += scoreVO.intMath;
		sum += scoreVO.intMusic;
		sum += scoreVO.intHistory;
		return sum;
	}

}
