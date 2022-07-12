package com.gang.object1.ex1;

import java.util.Scanner;

public class Ex1Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("프로그램 시작");
		
		Student student1 = new Student();
		Student st2 = new Student();
		Student st3 = new Student();
		student1.name = "홍수경";
		student1.number = 1;
		student1.kor = 90;
		student1.eng = 100;
		student1.math = 80;
		student1.total = student1.kor + student1.eng + student1.math;
		student1.avg = student1.total / 3;
		
		Student st = null;
		Scanner sc = new Scanner(System.in);
		Student [] students = new Student[3];
		
		for(int i = 0; i<3;i++) {
			st = new Student();
			System.out.println("이름 입력");
			st.name = sc.next();
			students[i]= st;
		}
		
		System.out.println(students[0].name);
		System.out.println(students[1].name);
		System.out.println(students[2].name);
		
		
		
		System.out.println(student1.name);
		System.out.println(student1.number);
		System.out.println(student1.kor);
		System.out.println(student1.eng);
		System.out.println(student1.math);
		System.out.println(student1.total);
		System.out.println(student1.avg);
		
		
		
		System.out.println("프로그램 종료");

	}

}
