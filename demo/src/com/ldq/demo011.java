package com.ldq;

class Personq {
	public void finalize() {
		System.out.println("对象将作为垃圾被回收！！！");
	}
}

public class demo011 {

	public static void main(String[] args) {
		Personq personq1 = new Personq();
		Personq personq2 = new Personq();
		personq1 = null;
		personq2 = null;
		System.gc();
		for (int i = 0; i < 500000000; i++) {

		}

	}

}
