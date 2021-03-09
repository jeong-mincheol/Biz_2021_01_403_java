package com.callor.student;

import com.callor.student.service.StudentService;
import com.callor.student.service.StudentServiceImplV1;

public class StudentEx_01 {
	
	public static void main(String[] args) {
		
		StudentService sService = new StudentServiceImplV1();
		
		sService.loadFile();
		sService.findStudent();
		
	}

}
