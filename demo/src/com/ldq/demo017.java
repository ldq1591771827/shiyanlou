package com.ldq;

/*
 * 运用super关键字访问父类的成员变量和构造方法
 * */
class Ffather {
	String name = "动物";

	void shout() {
		System.out.println("动物发出叫声了！");
	}
}

class Efather extends Ffather {
	String name = "长颈鹿";

	void shout() {
		super.shout();
		// super调用了父类的shout（）构造方法
	}

	void printName() {
		System.out.println("Name=" + name);
		System.out.println("name=" + this.name);
		System.out.println("nname=" + super.name);
	}

}

public class demo017 {

	public static void main(String[] args) {
		Efather efather = new Efather();
		efather.shout();
		efather.printName();

	}

}
