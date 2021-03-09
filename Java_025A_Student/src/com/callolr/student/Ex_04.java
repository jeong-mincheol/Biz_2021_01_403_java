package com.callolr.student;

import com.callolr.student.model.StudentVO;

public class Ex_04 {
	
	public static void main(String args[]) {
		
		// 배열 10개를 선언
		StudentVO[] stdArray = new StudentVO[10];
		
		int index = 2;
		
		// 1과 2의 차이?
		// 1 
		stdArray[index] = new StudentVO();
		// 2
		for(int i = 0 ; i < stdArray.length ; i++) {
			stdArray[i] = new StudentVO();
		}
		
		stdArray[index].setStName("홍길동");
		stdArray[index].setStNum("0001");
		
		System.out.println("이름 : " + stdArray[index].getStName());
		System.out.println("학번 : " + stdArray[index].getStNum());
		// 오류 발생이유? 초기화안해서
		// 선언만하고 각요소들을 초기화를 안했다.
	}

}
