package com.ldq;

/*
 * 为了实现多态，允许使用一个父类类型的变量来引用子类类型的对象，根据被引用的对象类型不同，得到不同的结果。
 * */
interface Demo0244 {
	void shout();
}

class Demo0244_1 implements Demo0244 {
	public void shout() {
		System.out.println("(>^ω^<)喵。。。。");
	}
}

class Demo0244_2 implements Demo0244 {
	public void shout() {
		System.out.println("汪汪汪。。。。");
	}
}

public class demo024 {

	public static void main(String[] args) {
		Demo0244 demo0244_1 = new Demo0244_1();
		Demo0244 demo0244_2 = new Demo0244_2();
		anminalshoutt(demo0244_1);
		anminalshoutt(demo0244_2);
	}

	public static void anminalshoutt(Demo0244 de) {
		de.shout();
	}

}
