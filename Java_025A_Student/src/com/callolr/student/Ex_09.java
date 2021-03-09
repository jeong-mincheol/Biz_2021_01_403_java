package com.callolr.student;

import java.util.List;

import com.callolr.student.model.StudentVO;

public class Ex_09 {
	
	public static void main(String[] args) {
		
		List<StudentVO> stdList = null;
		for(int i = 0 ; i < 10 ; i++) {
			StudentVO stdVO = null;
			
			stdVO.setStName("홍길동");
			stdVO.setStNum("0001");
			// 실행하면 nullpointerexception이 나오는데 안나오려면 어떤 코드를 추가해야 할까?
			stdList.add(stdVO);
			// 이 코드가 오류가 안나려면 어케할까?
			
			// 문법오류 먼저 해결하고 exception이 나는것도 해결해라
		}
		
	}

}
