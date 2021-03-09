package com.callor.student.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.student.model.StudentVO;
import com.callor.student.values.Values;

public class StudentServiceImplV1 implements StudentService {

	private List<StudentVO> stlist;

	public StudentServiceImplV1() {
		stlist = new ArrayList<StudentVO>();
	}

	@Override
	public void loadFile() {
		// TODO 파일 불러오기
		String fileName = "src/com/callor/student/학생정보리스트.txt";

		FileReader fileReader = null;
		BufferedReader buffer = null;

		try {
			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader);
			while (true) {
				String reader = buffer.readLine();
				if (reader == null) {
					break;
				}
				String[] stDatas = reader.split(":");
				StudentVO studentVO = new StudentVO(Integer.valueOf(stDatas[0]), stDatas[1], stDatas[2],
						Integer.valueOf(stDatas[3]), Integer.valueOf(stDatas[4]), stDatas[5], stDatas[6]);
				stlist.add(studentVO);
			}
			buffer.close();
			fileReader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void findStudent() {
		// TODO 학생이름 입력받고 정보 불러오기

		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println(Values.dLine(50));
			System.out.println("찾는 학생이름을 입력하세요(종료하려면 QUIT를 입력)");
			System.out.println(Values.sLine(50));
			System.out.print("이름 >> ");
			String inputName = scan.nextLine();
			System.out.println(Values.dLine(50));

			for (StudentVO vo : stlist) {
				if (inputName.equals("QUIT")) {
					System.out.println("프로그램 종료");
					break;
				} else if (inputName.equals(vo.getStName())) {
					System.out.println("이름 : " + vo.getStName());
					System.out.println("학과 : " + vo.getMajor() + "과");
					System.out.println("학년 : " + vo.getGrade() + "학년");
					System.out.println("반 : " + vo.getClassNum() + "반");
					System.out.println("주소 : " + vo.getAddress());
					System.out.println("전화번호 : " + vo.getpNumber());
				} 
			}
			System.out.println(inputName + "자료는 없습니다");
			System.out.println(Values.dLine(50));
		}
	}
}