package com.ldq.computer;

public class TestDemoing {

	public static void main(String[] args) {
		Computer c = new Computer();
		c.add(new Mouse());
		c.add(new Mic());
		c.add(new KeyBoard());

		c.powerOn();
		System.out.println();
		c.powerOff();

	}

}
