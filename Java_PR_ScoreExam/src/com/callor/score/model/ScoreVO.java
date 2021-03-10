package com.callor.score.model;

public class ScoreVO {
	
	private String strNum;
	private int kor;
	private int eng;
	private int math;
	private int music;
	
	private int total;
	private float avg;
	
	private int korTotal;
	private int engTotla;
	private int mathTotal;
	private int musicTotal;
	private int allTotal;
	
	private float korAvg;
	private float engAvg;
	private float mathAvg;
	private float musicAvg;
	private float allAvg;
	
	public ScoreVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public ScoreVO(String strNum, int kor, int eng, int math, int music) {
		super();
		this.strNum = strNum;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.music = music;
	}

	public String getStrNum() {
		return strNum;
	}

	public void setStrNum(String strNum) {
		this.strNum = strNum;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getMusic() {
		return music;
	}

	public void setMusic(int music) {
		this.music = music;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public float getAvg() {
		return avg;
	}

	public void setAvg(float avg) {
		this.avg = avg;
	}

	public int getKorTotal() {
		return korTotal;
	}

	public void setKorTotal(int korTotal) {
		this.korTotal = korTotal;
	}

	public int getEngTotla() {
		return engTotla;
	}

	public void setEngTotla(int engTotla) {
		this.engTotla = engTotla;
	}

	public int getMathTotal() {
		return mathTotal;
	}

	public void setMathTotal(int mathTotal) {
		this.mathTotal = mathTotal;
	}

	public int getMusicTotal() {
		return musicTotal;
	}

	public void setMusicTotal(int musicTotal) {
		this.musicTotal = musicTotal;
	}

	public int getAllTotal() {
		return allTotal;
	}

	public void setAllTotal(int allTotal) {
		this.allTotal = allTotal;
	}

	public float getKorAvg() {
		return korAvg;
	}

	public void setKorAvg(float korAvg) {
		this.korAvg = korAvg;
	}

	public float getEngAvg() {
		return engAvg;
	}

	public void setEngAvg(float engAvg) {
		this.engAvg = engAvg;
	}

	public float getMathAvg() {
		return mathAvg;
	}

	public void setMathAvg(float mathAvg) {
		this.mathAvg = mathAvg;
	}

	public float getMusicAvg() {
		return musicAvg;
	}

	public void setMusicAvg(float musicAvg) {
		this.musicAvg = musicAvg;
	}

	public float getAllAvg() {
		return allAvg;
	}

	public void setAllAvg(float allAvg) {
		this.allAvg = allAvg;
	}

	@Override
	public String toString() {
		return "ScoreVO [strNum=" + strNum + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", music=" + music
				+ ", total=" + total + ", avg=" + avg + ", korTotal=" + korTotal + ", engTotla=" + engTotla
				+ ", mathTotal=" + mathTotal + ", musicTotal=" + musicTotal + ", allTotal=" + allTotal + ", korAvg="
				+ korAvg + ", engAvg=" + engAvg + ", mathAvg=" + mathAvg + ", musicAvg=" + musicAvg + ", allAvg="
				+ allAvg + "]";
	}

	

	
	
}
