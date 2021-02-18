package com.callor.applications;

import com.callor.applications.service.ClassServiceV1;

public class Class_01 {
	
	public static void main(String[] args) {
		
		ClassServiceV1 csV1 = new ClassServiceV1();
		
		csV1.add(30, 21);
		
		csV1.add(30, 21.2F);
		
		csV1.add(30.1D, 21.2F);
		
	}

}
