package com.ldq;

/*
 * ����super�ؼ��ַ��ʸ���ĳ�Ա�����͹��췽��
 * */
class Ffather {
	String name = "����";

	void shout() {
		System.out.println("���﷢�������ˣ�");
	}
}

class Efather extends Ffather {
	String name = "����¹";

	void shout() {
		super.shout();
		// super�����˸����shout�������췽��
	}

	void printName() {
		System.out.println("Name=" + name);
		System.out.println("name=" + this.name);
		System.out.println("nname=" + super.name);
	}

}

public class demo017 {

	public static void main(String[] args) {
		Efather efather = new Efather();
		efather.shout();
		efather.printName();

	}

}
