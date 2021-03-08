package com.callor.score.values;

public class Values {
	
	// final로 선언하면 바로 값을 입력해줘야한다
	public static final String dLine;
	public static final String sLine;
	
	// static final 변수 생성하기
	// 생성자 block
	static {
		// 50칸을 만들고 0으로 채워라(나열하라)
 		// ============================ : 코드화
		dLine = String.format("%050d", 0).replace("0", "=");
		sLine = String.format("%050d", 0).replace("0", "-");
		
	}

}
