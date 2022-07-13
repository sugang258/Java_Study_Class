package com.gang.object1.ex1;

import java.util.Scanner;

public class StudentController {
	//start 메서드 선언
	//System.out.println("1.학생정보입력 2.학생정보조회 3.학생정보검색 4.학생정보삭제 5.학생정보추가 6.프로그램 종료");
	
	public void start() {
		
		
		Scanner sc = new Scanner(System.in);
		
		StudentView view = new StudentView();
		StudentService service = new StudentService();
		Student [] students = null;
		
		boolean check = true;
		
		while(check) {
		System.out.println("1. 학생 정보 입력");
		System.out.println("2. 학생 정보 조회");
		System.out.println("3. 학생 정보 검색");
		System.out.println("4. 학생 정보 삭제");
		System.out.println("5. 학생 정보 추가");
		System.out.println("6. 프로그램 종료");

		int choice = sc.nextInt();
	
		if(choice == 1) {
			System.out.println("학생 정보 입력을 선택하셨습니다.");
			students = service.makestudent();
		}else if(choice == 2) {
			System.out.println("학생 정보 조회를 선택하셨습니다.");
			view.ViewAll(students);
		}else if(choice == 3) {
			System.out.println("학생 정보 검색을 선택하셨습니다.");
			service.findStudent(students);
		}else if(choice == 4) {
			System.out.println("학생 정보 삭제를 선택하셨습니다.");
		}else if (choice == 5) {
			System.out.println("학생 정보 추가를 선택하셨습니다");
		}else {
			System.out.println("프로그램 종료");
			check =! check;
		}

		
	}
	}

}
