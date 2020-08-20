package com.ldq;

/*
 * 1.接口中的方法都是抽象的，不能实例化对象.
 * 2.接口中的属性只能是常量
 * 3.当一个类实现接口时，如果这个类是抽象类，则实现接口中的部分方法即可，否则需要实现接口中的所有方法。
 * 4.一个类通过implements关键字实现接口时，可以实现多个接口，被实现的多个接口之间要用逗号隔开
 * 
 * 
 * 
 * */
interface Amnmnmni {
	String amnmnmni_nameString = "动物的行为";

	void breathen();

	void run();

}

interface LandAmnmnmni extends Amnmnmni {
	void liveonland();
}

class Sopn implements LandAmnmnmni {
	public void breathen() {
		System.out.println(amnmnmni_nameString + ":" + "大傻狗在呼吸中！！！");
	}

	public void run() {
		System.out.println(amnmnmni_nameString + ":" + "大傻狗在奔跑中！！！");
	}

	public void liveonland() {
		System.out.println("大傻狗不是一般的傻！！！");
	}
}

public class demo023 {

	public static void main(String[] args) {
		Sopn sopn = new Sopn();
		System.out.println(sopn.amnmnmni_nameString);
		System.out.println(Amnmnmni.amnmnmni_nameString);
		sopn.breathen();
		sopn.run();
		sopn.liveonland();

	}

}
