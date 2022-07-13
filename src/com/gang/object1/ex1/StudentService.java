package com.gang.object1.ex1;

import java.util.Scanner;

public class StudentService {
	
	StudentView view = new StudentView();
	//findStudent 메서드 만들기
	//makeStudents 메서드 만들기
	
	public void findStudent(Student[] students) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("검색할 학생 번호");
		int check = sc.nextInt();
		boolean sign = false;
		int j=0;
		for(int i=0; i<students.length;i++) {
			if(students[i].number == check) {
				j=i;
				sign = true;
			}
		}
		if(sign == true) {
			view.ViewOne(students[j]);

		}else {
			//존재하지 않는 학생 번호 ViewNo
			view.ViewNo();
		}
	}
	
	public Student[] makestudent() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("학생 수를 입력해주십시오");
		int number = sc.nextInt();
		
		Student[] students = new Student[number];
		
		for(int i=0;i<students.length;i++) {
			Student student = new Student();
			System.out.println("이름 입력");
			student.name = sc.next();
			System.out.println("번호 입력");
			student.number = sc.nextInt();
			System.out.println("국어 점수 입력");
			student.kor = sc.nextInt();
			System.out.println("영어 점수 입력");
			student.eng = sc.nextInt();
			System.out.println("수학 점수 입력");
			student.math = sc.nextInt();
			
			student.total = student.kor + student.eng + student.math;
			student.avg = student.total / 3;
			students[i] = student;
			
		}
		return students;
	}

}
