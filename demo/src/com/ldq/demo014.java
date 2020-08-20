package com.ldq;

/*
 * 定义成员内部类的构造方法进行调用
 * */
public class demo014 {

	public static void main(String[] args) {
		Poopp poopp = new Poopp();
		poopp.test();

	}

}

class Poopp {
	private int Number = 4;

	public void test() {
		Inter inter = new Inter(); // 类中的类，通过创建对象去调用
		inter.speak();
	}

	class Inter {
		void speak() {
			System.out.println("Num=" + Number);
		}
	}
}
