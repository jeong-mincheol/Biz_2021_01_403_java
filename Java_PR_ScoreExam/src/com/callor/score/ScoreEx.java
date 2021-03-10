package com.callor.score;

import com.callor.score.service.MenuService;
import com.callor.score.service.ScoreService;
import com.callor.score.service.impl.MenuServiceImplV1;
import com.callor.score.service.impl.ScoreServiceImplV1;
import com.callor.score.values.Values;

public class ScoreEx {
	
	public static void main(String[] args) {
		
		MenuService mService = new MenuServiceImplV1();
		ScoreService sService = new ScoreServiceImplV1();
		
		while(true) {
			Integer menu = mService.selectMenu();
			if(menu == null) {
				break;
			} else if(menu == Values.MENU_INPUT) {
				sService.inputScore();
			} else if(menu == Values.MENU_SAVE_FILE) {
				sService.saveScoreToFile();
			} else if(menu == Values.MENU_SCORELIST) {
				sService.printScore();
			}
		}
	}
}