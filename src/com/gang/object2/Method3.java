package com.gang.object2;

import java.util.Scanner;

public class Method3 {
	public void sal(int salary) {
		System.out.println("월급 계산");
		System.out.println(salary*0.967);
	}
	public void hap(int num1, int num2) {
		System.out.println(num1 + num2);
	}
	public void info(String name, int age, String email) {
		//Scanner sc = new Scanner(System.in);
		//System.out.println("이름을 입력하세요");
		//name = sc.next();
		//System.out.println("나이를 입력하세요");
		//age = sc.nextInt();
		//System.out.println("이메일을 입력하세요");
		//email = sc.next();
		System.out.println("이름 : " + name + " 나이 : " + age + " 이메일 : " + email);
		
	}
	public void info2(Member member) {
		System.out.println(member.name);
		System.out.println(member.age);
		System.out.println(member.email);
	}


}
