package com.ldq;

public class demo013 {
	static {
		System.out.println("main�еľ�̬����鱻ִ���ˡ�����");
	}

	public static void main(String[] args) {
		Peeson peeson1 = new Peeson();// �ڴ�������ʱ������̬�Ĵ������Ѿ���ִ����
		peeson1.speak();

	}

}

class Peeson {
	static {
		System.out.println("Peeson��ľ�̬����鱻ִ���ˡ�����");
	}

	void speak() {
		System.out.println("����Peeson���еĹ��췽��������");
	}
}
