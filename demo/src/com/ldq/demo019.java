package com.ldq;

/*
 * 定义有参无参的构造方法
 * */
class Aanimal {
	public Aanimal(String name) {
		System.out.println("这是一个" + name);
	}

	public Aanimal() {
		System.out.println("这是一个动物");
	}
}

class Dlog extends Aanimal {
	public Dlog() {
		// super("大傻狗");

	}
}

public class demo019 {

	public static void main(String[] args) {
		Dlog dlog = new Dlog();

	}

}
