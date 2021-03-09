package com.callor.student.model;

public class StudentVO {
	
	private int stNum; // 0
	private String stName; // 1 
	private String major; // 2
	private int grade; // 3 
	private int classNum; // 4
	private String address; // 5
	private String pNumber; // 6
	
	
	public StudentVO() {
		super();
	}
	
	public StudentVO(int stNum, String stName, String major, int grade, int classNum, String address, String pNumber) {
		super();
		this.stNum = stNum;
		this.stName = stName;
		this.major = major;
		this.grade = grade;
		this.classNum = classNum;
		this.address = address;
		this.pNumber = pNumber;
	}

	public int getStNum() {
		return stNum;
	}
	public void setStNum(int stNum) {
		this.stNum = stNum;
	}
	public String getStName() {
		return stName;
	}
	public void setStName(String stName) {
		this.stName = stName;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getClassNum() {
		return classNum;
	}
	public void setClassNum(int classNum) {
		this.classNum = classNum;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getpNumber() {
		return pNumber;
	}
	public void setpNumber(String pNumber) {
		this.pNumber = pNumber;
	}
	@Override
	public String toString() {
		return "StudentVO [stNum=" + stNum + ", stName=" + stName + ", major=" + major + ", grade=" + grade
				+ ", classNum=" + classNum + ", address=" + address + ", pNumber=" + pNumber + "]";
	}
	
	

}
