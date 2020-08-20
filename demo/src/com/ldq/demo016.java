package com.ldq;

/*
 * 
 * 重写父类方法
 * */
class Fatherr {
	void shout() {
		System.out.println("父类的构造方法被调用了----");
	}
}

class Sson extends Fatherr {
	void shout() {
		System.out.println("子类的构造方法被调用了----");
	}
}

public class demo016 {

	public static void main(String[] args) {
		Sson sson = new Sson();
		sson.shout();

	}

}
