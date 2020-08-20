package com.ldq;

/*
 * 使用匿名内部类
 * */
interface Anminsal {
	void shout();
}

public class demo027 {

	public static void main(String[] args) {
		// 定义一个内部类Cta实现Anminsal接口
		class Cta implements Anminsal {
			public void shout() {
				System.out.println("喵喵喵......");
			}
		}
		dsidhjsbdjpp(new Cta());

	}

	public static void dsidhjsbdjpp(Anminsal a) {
		a.shout();
	}

}
