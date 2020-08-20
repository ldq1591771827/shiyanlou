package com.ldq;

/*
 * 运用继承关系使用extends关键字
 * 
 * */
class Father {
	String name;

	void shout() {
		System.out.println("动物发出了叫声！！！");
	}
}

class Son extends Father {
	void speak() {
		System.out.println("name=" + this.name);
	}
}

public class demo015 {

	public static void main(String[] args) {
		Son son = new Son();
		son.name = "大番薯";
		son.speak();
		son.shout();

	}

}
