package com.ldq;

/*
 * Ϊ��ʵ�ֶ�̬������ʹ��һ���������͵ı����������������͵Ķ��󣬸��ݱ����õĶ������Ͳ�ͬ���õ���ͬ�Ľ����
 * */
interface Demo0244 {
	void shout();
}

class Demo0244_1 implements Demo0244 {
	public void shout() {
		System.out.println("(>^��^<)����������");
	}
}

class Demo0244_2 implements Demo0244 {
	public void shout() {
		System.out.println("��������������");
	}
}

public class demo024 {

	public static void main(String[] args) {
		Demo0244 demo0244_1 = new Demo0244_1();
		Demo0244 demo0244_2 = new Demo0244_2();
		anminalshoutt(demo0244_1);
		anminalshoutt(demo0244_2);
	}

	public static void anminalshoutt(Demo0244 de) {
		de.shout();
	}

}
