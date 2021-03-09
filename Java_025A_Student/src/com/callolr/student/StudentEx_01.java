package com.callolr.student;

import com.callolr.student.service.StudentService;
import com.callolr.student.service.impl.StudentServiceImplV1;

public class StudentEx_01 {
	
	public static void main(String[] args) {
		
		StudentService stService = new StudentServiceImplV1();
		
		stService.loadStudentFromFile();
		stService.searchStudent();
		
	}

}
