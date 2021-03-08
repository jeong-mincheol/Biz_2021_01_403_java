package com.callor.score.model;

public class ScoreVO {
	
	private int intKor;
	private int intEng;
	private int intMath;
	private int intMusic;
	private int intHistory;
	
	private int intTotal;
	private float floatAvg;
	
	public ScoreVO() {
	}
	
	public ScoreVO(int intKor, int intEng, int intMath, int intMusic, int intHistory) {
		super();
		this.intKor = intKor;
		this.intEng = intEng;
		this.intMath = intMath;
		this.intMusic = intMusic;
		this.intHistory = intHistory;
	}

	public int getIntKor() {
		return intKor;
	}
	public void setIntKor(int intKor) {
		this.intKor = intKor;
	}
	public int getIntEng() {
		return intEng;
	}
	public void setIntEng(int intEng) {
		this.intEng = intEng;
	}
	public int getIntMath() {
		return intMath;
	}
	public void setIntMath(int intMath) {
		this.intMath = intMath;
	}
	public int getIntMusic() {
		return intMusic;
	}
	public void setIntMusic(int intMusic) {
		this.intMusic = intMusic;
	}
	public int getIntHistory() {
		return intHistory;
	}
	public void setIntHistory(int intHistory) {
		this.intHistory = intHistory;
	}
	public int getIntTotal() {
		return intTotal;
	}
	public void setIntTotal(int intTotal) {
		this.intTotal = intTotal;
	}
	public float getFloatAvg() {
		return floatAvg;
	}
	public void setFloatAvg(float floatAvg) {
		this.floatAvg = floatAvg;
	}
	@Override
	public String toString() {
		return "ScoreVO [intKor=" + intKor + ", intEng=" + intEng + ", intMath=" + intMath + ", intMusic=" + intMusic
				+ ", intHistory=" + intHistory + ", intTotal=" + intTotal + ", floatAvg=" + floatAvg + "]";
	}
	
	

}
