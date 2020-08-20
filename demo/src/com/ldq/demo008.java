package com.ldq;

/*
 * 构造方法的定义
 * 
 * */
class Person {

	int age;

	public Person(int a) {
		age = a;
	}

	public void speak() {
		System.out.println("大家好，我今年" + age + "岁了！");
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
