package com.ldq;

/*������ʹ�ã�����Ϊ���������Ϊ���󣻳�����ɲ��������󷽷�*/
abstract class Anmimgs {
	abstract void shout();
}

class Dooog extends Anmimgs {
	void shout() {
		System.out.println("������������������");
	}
}

public class demo021 {

	public static void main(String[] args) {
		Dooog dooog = new Dooog();
		dooog.shout();

	}

}
