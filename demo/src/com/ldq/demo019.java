package com.ldq;

/*
 * �����в��޲εĹ��췽��
 * */
class Aanimal {
	public Aanimal(String name) {
		System.out.println("����һ��" + name);
	}

	public Aanimal() {
		System.out.println("����һ������");
	}
}

class Dlog extends Aanimal {
	public Dlog() {
		// super("��ɵ��");

	}
}

public class demo019 {

	public static void main(String[] args) {
		Dlog dlog = new Dlog();

	}

}
