package com.ldq;

/*
 * ͨ��super�����ɹ����ʳ�Ա����
 * */
class Animal {
	public Animal(String name) {
		System.out.println("����һֻ" + name);
	}
}

class Doog extends Animal {
	public Doog() {
		super("��ɵ��");
	}
}

public class demo018 {

	public static void main(String[] args) {
		Doog doog = new Doog();

	}

}
