package com.callor.oop;

import java.util.ArrayList;
import java.util.List;

public class List_01 {

	public static void main(String[] args) {
		
		/*
		 * List 
		 * 배열과 성질이 유사한 java의 클래스
		 * 개수가 정해지지 않은 (최초는 0개) 배열을 생성하는 것과 같다
		 */
		
		// 북스라는 ArrayList 클래스 사용해서 개수가 하나도 없는 배열을 만든다
		// 개수 없는 (= 개수가 정해지지 않은)
		ArrayList<String> books = new ArrayList<String>();
		
		// List라는 클래스를 사용해서 strNames 라는 객체를 만들고
		// ArrayList를 사용하여 생성 (개수가 1개도 없는 배열을 만든다) 
		// 자바에서는 배열이라기보다 리스트라고 부른다
		List<String> strNames = new ArrayList<String>();
		
		// books 리스트에 저장된 데이터들 중에서
		// 0번 위치에 저장된 데이터를 Console에 출력하라 
		
		try {
			System.out.println("여기는 add하기 전");
			System.out.println(books.get(0));
		} catch (Exception e) {
		}
		
		// books List에 도서명 "추가하기"
		// List에 add() method를 사용하여 값을 "추가"하면
		// 자동으로 개수가 추가되면서 데이터가 저장된다
		books.add("자바프로그래밍");
		books.add("자바의 정석");
		books.add("그리스로마신화"); // books는 내용물을 3개 갖는 배열이 된다
		
		// books 리스트에 저장된 데이터들 중에서
		// 0번 위치에 저장된 데이터를 Console에 출력하라 
		
		try {
			System.out.println("add 한 후");
			System.out.println(books.get(0));
			System.out.println(books.get(1));
			System.out.println(books.get(2));
		} catch (Exception e) {
		}


	}

}
