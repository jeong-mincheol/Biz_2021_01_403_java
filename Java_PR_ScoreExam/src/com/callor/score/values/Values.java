package com.callor.score.values;

public class Values {
	
	public static String dLine(int nCount) {
		return String.format("%0" + nCount + "d", 0).replace("0", "=");
	}
	public static String sLine(int nCount) {
		return String.format("%0" + nCount + "d", 0).replace("0", "-");
	}
	
	public final static Integer MENU_START = 1;
	public final static Integer MENU_LAST = 3;
	
	public final static Integer MENU_INPUT = 1;
	public final static Integer MENU_SAVE_FILE = 2;
	public final static Integer MENU_SCORELIST = 3;
}
