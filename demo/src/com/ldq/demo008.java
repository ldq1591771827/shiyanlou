package com.ldq;

/*
 * ���췽���Ķ���
 * 
 * */
class Person {

	int age;

	public Person(int a) {
		age = a;
	}

	public void speak() {
		System.out.println("��Һã��ҽ���" + age + "���ˣ�");
		// System.out.print("fklsnkfjsn");
	}
}

public class demo008 {

	public static void main(String[] args) {
		Person person1 = new Person(30);
		// person1.age = 50;
		person1.speak();
	}

}
