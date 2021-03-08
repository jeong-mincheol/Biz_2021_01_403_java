package com.callor.score;

import com.callor.score.service.MenuService;
import com.callor.score.service.ScoreService;
import com.callor.score.service.impl.MenuServiceImplV1;
import com.callor.score.service.impl.ScoreServiceImplV1;
import com.callor.score.values.Values;

public class ScoreEx_01 {
	
	public static void main(String[] args) {
		
		MenuService mService = new MenuServiceImplV1();
		ScoreService sService = new ScoreServiceImplV1();
		
		while(true) {
			Integer menu = mService.selectMenu();
			if(menu == null) {
				break;
			} else if(menu == Values.MENU_MAKE_RND) {
				sService.makeScore();
			} else if(menu == Values.MENU_SAVE_SCORE) {
				sService.saveScoreToFile();
			} else if(menu == Values.MENU_LOAD_SCORE) {
				sService.loadScoreFromFile();
			}
		}
		System.out.println("프로젝트 종료");
	}
}
