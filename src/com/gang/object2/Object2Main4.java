package com.gang.object2;

public class Object2Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Member member = new Member();
		member.name = "iu";
		member.age = 30;
		member.email = "iu@naver.com";
		
		Member member2 = new Member();
		member2.name = "suji";
		member2.age = 25;
		member2.email = "suji@google.com";
		
		Member member3 = new Member();
		member3.name = "choa";
		member3.age = 34;
		member3.email = "choa@daum.net";
		
		Member [] members = new Member[3];
		members[0] = member;
		members[1] = member2;
		members[2] = member3;
		
		Method4 m4 = new Method4();
		m4.info(members);
		
		System.out.println(members.length);
		

	}

}
