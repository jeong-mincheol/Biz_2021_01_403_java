package com.callor.applications;

import com.callor.applications.myclass.MyGuGuDan;

public class App_04 {
	
	public static void main(String[] args) {
		
		// 내가 프로젝트에 선언(정의, 만든다)
		// MyGuGuDan 클래스에 있는 어떤 기능들ㅇ들 
		// 사용하기 위하여 
		// 클래스를 객체로 선언하고
		// 초기화하여 사용할 준비를 하는 절차
		// 이후에는 myGu객체를 사용하여
		// 메서드들을 실행하는 코드를 사용할 수 있다.
		MyGuGuDan myGu = new MyGuGuDan();
		
		// MyGuGuDan 클래스에 선언(정의, 만들기) 된 
		// gugu() 메서드를 실행하라
		// myGu 객체(object, instance)의
		// gugu() method를 호출한다(실행한다)
		myGu.gugu();
		
	}

}
