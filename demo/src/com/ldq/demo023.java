package com.ldq;

/*
 * 1.�ӿ��еķ������ǳ���ģ�����ʵ��������.
 * 2.�ӿ��е�����ֻ���ǳ���
 * 3.��һ����ʵ�ֽӿ�ʱ�����������ǳ����࣬��ʵ�ֽӿ��еĲ��ַ������ɣ�������Ҫʵ�ֽӿ��е����з�����
 * 4.һ����ͨ��implements�ؼ���ʵ�ֽӿ�ʱ������ʵ�ֶ���ӿڣ���ʵ�ֵĶ���ӿ�֮��Ҫ�ö��Ÿ���
 * 
 * 
 * 
 * */
interface Amnmnmni {
	String amnmnmni_nameString = "�������Ϊ";

	void breathen();

	void run();

}

interface LandAmnmnmni extends Amnmnmni {
	void liveonland();
}

class Sopn implements LandAmnmnmni {
	public void breathen() {
		System.out.println(amnmnmni_nameString + ":" + "��ɵ���ں����У�����");
	}

	public void run() {
		System.out.println(amnmnmni_nameString + ":" + "��ɵ���ڱ����У�����");
	}

	public void liveonland() {
		System.out.println("��ɵ������һ���ɵ������");
	}
}

public class demo023 {

	public static void main(String[] args) {
		Sopn sopn = new Sopn();
		System.out.println(sopn.amnmnmni_nameString);
		System.out.println(Amnmnmni.amnmnmni_nameString);
		sopn.breathen();
		sopn.run();
		sopn.liveonland();

	}

}
