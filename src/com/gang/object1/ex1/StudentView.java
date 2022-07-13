package com.gang.object1.ex1;

import java.util.Scanner;

public class StudentView {
	//viewmessage
	//문자열을 받아서 그 문자열을 출력
	
	//ViewOne
	//학생정보 하나 받아서 출력
	
	Scanner sc = new Scanner(System.in);
	Student student = new Student();
	
	public void viewMessage() {
		System.out.println("학생의 번호가 존재하지 않습니다.");
	}
	public void ViewOne(Student student) {
		System.out.println("이름 : " + student.name);
		System.out.println("번호 : " + student.number);
		System.out.println("국어점수 : " + student.kor);
		System.out.println("영어점수 : " + student.eng);
		System.out.println("수학점수 : " + student.math);
		System.out.println("총점 : " + student.total);
		System.out.println("평균 : " + student.avg);
		
	}
	
	//ViewAll
	//학생들의 정보를 받아서 모든 정보를 출력
	public void ViewAll(Student[] students) {
		System.out.println("이름\t번호\t국어점수\t영어점수\t수학점수\t총점\t평균");
		
		for(int i=0;i<students.length;i++) {
			System.out.println(students[i].name + "\t"
					+ students[i].number + "\t"
					+ students[i].kor + "\t"
					+ students[i].eng + "\t"
					+ students[i].math + "\t"
					+ students[i].total + "\t"
					+ students[i].avg);
		}
		
	}
	
	

}
