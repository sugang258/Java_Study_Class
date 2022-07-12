package com.gang.object1;

public class ObjectMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("프로그램 시작");
		//Object 생성
		//클래스명 변수명 = new 생성자();
		//데이터타입 변수명
		Monster monster = new Monster(); 
		//멤버 접근
		//변수명.멤버변수명
		System.out.println(monster.name);
		System.out.println(monster.level);
		System.out.println(monster.hp);
		
		monster.name = "오크";
		monster.level = 5;
		monster.hp = 100;
		
		System.out.println(monster.name);
		System.out.println(monster.level);
		System.out.println(monster.hp);
		
		//-------------------------------------
		Monster monster2 = new Monster();
		monster2.name = "골렘";
		monster2.level = 7;
		monster2.hp = 100;
		
		Weapon sword = new Weapon();
		sword.name = "단검";
		sword.damage = 10;
		sword.inchant = 1;
		
		monster.weapon = sword;
		
		System.out.println(monster.weapon.name);
		
		System.out.println(monster.name);
		
		System.out.println(monster2.weapon.name);

		
		
		
		System.out.println("프로그램 종료");

	}

}

