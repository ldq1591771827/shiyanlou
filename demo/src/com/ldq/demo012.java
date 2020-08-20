package com.ldq;

/*
 * static关键字能够让构造方法可以不用创建对象直接使用
 * */
class Pouio {
	public static void speak() {
		System.out.println("我来也！！！");
	}

	void speakk() {
		System.out.println("你在吗？？？");
	}
}

public class demo012 {

	public static void main(String[] args) {
		Pouio.speak(); // 不必创建对象直接使用构造方法
		Pouio pouio = new Pouio();
		pouio.speak();
		// Pouio.speakk();报错
		pouio.speakk();// 创建了对象后可以调用非静态类构造方法

	}

}
