package com.ldq;

/*
 * 多态时传入对象类型不匹配，需要用instanceof检测判断类型
 * */
interface Anminalss {
	void shout();
}

class Cast implements Anminalss {
	public void shout() {
		System.out.println("喵喵喵......");
	}

	void sleep() {
		System.out.println("睡觉咯");
	}
}

class Dogt implements Anminalss {
	public void shout() {
		System.out.println("汪汪汪......");
	}
}

public class demo026 {

	public static void main(String[] args) {
		Dogt dogt = new Dogt();
		System.out.println(dogt.getClass().getName());
		anmidbdbhs(dogt);

	}

	public static void anmidbdbhs(Anminalss a) {
		if (a instanceof Cast) {
			Cast cast = (Cast) a;
			cast.sleep();
			cast.shout();
		} else {
			System.out.println("这不是猫类！");
		}

	}

}
