package com.ldq;

/*
 * �����Ա�ڲ���Ĺ��췽�����е���
 * */
public class demo014 {

	public static void main(String[] args) {
		Poopp poopp = new Poopp();
		poopp.test();

	}

}

class Poopp {
	private int Number = 4;

	public void test() {
		Inter inter = new Inter(); // ���е��࣬ͨ����������ȥ����
		inter.speak();
	}

	class Inter {
		void speak() {
			System.out.println("Num=" + Number);
		}
	}
}
