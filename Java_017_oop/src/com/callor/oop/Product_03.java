package com.callor.oop;

import java.util.Scanner;

import com.callor.oop.model.ProductVO;

public class Product_03 {
	
	public static void main(String[] args) {
		
		// VO 클래스를 배열로 선언하고 사용(데이터 저장, 읽기)하려면 
		// 선언된 배열 요소요소를 모두 다시 초기화(생성)하는 과정이 필요하다
		// 이 과정이 생략되면
		// NullPointerException이 발생한다
		ProductVO[] pVO = new ProductVO[5];
		
		for(int i = 0 ; i < pVO.length ; i++) {
			pVO[i] = new ProductVO();
		}
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("=================================");
		System.out.println("나라쇼핑몰 상품관리 V1");
		System.out.println("---------------------------------");
		System.out.println("상품정보를 입력하시오");
		
		String strN = 3 + ""; // "3"이라는 문자열로 저장  / ""안에 빈칸이 있으면 오류
		int intN = Integer.valueOf(strN);
		
		for(int i = 0 ; i < pVO.length ; i++) {
			// 연속된 값으로 상품코드 생성
			String pCode = (i +1) + "";
			pVO[i].strPCode = pCode;
			
			System.out.println(pCode + " 번 상품정보 입력");
			System.out.print("상품코드 >> ");
			pVO[i].strPCode = scan.nextLine();
			System.out.print("상품이름 >> ");
			pVO[i].strPname = scan.nextLine();
			System.out.print("거래처 >> ");
			pVO[i].strDName = scan.nextLine();
			System.out.print("품목 >> ");
			pVO[i].strItem = scan.nextLine();
			
			while(true) {
			System.out.print("매입단가 >> ");
			String strIPrice = scan.nextLine();
			int intIPrice = Integer.valueOf(strIPrice);
			if(intIPrice < 0) {
			System.out.println("매입단가는 0이상 입력하세요");
			} else {
			  pVO[i].iPrice = intIPrice;
			  break;
			  }
			}
			
			/*
			System.out.print("매입단가 >> ");
			String iPrice = scan.nextLine();
			pVO[i].iPrice = Integer.valueOf(iPrice);
			if(Integer.valueOf(iPrice) < 0 ) {
				System.out.println("0미만값은 입력불가");
				break;
			}
			*/
			
			System.out.print("매출단가 >> ");
			String strOPrice = scan.nextLine();
			int intOPrice = Integer.valueOf(strOPrice);
			if(intOPrice < 0) {
			System.out.println("매입단가는 0이상 입력하세요");
			} else {
			    // 정상처리되었으면
			    // 단가가 0이상 입력되었으면
			    // VO에 값을 저장하고
			    // 다음단계로 진행
			    // 현 시점의 while()은 중단하라
			  pVO[i].oPrice = intOPrice;
			  break;
			  }
			
	
			
			/*
			System.out.print("매출단가 >> ");
			String oPrice = scan.nextLine();
			pVO[i].oPrice = Integer.valueOf(oPrice);
			if(Integer.valueOf(oPrice) < 0 ) {
				System.out.println("0미만값은 입력불가");
				break;
			}
			*/
			pVO[i].toString();
		
		System.out.println("===============================");
		}
	}

}
