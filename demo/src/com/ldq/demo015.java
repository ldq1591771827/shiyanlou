package com.ldq;

/*
 * ���ü̳й�ϵʹ��extends�ؼ���
 * 
 * */
class Father {
	String name;

	void shout() {
		System.out.println("���﷢���˽���������");
	}
}

class Son extends Father {
	void speak() {
		System.out.println("name=" + this.name);
	}
}

public class demo015 {

	public static void main(String[] args) {
		Son son = new Son();
		son.name = "����";
		son.speak();
		son.shout();

	}

}
