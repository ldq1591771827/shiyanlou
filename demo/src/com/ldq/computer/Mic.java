package com.ldq.computer;

public class Mic implements USB {

	@Override
	public void turnOn() {
		System.out.println("��˷������ˣ�����");

	}

	@Override
	public void turnOff() {
		System.out.println("��˷�ر��ˣ�����");

	}

}