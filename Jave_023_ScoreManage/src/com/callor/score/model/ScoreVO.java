package com.callor.score.model;

public class ScoreVO {
	
	private String strOrder;
	private String strSubject;
	private int intKor;
	private int intEng;
	private int intMath;
	private int intMusic;
	private int intHistory;
	
	private int intTotal;
	private float floatAvg;
	
	
	public ScoreVO() {
	}
	
	public ScoreVO(String strOrder, String strSubject,
			int intKor, int intEng, int intMath, int intMusic, int intHistory) {
		this.strOrder = strOrder;
		this.strSubject = strSubject;
		this.intKor = intKor;
		this.intEng = intEng;
		this.intMath = intMath;
		this.intMusic = intMusic;
		this.intHistory = intHistory;
	}

	public String getStrOrder() {
		return strOrder;
	}
	public void setStrOrder(String strOrder) {
		this.strOrder = strOrder;
	}
	public String getStrSubject() {
		return strSubject;
	}
	public void setStrSubject(String strSubject) {
		this.strSubject = strSubject;
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
		return "ScoreVO [strOrder=" + strOrder + ", strSubject=" + strSubject + ", intKor=" + intKor + ", intEng="
				+ intEng + ", intMath=" + intMath + ", intMusic=" + intMusic + ", intHistory=" + intHistory
				+ ", intTotal=" + intTotal + ", floatAvg=" + floatAvg + "]";
	}
	

}
