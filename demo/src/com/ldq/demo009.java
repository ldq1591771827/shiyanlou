package com.ldq;

/*
 * ���췽��������
 * */
class Personn {
	String name;
	int age;

	public Personn(String nname, int aage) {
		name = nname;
		age = aage;

	}

	public Personn(String nname) {
		name = nname;
	}

	public void speak() {
		System.out.println("��Һã��ҽ�" + name + ",����" + age + "���ˣ�");
	}

}

public class demo009 {

	public static void main(String[] args) {
		Personn person1 = new Personn("����");
		Personn person2 = new Personn("����", 27);
		person1.speak();
		person2.speak();

	}

}
