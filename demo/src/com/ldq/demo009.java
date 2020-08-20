package com.ldq;

/*
 * 构造方法的重载
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
		System.out.println("大家好，我叫" + name + ",今年" + age + "岁了！");
	}

}

public class demo009 {

	public static void main(String[] args) {
		Personn person1 = new Personn("张三");
		Personn person2 = new Personn("李四", 27);
		person1.speak();
		person2.speak();

	}

}
