package com.ldq;

/*
 * static�ؼ����ܹ��ù��췽�����Բ��ô�������ֱ��ʹ��
 * */
class Pouio {
	public static void speak() {
		System.out.println("����Ҳ������");
	}

	void speakk() {
		System.out.println("�����𣿣���");
	}
}

public class demo012 {

	public static void main(String[] args) {
		Pouio.speak(); // ���ش�������ֱ��ʹ�ù��췽��
		Pouio pouio = new Pouio();
		pouio.speak();
		// Pouio.speakk();����
		pouio.speakk();// �����˶������Ե��÷Ǿ�̬�๹�췽��

	}

}
