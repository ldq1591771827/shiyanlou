package com.ldq;

public class demo013 {
	static {
		System.out.println("main中的静态代码块被执行了》》》");
	}

	public static void main(String[] args) {
		Peeson peeson1 = new Peeson();// 在创建对象时两个静态的代码块就已经被执行了
		peeson1.speak();

	}

}

class Peeson {
	static {
		System.out.println("Peeson类的静态代码块被执行了》》》");
	}

	void speak() {
		System.out.println("我是Peeson类中的构造方法》》》");
	}
}
