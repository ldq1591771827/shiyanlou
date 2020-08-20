package com.ldq;

/*
 * 子类在实现父类的接口后是可以被实例化的，可以调用实例化的方法.子类中必须给出方法的实现！！！
 * */
interface Annmiall {
	String annminall_nameString = "动物的行为";

	void breathen();

	void run();
}

class Seon implements Annmiall {
	public void breathen() {
		System.out.println(annminall_nameString + ":" + "大傻狗在呼吸着》》》");
	}

	public void run() {
		System.out.println(annminall_nameString + ":" + "大傻狗在奔跑着》》》");
	}
}

public class demo022 {

	public static void main(String[] args) {
		Seon seon = new Seon();
		seon.breathen();
		seon.run();

	}

}
