package com.ldq;

class Student {
	final String name = "马云";// final修饰的变量一定要去初始化，Java不会将其初始化的
	String nameString; // 无final修饰的变量不用初始化，Java自动设置String类型的为null
	int value;
	int valuee = 100;

	public void speak() {
		System.out.println("我是大老板，我叫" + name + ",我有" + valuee + "亿资产");
		System.out.println("我不是大老板，我叫" + nameString + ",我有" + value + "亿资产");
	}

}

public class demo020 {

	public static void main(String[] args) {
		Student student = new Student();
		student.speak();

	}

}
