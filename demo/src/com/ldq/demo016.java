package com.ldq;

/*
 * 
 * ��д���෽��
 * */
class Fatherr {
	void shout() {
		System.out.println("����Ĺ��췽����������----");
	}
}

class Sson extends Fatherr {
	void shout() {
		System.out.println("����Ĺ��췽����������----");
	}
}

public class demo016 {

	public static void main(String[] args) {
		Sson sson = new Sson();
		sson.shout();

	}

}
