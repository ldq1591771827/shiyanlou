package com.ldq;

interface Anminsalq {
	void shout();
}

public class demo028 {

	public static void main(String[] args) {
		dsidhjsbdjpp(new Anminsalq() {

			@Override
			public void shout() {
				System.out.println("������......");

			}
		});

	}

	public static void dsidhjsbdjpp(Anminsalq a) {
		a.shout();
	}
}
