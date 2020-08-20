package com.ldq;

/*
 * 使用this()调用其他构造函数
 * */
class Personm {
	public Personm() {
		System.out.println("无参的方法被调用了！！！");
	}

	public Personm(String name) {
		// System.out.println(name);
		System.out.println("有参的方法被调用了！！！");
	}
}

public class demo010 {

	public static void main(String[] args) {
		Personm personm = new Personm("你看不到");
		Personm ppPerson = new Personm();

	}

}
