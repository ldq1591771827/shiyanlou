package com.ldq;

/*
 * ��̬ʱ����������Ͳ�ƥ�䣬��Ҫ��instanceof����ж�����
 * */
interface Anminalss {
	void shout();
}

class Cast implements Anminalss {
	public void shout() {
		System.out.println("������......");
	}

	void sleep() {
		System.out.println("˯����");
	}
}

class Dogt implements Anminalss {
	public void shout() {
		System.out.println("������......");
	}
}

public class demo026 {

	public static void main(String[] args) {
		Dogt dogt = new Dogt();
		System.out.println(dogt.getClass().getName());
		anmidbdbhs(dogt);

	}

	public static void anmidbdbhs(Anminalss a) {
		if (a instanceof Cast) {
			Cast cast = (Cast) a;
			cast.sleep();
			cast.shout();
		} else {
			System.out.println("�ⲻ��è�࣡");
		}

	}

}
