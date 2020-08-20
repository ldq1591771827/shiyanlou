package com.ldq;

/*抽象类使用，方法为抽象类必须为抽象；抽象类可不包含抽象方法*/
abstract class Anmimgs {
	abstract void shout();
}

class Dooog extends Anmimgs {
	void shout() {
		System.out.println("汪汪汪。。。。。。");
	}
}

public class demo021 {

	public static void main(String[] args) {
		Dooog dooog = new Dooog();
		dooog.shout();

	}

}
