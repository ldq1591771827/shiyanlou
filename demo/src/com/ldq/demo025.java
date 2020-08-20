package com.ldq;

interface Demo0255 {
	void shout();
}

class Demo025_1 implements Demo0255 {

	public void shout() {
		System.out.println("叫出声音来");
	}

	public void sleep() {
		System.out.println("要睡觉了");
	}

}

public class demo025 {

	public static void main(String[] args) {
		Demo025_1 demo0255 = new Demo025_1();
		anminuhdus(demo0255);

	}

	public static void anminuhdus(Demo0255 mm) {
		mm.shout();
		Demo025_1 dd = (Demo025_1) mm;
		// dd.shout();
		dd.sleep();
		// mm.sleep(); 父类没有写sleep（）抽象方法，无法调用
	}

}
