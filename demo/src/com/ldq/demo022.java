package com.ldq;

/*
 * ������ʵ�ָ���Ľӿں��ǿ��Ա�ʵ�����ģ����Ե���ʵ�����ķ���.�����б������������ʵ�֣�����
 * */
interface Annmiall {
	String annminall_nameString = "�������Ϊ";

	void breathen();

	void run();
}

class Seon implements Annmiall {
	public void breathen() {
		System.out.println(annminall_nameString + ":" + "��ɵ���ں����š�����");
	}

	public void run() {
		System.out.println(annminall_nameString + ":" + "��ɵ���ڱ����š�����");
	}
}

public class demo022 {

	public static void main(String[] args) {
		Seon seon = new Seon();
		seon.breathen();
		seon.run();

	}

}
