package com.ldq;

/*
 * 通过super（）成功访问成员变量
 * */
class Animal {
	public Animal(String name) {
		System.out.println("这是一只" + name);
	}
}

class Doog extends Animal {
	public Doog() {
		super("大傻狗");
	}
}

public class demo018 {

	public static void main(String[] args) {
		Doog doog = new Doog();

	}

}
