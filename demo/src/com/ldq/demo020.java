package com.ldq;

class Student {
	final String name = "����";// final���εı���һ��Ҫȥ��ʼ����Java���Ὣ���ʼ����
	String nameString; // ��final���εı������ó�ʼ����Java�Զ�����String���͵�Ϊnull
	int value;
	int valuee = 100;

	public void speak() {
		System.out.println("���Ǵ��ϰ壬�ҽ�" + name + ",����" + valuee + "���ʲ�");
		System.out.println("�Ҳ��Ǵ��ϰ壬�ҽ�" + nameString + ",����" + value + "���ʲ�");
	}

}

public class demo020 {

	public static void main(String[] args) {
		Student student = new Student();
		student.speak();

	}

}
