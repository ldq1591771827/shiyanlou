package com.ldq;

interface Demo0255 {
	void shout();
}

class Demo025_1 implements Demo0255 {

	public void shout() {
		System.out.println("�г�������");
	}

	public void sleep() {
		System.out.println("Ҫ˯����");
	}

}

public class demo025 {

	public static void main(String[] args) {
		Demo025_1 demo0255 = new Demo025_1();
		anminuhdus(demo0255);

	}

	public static void anminuhdus(Demo0255 mm) {
		mm.shout();
		Demo025_1 dd = (Demo025_1) mm;
		// dd.shout();
		dd.sleep();
		// mm.sleep(); ����û��дsleep�������󷽷����޷�����
	}

}
