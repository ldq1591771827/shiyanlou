package com.ldq;

/*
 * ʹ�������ڲ���
 * */
interface Anminsal {
	void shout();
}

public class demo027 {

	public static void main(String[] args) {
		// ����һ���ڲ���Ctaʵ��Anminsal�ӿ�
		class Cta implements Anminsal {
			public void shout() {
				System.out.println("������......");
			}
		}
		dsidhjsbdjpp(new Cta());

	}

	public static void dsidhjsbdjpp(Anminsal a) {
		a.shout();
	}

}
