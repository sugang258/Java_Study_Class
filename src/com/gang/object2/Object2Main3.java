package com.gang.object2;

public class Object2Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method3 mt3 = new Method3();
		
		//월급 입력
		int salary = 5000000;
		mt3.sal(salary);

		mt3.hap(10, 20);
		
		mt3.info("sugang", 23, "sugang@naver.com");
		
		Member member = new Member();
		member.name = "sugang";
		member.age = 23;
		member.email = "sugang@naver.com";
		
		mt3.info2(member);
		
	}
	
}
