package com.ldq;

/*
 * ʹ��this()�����������캯��
 * */
class Personm {
	public Personm() {
		System.out.println("�޲εķ����������ˣ�����");
	}

	public Personm(String name) {
		// System.out.println(name);
		System.out.println("�вεķ����������ˣ�����");
	}
}

public class demo010 {

	public static void main(String[] args) {
		Personm personm = new Personm("�㿴����");
		Personm ppPerson = new Personm();

	}

}
