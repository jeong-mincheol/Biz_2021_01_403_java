package com.callor.applications.service;

 //java.util이라는 패키지의 Scanner라는 클래스를 가져와 사용한다
 // 3과목의 점수를 입력할 수 있게 하는 클래스
import java.util.Scanner;

/*
 * 클래스extends(확장, 상속)
 * 
 * ScoreServiceV4 : Parent(부모) 클래스
 * ScoreServiceExtendsV1 : child(자식) 클래스
 * 
 * 단순한 extends
 * 		부모 클래스에 정의된 모든 method를 
 * 		코드한줄 추가, 수정 없이 그대로 사용할 수 있다.
 * 
 * 추가 extends
 * 		부모 클래스에 정의된 method와
 * 		새롭게 추가된 method가 있는 
 * 		확장된 클래스의 생성
 */
public class ScoreServiceExtendsV1 extends ScoreServiceV4 {
	
	/*
	 * 문자열형변수 1개를 매개변수로 갖는 input() method
	 */
	// 점수를 입력하여 0점에서 100점사이의 정수값이 되면 Console에 나타나도록 한다.  
	public int input(String subject) {
		// java.util이라는 패키지의 Scanner라는 클래스를 가져와 새로 선언한다
		// Console에 값을 입력할 수 있게 Scanner 명령문을 가져온다.
		Scanner scan = new Scanner(System.in);
		
		// 정수형변수 intScore를 선언한다. (초기화한다)
		int intScore = 0;
		// while() 구문을 쓰면 ()안이 참이라면 {}안의 값은 무한반복이 된다.
		while(true) {
			// Console이라는 결과 창에 입력 (줄은 바뀌지 않는다) 
			System.out.print( subject + "점수 입력 >> ");
			// Console창에 키보드로 입력한 정수값이 변수 intScore에 저장된다.
			intScore = scan.nextInt();
			
			// if() {}문은 ()안의 내용이 true라면 {} 안에 있는 명령을 실행,계산한다.
			if(intScore < 0) {
				System.out.println(subject + "점수는 0점 이상입력 !!");
			// else if() {}문은 if()문이 false일 때, else if()안이 true이면 else if() {} 안의 값을 실행,계산한다.	
			} else if(intScore > 100) {
				System.out.println(subject + "점수는 100점 이하 입력 !! ");
			// else {} 문은 if()문과 else if()문을 제외한 즉, false 일 때, else{} 안의 내용을 실행 혹은 계산한다.	
			} else {
				// 반복하지 않고 if() 문을 끝낸다.
				break;
			}
		}
		// Console에 "입력한 점수 : 점수(변수 intScore에 저장된 값)" 를 표시한다.
		// System.out.println("입력한 점수 : " + intScore);
		return intScore;
		
		// 호출한 코드에서 
		// return 30; ==> int intKor에 30을 담아라
		// return 100; ==> int intKor에 100을 담아라
	}

}
